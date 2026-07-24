import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class LatihanMember {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Member> data = new ArrayList<>();

        while (true) {

            try {

                System.out.print("Nama : ");
                String nama = input.nextLine();

                if (nama.equals("-")) {
                    break;
                }

                System.out.print("Score : ");
                int score = input.nextInt();
                input.nextLine();

                Member m = new Member();
                m.nama = nama;
                m.score = score;

                data.add(m);

            } catch (InputMismatchException e) {

                System.out.println("Score harus berupa angka!");
                input.nextLine();

            }

        }

        System.out.println("\n=== Daftar Member ===");

        for (int i = 0; i < data.size(); i++) {

            System.out.println("Nama  : " + data.get(i).nama);
            System.out.println("Score : " + data.get(i).score);
            System.out.println();

        }

    }

}