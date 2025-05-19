
import java.util.Scanner;


public class MaxValueInEach2DLayerIn3DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][][]arr = new int[b][r][c];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                for(int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.println("3D Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Layer " + (i + 1) + ":" );
            for(int j = 0; j < arr[i].length; j++) {
                for(int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                            System.out.println();
            }
        }

        for(int i = 0; i < arr.length; i++) {
            int max = arr[0][0][0];
            for(int j = 0; j < arr[i].length; j++) {
                for(int k = 0; k < arr[i][j].length; k++) {
                    if(arr[i][j][k] > max) {
                        max = arr[i][j][k];
                    }
                 }
            }
            System.out.println("Maximum element of layer " + (i + 1) + ": " + max);
        }
        sc.close();
    }
}
