import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pracownik m1 = new Manager("ziomek","ziomowy",550);
        Pracownik j1 = new JuniorProgramista("ja","pierdola",10000, true);
        Pracownik s1 = new SeniorProgramista("Maciej","UratujMnie", 150, "KartaSportowa");

        int projekt = projekt(m1, j1, s1);
        System.out.println("czas realizacji projektu: " + projekt + " godzin.");;

        Pracownik[] listaPracownikow = listaObecnosci(m1, j1, s1);
        for (Pracownik pracownik:listaPracownikow
             ) {
            System.out.println(pracownik.getClass().getTypeName() + "  " + pracownik.toString());
        }

        System.out.println("Wybierz dzień na najlepszy dzień tygodnia:");
        Scanner scanner = new Scanner(System.in);
        String wprowadz = scanner.nextLine().toLowerCase();
        DniTygodnia wybranyDzien = DniTygodnia.valueOf(wprowadz);
        System.out.println("Wybrales " + wybranyDzien.getDzienTygodnia());


        String dzienOwoca = DniTygodnia.czwartek.toString();
        System.out.println("Najlepszy dzien w biurze to: "+ dzienOwoca);
        scanner.close();
    }

    public static int projekt(Pracownik... pracownicy){
        int liczCzas = 0;
        for (Pracownik pracownik:pracownicy
             ) {
            liczCzas += pracownik.getCzas();
        }
        return liczCzas;
    }

    public static Pracownik[] listaObecnosci(Pracownik... pracownicy){
        Pracownik[] tablica = new Pracownik[pracownicy.length];
        int i = 0;
        for (Pracownik pracownik:pracownicy
             ) {
            tablica[i] = pracownik;
            i++;
        }
        return tablica;
    }
}
