import java.util.ArrayList;

public class ProductList {
    private ArrayList<Product> products;

    public ProductList(){
        this.products = new ArrayList<>();
    }

    public void printProducts(){
        for(Product item : products){
            System.out.println(item);
        }
    }
    public void addProduct(Product item){
        this.products.add(item);
    }
    public void removeProduct(int index){
        this.products.remove(index);
    }
    public int sizeOfList(){
        return this.products.size();
    }
}
