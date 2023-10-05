import esercizio1.Dipendente;

import static esercizio1.Dipartimento.*;
import static esercizio1.Livello.DIRIGENTE;
import static esercizio1.Livello.IMPIEGATO;

public class GestioneDipendenti {
    public static void main(String[] args) {
/*
        Dipendente dipendente1 = new Dipendente(125125, PRODUZIONE);
        Dipendente.stampaDatiDipendente(dipendente1); // prima della promozione
        dipendente1.promuovi();
        Dipendente.stampaDatiDipendente(dipendente1); //dopo la promozione
        System.out.println("Lo stipendio del dipendente e' di: " + Dipendente.calcolaPaga(dipendente1));
        System.out.println("Lo stipendio del dipendente e' di: " + Dipendente.calcolaPaga(dipendente1, 2));
*/

        Dipendente dipendente1 = new Dipendente(125126, PRODUZIONE);
        Dipendente dipendente2 = new Dipendente(125127, PRODUZIONE);
        Dipendente dipendente3 = new Dipendente(1000, 125128, 1300, 50, IMPIEGATO, AMMINISTRAZIONE);
        Dipendente dipendente4 = new Dipendente(1000, 125128, 1600, 100, DIRIGENTE, VENDITE);
        dipendente1.promuovi();
        dipendente3.promuovi();
        Dipendente.stampaDatiDipendente(dipendente1);
        Dipendente.stampaDatiDipendente(dipendente2);
        Dipendente.stampaDatiDipendente(dipendente3);
        Dipendente.stampaDatiDipendente(dipendente4);

        Dipendente[] myArr = {dipendente1, dipendente2, dipendente3, dipendente4};
        double stipendioTotale = 0;
        for (Dipendente dipendente : myArr) {
            stipendioTotale = stipendioTotale + Dipendente.calcolaPaga(dipendente, 5);
        }
        System.out.println("Lo stipendio totale ammonta a: " + stipendioTotale + "$");
    }
}