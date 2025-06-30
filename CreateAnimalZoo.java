public final class Main {
  
    public static void main(String[] args) {
      Animal animal = new Animal("Leo", "Mammal" , 6);
      System.out.println("My animals name is: " + animal.name);
          System.out.println("My animals species is: " + animal.species);
          System.out.println("My animals age is: " + animal.age);
              }
            }
class Animal {
          String name;
          String species;
          int age = 6;
      
      public Animal(String name, String species, int age) {
          this.name = name;
          this.species = species;
          this.age = age;
          }
      }
