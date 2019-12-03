package Modele;


import java.time.DateTimeException;

public class Message {
    private String id;
    private DateTimeException date;
    private String lu;
    private String type;

    public Message(DateTimeException date, String lu, String type) {
        this.date = date;
        this.lu = lu;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public DateTimeException getDate() {
        return date;
    }

    public String getLu() {
        return lu;
    }

    public String getType() {
        return type;
    }

    public void setDate(DateTimeException date) {
        this.date = date;
    }

    public void setLu(String lu) {
        this.lu = lu;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", lu='" + lu + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
