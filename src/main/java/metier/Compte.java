package metier;

public class Compte {
    private long code;           // Numéro du compte (identifiant)
    private String dateCreation; // Date de création du compte
    private double solde;        // Solde du compte

    // Constructeur par défaut
    public Compte() {
        super(); // Appelle le constructeur de la classe parente (Object, implicitement)
    }

    // Constructeur avec paramètres pour initialiser les attributs lors de la création d'un objet Compte
    public Compte(long code, String dateCreation, double solde) {
        this.code = code;
        this.dateCreation = dateCreation;
        this.solde = solde;
    }

    // Méthodes getter pour récupérer les valeurs des attributs
    public long getCode() {
        return code;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public double getSolde() {
        return solde;
    }

    // Méthodes setter pour modifier les valeurs des attributs
    public void setCode(long code) {
        this.code = code;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
