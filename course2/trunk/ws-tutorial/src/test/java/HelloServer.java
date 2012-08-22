import javax.xml.ws.Endpoint;
import com.skcc.tutorial.jaxws.HelloImpl;

public class HelloServer {
	public static void main(String args[]){
		HelloImpl hello = new HelloImpl();
		String address = "http://localhost:8080/ws-tutorial/services/hello";
		Endpoint.publish(address, hello);
	}
}
