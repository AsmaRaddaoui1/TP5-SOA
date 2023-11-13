package CLIENT;
import jakarta.xml.ws.WebServiceRef;
import service.BanqueService;
import service.BanqueServiceService;

public class ClientWS {

    @WebServiceRef(wsdlLocation = "http://localhost:8084/banqueService?wsdl")
    private static BanqueServiceService banqueServiceService;

    public static void main(String[] args) {
        BanqueService banqueServicePort = banqueServiceService.getBanqueServicePort();

        double montantConverti = banqueServicePort.conversion(100);
        System.out.println("Montant converti : " + montantConverti);

        banqueServicePort.getComptes().forEach(compte -> {
            System.out.println("Code du compte : " + compte.getCode());
            System.out.println("Date de création : " + compte.getDateCreation());
            System.out.println("Solde du compte : " + compte.getSolde());
        });
    }
}

