package Ex01;
public class RegexPartA {


    public static String regexPartA(String module){
        return "^(\\/[^/]+)?\\/[a-zA-Z]+\\/src\\/(test|main)\\/java\\/org\\/pg4200\\/([a-zA-Z]+" + module + "\\/.*\\.(java|cpp|kt))$";
    }

    public static void main(String[] args){
        String module = "10";

        String input = "/pg4200algorithms/lessons/src/test/java/org/pg4200/les10/regex/MatcherTest.java";

    }

    }

