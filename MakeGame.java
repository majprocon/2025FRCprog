// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Character{
    private String name;
    private int health;
    private int attackPower;
    
    public Character(String name, int health, int attackPower){
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }
    
    //methods
    public void attack(Character target){
        target.takeDamage(this.attackPower);
        System.out.println(this.name + " attacks " + target.getName() + " for " + this.attackPower + " damage.");
        
    }
    
    public void takeDamage(int damage){
        this.health -= damage;
    }
    
    public boolean isAlive(){
        return this.health > 0;
    }
    
    
    //Getters
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getAttackPower() {
        return attackPower;
    }
    
    
    //Setters
    public void setName(String newName) {
        this.name = name;
    }
    public void setHealth(double newHealth){
        this.health = health;
    }
    public void setAttackPower(double newAttackPower){
        this.attackPower = attackPower;
    }
  
}

class Hero extends Character{
    private int level;
    
    public Hero(String name) {
        super(name, 100, 10);
        this.level = 1;
    }
    
    public void levelUp(){
        this.level++;
        this.setAttackPower(this.getAttackPower() + 5);
        System.out.println(this.getName() + " leveled up to " + this.level + "!");
    }
}


class Monster extends Character{
    public Monster (String name, int health, int attackPower) {
        super(name, health, attackPower);
    }
    
}



class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hero hero = new Hero("Jimmy");
        Monster timmy = new Monster("Timmy", 30, 5);
        
        System.out.println("A wild " + timmy.getName() + " appears!");
        
        while(hero.isAlive() && timmy.isAlive()){
            System.out.println(hero.getName() + "'s health: " + hero.getHealth());
            System.out.println(timmy.getName() + "'s health: " + timmy.getHealth());
            
            System.out.println("Choose an action: ");
            System.out.println("1. Attack");
            System.out.println("2. Run");
            
            int choice = input.nextInt();
            
            if(choice == 1) {
                hero.attack(timmy);
                if (timmy.isAlive()){
                    timmy.attack(hero);
                }
            }
            
            else if (choice == 2) {
                System.out.println("You ran away coward!");
                break;
            }
            else{
                System.out.println("Invalid choice");
            }
        }
        
        if(!hero.isAlive()){
            System.out.println("You were defeated. Game Over!");
        }
        else if (!timmy.isAlive()){
            System.out.println("You defeated Timmy!");
            hero.levelUp();
        }
        
    }
