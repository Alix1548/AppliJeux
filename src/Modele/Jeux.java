package Modele;

public class Jeux {
    private String id;
    private String nom;
    private String description;
    private int duree;
    private int nbjMax;
    private int nbjMin;

    public Jeux(String nom, String description, int duree, int nbjMax, int nbjMin) {
        this.nom = nom;
        this.description = description;
        this.duree = duree;
        this.nbjMax = nbjMax;
        this.nbjMin = nbjMin;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public int getDuree() {
        return duree;
    }

    public int getNbjMax() {
        return nbjMax;
    }

    public int getNbjMin() {
        return nbjMin;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void setNbjMax(int nbjMax) {
        this.nbjMax = nbjMax;
    }

    public void setNbjMin(int nbjMin) {
        this.nbjMin = nbjMin;
    }

    @Override
    public String toString() {
        return "Jeux{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", duree=" + duree +
                ", nbjMax=" + nbjMax +
                ", nbjMin=" + nbjMin +
                '}';
    }
}
