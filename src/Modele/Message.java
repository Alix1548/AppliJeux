package Modele;


import java.time.DateTimeException;

public class Message {
    private int id;
    private DateTimeException date;
    private String lu;
    private String type;
    private int id_Adherent;
    private int id_Message;

    public Message(DateTimeException date, String lu, String type, int id_Adherent, int id_Message) {
        this.date = date;
        this.lu = lu;
        this.type = type;
        this.id_Adherent = id_Adherent;
        this.id_Message = id_Message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DateTimeException getDate() {
        return date;
    }

    public void setDate(DateTimeException date) {
        this.date = date;
    }

    public String getLu() {
        return lu;
    }

    public void setLu(String lu) {
        this.lu = lu;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId_Adherent() {
        return id_Adherent;
    }

    public void setId_Adherent(int id_Adherent) {
        this.id_Adherent = id_Adherent;
    }

    public int getId_Message() {
        return id_Message;
    }

    public void setId_Message(int id_Message) {
        this.id_Message = id_Message;
    }
}
