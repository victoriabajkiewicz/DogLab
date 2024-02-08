public abstract class Animal {
    private int age;

    public Animal(){
        age = 0;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

  //An abstract method means that the entire class must be made abstract. Also, it means that it is a blank method and that the child classes must override it. It was overridden in the Dog class.
   public abstract void eat();




}
