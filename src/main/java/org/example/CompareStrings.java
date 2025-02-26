package org.example;
import static input.InputUtils.stringInput;

public class CompareStrings {
    public static void main(String[] args) {
        // Kullanıcıdan üniversite adını alır
        String college = stringInput("Which college do you attend?");

        // Girilen üniversite adını "MCTC" ile karşılaştırır (büyük/küçük harf duyarsız)
        if (college.equalsIgnoreCase("MCTC")) {
            System.out.println("Vay, MCTC!");
        } else {
            System.out.println("Too bad, you should check out MCTC.");
        }
    }
}
