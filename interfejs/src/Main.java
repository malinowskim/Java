public class Main {
    public static void main(String[] args) {

        Wiadomosc ksiazka = new Ksiazka();
        Wiadomosc tekst = new Tekst();

        print(ksiazka);
        ksiazka.pokazCzas();
        print(tekst);
        tekst.pokazCzas();

        Ksiazka ksiazka2 = new Ksiazka(Wydawca.HermutPress);
        System.out.println(ksiazka2.getWydawca().getNaklad());
    }

    public static void print(Wiadomosc wiadomosc) {
        wiadomosc.wyswetlWiadomosc();

    }



}


//    Proszę zrealizować interfejs opisujący dowolny fragment rzeczywistości.
//    Proszę zaproponować realizacje tego interfejsu w klasach implementujących go.
//    Proszę wyposażyć interfejs w domyślne metody.