class Reversenext {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        // Reverse array
        for(int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

        // Print after fully reversed
        System.out.print("Reversed array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}

  