package consumo.serviceImp;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import consumo.modelo.Categorias;
import consumo.service.CategoriaService;
import consumo.util.AppProperties;

@Service
public class CategoriaServiceImp implements CategoriaService {
	
	@Autowired
	RestTemplate template;
	
	@Autowired
	AppProperties prop;

	@Override
	public List<Categorias> listCategorias() {
		return Arrays.asList(template.getForObject(prop.getListarCategoria(), Categorias[].class));
	}

}
