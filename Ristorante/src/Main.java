public class Main {
    public static void main(String[] args) {
        GestorePrenotazioni g = new GestorePrenotazioni(5, 5);
        Prenotazione p1 = new PrenotazioneGruppo(1, preferenza.INTERNA, 2);
        Prenotazione p2 = new PrenotazioneGruppo(2, preferenza.INTERNA, 2);
        Prenotazione p3 = new PrenotazioneGruppo(3, preferenza.ESTERNA, 3);
        Prenotazione p4 = new PrenotazioneSingola(4, preferenza.ESTERNA);
        g.prenota(p1);
        g.prenota(p2);
        g.prenota(p3);
        g.prenota(p4);
        //g.terminaPrenotazione(2);
        //g.terminaPrenotazione(1);
        //g.terminaPrenotazione(4);
        //g.terminaPrenotazione(3);
        g.stampaInterni();
        g.stampaEsterni();
    }
}