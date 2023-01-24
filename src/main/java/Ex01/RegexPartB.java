package Ex01;

import java.util.ArrayList;

public class RegexPartB {

    public static String regexPartB(String list){
        String regA = "(^@\\w+:).+(programming|programmering|[P|p][Gg][a-zA-Z0-9]{4}).+(exam|eksamen).+(20[0-9]{2}-[0-9]{2}-[0-9]|[0-9]{2}-[0-9]{2}-[0-9]{2})(.+)?([^?])$";
        String regB = "(^@\\w+:).+(exam|eksamen).+(programming|programmering|[P|p][Gg][a-zA-Z0-9]{4}).+(20[0-9]{2}-[0-9]{2}-[0-9]|[0-9]{2}-[0-9]{2}-[0-9]{2})(.+)?([^?])$";

        if(list.matches(regA)){
                return regA;
            } else if(list.matches(regB)){
                return regB;
            }
        return "";
    }
}
