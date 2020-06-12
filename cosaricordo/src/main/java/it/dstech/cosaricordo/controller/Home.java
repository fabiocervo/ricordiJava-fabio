package it.dstech.cosaricordo.controller;

import java.io.IOException;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.cosaricordo.service.Service;
@WebServlet(name = "home", urlPatterns = "/home")
public class Home extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	EntityManagerFactory emf = (EntityManagerFactory) getServletContext().getAttribute("emf");
	Service s = new Service(emf);
	req.setAttribute("listaPersone", s.stampaLista());
	req.getRequestDispatcher("aggiungiPersona.jsp").forward(req, resp);
}
}
