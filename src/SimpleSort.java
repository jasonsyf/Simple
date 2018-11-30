class SimpleSort {

    static void bubbleSort(int[] items, int count) {
        if (count <= 1) {
            return;
        }
        for (int i = 0; i < count; i++) {
            boolean isBubble = false;
            for (int j = 0; j < count - i - 1; j++) {
                if (items[j] > items[j + 1]) {
//                    int temp = items[j];
//                    items[j] = items[j + 1];
//                    items[j + 1] = temp;
                    swap(items, j, j + 1);
                    isBubble = true;
                }
            }
            if (isBubble) {
                break;
            }
        }
    }

    private static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
