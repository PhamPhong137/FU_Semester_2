/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asshelp;

/**
 *
 * @author PC-Phong
 */
public class Validate {

    private static final String PRODUCT_CODE_PATTERN = "P\\d{6}";

    public static boolean isValidCode(String code) {
        // Check if the code matches the format P000000
        return code != null && code.matches(PRODUCT_CODE_PATTERN);
    }

    public static boolean isNotEmpty(String value) {
        // Check if the value is not empty
        return value != null && !value.trim().isEmpty();
    }

    public static boolean isPositive(double value) {
        // Check if the value is positive
        return value > 0;
    }

    public static boolean isPositive(int value) {
        // Check if the value is positive
        return value > 0;

    }
}
