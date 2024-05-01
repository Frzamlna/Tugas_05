// Kelas utama untuk memesan tiket

import java.util.Scanner;

// Kelas utama untuk program pemesanan tiket
public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket!");

        System.out.print("Masukkan nama pemesan: ");
        String namaPemesan = scanner.nextLine();

        System.out.println("\nPilih tahap pembelian:");
        System.out.println("1. Presale");
        System.out.println("2. Reguler");
        System.out.print("Pilih tahap pembelian (1/2): ");
        int tahapPembelianInput = scanner.nextInt();
        scanner.nextLine(); // Konsumsi enter yang tersisa

        String tahapPembelian;

        if (tahapPembelianInput == 1) {
            tahapPembelian = "Presale";
        } else if (tahapPembelianInput == 2) {
            tahapPembelian = "Reguler";
        } else {
            System.out.println("Tahap pembelian tidak valid.");
            return;
        }

        System.out.println("\nPilih jenis tiket:");
        if (tahapPembelian.equals("Presale")) {
            System.out.println("2. VIP");
            System.out.println("3. VVIP");
        } else {
            System.out.println("1. Festival");
            System.out.println("2. VIP");
            System.out.println("3. VVIP");
        }

        System.out.print("Pilih jenis tiket (1/2/3): ");
        int jenisTiketInput = scanner.nextInt();

        Tiket tiket = null;
        boolean validJenisTiket = true;

        switch (jenisTiketInput) {
            case 1:
                if (tahapPembelian.equals("Presale")) {
                    System.out.println("Tiket Festival tidak tersedia pada tahap Presale.");
                    validJenisTiket = false;
                } else {
                    tiket = new Festival();
                }
                break;
            case 2:
                tiket = new VIP();
                if (tahapPembelian.equals("Presale")) {
                    tiket.setHargaTiket((int) (tiket.getHargaTiket() * 0.8)); // Diskon 20%
                }
                break;
            case 3:
                tiket = new VVIP();
                if (tahapPembelian.equals("Presale")) {
                    tiket.setHargaTiket((int) (tiket.getHargaTiket() * 0.8)); // Diskon 20%
                }
                break;
            default:
                System.out.println("Jenis tiket tidak valid.");
                validJenisTiket = false;
        }

        if (!validJenisTiket) {
            return;
        }

        System.out.print("\nMasukkan jumlah tiket yang ingin dibeli: ");
        int jumlahTiket = scanner.nextInt();

        Pemesanan pemesanan = new Pemesanan(namaPemesan, tahapPembelian, tiket, jumlahTiket);

        pemesanan.cetakNota(); // Cetak nota pesanan
    }
}