public class tracing {
    public static void main(String args[]) {
        int j = 10;
        int x = 2, y = 2, z = 6;
        while (j >0) {
            y = 4 / x % 3 + z * y - 5;
            if (4 + x % 3 > 5) {
                x = y + (z--) + z;
                System.out.println(x);
            }
            if (4 - x % 3 < 5) {
                y = x + (--z) + y;
                System.out.println(y);
            }
            y /= 10;
            x++;
            j--;
        }
        int n = 3%1;
        System.out.println(n);
    }
}
