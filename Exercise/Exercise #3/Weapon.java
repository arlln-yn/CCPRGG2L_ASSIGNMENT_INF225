public class Weapon {
    String rarity;
    int damage;
    String WeaponName;

    public void sayMyWeapon() {
        System.out.println("My Weapon is " + WeaponName);
    }

    public void sayTheDamage() {
        System.out.println("Damage is " + damage);
    }

    public void sayTheRarity() {
        System.out.println("My Weapon's Rarity is " + rarity);
    }

    public void AddDamage(int additionalDamage) {
        int newDamage = damage + additionalDamage;
        System.out.println("Damage increased from " + damage + " to " + newDamage);

        this.damage = newDamage;
    }
    
    public String showWeaponNameandRarity(){
        return this.WeaponName + " " + this.rarity;
    }
}