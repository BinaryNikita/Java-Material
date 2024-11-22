package Exception;

public class _try2 {
    public static void main(String[] args) {
        int[] arr = {8, 9, 7, 6, 8};
        try {
            for(int i = 0; i <= arr.length; i++){
                System.out.println(arr[i]);  
            } 
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            }

finally{
    System.out.println("Finally block");
}
      
    }
}
