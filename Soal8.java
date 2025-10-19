public class Soal8 {
    public static void main(String[] args) {
        int[][] angka = {
            {5, 1, 3},
            {2, 8, 4},
            {6, 7, 9}
        };

        int total = 0;

        System.out.println("Isi Matriks:");
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                System.out.print(angka[i][j] + " ");
                total += angka[i][j];
            }
            System.out.println();
        }

        System.out.println("\nJumlah semua elemen = " + total);
    }
}
