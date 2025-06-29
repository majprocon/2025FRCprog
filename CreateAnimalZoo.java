public final class Main {
  
  public static void main(String[] args) {
    Animal animal = new Animal("Leo", "Mammal" , 6);
        System.out.println(animal.name);
        System.out.println(animal.species);
        System.out.println(animal.age);
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
