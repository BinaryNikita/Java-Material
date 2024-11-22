package Arrays;

public class _AnonymousArray {
    public static void main(String[] args) {
        printArray(new int[][]{{78,9,2,34,76,78,4,5},{7,4,32,5},{89,9,8,7}} );
    }

    public static void printArray(int[][] array) {
        for (int[] i : array) {
            for(int num : i){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
    

