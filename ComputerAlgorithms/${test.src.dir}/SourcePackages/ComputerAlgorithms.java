
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
public class ComputerAlgorithms {
    public static void main(String[] args) {
        
        Double[] numbers = {2.4, 55.6, 90.12, 26.6};
        Set<Double> set = new HashSet<>(Arrays.asList(numbers));
        int count = 0;
        for(double e: set){
            if (e>60){
                count++;
            }
            System.out.println("Count is: "+count);
        }
        
    }
}
