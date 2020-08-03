import static java.time.LocalDate.now;

public class Tekst implements Wiadomosc {

    @Override
    public void wyswetlWiadomosc() {
        System.out.println("Wiadomosc z Publication");
    }

    @Override
    public void pokazCzas() {
        System.out.println("Dziś: " + now());
    }
}
