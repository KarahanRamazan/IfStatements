import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein : \n");
        int Zahl= scanner.nextInt();
        if (Zahl%2==0) {
            System.out.println("gerade zahl");
        }

        if (Zahl%2==1) {
            System.out.println("ungerade Zahl");
        }
        scanner.close();


    }
}