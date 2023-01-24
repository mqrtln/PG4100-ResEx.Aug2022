package Ex01;

import Ex01.RegexPartA;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestShouldNotPassRegexPartA {
    String regex = RegexPartA.regexPartA("10");

    @Test
    public void testShouldNotPassRegex1(){
        String input = "/pg4200algorithms/lessons/src/main/java/org/pg4200/les10/regex/MatcherTest.txt";
        assertFalse(input.matches(regex));
    }
    @Test
    public void testShouldNotPassRegex2(){
        String input = "/lessons/src/test/java/org/pg4200/les09/UndirectedGraph.java";
        assertFalse(input.matches(regex));
    }
    @Test
    public void testShouldNotPassRegex3(){
        String input = "/solutions/src/test/java/org/pg4200/sol10/RegexExampleImpTest.html";
        assertFalse(input.matches(regex));
    }
}
