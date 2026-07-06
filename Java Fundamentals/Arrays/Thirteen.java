public class Thirteen {
    public static void main(String[] args) {
        int rows = 2;
        int cols = 2;
        if (args.length != rows * cols) {
            System.out.println("Please enter " + (rows * cols) + " integer numbers");
            return;
        }
        int[][] arr = new int[rows][cols];
        int k = 0;
        System.out.println("The given array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = Integer.parseInt(args[k++]);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The reverse of the array is:");
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}