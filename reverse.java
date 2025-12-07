import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

        // int rev=0;
        // while(num!=0){
        //     rev=rev*10+num%10;
        //     num=num/10;
        // }

        StringBuffer rev;
        StringBuffer sb=new StringBuffer(String.valueof(num));
        rev = sb.reverse();
        System.out.println("after reverse number"+rev);
    }
    
}
