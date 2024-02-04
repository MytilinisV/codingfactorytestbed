package gr.aueb.cf.ch19.Sorting;

import gr.aueb.cf.ch19.maps.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductApp {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>(List.of(
                new Product("Apples", 8, 40),
                new Product("Apples", 8, 40),
                new Product("Apples", 8, 40),
                new Product("Oranges", 7.2, 60),
                new Product("Oranges", 6.7, 35),
                new Product("Eggs", 10.5, 140),
                new Product("Honey", 26.0, 335)
        ));

        List<Product> apples = productList.stream()
                        .filter(product -> product.getDescription().equals("Apples"))
                        .sorted(Comparator.comparing(Product::getPrice))
                        .collect(Collectors.toList());
        apples.forEach(System.out::println);

        List<Double> prices = productList.stream()
                        .map(Product::getPrice)
                        .collect(Collectors.toList());

        List<Product> updatedPriceProducts = productList.stream()
                        .map(p -> new Product(p.getDescription(), p.getPrice() * 0.2, p.getQuantity()))
                        .collect(Collectors.toList());

        int orangesCount = productList.stream()
                        .filter(product -> product.getDescription().equals("Oranges"))
                        .reduce(0, (total, p) -> p.getQuantity(), Integer::sum);
//                      .mapToInt(Product::getQuantity)
//                      .sum();



        Collections.sort(productList, Comparator.comparing(Product::getDescription).thenComparing(Product::getQuantity));
        productList.forEach(System.out::println);
    }
}
