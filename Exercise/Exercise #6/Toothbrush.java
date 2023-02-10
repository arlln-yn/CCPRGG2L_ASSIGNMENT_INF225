public class Toothbrush extends GroceryItem {
    
    // Method override
    public void showItemName() {
        System.out.println(this.name + " is a toothbrush");
    }
    public void showItemPrice() {
        System.out.println("the price of this item is " + this.price);
    }
}

