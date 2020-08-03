public class Ksiazka implements Wiadomosc {

    @Override
    public void wyswetlWiadomosc() {
        System.out.println("Wiadomosc z Booka");
    }

    public Wydawca wydawca;

    public Ksiazka(Wydawca wydawca) {
        this.wydawca = wydawca;
    }

    public Ksiazka() {
    }


    public Wydawca getWydawca() {
        return wydawca;
    }

    public void setWydawca(Wydawca wydawca) {
        this.wydawca = wydawca;
    }
}
