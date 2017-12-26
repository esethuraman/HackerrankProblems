import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsPractice {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ela", "Actiance", "Bangalore",
                "Barcelona", "Ezhil", "Kolkatta", "Chennai");

        boolean isAnyNameHasEzhil = names.stream().anyMatch(
                (str) -> str.equals("Ezhil"));
        System.out.println("List has Ezhil?  "+ isAnyNameHasEzhil);

        boolean isAllNamesOfLength3AndAbove =
                names.stream().allMatch(
                        (str) -> (str.length() >= 3)
                );
        System.out.println("Is all names of length 3 and above " +
                isAllNamesOfLength3AndAbove);


//        Filters are intermediate operations that produces a stream
//        print the list contents that starts with "E"
        names.stream().filter((str) -> (str.startsWith("E"))).forEach(System
                .out::println);

//     collect the filtered contents and then assign it to a list
        List<String> newLst = names.stream().filter((str) -> (str.length() >
                5)).collect
                (Collectors
                .toList());
        System.out.println("The contents of new list are " );
        newLst.forEach(System.out::println);

//        Sorted is an intermediate function
//        sort using the default comparator
        System.out.println("---> The sorted names (Using default comparators ");
        names.stream().sorted().forEach(System.out::println);

//        sorted using custom comparator
        System.out.println("--> Custom sorting inverse ... ");
        List<String> customSortedList = names.stream().
                sorted((a,b) -> b.compareTo(a)).collect(Collectors.toList());
        customSortedList.forEach(System.out::println);

//        Map is an intermediate function
//        Map
        System.out.println("Performing map operation");
        names.stream().map(
                (str) -> "Mapped Name " + str
        ).forEach(System.out::println);

//        Terminal operation
//        count
        long count = names.stream().filter(
                (str) -> str.length()>5
        ).count();
        System.out.println("Number of names with length > 5 : "+ count);

//        reduce  - terminal operation
        Optional reducedValues = names.stream().filter(
                (str) -> str.length() <= 5
        ).reduce( (s1, s2) -> s1 + "--" + s2);

        reducedValues.ifPresent(System.out::println);
//        ensuring that the list is untouched after all these stream operations
//        names.forEach(System.out::println);


     }
}
