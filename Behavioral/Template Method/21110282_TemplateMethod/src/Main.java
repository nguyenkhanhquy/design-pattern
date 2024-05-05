public class Main {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        System.out.print("Mảng ban đầu: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        SortingAlgorithm bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);

        SortingAlgorithm quickSort = new QuickSort();
        quickSort.sort(arr);
    }

}
