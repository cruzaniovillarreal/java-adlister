import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) {
        try {
            res.setContentType("text/html");
            PrintWriter out =res.getWriter();
            String name = req.getParameter("name");
            if (name == null || name.equals("")) {
                name = "World";
            }
            out.println("<h3>Hello "+name+".</h3>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
