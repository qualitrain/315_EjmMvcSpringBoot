package qtx;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}
	/*
	 La clase SpringBootServletInitializer es una clase, en Spring Boot, que se utiliza para 
	 - inicializar la aplicación Spring Boot como un servlet en un contenedor de servlets externo, 
	   como Tomcat, Jetty o Undertow.
     Cuando se construye una aplicación Spring Boot, 
     - normalmente se ejecuta como una aplicación independiente en un servidor embebido. 
     Sin embargo, en algunos casos, es necesario desplegar la aplicación en un contenedor de servlets 
     externo. 
     - En este caso, se debe utilizar la clase SpringBootServletInitializer.
     La clase SpringBootServletInitializer 
     - proporciona un método configure() que 
       - debe ser anulado en una subclase para indicar cómo se debe inicializar la aplicación Spring 
         Boot en el contenedor de servlets externo. 
       - En este método, se pueden configurar 
         - el contexto de la aplicación y 
         - los recursos estáticos, entre otras cosas.
     En resumen, la clase SpringBootServletInitializer 
     - es esencial para desplegar una aplicación Spring Boot en un contenedor de servlets externo y 
     - proporciona una forma de inicializar la aplicación correctamente.
	 */

}
