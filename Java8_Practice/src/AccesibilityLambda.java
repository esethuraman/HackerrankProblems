import java.util.Arrays;
import java.util.List;

public class AccesibilityLambda {
    int instanceVariable;
    static int staticVariable;

    public void myFun(){

        DoubleTheNumber d = (n) -> {
            instanceVariable = 55;
            return (instanceVariable * 2);
        };
        System.out.println(d.fun(4));
    }

    public static void main(String[] args) {
        DoubleTheNumber doubleTheNumber = (n) -> {
            return n * 2;
        };

        int result = doubleTheNumber.fun(10);
        System.out.println(result);

        new AccesibilityLambda().myFun();

        List<String> names = Arrays.asList("Ela", "Bangalore", "Barcelona",
                "Boston");
        names.forEach(System.out::println);

    }
}


interface DoubleTheNumber{
    int fun(int n);
}
