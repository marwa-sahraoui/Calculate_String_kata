package fr.arolla;
import java.util.Arrays;
import java.util.stream.Stream;

public class CalculateString {

    public static int add(String number) {
        if(number.isEmpty()){
            return 0;
        }
        
           Stream <String> numbers= Arrays.stream(number.split(","));
            return numbers.mapToInt(Integer::parseInt).sum();

    }
}
