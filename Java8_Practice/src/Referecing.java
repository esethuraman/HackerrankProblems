public class Referecing {
    public static void main(String[] args) {
//         Car car = Audi::getColor;
    }
}

interface Car{
    void printColor(String color);
}

class Audi implements Car{

    public static String getColor() {
        return "Ivory";
    }

    @Override
    public void printColor(String c) {
        System.out.println("AUDI color is "+c);
    }

}

class Maruti implements Car{

    public String getColor() {
        return "Hot pink";
    }

    @Override
    public void printColor(String c) {
        System.out.println("Maruti car's color is " + c);
    }
}