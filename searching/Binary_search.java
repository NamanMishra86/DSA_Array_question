package searching;

public class Binary_search {
    public static void main(String[] args) {

        int[] n = {2, 5, 7, 9, 12, 15, 18, 20, 25, 30};
        
        int target = 18;
        
        int st = 0;
        int end = n.length - 1;
        int mid;
        
        boolean found = false;

        while (st <= end) {

            mid = (st + end) / 2;

            if (n[mid] == target) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            }
            else if (n[mid] < target) {
                st = mid + 1;   // go right
            }
            else {
                end = mid - 1;  // go left
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}
