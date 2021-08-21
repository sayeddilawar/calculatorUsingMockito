import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorTest
{
    Calculator calc=null;
    ArithmeticOperation arithmetic = mock(ArithmeticOperation.class);
    @BeforeEach
    void perform()
    {
        calc = new Calculator(arithmetic);
    }
    @Test
    void toGetSumOfTwoNumbers()
    {
        when(arithmetic.sum(5.0,5.0)).thenReturn(10.0);
        assertEquals(10.0,calc.sum(5.0,5.0));
    }

    @Test
    void toGetDifferenceBetweenTwoNumbers()
    {
        when(arithmetic.Diff(5.0,3.0)).thenReturn(2.0);
        assertEquals(2.0,calc.Diff(5.0,3.0));
    }

    @Test
    void toGetProductTwoNumbers() {
        when(arithmetic.Product(5.0, 3.0)).thenReturn(15.0);
        assertEquals(15.0, calc.Product(3.0, 5.0));
    }

    @Test
    void toGetQuotientWhenDivisibleByNumber()
    {
        when(arithmetic.Quotient(15.0, 3.0)).thenReturn(5.0);
        assertEquals(5.0, calc.Quotient(15.0, 3.0));

    }
}