
package Serveur;

import Service.BanqueService;
import javax.xml.ws.Endpoint;

public class Serveur {
    public static void main(String[] args) 
    {
        Endpoint.publish("http://localhost:8090/",new BanqueService());
        System.out.println("working");
    }
}
