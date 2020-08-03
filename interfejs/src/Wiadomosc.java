public interface Wiadomosc {

    void wyswetlWiadomosc();

    default void pokazCzas(){
        System.out.println("Czas nie jest istotny...");
    }

}
