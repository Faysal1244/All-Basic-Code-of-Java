package Array;

public class Array03 {
    public static void main(String[] args) {
        int[][] numbers = new int[4][5];
        int k = 0;
        //Assigning the value in array
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                numbers[i][j] = k;
                k++;
            }
        }
        //printing elements
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + numbers[i][j]);
            }
            System.out.println();
        }
    }
}
