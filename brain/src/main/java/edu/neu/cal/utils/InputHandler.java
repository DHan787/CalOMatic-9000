/*
 * @Author: Jiang Han
 * @Date: 2023-12-11 18:41:17
 * @Description: 
 */
package edu.neu.cal.utils;

import java.util.function.Function;

public class InputHandler {

    public static <T> boolean handleInput(String inputContent, Class<T> type, Function<String, T> parser) {
        try {
            // Attempt to parse the input content using the provided parser function
            T parsedValue = parser.apply(inputContent);
            return type.isInstance(parsedValue);
        } catch (Exception e) {
            // Parsing failed
            return false;
        }
    }
}
