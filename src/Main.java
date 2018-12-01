import java.util.Arrays;

public class Main {
    private static int[] a = {12,1, 6,55,69,10, 5, 9 ,7, 8,25};

    public static void main(String[] args) {
        SimpleSort.fastSort(a, 0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
