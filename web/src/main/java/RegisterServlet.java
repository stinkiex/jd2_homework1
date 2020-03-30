import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String repassword = req.getParameter("repassword");
        AuthUser user = securityService.login(login, password);
        if (login == null) {
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