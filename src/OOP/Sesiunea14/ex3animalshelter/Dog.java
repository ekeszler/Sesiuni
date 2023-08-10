package OOP.Sesiunea14.ex3animalshelter;

public class Dog extends  Animal{


    public Dog(String name) {
        super(name);
    }

    @Override
    public void greeting() {
        System.out.println(this.getName() + " ham");
    }

    public  void greeting(Dog anotherDog){
        System.out.println(this.getName() + " face woof catre " + anotherDog.getName());

    }
}
