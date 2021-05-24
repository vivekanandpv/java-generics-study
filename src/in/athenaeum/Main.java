package in.athenaeum;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //  Type erasure works only with reference types
        //  This rules out the primitives as type arguments

        //  We have autoboxing and unboxing with wrapper classes to support this flaw
        //  https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html

        //  Boxing is when a primitive is wrapped inside a reference type object
        Integer i = Integer.valueOf(123);

        //  Boxing is enabled automatically for primitives and their wrappers
        //  It has other optimizations as well
        //  Hence autoboxing
        Integer j = 123;    //  new Integer(123); is implicit

        //  Unboxing is when a primitive is unboxed from the respective wrapper
        int x = i.intValue();

        //  Unboxing is enabled automatically for primitives and their wrappers
        int y = j;  //j.intValue(); is implicit

        //  Self-study:
        //  boolean	->  Boolean
        //  byte	->  Byte
        //  char	->  Character
        //  float	->  Float
        //  int	    ->  Integer
        //  long	->  Long
        //  short	->  Short
        //  double	->  Double
    }
}
