
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class CreateUserPage extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateUserPage() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub

        ConnexionBdd logins = new ConnexionBdd();

        request.setAttribute("users", logins.listUsers());

        List<User> listusers = new ArrayList<>();
        listusers = logins.listUsers();

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
