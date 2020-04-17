package domain;

/**
 * Main class for working with numbers
 * @author admin
 */
public class Exercise {

    /**
     * Method that transletes a decimal number to binary
     * @param R integer with whitch action will be performed
     * @return the specified number in binary notation as a string
     */
    public static String CalculateBinarySystem(int R){
        return (String) (Integer.toBinaryString((int) R));
    }
    
    /**
     * Method that transletes a decimal number to octal
     * @param R integer with whitch action will be performed
     *  @return the specified number in octal notation as a string
     */
    public static String CalculateOctalSystem(int R){
        return (String) (Integer.toOctalString((int) R));
    }
    
    /**
     * Method that transletes a decimal number to hexadecimal
     * @param R integer with whitch action will be performed
     *  @return the specified number in hexadecimal notation as a string
     */
    public static String CalculateHexadecimalSystem(int R){
        return (String) (Integer.toHexString((int) R));
    }
}
