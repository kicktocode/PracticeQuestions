package com.example.conceptTryOut.StringQuestions.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPrac {
    public static void main(String[] args) {
        Integer number[]={1,2,3,4,5,6,7,8,9};
        Integer sumOdd= Arrays.stream(number).filter(n->n%2!=0).reduce(0,(n1,n2)->n1+n2);
        System.out.println(sumOdd);

        List<Integer>Num=List.of(2,5,4785,7,84,6,4,44,53,788,66);
       List<Integer>result= Num.stream().sorted().collect(Collectors.toList());
        System.out.println(result);
        Num.stream().sorted().forEach(e->System.out.println(e));

        List<Integer>Num1=List.of(2,5,4785,5,84,4,4,44,53,788,66);
        Num1.stream().distinct().forEach(r->System.out.println(r));
        List<Integer>result1= Num1.stream().distinct().collect(Collectors.toList());
        System.out.println(result1);

        List<Integer>Num2=List.of(2,5,4785,5,84,4,4,44,53,788,66);
        Num2.stream().distinct().sorted().forEach(r->System.out.println(r));
        List<Integer>result2= Num2.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(result2);

        List<Integer>Num3=List.of(2,5,4785,5,84,4,4,44,53,788,66);
        Num3.stream().distinct().map(r->r*r).sorted().forEach(r->System.out.println(r));
        List<Integer>result3= Num3.stream().distinct().map(r->r*r).sorted().collect(Collectors.toList());
        System.out.println(result3);

        IntStream.range(1,11).map(e->e*e).forEach(e->System.out.println(e));

        List<String>str=List.of("Ant","Anty","Anties");
        str.stream().map(e->e.toUpperCase()).collect(Collectors.toList()).forEach(e->System.out.println(e));
        str.stream().mapToInt(e->e.length()).forEach(e->System.out.println(e));
        System.out.println("MethodReference Example");
                                               //(className::MethodName)
        str.stream().map(String::length).forEach(System.out::println);

       Integer sum= IntStream.range(1,11).reduce(0,(n1,n2)->n1+n2);
        System.out.println(sum);


        List<Integer>Num4=List.of(2,5,4785,5,84,4,4,44,53,788,66);
        Optional res=Num4.stream().max((n1, n2)->Integer.compare(n1,n2));
        System.out.println(res);

        List<Integer>Num5=List.of(2,5,4785,5,84,4,4,44,53,788,66);
        Optional res1=Num5.stream().min((n1, n2)->Integer.compare(n1,n2));
        System.out.println(res1);
        Optional<Integer> MethodRef=Num5.stream().min(Integer::compareTo);
        System.out.println("MethodRefExample"+MethodRef);

        List<Integer>oddNum=Num5.stream().filter(e->e%2!=0).collect(Collectors.toList());
        System.out.println(oddNum);

        IntStream.range(0,11).map(e->e*e).boxed().collect(Collectors.toList()).forEach(e->System.out.println(e));

    }
}
