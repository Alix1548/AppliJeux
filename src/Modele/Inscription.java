package Modele;

public class Inscription {
    int seance;
    int adherent;

    public Inscription(int seance, int adherent) {
        this.seance = seance;
        this.adherent = adherent;
    }

    public int getSeance() {
        return seance;
    }

    public void setSeance(int seance) {
        this.seance = seance;
    }

    public int getAdherent() {
        return adherent;
    }

    public void setAdherent(int adherent) {
        this.adherent = adherent;
    }
}
