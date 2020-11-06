import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AdsServlet", urlPatterns = "/ads")
public class AdsServlet extends HttpServlet {
    private Ads adsManager;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Ad> ads = DaoFactory.getAdsDao().all();
//        adsManager.all() can be replaces with the above List<Ad> variable
        request.setAttribute("ads", adsManager.all());
        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);
    }

    @Override
    public void init() {
        adsManager = DaoFactory.getAdsDao();
    }
}
