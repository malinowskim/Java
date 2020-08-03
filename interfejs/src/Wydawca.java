public enum Wydawca {
    PolishDruk(50),
    HermutPress(120),
    BMCUWydawca(90);

    private int naklad;

    Wydawca(int naklad){
        this.naklad = naklad;
    }

    public int getNaklad() {
        return naklad;
    }

    public void setNaklad(int naklad) {
        this.naklad = naklad;
    }
}

