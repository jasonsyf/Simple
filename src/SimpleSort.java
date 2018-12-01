
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


    static void insertSort(int[] items, int count) {
        if (count <= 1) {
            return;
        }
        for (int i = 1; i < count; i++) {
            int value = items[i];
            int j = i - 1;
            //查找插入的位置
            for (; j >= 0; j--) {
                if (items[j] > value) {
                    items[j + 1] = items[j];//数据移动
                } else {
                    break;
                }
            }
            items[j + 1] = value;
        }
    }

    static void selectionSort(int[] items, int count) {
        if (count <= 1) {
            return;
        }
        for (int i = 0; i < count; i++) {
            int k = i;
            for (int j = i + 1; j < count; j++) {
                if (items[j] < items[k]) {
                    k = j;
                }
            }
            if (k > i) {
                swap(items, i, k);
            }
        }
//        int minPoi = 0;
//        int i = 0;
//        for (; i < count; i++) {
//            int minValue = items[i];
//            for (int j = i+1 ; j < count; j++) {
//                if (minValue > items[j]) {
//                    minValue = items[j];
//                    minPoi = j;
//                }
//            }
//            if (minPoi>i ) {
//                swap(items, i, minPoi);
//            }
//        }

    }

    static void fastSort(int[] items, int low, int high) {
        if (low >= high) {
            return;
        }
        int m = items[low];
        int i = low, j = high;
        while (i < j) {
            while (items[j] > m && i < j) {
                j--;
            }
            if (i < j) {
                items[i++] = items[j];
            }
            while (items[i] < m && i < j) {
                i++;
            }
            if (i < j) {
                items[j--] = items[i];
            }
        }
        items[i] = m;
        fastSort(items, low, i - 1);
        fastSort(items, i + 1, high);
    }

    private static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
