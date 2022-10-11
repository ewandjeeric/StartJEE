package com.sid;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Cookie
 */
@WebServlet("/Cookie")
public class Cookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cookies() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie : cookies) {
			
			if(cookie.getName().equals("nom")) request.setAttribute("cookienom", cookie.getValue());
			if(cookie.getName().equals("prenom")) request.setAttribute("cookieprenom", cookie.getValue());
		}
		this.getServletContext().getRequestDispatcher("/WEB-INF/cookie.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		Cookie cookienom = new Cookie("nom", nom);
		cookienom.setMaxAge(60*60*24);
		Cookie cookieprenom = new Cookie("prenom", prenom);
		cookieprenom.setMaxAge(60*60*24);
		response.addCookie(cookienom);
		response.addCookie(cookieprenom);
		
		request.setAttribute("cookienom", cookienom.getValue());
		request.setAttribute("cookieprenom", cookieprenom.getValue());
		this.getServletContext().getRequestDispatcher("/WEB-INF/cookie.jsp").forward(request, response);
	}

}
