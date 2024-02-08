// ****************************************************************
// Dog.java
//
// A class that holds a dog's name and can make it speak.
//          
// ****************************************************************
public class Dog extends Animal
{
    protected String name;

    // ------------------------------------------------------------
    // Constructor -- store name
    // ------------------------------------------------------------
    public Dog(String name)
    {
	this.name = name;
    }


    // ------------------------------------------------------------
    // Returns the dog's name
    // ------------------------------------------------------------
    public String getName()
    {
	return name;
    }

    // ------------------------------------------------------------
    // Returns a string with the dog's comments
    // ------------------------------------------------------------
    public String bark()
    {
	return "Dog barking";
    }

    //Because Animal was made abstract, and the eat method was abstract, the children must override it.
    public void eat(){
        System.out.println("Dog eats");
    }


}
