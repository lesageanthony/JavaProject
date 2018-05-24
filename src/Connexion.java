import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Connexion", urlPatterns = {"/connxeion"} )
public class Connexion extends HttpServlet{

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setLogin(request.getParameter("login"));
        user.setPassword(request.getParameter("password"));

        String message;
        ConnexionBdd logins = new ConnexionBdd();
        if (logins.verifUser(user)) {
            HttpSession session = request.getSession();
            message = "Connexion réussie !";

            session.setAttribute("login", request.getParameter("login"));
            request.setAttribute("message", message);
            response.sendRedirect("/test1/private");

        } else {
            message = "Connexion fail :(";
            request.setAttribute("message", message);
            this.getServletContext().getRequestDispatcher("/WEB-INF/Connexion.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/Connexion.jsp").forward(request, response);
    }

}
