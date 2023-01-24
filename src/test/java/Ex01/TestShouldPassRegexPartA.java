package Ex01;

import Ex01.RegexPartA;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestShouldPassRegexPartA {
    String regex = RegexPartA.regexPartA("10");

    @Test
    public void testShouldPassRegex1(){
        String input = "/pg4200algorithms/lessons/src/test/java/org/pg4200/les10/regex/MatcherTest.java";
        assertTrue(input.matches(regex));
    }

    @Test
    public void testShouldPassRegex2(){
        String input = "/lessons/src/test/java/org/pg4200/les10/UndirectedGraphTest.java";
        assertTrue(input.matches(regex));
    }

    @Test
    public void testShouldPassRegex3(){
        String input = "/solutions/src/test/java/org/pg4200/sol10/RegexExampleImpTest.java";
        assertTrue(input.matches(regex));
    }
}
