public class missingvalue {
    public static void main(String[] args) {
        int arr[]={1,2,3,5};

        int n= arr.length + 1;
        int total= n*(n+1)/2;
        int sum = 0;

        for( int num:arr){
            sum+= num;

        }
        int missing= total-sum;
        System.out.println("missing number"+ missing);
    }
    
}
