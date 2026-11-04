import java.util.Scanner;

class NilaiKelompok20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah kelompok: ");
        int jumlahKelompok = sc.nextInt();
        System.out.print("Masukkan jumlah penilai: ");
        int jumlahPenilai = sc.nextInt();

        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus > 0.");
        } else {
            int nomorKelompok = 1;
            double rataTertinggi = -1;
            int kelompokTerbaik = 0;

            while (nomorKelompok <= jumlahKelompok) {
                System.out.println("kelompok " + nomorKelompok);
                double totalNilai = 0;

                for (int j = 1; j <= jumlahPenilai; j++) {
                    int nilai;
                    do {
                        System.out.print("Masukkan nilai penilai " + j + ": ");
                        nilai = sc.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println("Nilai harus 0 - 100. Ulangi input!");
                        }
                    } while (nilai < 0 || nilai > 100);
                    totalNilai += nilai;
                }

                double rataRata = totalNilai / jumlahPenilai;
                System.out.println("kelompok " + nomorKelompok + ": rata-rata = " + rataRata);

                if (rataRata > rataTertinggi) {
                    rataTertinggi = rataRata;
                    kelompokTerbaik = nomorKelompok;
                }

                System.out.println("==============================");
                System.out.println("Kelompok terbaik : " + kelompokTerbaik);
                System.out.println("Rata-rata tertinggi : " + rataTertinggi);

                nomorKelompok++;
            }
        }
        sc.close();
    }
}