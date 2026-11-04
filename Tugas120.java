import java.util.Scanner;

public class Tugas120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Masukkan nilai n: ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("Nilai harus lebih dari 0 minimal 1");
                 
            }
        } while (n < 1);

        int total = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print( j + " ");
                total++;

            }
            System.out.println(); // Pindah ke baris baru setelah setiap baris angka
        }
        System.out.println("Total angka yang dicetak: " + total);
        sc.close();
    }
}