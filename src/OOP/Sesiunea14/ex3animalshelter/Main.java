package OOP.Sesiunea14.ex3animalshelter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Cat cat = new Cat("pisi" , "de casa");
//        cat.greeting();
//        Dog dog = new Dog("azor");
//        dog.greeting();
//        SecurityDog securityDog = new SecurityDog("politia");
//        securityDog.greeting();
//
//        dog.greeting(securityDog);
//        securityDog.greeting(dog);

        Animal cat = new Cat("pisi", "de casa");
        cat.greeting();
        Animal dog = new Dog("azor");
        dog.greeting();
        Animal securityDog = new SecurityDog("politia");
        securityDog.greeting();

        Dog copyDog = (Dog) dog;
        SecurityDog copySecurityDog = (SecurityDog) securityDog;
        copyDog.greeting(copySecurityDog);
        copySecurityDog.greeting(copyDog);

        Animal animal = getAnimal();
        animal.greeting();

    }

    public static Animal getAnimal(){
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch(option){
            case 1:
                return new Cat("pisi", "de casa");
            case 2:
                return new Dog("azor");
            case 3:
                return new SecurityDog("politia");
            defaul:
            return null;

        }
    }

}
