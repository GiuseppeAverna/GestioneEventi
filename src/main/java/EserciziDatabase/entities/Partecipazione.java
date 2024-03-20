package EserciziDatabase.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Partecipazione {
    @Id
    @GeneratedValue

    private long id;
    private String persona;
    private String evento;
    private Stato stato;
    public Partecipazione () {}

    public Partecipazione(String persona, String evento, Stato stato) {
        this.persona = persona;
        this.evento = evento;
        this.stato = stato;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Partecipazione{" +
                "id=" + id +
                ", persona='" + persona + '\'' +
                ", evento='" + evento + '\'' +
                ", stato=" + stato +
                '}';
    }
}
