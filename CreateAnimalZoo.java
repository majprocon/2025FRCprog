public final class Main {
  
    @SuppressWarnings("unused")
    public static void main(String[] args) {
      Zoo myZoo = new Zoo();
      Animal animal = new Animal("Leo", "Lizard" , 6);
      myZoo.addAnimal(new Animal("Perry", "Parrot", 21));
      Animal a = new Animal("Timmy", "Tiger", 7 );
      myZoo.addAnimal(a);
      myZoo.addAnimal(new Lion("", "", 2));
      myZoo.addAnimal(new Zebra("", "", 2));
      myZoo.listAllAnimals();
          
         /*simba.makeSound();
          marty.makeSound();
          animal.eat();
          animal.sleep();
          animal.makeSound(); 
          Lion simba = new Lion("Simba", "Lion", 2);
          Zebra marty = new Zebra("Marty", "Zebra", 3);
          System.out.println("My animals name is: " + animal.name);
          System.out.println("My animals species is: " + animal.species);
          System.out.println("My animals age is: " + animal.age);
          animal.setName("LILY");
          String x = animal.getName();
          System.out.println(x);*/
    }
}

public class Zoo{
    Animal[] Animal = new Animal[10];
        int numberOfAnimals = 0;
            
    public void addAnimal(Animal animal){
        Animal[numberOfAnimals] = animal;
        System.out.println(numberOfAnimals);
        numberOfAnimals++;
    }
            
    public void listAllAnimals(){
        for(Animal a: Animal){
            if(a == null){
                break;
            }

        System.out.println(a.getName() + " the " + a.getSpecies());
        
        a.makeSound();
        a.eat();
        a.sleep();
        
        System.out.println(a.getName() + " has been fed");
        
        if (a instanceof Lion) {
            ((Lion) a).hunt();
        } else if (a instanceof Zebra) {
            ((Zebra) a).graze();
        }
            System.out.println();
        }

    }

}

public class Lion extends Animal {
    public Lion(String string, String string2, int i){
        super("Simba", "Lion", 7);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " the Lion roars");
    }

    void hunt(){
        System.out.println(name + "the Lion is hunting for prey");
    }

}

public class Zebra extends Animal {
    public Zebra(String string, String string2, int i){
        super("Marty", "Zebra", 4);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " the Zebra whines");
    }
    void graze(){
        System.out.println(name + "the Zebra is grazing on grass");
    }
}

public class Animal {
    protected String name;
    protected String species;
    protected int age;

public Animal(String name, String species, int age) {
    this.name = name;
    this.species = species;
    this.age = age;
}

public Animal(String string, Object animal) {

}

public void eat(){
    System.out.println(name + " the " + species + " is eating.");
}

public void sleep(){
    System.out.println(name + " the " + species + " is sleeping, DONT WAKE HIM UP.");
}

public void makeSound(){
    System.out.println(name + " the " + species + " thumth thumth");
}

public void setName(String newName){
    this.name = newName;
}

public void setSpecies(String newSpecies){
    this.species = newSpecies;
}

public void setAge(int newAge){
    this.age = newAge;
}

public String getName(){
    return name;
}

public String getSpecies(){
    return species;
}

public int getAge(){
    return age;
}
}
