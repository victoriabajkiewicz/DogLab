// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************


import java.sql.SQLOutput;

public class Main
{
    public static void main(String[] args)
    {
	Dog dog = new Dog("Spike");
	System.out.println(dog.getName() + " says " + dog.bark());
    Labrador lab = new Labrador("Buddy", "Yellow");
    System.out.println(lab.getName() + " says " + lab.bark());
    Yorkshire york = new Yorkshire("Princess", 3);
    //inherits bark method from Dog class
    System.out.println(york.getName() + " says " + york.bark());
    york.waddle();
    //Will not work because Labrador does not inherit from Yorkshire
   // lab.waddle();





	Dog[] dogs = {dog, lab, york};

    for(int i = 0; i < dogs.length; i++){

       System.out.println(dogs[i].getName() + " says " + dogs[i].bark());
    }

    for(Dog doggy : dogs){
        System.out.println(doggy.getName() + " says " + doggy.bark());
    }

lab.waddle();

    }
}
