package searching;

import java.util.Scanner;

public class Linear_search {
//     public static void main (String arg[]){
//         int n , i, iteam;
//         int [] a;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("How many elemnet do you enter ");
//         n= sc.nextInt();
//         a= new int[n];
//         System.out.println("Enter  the element");
           
//         for(i=0;i<n;i++)
//             a[i]=sc.nextInt();


//             System.out.println("Enter find elemet");
//             iteam =sc.nextInt();
        


    

//            for(i=0;i<a.length;i++){
//             if (a[i] == iteam) {
                 

//                 System.out.println("iteam exit");
//                  break;
                
//             }
//          }
    
        
//     }
// }

public static void main (String arg[]){
    int n,i,iteam, c=0;
    Scanner sc =new Scanner(System.in);
    System.out.println("how many element do yor want to enter");
    n=sc.nextInt();
    int[] a=new int[n];
    System.out.println("Enter your element");

    for(i=0;i<n;i++)
     a[i]=sc.nextInt();
     System.out.println("enter find the elemmnt");
     iteam=sc.nextInt();

     for(i=0;i<a.length;i++){
        if(a[i]==iteam){
            c++;
        }
     }

     if(c>0){
        System.out.println("itam exit"+i);
     }
     else{
        System.out.println("iteam not exit");
     }
}}