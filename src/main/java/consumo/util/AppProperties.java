package consumo.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Component
@Configuration
@PropertySource(value = { "classpath:application.properties" })
@ConfigurationProperties(prefix = "consumo-api-platzi")
public class AppProperties {
	
	private String listarProducto;
	private String listarCategoria;
    private String crearProducto;
	
}
