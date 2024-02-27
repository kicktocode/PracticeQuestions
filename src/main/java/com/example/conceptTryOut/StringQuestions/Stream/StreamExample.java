package com.example.conceptTryOut.StringQuestions.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

        List<Product> productsList = new ArrayList<Product>();
//        long  l = 11111L;

        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000F));
        productsList.add(new Product(2, "Dell Laptop", 30000F));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));

        List<Float> minPriceProduct =
                productsList.stream()
                        .filter(p -> p.price == 28000)
                        .map(p -> p.price)
                        .collect(Collectors.toList());
        System.out.println(minPriceProduct);

        productsList.stream().filter(p -> p.price > 28000).forEach(p -> System.out.println(p.name));
        productsList.stream().filter(f -> f.price > 30000).forEach(f -> System.out.println(f.name));

        productsList.stream().filter(j -> j.price < 28000).forEach(j -> System.out.println(j.name));

        float sumReduceMethod = productsList.stream()
                .map(product -> product.price)
                .reduce(0.0f, (x, y) -> x + y);
        System.out.println(sumReduceMethod);
    }
}
