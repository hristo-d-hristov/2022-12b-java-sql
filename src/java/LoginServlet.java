import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        String successful = """
                            <!DOCTYPE html>
                            <html>
                                <head>
                                </head>
                                <body>
                                    Login %d successful %d!!!
                                </body>
                            </html>
                            """.formatted(5,7);
        if (user.equals("Hristov")
                && pass.equals("1234")) {
            response.getWriter().println(successful);
        } else {
            response.getWriter().println("Login failed");
        }
    }
}
