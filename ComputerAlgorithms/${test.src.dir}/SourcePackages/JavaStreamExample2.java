/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilyas
 */

import java.util.*;

class Product{
    int id;
    String name;
    float price;
    
    public Product(int id, String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class JavaStreamExample2 {
    
    public static void main(String[] args){
        
        List<Product> productsList = new ArrayList<Product>();
        //Adding products
        
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        
        //This is a more compact approach for filtering data
        Float totalPrice = productsList.stream()
                .map(product->product.price)
                .reduce(0.0f, (sum, price)-> sum+price); //accumulating price
        System.out.println(totalPrice);
        
        
    }
}
