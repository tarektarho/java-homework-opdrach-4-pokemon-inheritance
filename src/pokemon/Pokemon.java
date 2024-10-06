package pokemon;

import java.util.ArrayList;
import java.util.List;

// Superclass for all Pokemon
public abstract class Pokemon {
    // Common attributes for all Pokemon
    private String name;
    private List<String> type = new ArrayList<String>(); // List of types (e.g. Fire, Water, Grass, Electric) that a Pokemon can have (a Pokemon can have multiple types)
    private int level;
    private int hp; // Health Points
    private int xp; // Experience Points
    private double height;
    private double weight;
    private String food;
    private String sound;
    private String attack;

    // Constructor
    public Pokemon(String name, String type, int level, int hp, int xp, double height, double weight, String food, String sound, String attack) {
        this.name = name;
        this.type.add(type); // Add type to the list
        this.level = level;
        this.hp = hp;
        this.xp = xp;
        this.height = height;
        this.weight = weight;
        this.food = food;
        this.sound = sound;
        this.attack = attack;
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<String> getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public int getXp() {
        return xp;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    public String getAttack() {
        return attack;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type.add(type);
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }


    public void setAttack(String attack) {
        this.attack = attack;
    }

    // Methods
    public abstract void eat(int amount);

    public abstract void speaks();

    public void attack(Pokemon pokemon) {
        int damage = xp * level;
        System.out.println(name + " attacks " + pokemon.getName() + " with " + damage + " damage!");
        pokemon.takeDamage(damage);
    }

    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) {
            hp = 0;
            System.out.println(name + " fainted!");
        } else {
            System.out.println(name + " has " + hp + " HP left!");
        }
    }

    public void gainXp(int xp) {
        this.xp += xp;
        System.out.println(name + " gained " + xp + " XP!");
    }

    public void levelUp() {
        level++;
        System.out.println(name + " leveled up to level " + level + "!");
    }

    public void heal() {
        hp = 100;
        System.out.println(name + " has been healed!");
    }


    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", level=" + level +
                ", hp=" + hp +
                ", xp=" + xp +
                ", height=" + height +
                ", weight=" + weight +
                ", food='" + food + '\'' +
                ", sound='" + sound + '\'' +
                ", attack='" + attack + '\'' +
                '}';
    }

}