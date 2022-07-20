package qtx.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebListener
public class EscuchaContexto implements ServletContextListener {
	
	private static Logger bitacora = LoggerFactory.getLogger(EscuchaContexto.class);
	private static final String MODO = "debug";

	public EscuchaContexto() {
		bitacora.info("EscuchaContexto instanciado");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		bitacora.info("contextInitialized");
		ServletContext contextoApp = sce.getServletContext();
		bitacora.info("contextoApp:" + contextoApp);
		contextoApp.setAttribute("modo", MODO);
		bitacora.info("modo:" + contextoApp.getAttribute("modo"));
	}
	
}
