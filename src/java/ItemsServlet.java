import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/ItemsServlet"})
public class ItemsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String name = "";
        Cookie[] cookies = request.getCookies();
        for (Cookie c : cookies) {
            if (c.getName().equals("name")) {
                name = c.getValue();
            }
        }
        
        String webpage = """
            <!DOCTYPE html>
            <html>
                <head>
                </head>
                <body>
                    Zdravei %s
                </body>
            </html>
            """.formatted(name);
        response.getWriter().println(webpage);
    }
}
