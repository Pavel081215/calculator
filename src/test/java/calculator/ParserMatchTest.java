package calculator;

import org.testng.Assert;
import org.testng.annotations.Test;
import sun.font.Script;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;


public class ParserMatchTest {
    ParserMatch parserMatch = new ParserMatch();


    @Test
    public void testParse() throws Exception {


        Double actuals = parserMatch.Parse("12 3.12+ 34*( 12-10)");

        Double expected = 191.12;
        Assert.assertEquals(actuals, expected);

    }

    @Test
    public void testParseVariables() throws Exception {
        parserMatch.setVariable("a",34.0);

        Double actuals = parserMatch.Parse("123.12 +a *(1 2-10)");

        Double expected = 191.12;
        Assert.assertEquals(actuals, expected);

    }
    @Test
    public void testParseScientificCalculator() throws Exception {

        ScientificCalculator sinus = new Sinus();
        Map<String,ScientificCalculator> variablesCalculator = new HashMap<String, ScientificCalculator>();
        variablesCalculator.put("sin", sinus);
        parserMatch.setVariablesScientificCalculator(variablesCalculator);
        Double actuals = parserMatch.Parse("sin(180)");
        Double expected = 1.2246467991473532E-16;
        Assert. assertEquals(actuals, expected);

    }
}
