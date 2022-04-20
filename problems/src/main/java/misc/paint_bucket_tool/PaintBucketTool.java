package misc.paint_bucket_tool;

import java.util.Scanner;

public class PaintBucketTool {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        array = recursiveFill(array, x, y, size);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] recursiveFill(int[][] array, int x, int y, int size) {
        if (y+1 < size && array[x][y+1] == 0) {
            array[x][y+1] = 1;
            array = recursiveFill(array, x, y+1, size);
        }
        if (y-1 >= 0 && array[x][y-1] == 0) {
            array[x][y-1] = 1;
            array = recursiveFill(array, x, y-1, size);
        }
        if (x+1 < size && array[x+1][y] == 0) {
            array[x+1][y] = 1;
            array = recursiveFill(array, x+1, y, size);
        }
        if (x-1 >= 0 && array[x-1][y] == 0) {
            array[x-1][y] = 1;
            array = recursiveFill(array, x-1, y, size);
        }
        return array;
    }

}
/*

 Case 1: Escape.
 8
 7
 7
 0 0 0 0 0 0 0 0
 0 1 1 1 1 1 1 0
 0 0 0 0 0 0 1 0
 0 1 0 0 0 0 1 0
 0 1 0 0 0 0 1 0
 0 1 0 0 0 0 1 0
 0 1 1 1 1 1 1 0
 0 0 0 0 0 0 0 0

 Case 2: Fill outer border.
 8
 7
 7
 0 0 0 0 0 0 0 0
 0 1 1 1 1 1 1 0
 0 1 0 0 0 0 1 0
 0 1 0 0 0 0 1 0
 0 1 0 0 0 0 1 0
 0 1 0 0 0 0 1 0
 0 1 1 1 1 1 1 0
 0 0 0 0 0 0 0 0

 Case 3: Fill in square.
 8
 3
 3
 0 0 0 0 0 0 0 0
 0 1 1 1 1 1 1 0
 0 1 0 0 0 0 1 0
 0 1 0 0 0 0 1 0
 0 1 0 0 0 0 1 0
 0 1 0 0 0 0 1 0
 0 1 1 1 1 1 1 0
 0 0 0 0 0 0 0 0

 Case 4: Fill arbitrary shape.
 8
 2
 5
 0 0 0 0 0 0 0 0
 0 1 1 0 0 1 1 0
 0 1 0 1 1 0 1 0
 0 1 0 0 0 0 1 0
 0 1 0 0 1 1 1 0
 0 1 0 0 1 0 0 0
 0 1 1 1 1 0 0 0
 0 0 0 0 0 0 0 0

 */