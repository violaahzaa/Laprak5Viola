class Mahasiswa {
    private String nama;
    private int nilai;

    public Mahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public int getNilai() {
        return nilai;
    }
}

public class Soal11 {
    public static void main(String[] args) {
        Mahasiswa[] data = {
            new Mahasiswa("Rafi", 83),
            new Mahasiswa("Naila", 91),
            new Mahasiswa("Satria", 76),
            new Mahasiswa("Lina", 88)
        };

        System.out.println("=== Data Mahasiswa ===");
        for (Mahasiswa mhs : data) {
            System.out.println("Nama : " + mhs.getNama());
            System.out.println("Nilai : " + mhs.getNilai());
            System.out.println("----------------------");
        }

        Mahasiswa terbaik = data[0];
        for (Mahasiswa mhs : data) {
            if (mhs.getNilai() > terbaik.getNilai()) {
                terbaik = mhs;
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi:");
        System.out.println("Nama : " + terbaik.getNama());
        System.out.println("Nilai : " + terbaik.getNilai());
    }
}
