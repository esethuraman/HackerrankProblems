package Stacks;

import sun.awt.image.ImageWatched;

import javax.print.Doc;
import java.util.LinkedList;
import java.util.List;

public class AnimalShelterQueue {
    List<Animal> shelterQueue = new LinkedList<>();

    public void enqueue(Animal animal){
        shelterQueue.add(animal);
    }

    public void dequeueAny(){
        System.out.println("Dequeued ... "+shelterQueue.get(0).getName());
        shelterQueue.remove(0);
    }

    public void dequeueDog(){
        int dogIndex = 0;
        boolean isDogFound = false;
        for(Animal animal : shelterQueue){
            if(animal.getType() == "dog"){
                System.out.println(animal.getName());
                isDogFound = true;
                break;
            }
            dogIndex++;
        }
        if(isDogFound){
            System.out.println("Dequeued DOG .. "+shelterQueue.get(dogIndex)
                    .getName());
            shelterQueue.remove(dogIndex);
        }

    }

    public void dequeueCat(){
        int catIndex = 0;
        boolean isCatFound = false;
        for(Animal animal : shelterQueue){
            if(animal.getType() == "cat"){
                isCatFound = true;
                break;
            }
            catIndex++;
        }
        if(isCatFound){
            System.out.println("Dequeued CAT.. "+shelterQueue.get(catIndex)
                    .getName());
            shelterQueue.remove(catIndex);
        }

    }

    public static void main(String[] args) {
        AnimalShelterQueue queue = new AnimalShelterQueue();

        queue.enqueue(new Dog("Tommy"));
        queue.enqueue(new Dog("Jimmmy"));
        queue.enqueue(new Cat("Choco"));
        queue.enqueue(new Dog("Browny"));
        queue.enqueue(new Cat("Inu"));
        queue.enqueue(new Dog("Blacky"));
        queue.enqueue(new Cat("Meyow"));
        queue.enqueue(new Dog("Rambo"));
        queue.enqueue(new Cat("Catsy"));

        queue.dequeueAny();
        queue.dequeueAny();
        queue.dequeueCat();
        queue.dequeueDog();
    }
}

interface Animal{
    String getName();
    String getType();
}
class Dog implements Animal{

    String name;

    Dog(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return "dog";
    }

}

class Cat implements Animal{

    String name;

    Cat(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return "cat";
    }
}
