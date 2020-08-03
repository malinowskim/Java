public enum DniTygodnia {
    poniedzialek("Poniedzialek"),
    wtorek("Owocowy Wtorek"),
    sroda("Sroda"),
    czwartek("Czwartek"),
    piatek("Piatek"),
    sobota("Daj spokoj jest wolne..."),
    niedziela("Niedziela");

    private String dzienTygodnia;

    DniTygodnia(String dzienTygodnia) {
        this.dzienTygodnia = dzienTygodnia;
    }

    public String getDzienTygodnia() {
        return dzienTygodnia;
    }

    public void setDzienTygodnia(String dzienTygodnia) {
        this.dzienTygodnia = dzienTygodnia;
    }
}
