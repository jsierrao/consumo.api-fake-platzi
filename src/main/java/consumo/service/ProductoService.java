package consumo.service;

import java.util.List;

import consumo.modelo.Producto;
import consumo.response.ProductoDTO;
import consumo.response.Response;

public interface ProductoService {

	public List<ProductoDTO> obtener();

	public Response crearProduct(Producto producto);

}
