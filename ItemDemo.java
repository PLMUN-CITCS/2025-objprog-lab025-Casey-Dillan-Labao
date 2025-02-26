class Item{
    static int objectCount=0;
    String itemName;

    public Item(String itemName) {
    this.itemName = itemName;
    objectCount++;
    }
    public static int getObjectCount(){
        return objectCount;
    }

    public static void displayObjectCount(){
        System.out.println("Total objects created: " + objectCount);
    }
    public void displayItem() {
        System.out.println("Item: " + itemName);
    }
}

public class ItemDemo {
    public static void main(String[] args) {
        Item[] items= {
        new Item("Laptop"),
        new Item("Smartphone"),
        new Item("Tablet")
        };
        int y=Item.getObjectCount();
        for(int x=0;x!=y;x++){
        items[x].displayItem();
        }
        Item.displayObjectCount();
    }
}