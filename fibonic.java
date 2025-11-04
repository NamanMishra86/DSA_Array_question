public class fibonic {
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {   
            int a = 0;
            int b = 1;
            while (b <= 55) {           
                System.out.println(b);
                int temp = a + b;       
                a = b;
                b = temp;
            }
        }
    }
}

