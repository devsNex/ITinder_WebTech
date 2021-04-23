package servlets;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.RegistrierungsBean;

@WebServlet("/registrierungservlet")
public class registrierungservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		RegistrierungsBean form = new RegistrierungsBean();
		form.setBenutzername(request.getParameter("benutzername"));
		form.setVorname(request.getParameter("vorname"));
		form.setNachname(request.getParameter("nachname"));
		form.setGeschlecht(request.getParameter("geschlecht"));
		// form.setGeburtstag(request.getParameter("geburtstag"));
		form.setLieblingsgame(request.getParameter("lieblingsgame"));
		form.setHobby(request.getParameter("hobby"));
		form.setProgrammiersprachen(request.getParameterValues("programmiersprachen"));
		form.setWeiteresprachen(request.getParameter("weiteresprachen"));
		form.setEmail(request.getParameter("email"));
		form.setEmailbestätigen(request.getParameter("emailbestätigen"));
		form.setPasswort(request.getParameter("passwort"));
		form.setPasswortbestätigen(request.getParameter("passwortbestätigen"));

		final HttpSession session = request.getSession();
		session.setAttribute("form", form);

		// HTTP-Header setzen
		//response.setStatus(HttpServletResponse.SC_OK); // nicht zwingend erforderlich; ist der default-Wert
		//response.setContentType("text/html");
		//response.setCharacterEncoding("UTF-8");

		final RequestDispatcher dispatcher = request.getRequestDispatcher("html/registrierung.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
