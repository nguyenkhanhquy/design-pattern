public abstract class SortingAlgorithm {

    public void sort(int[] arr) {
        initialize();
        peformSort(arr);
        printResult(arr);
    }

    protected void initialize() {
        System.out.println("Khởi tạo thuật toán: " + getClass().getSimpleName());
    }

    abstract protected void peformSort(int[] arr);

    protected void printResult(int[] arr) {
        System.out.print("Kết quả: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
