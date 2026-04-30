class Mobile{
    int price;
    String brand;
    static String name;

    public Mobile(){
        name = "Smartphone";
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    // public static String getType() {
    //     return type;
    // }
    // public static void setType(String type) {
    //     Mobile.type = type;
    // }

    public static void showAll(Mobile obj){
        System.out.println(obj.brand + " " + obj.price + name);
   
    }

}

public class StaticKeyword {
    public static void main(String a[]){
        Mobile obj = new Mobile();
        obj.brand = "Apple";
        obj.price = 1000;
        Mobile.showAll(obj);
    }
}
