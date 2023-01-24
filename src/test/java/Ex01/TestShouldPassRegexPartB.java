package Ex01;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class TestShouldPassRegexPartB {


    ArrayList<String> input = new ArrayList<>();


    @Test
    public void shouldPassRegexPartB1(){
        input.add("@Bogdan:");
        input.add("The");
        input.add("PG4200");
        input.add("re-exam");
        input.add("is");
        input.add("on");
        input.add("05-08-22");
        input.add("are");
        input.add("on");
        input.add("the");
        input.add("repo.");

        String regex = RegexPartB.regexPartB(input);

        assertTrue(input.toString().matches(regex));
    }
}
