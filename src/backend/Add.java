package backend;


import javax.ws.rs.Path;
import javax.ws.rs.GET;

@Path("add")
public class Add {
    
	@GET
	public String getString() {
		return "Blah";
	}
}