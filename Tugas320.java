import java.util.Scanner;

public class Tugas320 {
    static int bacaBilangan(Scanner input, String pesan, int minimal) {
        int nilai;
        do {
            System.out.print(pesan);
            nilai = input.nextInt();
            if (nilai < minimal) {
                System.out.println("Input tidak valid! Minimal " + minimal + ".");
            }
        } while (nilai < minimal);
        return nilai;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahToko = bacaBilangan(input, "Masukkan jumlah toko (minimal 1): ", 1);

        int totalSemuaBarang = 0;
        int tokoTerbanyak = 0;
        int barangTerbanyak = -1;
        StringBuilder ringkasan = new StringBuilder();
        for (int toko = 1; toko <= jumlahToko; toko++) {
            System.out.println("\nToko " + toko);
            int jumlahPelanggan = bacaBilangan(input, "Jumlah pelanggan: ", 0);

            int totalBarangToko = 0;

            for (int pelanggan = 1; pelanggan <= jumlahPelanggan; pelanggan++) {
                int barang = bacaBilangan(input, "Total barang yang dibeli: ", 0);
                totalBarangToko += barang;
            }

            ringkasan.append("Toko ").append(toko)
                     .append(" - pelanggan: ").append(jumlahPelanggan)
                     .append(", total barang: ").append(totalBarangToko)
                     .append("\n");

            totalSemuaBarang += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = toko;
            }
        }

        System.out.println();
        System.out.print(ringkasan);
        System.out.println("Total barang seluruh toko: " + totalSemuaBarang);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        input.close();
    }
}