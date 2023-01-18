package consumo.modelo;

import java.util.List;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Producto {

	private int id;

	private String title;

	private int price;

	private String description;

	private int categoryId;

	private List<String> images;

}
