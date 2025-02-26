package org.example;
import static input.InputUtils.yesNoInput;
public class CanYouTakeMicrocomputerMaintenance {

    public static void main(String[] args) {
        // Introduction message
        System.out.println("This program will check if you meet the pre-requisites for taking IEE 1310 Microcomputer Systems Maintenance.");
        System.out.println("Please answer the following three questions.");

        // Prompt the user to input whether they have taken the required classes
        boolean hasTakenITConcepts = yesNoInput("Have you taken IEE 1100 Info Tech Concepts?");
        boolean hasTakenITSkills = yesNoInput("Have you taken IEE 1110 Info Tech Skills?");
        boolean hasTakenWindows = yesNoInput("Have you taken IEE 1250 Windows Operating Systems?");

        // Use an AND operator in the condition to check if all of the pre-requisites are met
        if (hasTakenITConcepts && hasTakenITSkills && hasTakenWindows) {
            System.out.println("You meet the pre-requisites. You may take IEE 1310 Microcomputer Systems Maintenance.");
        } else {
            System.out.println("You do not meet the pre-requisites yet. You need to complete all three pre-requisite classes.");
        }
    }
}