public class LambdaTry {
    public static void main(String[] args) {
        LambdaIntf intValue = (value) -> (2*10);

//        implementation for the interface
        Converter conv = (s) -> Integer.valueOf(s);

//        now we can use the implemented method from the interface
        int convertedValue = conv.fun("10");
        System.out.println(convertedValue);
    }
}
interface LambdaIntf{
    int fun(int value);
}

interface Converter{
    int fun(String s);
}
