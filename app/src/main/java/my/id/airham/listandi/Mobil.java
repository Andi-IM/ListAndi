package my.id.airham.listandi;

public class Mobil {
    int icon;
    String harga;
    String nama;
    String bahan_bakar;
    String tahun;
    String lokasi;

    public Mobil() {

    }

    public Mobil(int icon, String harga, String nama, String bahan_bakar, String tahun, String lokasi) {
        this.icon = icon;
        this.harga = harga;
        this.nama = nama;
        this.bahan_bakar = bahan_bakar;
        this.tahun = tahun;
        this.lokasi = lokasi;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBahan_bakar() {
        return bahan_bakar;
    }

    public void setBahan_bakar(String bahan_bakar) {
        this.bahan_bakar = bahan_bakar;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
}
