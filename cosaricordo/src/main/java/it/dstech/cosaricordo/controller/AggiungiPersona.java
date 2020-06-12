package it.dstech.cosaricordo.controller;

import java.io.IOException;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.cosaricordo.model.Persona;
import it.dstech.cosaricordo.service.Service;



@WebServlet(name = "AggiungiPersona", urlPatterns = "/aggiungiPersona")
public class AggiungiPersona extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	EntityManagerFactory emf = (EntityManagerFactory) getServletContext().getAttribute("emf");
	Persona p = new Persona();
	p.setNome(req.getParameter("nome"));
	p.setCognome(req.getParameter("cognome"));
	p.setNumero(Long.parseLong(req.getParameter("numero")));
	
	Service s = new Service(emf);
	s.aggiungiPersona(p);
	
	req.setAttribute("listaPersone", s.stampaLista());
	req.getRequestDispatcher("aggiungiPersona.jsp").forward(req, resp);
}
}
