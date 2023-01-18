package consumo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import consumo.modelo.Categorias;
import consumo.response.Response;
import consumo.service.CategoriaService;

@RestController
@RequestMapping("/nexsys/v1/")
public class CategoriaController {
	
	@Autowired
	private CategoriaService categoria;
	
	@GetMapping("/categories")
	public ResponseEntity<Response>listarCategorias(){
		Response rsp = new Response();
		List<Categorias>cat = categoria.listCategorias();
		rsp.setCategorias(cat);
		rsp.setCode("200");
		rsp.setMensaje("proceso exitoso");
		return new ResponseEntity<>(rsp,HttpStatus.OK);
	}
	
	

}
