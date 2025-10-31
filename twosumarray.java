public class twosumarray {
    public static void main(String args[]){
        int[] num = {2,7,11,9};
        int target = 9;

        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                if(num[i]+num[j]== target){
                    System.out.println("indices:"+i+"and"+j);
                    System.out.println("number"+ num[i]+"+"+num[j]+"="+ target);
                }
            }
        }
    }
    
}
