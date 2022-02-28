package Week6.Session26_jdk10;

import java.util.Optional;

public class OptionalClassDemo {
    public static void main(String[] args) {
        String temp = "Ashraf";
        String tempNull = null;

        Optional<String> nullCheck = Optional.ofNullable(temp);
        if(nullCheck.isPresent()) {
            System.out.println(nullCheck.get()+ " :: String is not null .");   // get() is used to get Value of String
        } else {
            System.out.println(" String is null.");
        }

        Optional<String> nullCheck2 = Optional.ofNullable(tempNull);
        if(nullCheck2.isPresent()) {
            System.out.println(nullCheck2.get()+ " :: String is not null .");
        } else {
            System.out.println(" String is null.");
        }

        System.out.println("Value is :: "+nullCheck.filter((s)->s.equals("Ashraf")));   // returns Optional
        System.out.println("Value is :: "+nullCheck2.filter((s)->s.equals("Dummy")));  // returns Empty Optional

        System.out.println("Is value present :: "+nullCheck.isPresent());  // returns true if value present
        System.out.println("Is value present :: "+nullCheck2.isPresent());

        System.out.println("orElse() :: "+nullCheck.orElse("Not Present")); // returns value if present else specified value
        System.out.println("orElse() :: "+nullCheck2.orElse("Not Present"));

    }
}

/*

Ashraf :: String is not null .
 String is null.

Value is :: Optional[Ashraf]
Value is :: Optional.empty

Is value present :: true
Is value present :: false

orElse() :: Ashraf
orElse() :: Not Present



* */