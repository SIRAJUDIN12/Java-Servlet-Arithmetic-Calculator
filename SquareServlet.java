/* SquareServlet.java */
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class SquareServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieve sum from request attribute
        int sum = (int) request.getAttribute("sum");

        // Calculate square of the sum
        int square = sum * sum;

        // Display square result
        out.println("<h2>The square of the sum " + sum + " is " + square + "</h2>");
    }
}