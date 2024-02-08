// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************

import java.util.*;
import java.sql.SQLOutput;

public class Main
{
    public static void main(String[] args)
    {
//	Dog dog = new Dog("Spike");
//	System.out.println(dog.getName() + " says " + dog.bark());
//    Labrador lab = new Labrador("Buddy", "Yellow");
//    System.out.println(lab.getName() + " says " + lab.bark());
//    Yorkshire york = new Yorkshire("Princess", 3);
//    //inherits bark method from Dog class
//    System.out.println(york.getName() + " says " + york.bark());
//    york.waddle();
//    //Will not work because Labrador does not inherit from Yorkshire
//   // lab.waddle();
//
//
//        // Array
//	Dog[] dogs = {dog, lab, york};
//        System.out.println(" // ");
//        System.out.println("Printing out Array");
//
//    for(int i = 0; i < dogs.length; i++){
//
//       System.out.println(dogs[i].getName() + " says " + dogs[i].bark());
//    }
//
//    for(Dog doggy : dogs){
//        System.out.println(doggy.getName() + " says " + doggy.bark());
//    }
//
//        ((Labrador)dogs[1]).waddle();
//
//
//        //ArrayList
//        ArrayList<Dog> dogs2 = new ArrayList<Dog>();
//        dogs2.add(dog);
//        dogs2.add(lab);
//        dogs2.add(york);
//        System.out.println(" // ");
//        System.out.println("Printing out ArrayList");
//        for(int i = 0; i < dogs2.size(); i++){
//            System.out.println(dogs2.get(i).getName() + " says " + dogs2.get(i).bark());
//    }
//
//        for(Dog doggy2 : dogs2){
//            System.out.println(doggy2.getName() + " says " + doggy2.bark());
//        }
//
//        ((Labrador)dogs2.get(1)).waddle();



        ArrayList<Animal> animals = new ArrayList<Animal>();
        Dog max = new Dog("Max");
        Dog sara = new Dog("Sara");
        Dog toby = new Dog("Toby");
        animals.add(max);
        animals.add(sara);
        animals.add(toby);
        animals.get(0).setAge(8);
        animals.get(1).setAge(12);
        animals.get(2).setAge(7);


        for(int i = 0; i < animals.size(); i++){
            System.out.println(animals.get(i).getAge());
            animals.get(i).eat();

        }






    }
}
