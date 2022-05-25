public class Product {
    
    private String name;
    private int quantity;

    public Product (String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return this.quantity;
    }
    @Override
    public String toString(){
        return "Products{" +
        "Product name ='" + name + '\'' +
        ", Quantity ='" + quantity + '\'' +
        '}';
    }
}
