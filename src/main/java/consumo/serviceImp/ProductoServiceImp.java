package consumo.serviceImp;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import consumo.modelo.Producto;
import consumo.response.ProductoDTO;
import consumo.response.Response;
import consumo.service.ProductoService;
import consumo.util.AppProperties;

@Service
public class ProductoServiceImp implements ProductoService {

	@Autowired
	private AppProperties prop;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<ProductoDTO> obtener() {
		return Arrays.asList(restTemplate.getForObject(prop.getListarProducto(), ProductoDTO[].class));
	}

	@Override
	public Response crearProduct(Producto producto) {
		Response rsp = new Response();
		rsp = restTemplate.postForObject(prop.getCrearProducto(), producto, Response.class);
		rsp.setCode("200");
		rsp.setMensaje("creado exitosamente");
		return rsp;
	}

}
