import java.util.Scanner;

public class Tugas220 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        do {
            System.out.print("Masukkan n: ");
            n = input.nextInt();
            if (n < 3) {
                System.out.println("n harus minimal 3!");
            }
        } while (n < 3);

        int lebar = String.valueOf(n * n).length() + 1;
        String format = "%" + lebar + "d";

        long jumlah = 0;

        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int hasil = i * j;
                System.out.printf(format, hasil);
                jumlah += hasil;
            }
            System.out.println();
        }

        System.out.println("\nJumlah seluruh angka pada tabel: " + jumlah);
        input.close();
    }
}
