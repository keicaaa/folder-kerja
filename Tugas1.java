import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Nilai: ");
        int nilai = input.nextInt();

        char grade;
        if (nilai >= 80) {
            grade = 'A';
        } else if (nilai >= 70) {
            grade = 'B';
        } else if (nilai >= 60) {
            grade = 'C';
        } else if (nilai >= 50) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        // Menentukan lulus/tidak
        String status;
        if (nilai >= 75) {
            status = "LULUS";
        } else {
            status = "TIDAK LULUS";
        }

        // Output
        System.out.println("\nNama: " + nama);
        System.out.println("Nilai: " + nilai);
        System.out.println("Grade: " + grade);

        System.out.println("\nHalo " + nama + ", kamu " + status + " dengan grade " + grade);

        input.close();
    }
}