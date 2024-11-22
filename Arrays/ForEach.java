package Arrays;

public class ForEach {
    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 5};
        for(int i : arr){
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
