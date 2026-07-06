public class Fourteen {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        if (args.length != rows * cols) {
            System.out.println("Please enter " + (rows * cols) + " integer numbers");
            return;
        }
        int[][] arr = new int[rows][cols];
        int k = 0;
        int max = Integer.MIN_VALUE;
        System.out.println("The given array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = Integer.parseInt(args[k++]);
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("The biggest number in the given array is " + max);
    }
}