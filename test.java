public class test {
    public static void main(String[] args) {
        int[][] arrays = new int[3][];

        arrays[0] = new int[] {5, 7, 6, 4};
        arrays[1] = new int[] {1, 3, 1, 8};
        arrays[2] = new int[] {9, 2, 3, 5};

        for(int[] arr: arrays) {
            for(int n: arr) {
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
