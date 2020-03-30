import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
//Todo Разобраться с зависимостями
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String repassword = req.getParameter("repassword");
        AuthUser user = securityServices.login(login, password);
        if (repassword != password){
            req.setAttribute("error", "Password and Confirm password not match");
        }
        if (login == user.getLogin() ) {
            req.setAttribute("error", "login already exist");
            WebUtils.forword("register", req, resp);
        }
        req.getSession().setAttribute("authUser", user);
        try {
            resp.sendRedirect(req.getContextPath() +"/student");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
