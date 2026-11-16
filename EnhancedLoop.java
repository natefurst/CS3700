public class EnhancedLoop {
    //matrixes 1 and 2
    public static void main(String[] args) {
        int[][] a = {
            {1, 7, 2},
            {9, 12, 6}
        };

        int[][] b = {
            {1, 8},
            {9, 10},
            {5, 5}
        };

        int[][] result = new int[2][2];

        // multiply the matrices
        int row = 0;
        for (int[] r : a) {
            int k = 0;
            for (int num : r) {
                int col = 0;
                for (int num2 : b[k]) {
                    result[row][col] = result[row][col] + num * num2;
                    col++;
                }
                k++;
            }
            row++;
        }

        // print the result
        System.out.println("The result is:");
        for (int[] r : result) {
            for (int num : r) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
