import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class TokenTest extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        HttpSession session = request.getSession();
        String token = request.getParameter("token");
        Object attribute = session.getAttribute(token);
        response.setContentType("text/html;charset=UTF-8");
        if (attribute != null) {
            session.removeAttribute(token);
            response.getWriter().write("请求成功！");
        } else {
            response.getWriter().write("请不要重复请求！");
        }
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }


}
