import fr.arolla.CalculateString;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.platform.commons.util.PackageUtils;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateStringTest {
    @Test
    public void given_String_zero_should_return_int_0(){
        assertThat(CalculateString.add("") ).isEqualTo(0);
    }
    @Test
    public void given_String_four_should_return_int_4(){
        assertThat(CalculateString.add("4") ).isEqualTo(4);
    }
   @ParameterizedTest
    @CsvSource({"0, 0", "4, 4","15, 15"})
   public void given_String_number_should_return_int_number(String actualNumber, int expectedNumber){

       assertThat(CalculateString.add(actualNumber)).isEqualTo(expectedNumber);

   }
  
}
