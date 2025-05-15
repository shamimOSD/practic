package ch9;

 abstract class Store {
    abstract int getprice();
    abstract void displaiInfo();
    public void ShowItem(){
        System.out.println("Item Available");
    }

}
class BookStore extends Store{
    private String name;
    int price;
    BookStore(String name,int price){
        this.name=name;
        this.price=price;
    }

    @Override
    int getprice() {
        return price;
    }
    void displaiInfo(){
        System.out.println("Book "+name+" price "+price);

    }
    public void ShowItem(){
        System.out.println("Book Item");
    }

}
class RiceStore extends Store{

    int price;
    String name;
    RiceStore(int price,String name){
        this.name=name;
        this.price=price;
    }
    int getprice(){
        return price;

    }
    void displaiInfo(){
        System.out.println("Rice name "+name+" price "+price);

    }
}
public class Main1{
    public static void main(String[] args) {
        BookStore bookStore=new BookStore("Anime ",8000);
        RiceStore riceStore =new RiceStore(90,"Nazirsal");
        bookStore.displaiInfo();
        riceStore.displaiInfo();
        // riceStore.ShowItem();
        bookStore.ShowItem();


    }
}