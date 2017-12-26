import java.util.ArrayList;
import java.util.List;

public class LambdaPrac {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Ela");
        names.add("Ezhil");
        names.add("Richu");

        names.forEach(name -> System.out.println("Helloo " + name));
    }
}
