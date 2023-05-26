import java.util.Scanner;

public class MenuHandler {
    ProductList productList;
    Scanner scanner;

    public MenuHandler(){
        scanner = new Scanner(System.in);
        productList = new ProductList();
    }

    public void menuHandler(){
        boolean exit = false;


        while(!exit){
            System.out.println("\nMenu Options:");
            System.out.println("1. Add Product");
            System.out.println("2. List Products");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1 -> addProduct();
                case 2 -> showProducts();
                default -> {
                    break;
                }
            }
        }
    }

    public void addProduct(){
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();

        System.out.println("Enter the price: ");
        double price = scanner.nextDouble();

        Product product = new Product(name, price);

        productList.addProduct(product);
    }

    public void showProducts(){
        System.out.println("List of products: ");
        productList.showProducts();
    }
}
