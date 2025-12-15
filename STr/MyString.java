// import java.util.*;

// public class MyString {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the name: ");
//         String str = sc.nextLine();

//         System.out.println("Entered name is: " + str);
//     }
// }
import java.util.*;
public class MyString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // concatenation of Strings
        String Firstname="naman";
        String Lastname="mishra";
        String Fullname=Firstname + " " + Lastname;
        System.out.println(Fullname.length());
        // charAT 
        for(int i=0;i<Fullname.length();i++){
            System.out.println(Fullname.charAt(i));
        }

    }
}