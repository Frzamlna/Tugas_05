// Kelas Tiket sebagai dasar untuk semua jenis tiket
class Tiket {
    private String namaTiket;
    private int hargaTiket;

    public Tiket(String namaTiket, int hargaTiket) {
        this.namaTiket = namaTiket;
        this.hargaTiket = hargaTiket;
    }

    public String getNamaTiket() {
        return namaTiket;
    }

    public int getHargaTiket() {
        return hargaTiket;
    }

    public void setHargaTiket(int harga) {
        this.hargaTiket = harga;
    }
}
