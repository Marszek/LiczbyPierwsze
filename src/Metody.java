import java.util.InputMismatchException;
import java.util.Scanner;

public class Metody {
    public int podajLiczbe(){
        int liczba=0;
        Scanner s= new Scanner(System.in);
        try {
            liczba = s.nextInt();
        } catch (InputMismatchException ime){
            System.out.println("Nie podales liczby naturalnej wiekszej od 2");
        }
        return liczba;
    }

    public void wypiszLiczby(int x){

        int a;
        for(a=2;a<x;a++) {
            int b=2;
            while (a % b != 0) {
                b++;
            }
            if(a==b){
                System.out.println(a);
            }

        }
    }
}
