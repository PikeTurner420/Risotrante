public class Prenotazione {
    int cod;
    preferenza pr;
    int n;

    public Prenotazione(int cod, preferenza pr) {
        this.cod = cod;
        this.pr = pr;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public preferenza getPr() {
        return pr;
    }

    public void setPr(preferenza pr) {
        this.pr = pr;
    }
}
