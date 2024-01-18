import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String>A = new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите строку: ");
            A.add(scanner.nextLine());
        }
        System.out.println("Список А: " + A);


        ArrayList<String>B = new ArrayList<>();
        Scanner scanner1= new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите строку: ");
            B.add(scanner1.nextLine());
        }
        System.out.println("Список B: " + B);

        ArrayList<String>C = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            C.add(A.get(i));
            C.add(B.get(i));
        }
        System.out.println("Список С: "+ C);

        C.sort(Comparator.comparing(String::length));
        System.out.println("После сортировки: " + C);

    }
}