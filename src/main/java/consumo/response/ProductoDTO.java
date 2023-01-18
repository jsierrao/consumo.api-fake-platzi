package consumo.response;

import java.util.List;



import consumo.modelo.Categorias;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductoDTO {

	private int id;

	private String title;

	private int priceFinal;

	private String description;

	private Categorias category;

	private List<String> images;

}
