import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6};
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai k: ");
    int k = input.nextInt();
    int n = data.length;

    k = ((k % n) + n) % n; 

        reverse(data, 0, data.length - 1);
        reverse(data, 0, k - 1);
        reverse(data, k, data.length - 1);

        System.out.print("Hasil rotasi: ");
        for (int value : data) {
            System.out.print(value + " ");
        }
        input.close();
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

