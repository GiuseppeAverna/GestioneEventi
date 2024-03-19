package EserciziDatabase.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Evento {
    @Id
    @GeneratedValue

    private long id;
    private String titolo;
    private LocalDate dataEvento;
    private String descrizione;
    private tipoEvento tipoEvento;
    private int numeroMassimoPaerecipanti;
    public Evento() {

    }


    public Evento(String titolo, LocalDate dataEvento, String descrizione, EserciziDatabase.entities.tipoEvento tipoEvento, int numeroMassimoPaerecipanti) {
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.numeroMassimoPaerecipanti = numeroMassimoPaerecipanti;
    }

    public long getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public EserciziDatabase.entities.tipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(EserciziDatabase.entities.tipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getNumeroMassimoPaerecipanti() {
        return numeroMassimoPaerecipanti;
    }

    public void setNumeroMassimoPaerecipanti(int numeroMassimoPaerecipanti) {
        this.numeroMassimoPaerecipanti = numeroMassimoPaerecipanti;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento=" + dataEvento +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", numeroMassimoPaerecipanti=" + numeroMassimoPaerecipanti +
                '}';
    }
}

