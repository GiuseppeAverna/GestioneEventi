package EserciziDatabase.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Persona {
    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataeveneto;
    private Sesso sesso;
    private List<String> ListaPartecipazioni = new ArrayList<>();
    public Persona () {}

    public Persona(String nome, String cognome, String email, LocalDate dataeveneto, Sesso sesso, List<String> listaPartecipazioni) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataeveneto = dataeveneto;
        this.sesso = sesso;
        ListaPartecipazioni = listaPartecipazioni;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataeveneto() {
        return dataeveneto;
    }

    public void setDataeveneto(LocalDate dataeveneto) {
        this.dataeveneto = dataeveneto;
    }

    public Sesso getSesso() {
        return sesso;
    }

    public void setSesso(Sesso sesso) {
        this.sesso = sesso;
    }

    public List<String> getListaPartecipazioni() {
        return ListaPartecipazioni;
    }

    public void setListaPartecipazioni(List<String> listaPartecipazioni) {
        ListaPartecipazioni = listaPartecipazioni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", dataeveneto=" + dataeveneto +
                ", sesso=" + sesso +
                ", ListaPartecipazioni=" + ListaPartecipazioni +
                '}';
    }
}









