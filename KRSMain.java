import java.util.Scanner;

public class KRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilihan;

        do {
            System.out.println("\n===== MENU ANTRIAN KRS =====");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses KRS (2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Cek Antrian Penuh");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("9. Cetak Jumlah Antrian");
            System.out.println("10. Cetak Jumlah Diproses");
            System.out.println("11. Cetak Mahasiswa Belum Proses KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    mahasiswa07 mhs = new mahasiswa07(nim, nama, prodi, kelas);
                    antrian.tambahkanAntrian(mhs);
                    break;
                case 2: 
                    antrian.prosesKRS(); 
                    break;
                case 3: 
                    antrian.tampilSemua(); 
                    break;
                case 4: 
                    antrian.lihatDuaTerdepan(); 
                    break;
                case 5: 
                    antrian.tampilPalingAkhir(); 
                    break;
                case 6: 
                    System.out.println(antrian.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong."); 
                    break;
                case 7: 
                    System.out.println(antrian.isFull() ? "Antrian penuh." : "Antrian tidak penuh."); 
                    break;
                case 8: 
                    antrian.clear(); 
                    break;
                case 9: 
                    antrian.cetakJumlahAntrian(); 
                    break;
                case 10: 
                    antrian.cetakJumlahDiproses(); 
                    break;
                case 11: 
                    antrian.cetakBelumDiproses(); 
                    break;
                case 0: 
                    System.out.println("Terima kasih."); 
                    break;
                default: 
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}
