public class Cart {
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[20];
    private int qtyOrdered = 0;
    public static final int MAX_NUMBERS_ORDERED = 20;
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < 20) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }
    

    public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
        for (DigitalVideoDisc dvd : dvds) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemsOrdered[qtyOrdered] = dvd;
                qtyOrdered++;
                System.out.println("Added: " + dvd.getTitle());
            } else {
                System.out.println("Cart is full! Cannot add " + dvd.getTitle());
            }
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered < 20) {
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
        if (qtyOrdered < 20) {
            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }
    public void displayCart() {
        System.out.println("***********************CART***********************");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(i + 1 + ". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + "$"+ " : " + itemsOrdered[i].getID());
        }
        System.out.println("**************************************************");
    } 
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered > 0) {
            for (int i = 0; i < qtyOrdered; i++) {
                if (itemsOrdered[i] == disc) {
                    for (int j = i; j < qtyOrdered - 1; j++) {
                        itemsOrdered[j] = itemsOrdered[j + 1];
                    }
                    qtyOrdered--;
                    System.out.println("The disc has been removed.");
                    return;
                }
            }
            System.out.println("The disc is not in the cart.");
        } else {
            System.out.println("The cart is almost empty.");
        }
        
    }
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
}
