package controlleurs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modeles.AuthentificationBean;

/**
 * Servlet implementation class Authentification
 */
@WebServlet("/Authentification")
public class AuthentificationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthentificationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		AuthentificationBean AuthentificationBean= (AuthentificationBean)session.getAttribute("AuthentificationBean");
		if(AuthentificationBean == null){
			String prenom = request.getParameter("prenom");
			String nom = request.getParameter("nom");
			
			AuthentificationBean nameBean = new AuthentificationBean();
			nameBean.setNom(prenom);
			nameBean.setPrenom(nom);
			session.setAttribute("nameBean", nameBean);
		}
		String address ="Authentification.jsp";
	     RequestDispatcher dispatcher =request.getRequestDispatcher(address);
	     dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
