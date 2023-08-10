package OOP.Sesiunea14.ex3animalshelter;

public class Shelter {

    private Animal[] animals;
    private int numberOfAnimals;

    public Shelter(int size) {
        this.animals = new Animal[size];
        numberOfAnimals = 0;
    }

    public void makeNoise(){
        for(int i = 0; i < numberOfAnimals; i++){
            animals[i].greeting();
        }
    }

    public void addAnimal ( Animal animal){
        animals[numberOfAnimals] = animal;
        numberOfAnimals++;
    }

}
