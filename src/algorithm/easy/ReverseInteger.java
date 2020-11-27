package algorithm.easy;

public class ReverseInteger {
    public int reverse(int x) {
        int ans = 0, med;
        while(x != 0) {
            //奶奶的溢出判断坑死我了
            if(ans < Integer.MIN_VALUE / 10 || ans > Integer.MAX_VALUE / 10 ) {
                return 0;
            }
            med = x % 10;
            ans = ans * 10 + med;
            x = x / 10;
        }
        return ans;
    }
}
