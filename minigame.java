// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hero hero = new Hero("Majdoleen");
        Monster manal = new Monster("manal", 40, 5);
        
    System.out.println("A wild and absurb " + manal.getName() + " appears!");
    
    while (hero.isAlive() && manal.isAlive()){
        System.out.println(hero.getName() + "'s health " + hero.getHealth());
        System.out.println(manal.getName() + "'s health " + manal.getHealth());
        
        System.out.println("Choose an action: ");
        System.out.println("1. Attack");
        System.out.println("2. Run");
        
        int choice = input.nextInt();
        
        if (choice == 1){
            hero.attack(manal);
            if (manal.isAlive()){
                manal.attack(hero);
            }
         }
         
         else if (choice == 2){
             System.out.println("You ran away U bum!");
             break;
         }
         else{
             System.out.println("Invalid choice bozo");
         }
         
         if(!hero.isAlive()){
             System.out.println("You were defeated. GAME OVER");
         }
         else if(!manal.isAlive()){
             System.out.println("You defeated Manal!");
             hero.levelUp();
         }
    }
}
}
class Character{
    
    // make variables
    private String name;
    private int health;
    private int attackPower;
    
    //constructor
    public Character(String name, int health, int attackPower){
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }
    
    
    //make Methods
    public void attack(Character target){
        target.takeDamage(this.attackPower);
        System.out.println(this.name + " attacks " + target.getName() + " for "+ this.attackPower + " damage ");
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
    public void setAttackPower(int attackPower){
        this.attackPower = attackPower;
    }
    
}

class Hero extends Character{
    private int level;
    
    public Hero(String name){
        super(name, 100, 20);
        this.level = 1;
    }
    
    public void levelUp(){
        this.level++;
        this.setAttackPower(this.getAttackPower() + 5);
System.out.println(this.getName() + " Leveled up to " + this.level + "!");
    }
    
}

class Monster extends Character{
    public Monster (String name, int health, int attackPower){
    super(name, health, attackPower);
}
}
