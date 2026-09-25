package Pendahuluan;
class Product {
    private final String itemName;
    private final float price; 
    static int totBarang = 0;

    public Product(String itemName, float price) {
        this.itemName = itemName;
        this.price = price;
        totBarang++;
    }

    public float total(int quantity) {
        return price * quantity;
    }

    public String getName() {
        return itemName;
    }
}

public class OOP {
    public static void main(String[] args) {
        Product item1 = new Product("Coffee", 120000.0f);
        Product item2 = new Product("Sugar", 30000.0f);

        System.out.println(item1.getName() + ": " + item1.total(3));
        System.out.println(item2.getName() + ": " + item2.total(1));
    }
}
