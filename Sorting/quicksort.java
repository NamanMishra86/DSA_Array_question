package Sorting;




 class quicksort {
    static int partition(int arr[], int low, int high){
    int pivot =arr[high];
    int i = low-1;
    int j=0;

    for( j = low; j<high; j++){
        if(arr[j]<pivot){
            i++;
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

    }
    int temp = arr[i+1];
    arr[i+1] = arr[high];
    arr[high]= temp;
    return i+1;
    
}
static void quicksort(int[] arr, int low, int high){
    if(low<high){

        int pi= partition(arr, low, high);
        quicksort(arr,low,pi-1);
        quicksort(arr,pi+1,high);


        }
    }
    static void print(int[] arr){

    for(int num:arr){  //for each loop
        System.out.print(num+"\t");
    }
    System.out.println();

}

    public static void main(String[] args) {
        int[] arr={28,55,46,38,16,89,83,30};
        print(arr);
        quicksort(arr,0,arr.length-1);
        print(arr);
        
    }
    
}
