import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class SubmitFeedbackServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String message = request.getParameter("message");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/feedbackdb",
                    "root",
                    "yourpassword");

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO feedback(student_name, message) VALUES (?, ?)");

            ps.setString(1, name);
            ps.setString(2, message);

            ps.executeUpdate();

            out.println("<h3>Feedback Submitted Successfully!</h3>");
            con.close();

        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }
    }
}
