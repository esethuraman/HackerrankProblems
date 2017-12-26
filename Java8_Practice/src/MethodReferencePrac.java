import java.util.ArrayList;
import java.util.List;

public class MethodReferencePrac {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Ela");
        names.add("Ezhil");
        names.add("Richu");

//        names.forEach(name -> System.out.println("Helloo " + name));
        names.forEach(MethodReferencePrac::modifyWithSalutation);
    }


    private static void  modifyWithSalutation(String name){
        System.out.println ("hello" + name);
    }
}
