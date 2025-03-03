package Strings;
import java.util.*;
// String Builder
public class Strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");

        System.out.println(sb);
        // sb.append(" Stark");
        // sb.insert(0, "Sto");
        // sb.replace(0, 4, "Stark");
        sb.setCharAt(0, 'P');
        System.out.println(sb);
    }
}
