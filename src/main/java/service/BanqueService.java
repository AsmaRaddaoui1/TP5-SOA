package service;

import java.util.List;
import java.util.ArrayList;
import metier.Compte;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class BanqueService {

    // Méthode de conversion de montant avec une annotation spécifiant le nom du paramètre dans la requête web.
    @WebMethod
    public double conversion(@WebParam(name = "montant") double montant) {
        // Conversion du montant en multipliant par un taux fixe (dans cet exemple, 3).
        return montant * 3;
    }

    // Méthode pour obtenir la liste de comptes.
    // Remarque : Cette méthode n'est pas annotée avec @WebMethod, mais elle est accessible en tant que service web.
    public List<Compte> getComptes() {
        // Création de quelques comptes fictifs pour démonstration.
        List<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte(001, "01-09-2023", 1500));
        comptes.add(new Compte(001, "01-10-2023", 2000));
        comptes.add(new Compte(001, "03-01-2023", 1050));
        // Retourne la liste de comptes.
        return comptes;
    }
}
