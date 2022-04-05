public class Web extends Nilai {
    String nama;
    int nik;

    Web(String nama, int nik) {
        super(nama, nik);
        // TODO Auto-generated constructor stub
        this.nama = nama;
        this.nik = nik;
    }

    public int NilaiTotal() {
        return (tulis * 40 / 100) + (coding * 35 / 100) + (wawancara * 25 / 100);
    }

}
