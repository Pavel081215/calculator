package calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class ParserMatchTest {
    ParserMatch parserMatch = new ParserMatch();


    @Test
    public void testParse() throws Exception {


        Double actuals = parserMatch.Parse("12 3.12+ 34*( 12-10)");

        Double expected = 191.12;
        Assert.assertEquals(expected, actuals);

    }

    @Test
    public void testParseVariables() throws Exception {
        parserMatch.setVariable("a",34.0);

        Double actuals = parserMatch.Parse("123.12 +a*(1 2-10)");

        Double expected = 191.12;
        Assert.assertEquals(expected, actuals);

    }

}
