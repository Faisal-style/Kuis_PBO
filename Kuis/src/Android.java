public class Android extends Nilai {
    String nama;
    int nik;

    Android(String nama, int nik) {
        super(nama, nik);
        // TODO Auto-generated constructor stub
        this.nama = nama;
        this.nik = nik;
    }

    public int NilaiTotal() {
        return (tulis * 20 / 100) + (coding * 50 / 100) + (wawancara * 30 / 100);
    }
}
