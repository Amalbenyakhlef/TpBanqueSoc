package org.enicar;

import jakarta.xml.ws.Endpoint;
import org.enicar.banqueService;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String url = "http://0.0.0.0:9000/";
        Endpoint.publish(url, new banqueService());
        System.out.println("web service deploy sur " + url);


    }

}