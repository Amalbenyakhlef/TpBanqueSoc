package org.enicar;

import java.util.*;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.enicar.Compte;


import static java.lang.Math.*;


@WebService(serviceName="BanqueWs")
public class banqueService {
    @WebMethod(operationName ="ConversionDinarsTOEuro")
    public double converions(@WebParam(name ="Montant") double mt) {
        return mt * 3.4 ;
    }

    @WebMethod(operationName = "Compte")
    public Compte getCompte(@WebParam(name ="Code") int code) {
        return new Compte(code, (int) random(), new Date());
    }

    @WebMethod
    public List<Compte> ListeComptes() {
        List<Compte> comptes = Arrays.asList(
                new Compte(1, new Random().nextInt(), new Date()),
                new Compte(2, new Random().nextInt(), new Date()),
                new Compte(3, new Random().nextInt(), new Date())
        );

        return comptes;

    }

}
