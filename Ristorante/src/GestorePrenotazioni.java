import java.util.ArrayList;
import java.util.List;

public class GestorePrenotazioni {
    int interni;
    int esterni;
    
    List<Prenotazione> listaPrenotazioni = new ArrayList<>();

    public GestorePrenotazioni() {
    }

    public void stampaEsterni(){
        System.out.println(esterni);
    }
    public void stampaInterni(){
        System.out.println(interni);
    }
    public GestorePrenotazioni(int interni, int esterni) {
        this.interni = interni;
        this.esterni = esterni;
    }

    public int getInterni() {
        return interni;
    }

    public void setInterni(int interni) {
        this.interni = interni;
    }

    public int getEsterni() {
        return esterni;
    }

    public void setEsterni(int esterni) {
        this.esterni = esterni;
    }
    public Prenotazione trovaOggetto(int cod){
        List<Prenotazione> r = listaPrenotazioni.stream().filter(prenotazione -> (prenotazione.getCod() == cod)).toList();
        try{
            return r.get(0);
        }
        catch (Exception ex) {
            return null;
        }
    }

    public void terminaPrenotazione(int cod){
        Prenotazione p = trovaOggetto(cod);
        try{
            listaPrenotazioni.remove(p);
            if(p.getPr() == preferenza.INTERNA){
                interni += p.getN();
            }else{
                esterni += p.getN();
            }
        }
        catch (Exception e){
            System.out.println("La prenotazione numero "+cod+" non esiste");
        }

    }
    public void prenota(Prenotazione pg){
        if (pg.getPr() == preferenza.INTERNA) {
            if (interni - pg.getN() >= 0) {
                listaPrenotazioni.add(pg);
                interni = interni - pg.getN();
            } else {
                System.out.println("La prenotazione: "+pg.getCod() + ", non può essere prenotata: posti esauriti");
            }
        } else {
            if (esterni - pg.getN() >= 0) {
                listaPrenotazioni.add(pg);
                esterni = esterni - pg.getN();
            } else {
                System.out.println("La prenotazione: "+pg.getCod() + ", non può essere prenotata: posti esauriti");
            }
        }

    }
}
