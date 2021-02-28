package in.athenaeum;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //  Wrapper classes are reference types
        Character character = null;

        Integer i = 100;
        Object object = i;  // = 100; is similar

        //  But primitives do not inherit from Object
        //  int j = null;   // fails

        //  A potential danger
        //  int j = i;  //  detectable only in runtime



        Integer j = 100;

        //  Are i and j references to the same object?
        //  It is not specified whether we get same object for same value
        //  Hence, == and != are generally not recommended

        //  recommended
        System.out.println(i.equals(j));
    }
}
