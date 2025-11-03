public class fibonic {
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {   // changed 0 → 1 so loop runs once
            int a = 0;
            int b = 1;
            while (b <= 55) {           // <= so it prints 55 too
                System.out.println(b);
                int temp = a + b;       // store next number
                a = b;
                b = temp;
            }
        }
    }
}

