package Modele;

public class Jeux {
    private int id;
    private String nom;
    private String description;
    private int duree;
    private int nbjMax;
    private int nbjMin;
    private int id_Theme;
    private int id_Adherent;

    public Jeux(String nom, String description, int duree, int nbjMax, int nbjMin, int id_Theme, int id_Adherent) {
        this.nom = nom;
        this.description = description;
        this.duree = duree;
        this.nbjMax = nbjMax;
        this.nbjMin = nbjMin;
        this.id_Theme = id_Theme;
        this.id_Adherent = id_Adherent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public int getNbjMax() {
        return nbjMax;
    }

    public void setNbjMax(int nbjMax) {
        this.nbjMax = nbjMax;
    }

    public int getNbjMin() {
        return nbjMin;
    }

    public void setNbjMin(int nbjMin) {
        this.nbjMin = nbjMin;
    }

    public int getId_Theme() {
        return id_Theme;
    }

    public void setId_Theme(int id_Theme) {
        this.id_Theme = id_Theme;
    }

    public int getId_Adherent() {
        return id_Adherent;
    }

    public void setId_Adherent(int id_Adherent) {
        this.id_Adherent = id_Adherent;
    }
}
