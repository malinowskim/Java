public class SeniorProgramista extends Pracownik{
    private String bonus;
    public SeniorProgramista(String imie, String nazwisko, int czas, String bonus) {
        super(imie, nazwisko, czas);
        this.bonus = bonus;
    }

}
