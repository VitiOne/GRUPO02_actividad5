package com.tienda.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.tienda.dao.ProductoDao;
import com.tienda.dao.RolDao;
import com.tienda.dao.UsuarioDao;
import com.tienda.modelo.Producto;
import com.tienda.modelo.Usuario;
import com.tienda.repository.ProductoRepository;


@Controller
public class TiendaController {
	
	@GetMapping("/")
	public String inicio() {
		return "index";
	}
	
	@Autowired
	RolDao rdao;
	@Autowired
	UsuarioDao udao;
	
	@GetMapping("/usuario/registro")
	public String registrar(Model model) {
		
		
	//	model.addAttribute("mensaje", "registrando");
		
		return "registro";
		 
		
	}
	@PostMapping("/usuario/registro")
	public String porregistrar(Model model, Usuario usuario, RedirectAttributes ratt) {
		
		//usuario.setEnabled(1);
	 	//usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
		usuario.setPassword(usuario.getPassword());
	 	if (udao.registro(usuario)) {
	 		ratt.addFlashAttribute("mensaje", "alta realizada");
	 		return "redirect:/login";
	 	}
	 	else {
	 		model.addAttribute("mensaje", "ya existe como usuario");
	 		return "/registro";
	 		
	 	}
		
	}

//	@GetMapping("login")
//	public String login(HttpServletRequest request, HttpSession session) {
//		String usuario = request.getParameter("usuario");
//		String password = request.getParameter("password");
//		return "index";
//	}
	
	@GetMapping("/usuario/login")
	public String procesarLogin(Authentication aut, Model model, HttpSession misesion) {
		
		System.out.println("usuario : " + aut.getName());
		Usuario usuario = udao.findById(aut.getName());
		
		if (misesion.getAttribute("usuario") == null)
			misesion.setAttribute("usuario", usuario);
		
		System.out.println();
		
		for (GrantedAuthority ele: aut.getAuthorities())
			System.out.println("ROL : " + ele.getAuthority());
		
		model.addAttribute("mensaje", aut.getAuthorities());
		
		
		return "redirect:/";
	}

	@GetMapping("/usuario/salir")
	public String cerrarSesion(HttpSession session) {
		

		session.invalidate();

		return "redirect:/login";
	}
	
	//-----------------------------------------------------------------------
	@Autowired
	ProductoDao prdao;
	@GetMapping("/producto/listar")
	public String listaProductos(Model model) {
		List<Producto> lista = prdao.buscarTodos();
		model.addAttribute("listaProductos", lista);
		return "listaProductos";
	}

	@GetMapping("/verUno/{id}")
	public String verUno(Model model, @PathVariable(name="id") int  codigo) {
		
		Producto producto = prdao.buscarUno(codigo);
		model.addAttribute("producto", producto);
		
		return "verUnProducto";
		
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(Model model, @PathVariable(name="id") int  codigo) {
		
		if (prdao.borrarProducto(codigo) == 1)
			model.addAttribute("mensaje", "producto eliminado");
		else
			model.addAttribute("mensaje", "producto NOOO eliminado");
		
	//	return "redirect:/app/producto/index";
		return "forward:/producto/listar";
	}

	
	@GetMapping("/alta")
	public String enviarFormulario() {
		
		
		return "formProducto";//falta por hacer jsp pero igual lo omitimos el alta
		 
		
	}
	@PostMapping("/alta")
	public String procesarFormulario(Model model,Producto producto ) {
		
		
		System.out.println(producto);
		
		prdao.insertarProducto(producto);
		
		System.out.println(producto);
	 
		
	 	return "redirect:/producto/listar";
		 
		
	}
	
	@GetMapping("/editar/{id}")
	public String enviarFormularioEditar(Model model, @PathVariable(name="id") int codigo) {
		
		 
		
		model.addAttribute("producto", prdao.buscarUno(codigo));
		return "formProductoEditar";
		 
		
	}
	@PostMapping("/modificar")
	public String procesarFormularioEditar(Model model,Producto producto ) {
		
		
		System.out.println(producto);
		
	 	prdao.modificarProducto(producto);
		
	//	System.out.println(producto);
	 
		
	  	return "redirect:/producto/listar";
		 
		 
	}
	//-----------------------------------------------------------------------
}
