import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (N >= 1) {
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = in.nextInt();
            }
            for (int i = N - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            in.close();
        }
    }
}