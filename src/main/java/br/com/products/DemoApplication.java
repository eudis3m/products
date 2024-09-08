package br.com.products;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@AutoConfiguration
@EnableAutoConfiguration()
//@ComponentScan("br.com.products")
//@Configuration
public class DemoApplication /*extends SpringBootServletInitializer*/ {
	//private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		LOGGER.info("Inicializando aplicação Multicanais via container (arquivo .war).");
		return application.sources(DemoApplication.class);
	}*/

}
