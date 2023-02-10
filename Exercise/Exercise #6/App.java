public class App {
    public static void main(String[] args) throws Exception {
        
        GroceryItem item1 = new GroceryItem();
        item1.name = "Tissue";
        item1.showItemName();

        // item in a form of toothbrush
        GroceryItem item2 = new Toothbrush();
        item2.name = "Colgate";
        item2.showItemName();
        item2.price = 123.45;

        // item in a form of toothpaste
        GroceryItem item3 = new Toothpaste();
        item3.name = "Pepsodent";
        item3.showItemName();
        item3.price = 112.34;

        // Cashier Object
        Cashier c1 = new Cashier();

        // Polymorphic parameter
        c1.checkOut(item2);
        c1.showItemPrice(item2);
        c1.checkOut(item3);
        c1.showItemPrice(item3);

        // Polymorphic array
        GroceryItem[] itemArray = new GroceryItem[2];
        itemArray[0] = item2;
        itemArray[1] = item3;

        // Loop through all items
        for (int i = 0; i < itemArray.length; i++){
            itemArray[i].showItemName();

        }

        // Pet myPet = new Pet
        Dog myDog = new Dog();
        myDog.eat();

        Lion myLion = new Lion();
        myLion.walk();
        myLion.run();
    }
}
