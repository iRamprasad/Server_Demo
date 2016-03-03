package example;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by iRamprasadK on 16/02/16.
 */
@WebService()
public class HalloWelt {
  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hallo, Welt, from " + from;
    System.out.println(result);
    return result;
  }

  public static void main(String[] argv) {
    Object implementor = new HalloWelt();
    String address = "http://localhost:9000/HalloWelt";
    Endpoint.publish(address, implementor);
  }
}
