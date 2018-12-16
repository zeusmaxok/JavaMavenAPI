package RestFulServices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/RestTest")
public class WebService1 {

	@GET
	@Path("/WS1")
	@Produces({MediaType.APPLICATION_JSON})
	public String getWSAResponse() {
		System.out.println("WS1 is called");
		return UsernameTool.getUsernameRange("ran", "ws1");
	}
	
	@GET
	@Path("/WS2/{username}")
	@Produces({MediaType.TEXT_PLAIN})
	public String getWSBResponse(@PathParam("username") String username) {
		
		return UsernameTool.getUsernameRange(username, "ws2");
	}
	
	@GET
	@Path("/WS3/{username}")
	@Produces({MediaType.TEXT_PLAIN})
	public String getWSCResponse(@PathParam("username") String username) {
		
		return UsernameTool.getUsernameRange(username, "ws3");
	}
	
	@GET
	@Path("/WS4/{username}")
	@Produces({MediaType.TEXT_PLAIN})
	public String getWSDResponse(@PathParam("username") String username) {
		
		return UsernameTool.getUsernameRange(username, "ws4");
	}
	
	@GET
	@Path("/WS5/{username}")
	@Produces({MediaType.TEXT_PLAIN})
	public String getWSEResponse(@PathParam("username") String username) {
		
		return UsernameTool.getUsernameRange(username, "ws5");
	}
	
	@GET
	@Path("/WS6/{username}")
	@Produces({MediaType.TEXT_PLAIN})
	public String getWSFResponse(@PathParam("username") String username) {
		
		return UsernameTool.getUsernameRange(username, "ws6");
	}
	
	@GET
	@Path("/WS7/{username}")
	@Produces({MediaType.TEXT_PLAIN})
	public String getWSGResponse(@PathParam("username") String username) {
		
		return UsernameTool.getUsernameRange(username, "ws7");
	}
	
	@GET
	@Path("/WS8/{username}")
	@Produces({MediaType.TEXT_PLAIN})
	public String getWSHResponse(@PathParam("username") String username) {
		
		return UsernameTool.getUsernameRange(username, "ws8");
	}
	
	@GET
	@Path("/WS9/{username}")
	@Produces({MediaType.TEXT_PLAIN})
	public String getWSIResponse(@PathParam("username") String username) {
		
		return UsernameTool.getUsernameRange(username, "ws9");
	}
	
	@GET
	@Path("/WS10/{username}")
	@Produces({MediaType.TEXT_PLAIN})
	public String getWSJResponse(@PathParam("username") String username) {
		
		return UsernameTool.getUsernameRange(username, "ws10");
	}
	
	
	
}
