import java.util.Arrays;

public class Main {
    private static int[] a = {1, 6, 5, 7, 9, 8};

    public static void main(String[] args) {
        SimpleSort.bubbleSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }
}
