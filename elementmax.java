import java.util.Scanner;

public class elementmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");
        int nums1 = sc.nextInt();
        int nums2 = sc.nextInt();
        int nums3 = sc.nextInt();
        int nums4 = sc.nextInt();
        int nums5 = sc.nextInt();

        int max = nums1;

        if (max < nums2)
            max = nums2;
        if (max < nums3)
            max = nums3;
        if (max < nums4)
            max = nums4;
        if (max < nums5)
            max = nums5;

        System.out.println("Maximum number is: " + max);

        
    }
}
