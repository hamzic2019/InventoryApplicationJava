import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductList {
    private List<Product> productList;
    private Scanner scanner;

    public ProductList(){
        productList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public void showProducts(){
        int attempts = 1;
        for(Product product : productList){
            System.out.println(attempts++ + ". " + product.getName() + " - $" + product.getPrice());
        }
    }

    public void removeProduct(String name){
        productList.removeIf(product -> product.getName().equalsIgnoreCase(name));
    }
}
