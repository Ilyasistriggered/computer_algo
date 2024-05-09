/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilyas
 */
import java.util.*;

public class MatchMethods {
    
    List<Integer> intList = Arrays.asList(2,4,5,6,8);
    boolean allEven = intList.stream().allMatch(i -> i%2 == 0);
    boolean oneEven = intList.stream().anyMatch(i -> i%2 ==0);
    boolean noneMultipleOfThree = intList.stream().noneMatch(i -> i%3 == 0);
    
}
