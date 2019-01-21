package asquared;

import classwork.Test_TrainedQA;
import org.junit.Test;

public class Test_InstantiatingClass {
    @Test
    public void instantiatingClass(){
        //Instantiating a class
        //CLASS NAME <variable> = new CLASS NAME();
        Test_TrainedQA trainedQA = new Test_TrainedQA();

        //Calling method using class object
        trainedQA.trainedQA();



        Test_VariablesAndMethods variablesAndMethods = new Test_VariablesAndMethods();
        variablesAndMethods.displayValues();

        variablesAndMethods.weekDay = "Tuesday";
        variablesAndMethods.gender = 'f';
        variablesAndMethods.displayValues();
    }
}
