package DivisonWithoutDivision;

public class Solution {
    public int divide(int dividend, int divisor) {
        if((dividend > Integer.MAX_VALUE) || (dividend < Integer.MIN_VALUE)){
            return Integer.MAX_VALUE;
        }
        if(((dividend == Integer.MAX_VALUE) && (divisor < 0))) {
            return Integer.MAX_VALUE;
        }
        int quotient = 0, sum = 0;
        int sign = -1;
        sign = ( ((dividend < 0) && (divisor > 0)) || ((dividend > 0) && (divisor < 0))  )? -1 : 1;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        if(dividend<divisor)
            return 0;
        while( (sum < dividend)){
            sum += divisor;

            quotient = (sum<=dividend) ? quotient+1 : quotient;
        }
        return sign*quotient;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

//        Systestem.out.println(obj.divide(1,1));
        System.out.println(obj.divide(-2147483648,-1));
    }
}



