package assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;

//import java.io.*;


public class Tests {


   @Test
   public void code(){
       App.main(null);
       assertEquals(15.0, App.midpoint(10, 20), "INCORRECT");
       assertEquals(24.0, App.midpoint(23, 25), "INCORRECT");
       assertEquals(74.5f, App.midpoint(74, 75), "INCORRECT");
   }

   @Test
    public void late() {
        App.main(null);
        assertTrue(DueDate.onTime(2020, 12, 21), "Submitted Late");
    }


}
