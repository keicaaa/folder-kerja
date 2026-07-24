import java.util.Scanner;

public class LoopKotak {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int panjang, lebar;

        System.out.print("Panjang? ");
        panjang = input.nextInt();

        System.out.print("Lebar? ");
        lebar = input.nextInt();

        for (int i = 1; i <= panjang; i++) {
            for (int j = 1; j <= lebar; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}