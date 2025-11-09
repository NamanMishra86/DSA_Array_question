package Sorting;

//time and spase complexcity
//best case=o(n^2) No improvement since selection happens every time
//Average case=o(n^2)Always compares all elements
//west case=o(n^2)Reverse order still gives n² comparisons
public class selectionsort {
    public static void main(String[] args) {
        int arr[]={105,120,10,200,20};
        for(int i=0; i<arr.length-1; i++){
            int  minIndex =i;
            for(int j=i; j<arr.length; j++){
                if(arr[j]< arr[minIndex]){
                    
                    int temp = arr[minIndex];
                    arr[minIndex]=arr[j];
                    arr[j]= temp;
                }

            }
            
        }
        System.out.println("sorted Array:");
        for(int num:arr){
            System.out.print (num+" ");
    
        }
    }
    
}
