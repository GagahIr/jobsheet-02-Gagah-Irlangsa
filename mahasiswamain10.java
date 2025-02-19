public class mahasiswamain10 {
    public static void main(String[] args) {
        mahasiswa10 mhs1 = new mahasiswa10();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();

        mahasiswa10 mhs2 = new mahasiswa10("Annisa Nabila", "21417201", 3.25, "TI 2L");
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();

       mahasiswa10 mhsGagahIrlangsa = new mahasiswa10("Gagah Irlangsa E.Y", "2443434433", 2.68, "SIB 1B");
       mhsGagahIrlangsa.updateIPK(-3.2);
       mhsGagahIrlangsa.tampilkanInformasi();
    }
}
