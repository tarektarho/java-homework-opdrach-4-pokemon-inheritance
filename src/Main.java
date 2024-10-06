import pokemon.types.ElectricPokemon;
import pokemon.types.FirePokemon;
import pokemon.types.GrassPokemon;
import pokemon.types.WaterPokemon;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n---------------FirePokemon---------------\n");
        // Create a FirePokemon object
        FirePokemon charmander = new FirePokemon("Charmander", 1, 100, 0, 0.6, 8.5, "Fish", "Fiery sound", "Fire attack", 50, "Fire Spin");
        System.out.println(charmander);
        charmander.eat(3);
        charmander.gainXp(50);
        System.out.println("Fire power: " + charmander.getFirePower());
        System.out.println("Special attack: " + charmander.getSpecialAttack());

        System.out.println("\n---------------ElectricPokemon---------------\n");
        // Create an ElectricPokemon object
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 2, 100, 0, 0.4, 6.0, "Berries", "Electric sound", "Electric attack", 60, "Thunder Shock");
        System.out.println(pikachu);
        pikachu.eat(5);
        pikachu.gainXp(55);
        System.out.println("Electric power: " + pikachu.getElectricPower());
        System.out.println("Special attack: " + pikachu.getSpecialAttack());

        System.out.println("\n---------------WaterPokemon---------------\n");
        // Create a WaterPokemon object
        WaterPokemon squirtle = new WaterPokemon("Squirtle", 1, 100, 0, 0.5, 9.0, "Insects", "Water sound", "Water attack", 70, "Water Gun");
        System.out.println(squirtle);
        squirtle.eat(6);
        squirtle.gainXp(55);

        System.out.println("\n---------------GrassPokemon---------------\n");

        // Create a GrassPokemon object
        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 1, 100, 0, 0.7, 6.9, "Leaves", "Grass sound", "Grass attack", 80, "Razor Leaf");
        //Since, Bulbasaur has two types Grass and Poison, we should add type Poison to the list of types. Grass type is already added in the constructor.
        bulbasaur.getType().add("Poison");
        System.out.println(bulbasaur);

        bulbasaur.eat(7);
        bulbasaur.gainXp(50);
        System.out.println("Grass power: " + bulbasaur.getGrassPower());
        System.out.println("Special attack: " + bulbasaur.getSpecialAttack());

        System.out.println("\n---------------Charmander Vs Pikachu---------------\n");
        charmander.fireBlast();
        charmander.attack(pikachu);
        charmander.flameThrower();
        charmander.attack(pikachu);

        System.out.println("\n---------------Pikachu Vs Squirtle---------------\n");
        pikachu.thunderShock();
        pikachu.attack(squirtle);
        pikachu.gainXp(50);
        pikachu.speaks();

        System.out.println("\n---------------Bulbasaur Vs Charmander---------------\n");
        bulbasaur.solarBeam();
        bulbasaur.attack(charmander);

        System.out.println("\n---------------Healing...---------------\n");
        charmander.eat(20);
        System.out.println("Charmander's HP: " + charmander.getHp());
        pikachu.eat(22);
        System.out.println("Pikachu's HP: " + pikachu.getHp());
        squirtle.eat(50);
        System.out.println("Squirtle's HP: " + squirtle.getHp());
    }
}