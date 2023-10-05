package esercizio1;

import static esercizio1.Livello.*;

public class Dipendente {
    private double stipendioBase = 1000;
    private int matricola;
    private double stipendio;
    private double importoOrarioStraordinario;

    private Livello livello;

    private Dipartimento dipartimento;


    public Dipendente(int matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.stipendio = this.stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = OPERAIO;
    }

    public Dipendente(double stipendioBase, int matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }


    public static void stampaDatiDipendente(Dipendente dipendente) {
        System.out.println(dipendente);
    }

    public static double calcolaPaga(Dipendente dipendente) {
        return dipendente.stipendio;
    }

    public static double calcolaPaga(Dipendente dipendente, int oreDiStraordinario) {
        return dipendente.stipendio + (oreDiStraordinario * dipendente.importoOrarioStraordinario);
    }


    public void promuovi() {
        switch (this.livello) {
            case OPERAIO -> {
                this.livello = IMPIEGATO;
                this.stipendio = stipendioBase * 1.2;
            }
            case IMPIEGATO -> {
                this.livello = QUADRO;
                this.stipendio = stipendioBase * 1.5;
            }
            case QUADRO -> {
                this.livello = DIRIGENTE;
                this.stipendio = stipendioBase * 2;
            }
            case DIRIGENTE -> System.out.println("Livello dirigente raggiunto complimenti!!");

        }

    }


    @Override
    public String toString() {
        return "Dipendente{" +
                " matricola=" + matricola +
                ", stipendio=" + stipendio +
                ", importoOrarioStraordinario=" + importoOrarioStraordinario +
                ", livello=" + livello +
                ", dipartimento=" + dipartimento +
                '}';

    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void setLivello(Livello livello) {
        this.livello = livello;
    }
}
