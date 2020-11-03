import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CounterServlet", urlPatterns = "/counter")
public class CounterServlet extends HttpServlet {
    private int counter = 0;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        counter += 1;
        response.getWriter().println("<h1>The count is "+counter+".</h1>");
        String toReset = request.getParameter("reset");
        if (toReset.equalsIgnoreCase("reset")) {
            this.counter = 0;
        }


    }
}
