/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex37;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args) {

        int[] numArr = {1,2,3,4,5,6,7,8,9,0};
        int length, specialChar, numbers;

        Scanner len = new Scanner(System.in);
        System.out.print("What is the minimum length: ");
        length = len.nextInt();

        Scanner chars = new Scanner(System.in);
        System.out.print("How many special characters: ");
        specialChar = chars.nextInt();

        Scanner numAmount = new Scanner(System.in);
        System.out.print("How many numbers: ");
        numbers = numAmount.nextInt();

        Random random = new Random();

        String setOfCharacters = "abcdefghijklmnopqrstuvwxyz";
        String setOfCharacters2 = "@#$%^&*!?><";
        String setOfCharacters3 = "1234567890";

        int randomInt = random.nextInt(setOfCharacters.length());
        char randomChar = setOfCharacters.charAt(randomInt);

        int randomInt2 = random.nextInt(setOfCharacters2.length());
        char randomChar2 = setOfCharacters2.charAt(randomInt2);

        int randomInt3 = random.nextInt(setOfCharacters3.length());
        char randomChar3 = setOfCharacters3.charAt(randomInt3);

        for(int i = 0; i < specialChar; i++) {

            System.out.print(randomChar2);

        }

        for(int i = 0; i < numbers; i++) {

            System.out.print(randomChar3);

        }

        for(int i = 0; i < length - numbers - specialChar; i++) {

            System.out.print(randomChar);

        }

    }

}
