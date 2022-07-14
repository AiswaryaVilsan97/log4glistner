package listeners;
import java.io.File;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import org.apache.log4j.PropertyConfigurator;
@WebListener("application context listener")
public class Log4jListener implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent event) {
		ServletContext context = event.getServletContext();
		String log4jConfigFile = context.getInitParameter("log4j-config-location");
		 String fullPath = context.getRealPath("") + File.separator + log4jConfigFile;
		 PropertyConfigurator.configure(fullPath);
		 System.out.println("log4j initiated in listenersclass");
	}}