/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilyas
 */

import java.util.stream.*;

public class JavaStreamExample {
    public static void main(String[] args){
        Stream.iterate(1, element -> element+1)
                .filter(element -> element%5 == 0)
                .limit(5)
                .forEach(System.out::println);
    }
}
