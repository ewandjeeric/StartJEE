package com.sid;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sid.beans.Utilisateur;
import com.sid.connexion.DBconnexion;

/**
 * Servlet implementation class Database
 */
@WebServlet("/Database")
public class Databases extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Databases() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DBconnexion db = new DBconnexion();
		request.setAttribute("utilisateurs", db.recupererUtilisateurs());
		this.getServletContext().getRequestDispatcher("/WEB-INF/db.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom(request.getParameter("nom"));
        utilisateur.setPrenom(request.getParameter("prenom"));
        
        DBconnexion db = new DBconnexion();
        db.ajouterUtilisateur(utilisateur);
        
        request.setAttribute("utilisateurs", db.recupererUtilisateurs());
        this.getServletContext().getRequestDispatcher("/WEB-INF/db.jsp").forward(request, response);
	}

}
