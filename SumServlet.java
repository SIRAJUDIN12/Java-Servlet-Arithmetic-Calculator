/* SumServlet.java */
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class SumServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieve numbers from the form
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));

        // Calculate sum
        int sum = num1 + num2;

        // Store sum in request attribute
        request.setAttribute("sum", sum);

        // Display sum result
        out.println("<h2>Sum of " + num1 + " and " + num2 + " is " + sum + "</h2>");

        // Forward the request to SquareServlet
        RequestDispatcher dispatcher = request.getRequestDispatcher("SquareServlet");
        dispatcher.include(request, response);
    }
}