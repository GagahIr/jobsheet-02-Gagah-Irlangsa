public class mahasiswa10 {

    String nim;
    String nama;
    String kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIPK(double ipkBaru) {
        if (ipk <= 0 || ipk > 4) {
            System.out.println("IPK tidak valid. Harus antara 0 dan 4");
        } else {
            ipk = ipkBaru;
        }
    }

    String nilaiKinerja() {
       if (ipk >= 3.5) {
           return "Kinerja Sangat Baik";
       } else if (ipk >= 3.0) {
           return "Kinerja Baik";
       } else if (ipk >= 2.0) {
           return "Kinerja Cukup";
       } else {
           return "Kinerja Kurang";
       }
    }

    public mahasiswa10(){
        
    }
    
    public mahasiswa10(String nm, String nim, double ipk, String kls){
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
}