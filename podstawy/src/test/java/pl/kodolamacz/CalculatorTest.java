package pl.kodolamacz;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void shouldAdTwoValues(){
        // given
        int a=5;
        int b=7;
        Calculator calculator = new Calculator();
        //when
        int result = calculator.add(a,b);
        //then
       Assert.assertEquals(12,result);
    }
    @Test
    public void shouldSubstractTwoValues() {

        //given
        int a=16;
        int b=7;
        Calculator calculator = new Calculator();
        //when
        int result = calculator.minus(16,7);
        //then
        Assert.assertEquals(9,result);
    }
    @Test
    public void shouldMultiplyTest(){
        // given
        int a=2;
        int b=10;
        Calculator calculator = new Calculator();
        // when
        int result = calculator.multiply(a,b);
        // then
     Assert.assertEquals(20,result);
    }
}
