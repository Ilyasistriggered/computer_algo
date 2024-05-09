/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilyas
 */

import java.util.*;

public class Test3 {
    
    public static void main(String[] args){
        
        Arrays.asList("a1","a2","a3")
                .stream()
                .findFirst()
                .ifPresent(System.out::println); //a1
        
    }
    
}
