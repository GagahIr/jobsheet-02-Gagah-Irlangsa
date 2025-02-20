public class mataKuliahMain {
    public static void main(String[] args) {
        mataKuliah10 matkul1 = new mataKuliah10();
        

        matkul1.kodeMK = "PBO";
        matkul1.jumlahJam = 2;
        matkul1.sks = 2;
        matkul1.nama = "Pemrograman berbasis objek";

        matkul1.tampilkanInformasi();
        matkul1.tambahJam(1);
        matkul1.ubahSKS(3);
        matkul1.tampilkanInformasi();
        matkul1.kurangiJam(2);
        matkul1.tampilkanInformasi();

        mataKuliah10 matkul2 = new mataKuliah10("Basis Data", "BD", 2, 4);
        matkul2.ubahSKS(4);
        matkul2.kurangiJam(3);
        matkul2.tampilkanInformasi();
    }
}
