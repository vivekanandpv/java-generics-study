package in.athenaeum;

public class Main {

    public static void main(String[] args) {
	    //  Defining the type parameter at the time of use
        //  Diamond operator (since Java 7) and type inference
        //  https://docs.oracle.com/javase/7/docs/technotes/guides/language/type-inference-generic-instance-creation.html
        Container<String> stringContainer = new Container<>("Generics study");

        //  stringContainer is type safe (java.lang.String)
        System.out.println(stringContainer.getElement().getClass().getName());

        stringContainer.setElement("How are you?"); //  ony T or subtypes
    }
}
