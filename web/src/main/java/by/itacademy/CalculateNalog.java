package by.itacademy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/vatsCalculate")
public class CalculateNalog extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Double money = Double.valueOf(req.getParameter("moneyIn"));
        PrintWriter pw = resp.getWriter();
        resp.setContentType("text/html");
        pw.println("fszn34 = " + money*0.34);
        pw.println("fszn1 = " + money*0.01);
        pw.println("belgosstrah06 = " + (money*0.6/100));
        pw.println("podohodNalog13 = " + (money*13/100));
        pw.println("profsojuz1 = "+ (money*1/100));
        pw.println("onHand = " + (money - money*(1 + 6 + 13 + 1)/100));



    }
}
