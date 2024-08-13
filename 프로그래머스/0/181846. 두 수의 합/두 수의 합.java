import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger num = new BigInteger(a);
        BigInteger num1 = new BigInteger(b);
        BigInteger sum = num.add(num1);
        return sum.toString();
    }
}