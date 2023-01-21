public class App {
    public static void main(String[] args) {

        // knight, mage, thief
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";

        knight.sayMyName();
        knight.sayMyStrength();
        knight.sayMyAgility();
        knight.sayMyIntelligence();

        System.out.println();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";

        mage.sayMyName();
        mage.sayMyStrength();
        mage.sayMyAgility();
        mage.sayMyIntelligence();
   
        System.out.println();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";

        thief.sayMyName();
        thief.sayMyStrength();
        thief.sayMyAgility();
        thief.sayMyIntelligence();

        System.out.println();

        // Own Character
        Character traveller = new Character();

            traveller.name = "Lumine";
            traveller.strength = 20;
            traveller.intelligence = 15;
            traveller.agility = 25;
            traveller.Attack();

            System.out.println();
        
        // Weapon
        Weapon sword = new Weapon();

        sword.WeaponName = "Knight's Sword";
        sword.damage = 20;
        sword.rarity = "5 STAR";

        sword.sayMyWeapon();
        sword.sayTheDamage();
        sword.sayTheRarity();

        sword.AddDamage(7); 
        System.out.print(sword.showWeaponNameandRarity());
    }
}
