import java.util.Scanner;

public class LatihanBilanganPrima {

    static boolean bilanganPrima(int angka) {

        if (angka < 2) {
            return false;
        }

        for (int i = 2; i < angka; i++) {
            if (angka % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int angka = input.nextInt();

        if (bilanganPrima(angka)) {
            System.out.println(angka + " adalah bilangan prima");
        } else {
            System.out.println(angka + " bukan bilangan prima");
        }

    }
}