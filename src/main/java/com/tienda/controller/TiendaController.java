package com.tienda.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class TiendaController {

//	@Autowired 
//	private UsuariosRepository usuariosRepository;

	@GetMapping("login")
	public String login(HttpServletRequest request, HttpSession session) {
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		return "index";
	}



//	@GetMapping("cerrarSesion")
//	public String cerrarSesion(HttpSession session) {
//		
//
//		session.invalidate();
//
//		return "redirect:/login";
//	}

}
