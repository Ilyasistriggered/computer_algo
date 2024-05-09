
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilyas
 */
import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> collect = list.stream().filter(x -> x>5).collect(Collectors.toList());
        System.out.println(collect);
        
    }
    
}
