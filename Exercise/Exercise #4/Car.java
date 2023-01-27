public class Car {
    String name;
    String color;
    Myself owner;

    Car(String carName, String carColor, Myself ownerName){
        this.name = carName;
        this.color = carColor;
        this.owner = ownerName;

    }
    void showOwnerName(){
        System.out.println("My car is a " + this.name + ". It is color " + this.color + ". The owner's name is " + owner.name);
    }
}
