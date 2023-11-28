/*
Charles Brown
CITC-1311-C01-Programming II
Sept. 23, 2023
*/

package com.murach.teamlineup;

public class Validation {

    private final String lineEnd;

    public Validation() {
        this.lineEnd = "\n";
    }

    public Validation(String lineEnd) {
        this.lineEnd = lineEnd;
    }

    public String isPresent(String value, String name) {
        String msg = "";
        if (value.isEmpty()) {
            msg = name + " is required." + lineEnd;
        }
        return msg;
    }

    public String isDouble(String value, String name) {
        String msg = "";
        try {
            Double.valueOf(value);
        } catch (NumberFormatException e) {
            msg = name + " must be a valid number." + lineEnd;
        }
        return msg;
    }

    public String isInteger(String value, String name) {
        String msg = "";
        try {
            Integer.valueOf(value);
        } catch (NumberFormatException e) {
            msg = name + " must be an integer." + lineEnd;
        }
        return msg;
    }
}
