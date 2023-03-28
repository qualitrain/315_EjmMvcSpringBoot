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
	 - inicializar la aplicaci�n Spring Boot como un servlet en un contenedor de servlets externo, 
	   como Tomcat, Jetty o Undertow.
     Cuando se construye una aplicaci�n Spring Boot, 
     - normalmente se ejecuta como una aplicaci�n independiente en un servidor embebido. 
     Sin embargo, en algunos casos, es necesario desplegar la aplicaci�n en un contenedor de servlets 
     externo. 
     - En este caso, se debe utilizar la clase SpringBootServletInitializer.
     La clase SpringBootServletInitializer 
     - proporciona un m�todo configure() que 
       - debe ser anulado en una subclase para indicar c�mo se debe inicializar la aplicaci�n Spring 
         Boot en el contenedor de servlets externo. 
       - En este m�todo, se pueden configurar 
         - el contexto de la aplicaci�n y 
         - los recursos est�ticos, entre otras cosas.
     En resumen, la clase SpringBootServletInitializer 
     - es esencial para desplegar una aplicaci�n Spring Boot en un contenedor de servlets externo y 
     - proporciona una forma de inicializar la aplicaci�n correctamente.
	 */

}
