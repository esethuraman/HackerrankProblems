package main.Array;

public class FlippingAnImage {


    public static void main(String[] args) {
//        int arr[][] = {{1,1,0},{1,0,1},{0,0,0}};
//        int arr[][] = {{1,0}, {0,0}};
        int arr[][] = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        new FlippingAnImage().flipAndInvertImage(arr);

    }



    public int[][] flipAndInvertImage(int[][] A) {

        int outerArrLength = A.length;
        int innerArrLength = A[0].length;
        int temp;
        System.out.println("Oringinal array ");
        printArr(A);

        int innerLengthBoundary = (innerArrLength%2==0) ? (innerArrLength/2-1) : (innerArrLength/2);
        for(int i=0; i < outerArrLength; i++){
            for(int j=0; j <= innerLengthBoundary; j++){
                temp = A[i][j];
                System.out.println();
                System.out.printf("flipping [%d][%d] with [%d][%d]", i, j, i ,(innerArrLength-j-1));
                A[i][j] = (A[i][innerArrLength-j-1]);
                A[i][innerArrLength-j-1] = (temp);
            }
        }
        System.out.println("The flipped array is ...");
        printArr(A);
        return A;
    }

    private void printArr(int[][] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private int flipValue(int bit) {

        System.out.println("original " + bit);
        int res = (bit==0) ? 1 : 0;
        System.out.println("flippedaaa " + res);
        return (bit==0) ? 1 : 0;
    }


}
