package prototype.design;

public class Main {
    public static void main(String args[] ) throws CloneNotSupportedException {
        System.out.println("proto type");
        BookShop bs = new BookShop();
        bs.setShopName("BookMart");
        bs.loadData();


        BookShop bs1 = (BookShop) bs.clone();
        bs.getBooks().remove(2);
//        BookShop bs1 = new BookShop();
        bs1.setShopName("Pushtak Bhandar");
        System.out.println(bs);
        System.out.println(bs1);
    }
}
