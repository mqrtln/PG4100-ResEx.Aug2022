package Ex01;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestShouldPassRegexPartB {


    @Test
    public void shouldPassRegexPartB1(){
        String input = "@Bogdan: The PG4200 re-exam is on 2022-08-05";
        String regex = RegexPartB.regexPartB(input);
        assertTrue(input.matches(regex));
    }

    @Test
    public void shouldPassRegexPartB2(){
        String input = "@Bogdan: Sample exercises for the PGR112 exam on 05-08-22 are on the repo.";
        String regex = RegexPartB.regexPartB(input);
        assertTrue(input.matches(regex));
    }

    @Test
    public void shouldPassRegexPartB3(){
        String input = "@Sven: The exam for PG4200 has been set for 22-08-05!";
        String regex = RegexPartB.regexPartB(input);
        assertTrue(input.matches(regex));
    }

    @Test
    public void shouldPassRegexPartB4(){
        String input = "@Harald: The programmering eksamen end on 2022-08-06.";
        String regex = RegexPartB.regexPartB(input);
        assertTrue(input.matches(regex));
    }

    @Test
    public void shouldNotPassRegexPartB1(){
        String input = "@Bogdan: The PG4200 is on 2022-08-05";
        String regex = RegexPartB.regexPartB(input);
        assertFalse(input.matches(regex));
    }


    @Test
    public void shouldNotPassRegexPartB2(){
        String input = "@Harald Where can I find more exercises for the programmering eksamen?";
        String regex = RegexPartB.regexPartB(input);
        assertFalse(input.matches(regex));
    }


    @Test
    public void shouldNotPassRegexPartB3(){
        String input = "@Hardrada: Where can I find more ships to invade England?";
        String regex = RegexPartB.regexPartB(input);
        assertFalse(input.matches(regex));
    }


    @Test
    public void shouldNotPassRegexPartB4(){
        String input = "@Napoleon: Is it too late to learn what programmering means?";
        String regex = RegexPartB.regexPartB(input);
        assertFalse(input.matches(regex));
    }


    @Test
    public void shouldNotPassRegexPartB5(){
        String input = "@Armfeld: I plan to travel to get to Trondheim by 1718-12-31, for the HIS4230 exam!";
        String regex = RegexPartB.regexPartB(input);
        assertFalse(input.matches(regex));
    }


    @Test
    public void shouldNotPassRegexPartB6(){
        String input = "@Harald: I am ready for any programming exam";
        String regex = RegexPartB.regexPartB(input);
        assertFalse(input.matches(regex));
    }

}
