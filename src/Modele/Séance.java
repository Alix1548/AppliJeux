package Modele;


import java.time.DateTimeException;
import java.util.Date;

public class Séance {
    private String id;
    private Date date;
    private DateTimeException heure_fin;
    private DateTimeException heure_debut;

    public Séance(Date date, DateTimeException heure_fin, DateTimeException heure_debut) {
        this.date = date;
        this.heure_fin = heure_fin;
        this.heure_debut = heure_debut;
    }

    public String getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public DateTimeException getHeure_fin() {
        return heure_fin;
    }

    public DateTimeException getHeure_debut() {
        return heure_debut;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setHeure_fin(DateTimeException heure_fin) {
        this.heure_fin = heure_fin;
    }

    public void setHeure_debut(DateTimeException heure_debut) {
        this.heure_debut = heure_debut;
    }

    @Override
    public String toString() {
        return "Séance{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", heure_fin=" + heure_fin +
                ", heure_debut=" + heure_debut +
                '}';
    }
}
