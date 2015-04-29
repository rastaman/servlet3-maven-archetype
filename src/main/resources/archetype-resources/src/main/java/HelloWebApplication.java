#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import javax.servlet.annotation.WebListener;

import be.fluid_it.tools.dropwizard.box.WebApplication;

@WebListener
public class HelloWebApplication extends
		WebApplication<HelloConfiguration> {
	public HelloWebApplication() {
		super(new HelloService(), "hello-config.yml");
	}
}