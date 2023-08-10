package OOP.Sesiunea14.ex3animalshelter;

public class SecurityDog extends Dog{

    public SecurityDog(String name) {
        super(name);
    }

    public void greeting(){
        System.out.println(this.getName() + " woof woof");
    }
}
