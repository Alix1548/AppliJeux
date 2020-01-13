package Modele;


import java.time.DateTimeException;
import java.util.Date;

public class Séance {
    private int id;
    private Date date;
    private DateTimeException heure_fin;
    private DateTimeException heure_debut;

    public Séance(Date date, DateTimeException heure_fin, DateTimeException heure_debut) {
        this.date = date;
        this.heure_fin = heure_fin;
        this.heure_debut = heure_debut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public DateTimeException getHeure_fin() {
        return heure_fin;
    }

    public void setHeure_fin(DateTimeException heure_fin) {
        this.heure_fin = heure_fin;
    }

    public DateTimeException getHeure_debut() {
        return heure_debut;
    }

    public void setHeure_debut(DateTimeException heure_debut) {
        this.heure_debut = heure_debut;
    }
}
