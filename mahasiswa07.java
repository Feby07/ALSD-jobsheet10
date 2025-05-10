public class mahasiswa07 {
    String nama;
    String nim;
    String prodi;
    String kelas;

    public mahasiswa07(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilData() {
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Prodi   : " + prodi);
        System.out.println("Kelas   : " + kelas);
    }
}
