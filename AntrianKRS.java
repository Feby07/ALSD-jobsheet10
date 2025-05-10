public class AntrianKRS {
    mahasiswa07[] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahDiproses = 0;
    int kapasitasDPA = 30;
    public AntrianKRS(int max) {
        this.max = max;
        this.data = new mahasiswa07[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == max;
    }
    public void tambahkanAntrian (mahasiswa07 mhs) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
            return;
        } 
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println("Mahasiswa " + mhs.nama + " berhasil ditambahkan ke antrian.");
    }
    public void prosesKRS() {
        if (jumlahDiproses >= kapasitasDPA) {
            System.out.println("DPA telah menangani maksimal 30 Mahasiswa,");
            return;
        }

        int proses;
        if (size >= 2) {
            proses = 2; 
        } else if (size == 1) {
            proses = 1;
        } else {
            proses = 0;
        }

        if (proses == 0) {
            System.out.println("Yidak ada mahasiswa dalam antrian");
            return;
        }

        System.out.println("Mahasiswa yang diproses: ");
        for (int i = 0; i < proses; i++) {
            data[front].tampilData();
            front = (front + 1) % max;
            size--;
            jumlahDiproses++;
        }
    }
    public void tampilSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilData();
        }
    }
    public void lihatDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Dua Mahasiswa terdepan: ");
        int terdepanPertama = front;
        int terdepanKedua = (front + 1) % max;

        System.out.println("1. ");
        data[terdepanPertama].tampilData();

        if (size > 1) {
            System.out.println("2. ");
            data[terdepanKedua].tampilData();
        } else {
            System.out.println("Hanya ada satu mahasiswa dalam antrian.");
        }
    }
    public void tampilPalingAkhir() {
        if (isEmpty()) {
            System.out.println();
        } else {
            System.out.println("Mahasiswa paling akhir dalam antrian: ");
            data[rear].tampilData();
        }
    }
    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }
     public void cetakJumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    public void cetakJumlahDiproses() {
        System.out.println("Jumlah mahasiswa yang sudah proses KRS: " + jumlahDiproses);
    }

    public void cetakBelumDiproses() {
        System.out.println("Sisa kuota mahasiswa yang bisa diproses oleh DPA: " + (kapasitasDPA - jumlahDiproses));
    }
}
