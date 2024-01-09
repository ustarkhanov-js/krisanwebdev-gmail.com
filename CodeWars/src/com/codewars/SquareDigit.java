package com.codewars;

public class SquareDigit {
    public static void main(String[] args) {
        System.out.println(squareDigits(765));
    }

    public static int squareDigits(int n) {
        char[] c = Integer.toString(n).toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < c.length; i++){
            int p = Character.digit(c[i], 10);
            sb.append(p*p);
        }

        return Integer.parseInt(sb.toString());
    }
}
