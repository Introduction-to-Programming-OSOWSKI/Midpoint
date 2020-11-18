package assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;

//import java.io.*;


public class Tests {


   @Test
   public void test(){
       App.main(null);
       assertEquals(15.0, App.midpoint(10, 20), "INCORRECT");
       assertEquals(24.0, App.midpoint(23, 25), "INCORRECT");
       assertEquals(74.5, App.midpoint(74, 75), "INCORRECT");
   }

}
