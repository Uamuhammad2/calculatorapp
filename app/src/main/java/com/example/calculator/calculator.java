package com.example.calculator;

import java.util.ArrayList;

import java.util.List;

public class calculator {
    private List<String> values = new ArrayList<>();
    boolean operatorCheck(String value) {
        return value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String value : values) {
            sb.append(value);
        }
        return sb.toString();
    }

    public String answer() {
        return String.valueOf(calculate());
    }

    void res() {
        values.clear();
    }

    int calculate() {
        int numfirst = 0;
        int i = 0;
        while (i < values.size() && !operatorCheck(values.get(i))) {
            numfirst = numfirst * 10 + Integer.parseInt(values.get(i));
            i++;
        }
        int result = numfirst;
        while (i < values.size()) {
            String operator = values.get(i);
            i++;
            int numSec = 0;
            while (i < values.size() && !operatorCheck(values.get(i))) {
                numSec = numSec * 10 + Integer.parseInt(values.get(i));
                i++;
            }
            if (operator.equals("+")) {
                result += numSec;
            } else if (operator.equals("-")) {
                result -= numSec;
            } else if (operator.equals("*")) {
                result *= numSec;
            } else if (operator.equals("/")) {
                result /= numSec;
            }
        }
        return result;
    }

    boolean v() {
        if (values.get(0).equals("+") || values.get(0).equals("-") || values.get(0).equals("*") || values.get(0).equals("/")) {
            return false;
        }
        if (values.get(values.size() - 1).equals("+") || values.get(values.size() - 1).equals("-") || values.get(values.size() - 1).equals("*") || values.get(values.size() - 1).equals("/")) {
            return false;
        }
        int c = 0;
        for (int i = 0; i < values.size(); i++) {
            String value = values.get(i);
            if (value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/")) {
                c++;
            }
        }
        if (c > 1) {
            return false;
        }
        return true;
    }
    void push(String value) {
        values.add(value);
    }
}
