public class Soal5 {
    public static void main(String[] args) {
        String[] hewan = {"Kucing", "Anjing", "Kelinci", "Burung", "Ikan"};

        System.out.println("Daftar Hewan Bu Yuyun:");
        for (int i = 0; i < hewan.length; i++) {
            System.out.println((i + 1) + ". " + hewan[i]);
        }
    }
}
