package main.java.com.dev.controller;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import main.java.com.dev.service.AuthenticationService;

/**
 * Servlet implementation class AuthenticationServlet
 */
public class AuthenticationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private AuthenticationService authenticationService;
	private HomeController homeController;
	/**
     * @see HttpServlet#HttpServlet()
     */
    public AuthenticationController() {
        super();
        authenticationService=new AuthenticationService();
        homeController=new HomeController();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		if (this.authenticationService.login(request.getParameter("username"), request.getParameter("password"))) {
			System.out.println("Access granted!");
			RequestDispatcher home= getServletContext().getRequestDispatcher("/HomeController.do");
			home.forward(request, response);
			//return homeController.handleRequestInternal(arg0, arg1);
		}else{
			System.out.println("Access denied!");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
