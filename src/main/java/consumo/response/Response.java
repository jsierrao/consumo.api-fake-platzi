package consumo.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import consumo.modelo.Categorias;
import consumo.modelo.Producto;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Response {
	
	private String code;
	
	private String mensaje;
	
	
	@JsonInclude(value =Include.NON_NULL)
	private List<ProductoDTO> productos;
	
	@JsonInclude(value = Include.NON_NULL)
	private Producto producto;
	
	@JsonInclude(value =Include.NON_NULL)
	private List<Categorias>categorias;

}
