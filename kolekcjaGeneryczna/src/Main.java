import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Double> lista = new ArrayList<>();

        lista.add(2.50);
        lista.add(5.70);
        lista.add(8.50);
        lista.add(9.30);
        lista.add(10.00);
        //lista.add(12.00);


        double suma = 0.00;

        for (double i :lista
        ) {
            suma += i;

        }

        double mediana = 0.00;

        if (lista.size() % 2 == 0)
            mediana = (lista.get(lista.size() / 2) + lista.get(lista.size() / 2 - 1)) / 2;
        else
            mediana = lista.get(lista.size() / 2);

        System.out.println("Suma: " + suma);
        System.out.println("Srednia wynosi: " + (suma / lista.size()));
        System.out.println("Mediana wynosi: " + mediana);

    }

}
