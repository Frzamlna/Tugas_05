
// Kelas Pemesanan untuk menangani pemesanan tiket
class Pemesanan {
    private String namaPemesan;
    private String tahapPembelian;
    private Tiket tiket;
    private int jumlahTiket;

    public Pemesanan(String namaPemesan, String tahapPembelian, Tiket tiket, int jumlahTiket) {
        this.namaPemesan = namaPemesan;
        this.tahapPembelian = tahapPembelian;
        this.tiket = tiket;
        this.jumlahTiket = jumlahTiket;
    }

    public void cetakNota() {
        System.out.println("\n--- Nota Pemesanan ---");
        System.out.println("Nama Pembeli: " + namaPemesan);
        System.out.println("Tahap Pembelian: " + tahapPembelian);
        System.out.println("Jenis Tiket: " + tiket.getNamaTiket());
        System.out.println("Harga per Tiket: Rp" + tiket.getHargaTiket());
        System.out.println("Jumlah Tiket: " + jumlahTiket);
        System.out.println("Total Harga: Rp" + (tiket.getHargaTiket() * jumlahTiket));
    }
}