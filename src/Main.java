public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę, do której chcesz uzyskać liczby pierwsze");
        Metody met= new Metody();
        int x=met.podajLiczbe();
        met.wypiszLiczby(x);

    }
}
