import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
@WebServlet(urlPatterns="/create-user")
public class CreateUserPage extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CreateUserPage() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/Bonjour.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //response.getWriter().append("Served at: ").append(request.getContextPath());
        String message = "Java is shit !";
        request.setAttribute("shit", message);

        User user = new User();
        user.setLogin(request.getParameter("login"));
        user.setPassword(request.getParameter("password"));

        ConnexionBdd login = new ConnexionBdd();
        login.addUser(user);

        // Listing des users
        request.setAttribute("users", login.listUsers());


        this.getServletContext().getRequestDispatcher("/WEB-INF/Bonjour.jsp").forward(request, response);

    }

}
