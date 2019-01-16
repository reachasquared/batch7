package sirisha;

import org.junit.Test;

/**
 * Variables allow the Java program to store values during the runtime of the program.
 * In this class we can learn the Types and use of them
 */
public class Test_VariablesAndMethods {

    //Variable declaration
    // character variable that can hold one character data
    char gender;
    // Integer variable that can hold an integer value
    int age;
    // String variable that can hold one string data
    //Variables can be declared and initiated at the same time like below
    String weekDay = "Sunday";
    // Boolean variable can hold ONLY either true or false (no other data it accepts)
    boolean status = true;

    @Test
    public void variablesAndMethods() {

        //Business logic using variables
        gender = 'f';
        age = 16;
        age = age + 1;
        weekDay = "Sunday";
        status = false;

        //displayValues
        displayValues();

        age = age + 10;
        weekDay = "Monday";

        displayValues();

    }


    public void displayValues(){
    //displayvalues
        System.out.println("Gender: " + gender);//we are displaying label 'Gender' and value
        System.out.println("age: " + age);
        System.out.println("Week: " + weekDay);
        System.out.println("Status:" + status);

        System.out.println();

    }
}
