public class Exercise_4 {
    public static void main(String[] args) {

        Person Friend = new Person("Kylie", 19);
        
        Myself Me = new Myself("Yeyen", 19);

        // Aggregation
        Me.addFriend(Friend);
        
        // Composition 
        Pet dog = new Pet ("Sanjie", Friend);
        dog.showOwnerName();

        Car pickUp = new Car("Ford Ranger", "white", Me);
        pickUp.showOwnerName();
    }
    
}