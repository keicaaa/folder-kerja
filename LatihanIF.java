import java.util.Scanner;

public class LatihanIF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char matematika, komputer;

        System.out.print("Suka matematika? ");
        matematika = input.next().charAt(0);

        System.out.print("Suka komputer? ");
        komputer = input.next().charAt(0);

        if (matematika == 'y') {
            if (komputer == 'y') {
                System.out.println("Jurusan = Teknik Informatika");
            }
        }
    }
}