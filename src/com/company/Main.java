package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        char x, y;
        int i;
        i = 0;
        do {
            System.out.println("Введите букву");
            x = (char) System.in.read();
            y = (char) System.in.read();
            if (x < 122 & x > 96) {
                System.out.println((char) (x - 32));
                i++;
                System.out.println(i);
            } else if (x > 65 & x < 90) {
                System.out.println((char) (x + 32));
                i++;
                System.out.println(i);
            }
        } while ((x != '.') & (y == '\n'));

    }
}
