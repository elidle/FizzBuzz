public class Reduce {
    public static void main(String[] args) {
        int i = 100, ans = 0;
        while (i > 0) {
            if (i % 2 == 0) {
                i /= 2;
            } else {
                i--;
            }
            ans++;
        }
        System.out.println(ans);;
    }
}
