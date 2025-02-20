public class mataKuliah10 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi() {
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Nama : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }

    void ubahSKS(int ubahSKS) {
        sks = ubahSKS;
    }

    void tambahJam(int tambahJam) {
        jumlahJam += tambahJam;
    }

    void kurangiJam(int kurangJam) {
        if (kurangJam > jumlahJam) {
            System.out.println("Jumlah jam yang tersisa tidak cukup untuk dikurangi");
        } else {
            jumlahJam -= kurangJam;
        }
    }

    public mataKuliah10() {

    }

    public mataKuliah10(String nama, String kodeMK, int sks, int jmlJam) {
        this.nama = nama;
        this.kodeMK = kodeMK;
        this.sks = sks;
        jumlahJam = jmlJam;
    }
}
