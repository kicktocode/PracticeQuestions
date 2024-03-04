package com.example.conceptTryOut.StringQuestions.Stream;

import org.springframework.web.servlet.tags.form.SelectTag;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
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

        List<Float> comparePriceProduct =
                productsList.stream()
                        .filter(p -> p.price == 28000)
                        .map(p -> p.price)
                        .collect(Collectors.toList());
        System.out.println(comparePriceProduct);

        productsList.stream().filter(p -> p.price > 28000).forEach(p -> System.out.println(p.name));
        productsList.stream().filter(f -> f.price > 30000).forEach(f -> System.out.println(f.name));

        productsList.stream().filter(j -> j.price < 28000).forEach(j -> System.out.println(j.name));

        float sumReduceMethod = productsList.stream()
                .map(product -> product.price)
                .reduce(0.0f, (x, y) -> x + y);
        System.out.println(sumReduceMethod);

        Float maxPriceProduct = productsList.stream()
                .max((p1, p2) -> p1.price > p2.price ? 1 : -1).get().price;
        System.out.println(maxPriceProduct);


        Integer NumberCount = (int) productsList.stream()
                .filter(p -> p.price > 28000)
                .count();
        System.out.println(NumberCount);

        int numCountRetry = (int) productsList.stream()
                .filter(p -> p.price > 25000)
                .count();
        System.out.println(numCountRetry);


        Float minPriceProduct = productsList.stream()
                .min((p1, p2) -> p1.price > p2.price ? 1 : -1)
                .get().price;
        System.out.println(minPriceProduct);

        //convert list to set
        Set<Float>listToSet=productsList
                .stream()
                .map(p->p.price)
                .collect(Collectors.toSet());
        System.out.println(listToSet);

        //Convert list to map
        Map<String,Float>listToMap=productsList.stream()
                .collect(Collectors.toMap(p->p.name,p->p.price));
        System.out.println(listToMap);

        //method reference in stream
       List< Float> productPrice=productsList.stream().filter(p->p.price>3000).map(p->p.price).collect(Collectors.toList());
        System.out.println(productPrice);

    }
}
