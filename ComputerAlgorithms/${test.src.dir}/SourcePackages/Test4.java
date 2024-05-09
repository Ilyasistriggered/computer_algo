/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilyas
 */
import java.util.*;

public class Test4 {
    
    public static void main(String[] args){
        
        Arrays.stream(new int[] {1,2,3})
                .map(n -> 2*n+1)
                .average()
                .ifPresent(System.out::println); // 5.0
    }
    
}
