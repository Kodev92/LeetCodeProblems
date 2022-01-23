package leetcode;

public class MyMath {

    public int gcd(int a, int b){
        int result;
        if (a == 0) return b;
        if (b == 0) return a;
        if (a > b) result = gcd(b, a % b);
        else result = gcd(a, b % a);
        return result;
    }

    public int lcm(int a, int b){
        return a * b / gcd(a ,b);
    }
}
