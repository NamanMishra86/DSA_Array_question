import java.util.Arrays;
import java.util.Collections;

class Revers{
    public static void main(String[]args){
        Integer[] arr= {1,2,3,4,5};

        Collections.reverse(Arrays.asList(arr));

       System.out.print("Reverse array: ");
for (int num : arr){
    System.out.print(num + " ");


      }
    }
}