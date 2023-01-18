package consumo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import consumo.modelo.Producto;
import consumo.response.ProductoDTO;
import consumo.response.Response;
import consumo.service.ProductoService;

@RestController
@RequestMapping(value = "/nexsys/v1/")
public class ProductoController {

	@Autowired
	private ProductoService service;

	@GetMapping("/products")
	public ResponseEntity<Response> productos() {
		Response rsp = new Response();
		List<ProductoDTO> produ = service.obtener();
		rsp.setCode("200");
		rsp.setMensaje("proceso exitoso");
		rsp.setProductos(produ);
		return new ResponseEntity<>(rsp, HttpStatus.OK);

	}

	@PostMapping("/categories")
	public ResponseEntity<Response> creaProductos(@RequestBody Producto productNew) {
		Response rsp = service.crearProduct(productNew);
		return new ResponseEntity<>(rsp, HttpStatus.OK);

	}

}
