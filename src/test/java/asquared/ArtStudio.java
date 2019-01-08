package asquared;

import org.junit.Test;

//class begins
public class ArtStudio {
    /**
     * method to print the objects located in an art studio
     */
    @Test
    public void mainHall(){
        System.out.println("I see a white board in the hall");
        System.out.println("I see a table in the hall");
        //calling reception
        reception();
        //calling bathroom
        bathroom();
    }
    public void reception(){
        System.out.println("I see a desk in reception");
    }
    public void bathroom(){
        System.out.println("I see a trash can in the bathroom");
        //calling storeroom
        storeRoom();
    }
    public void storeRoom(){
        System.out.println("I see supplies in store room");
    }
}
