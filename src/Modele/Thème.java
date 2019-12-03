package Modele;

public class Thème {
    private String id;
    private String libelle;

    public Thème(String libelle) {
        this.libelle = libelle;
    }

    public String getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Thème{" +
                "id='" + id + '\'' +
                ", libelle='" + libelle + '\'' +
                '}';
    }
}
