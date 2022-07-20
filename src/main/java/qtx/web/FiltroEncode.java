package qtx.web;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.util.MimeType;
import org.springframework.util.MimeTypeUtils;

@WebFilter("/AltaPerro")
public class FiltroEncode extends HttpFilter implements Filter {
	
	private static Logger bitacora = LoggerFactory.getLogger(FiltroEncode.class);
	public FiltroEncode() {
        super();
		bitacora.info("FiltroEncode instanciado");
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		bitacora.info("req.contentType:"+ request.getContentType());
		String contentTypeReq = request.getContentType();
		if(contentTypeReq != null && contentTypeReq.equalsIgnoreCase(MediaType.APPLICATION_FORM_URLENCODED_VALUE)) {
			request.setCharacterEncoding("ISO-8859-1");
		}
		chain.doFilter(request, response);
		bitacora.info("resp.contentType:"+ response.getContentType());
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
