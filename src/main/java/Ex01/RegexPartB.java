package Ex01;

import java.util.ArrayList;

public class RegexPartB {

    public static String regexPartB(ArrayList<String> list){

        for(String line : list){
            if(line.matches("(^@\\w+:).+(programming|programmering|[P|p][Gg][a-zA-Z0-9]{4}).+(exam|eksamen).+(20[0-9]{2}-[0-9]{2}-[0-9]|[0-9]{2}-[0-9]{2}-[0-9]{2})(.+)?([^?])$")){
                return line;
            } else if(line.matches("(^@\\w+:).+(exam|eksamen).+(programming|programmering|[P|p][Gg][a-zA-Z0-9]{4}).+(20[0-9]{2}-[0-9]{2}-[0-9]|[0-9]{2}-[0-9]{2}-[0-9]{2})(.+)?([^?])$")){
                return line;
            }
        }
        return "";
    }
}
