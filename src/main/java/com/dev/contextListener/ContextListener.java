/**
 * 
 */
package main.java.com.dev.contextListener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import main.java.com.dev.model.Dog;

/**
 * @author ak22835
 *
 */
public class ContextListener implements ServletContextListener {

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextInitialized(ServletContextEvent event) {
		ServletContext servletContext = event.getServletContext();
		String dogBreed=servletContext.getInitParameter("breed");
		Dog dog=new Dog(dogBreed);
		servletContext.setAttribute("dog", dog);
		

	}

}
