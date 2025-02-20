public class dosenMain10 {
    public static void main(String[] args) {
        dosen10 dsn1 = new dosen10();

        dsn1.idDosen = "878787782";
        dsn1.nama = "Dr. Liodora Sp.OG";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2020;
        dsn1.bidangKeahlian = "Spesialis Obgyn";

        dsn1.tampilkanInformasi();
        System.out.println();
        System.out.println("Lama Mengajar : " + dsn1.hitungMasaKerja(2025) + " Tahun");
        dsn1.ubahKeahlian("Spesialis Kandungan");
        dsn1.setStatusAktif(false);
        dsn1.tampilkanInformasi();

        System.out.println();
        dosen10 dsn2 = new dosen10("42423879", "Dr. Putri Sp.JP", true, 2010, "Spesialis Jantung");
        dsn2.tampilkanInformasi();
        dsn2.setStatusAktif(false);
        System.out.println("Lama Mengajar : " + dsn2.hitungMasaKerja(2025) + " Tahun");
        System.out.println();
        dsn2.tampilkanInformasi();
    }
}
