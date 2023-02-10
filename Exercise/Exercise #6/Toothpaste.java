public class Toothpaste extends GroceryItem {
   
    // Method override
    public void showItemName() {
        System.out.println(this.name + " is a toothpaste");
    }
    public void showItemPrice() {
        System.out.println("the price of this item is " + this.price);
    }
}