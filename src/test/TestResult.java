package test;
import domain.Exercise;

/**
 * Test class to test the functionality of tne main class
 * @author admin
 */

public class TestResult {

    public static void main(String[] args) {

        int R=158635;
        if(R>=100000 && R<1000000)
            {
            System.out.println("Число "+R+" в двійковій системі числення: "+Exercise.CalculateBinarySystem(R)+"\nв восьмеричній системі числення: "+Exercise.CalculateOctalSystem(R)+"\nв шістнадцятиричній системі числення: "+Exercise.CalculateHexadecimalSystem(R));
            }
        else{
            System.out.println("Число R должно быть шестизначным!");
            }
    }
}
