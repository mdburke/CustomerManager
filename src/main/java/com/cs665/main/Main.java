package com.cs665.main;

import com.cs665.bundle.Bundle;
import com.cs665.bundleStyle.ProductBundleStyle;
import com.cs665.bundleStyle.WhiteHomeTheaterBundleStyle;

import java.util.Scanner;

/**
 * @author michael.burke
 * @since 5/16/17
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductBundleStyle bundleStyle;

        displayWelcomeMessage();

        System.out.println("Choose a bundle style by typing in the associated number. Your options are:");
        System.out.println("1. Home Theater Bundle - White");
        System.out.println("2. Home Theater Bundle - Black");
        System.out.println("3. Digital Streaming Bundle - White");
        System.out.println("4. Digital Streaming Bundle - Black");

        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                bundleStyle = new WhiteHomeTheaterBundleStyle();
                break;
            case 2:
                bundleStyle = new WhiteHomeTheaterBundleStyle();
                break;
            case 3:
                bundleStyle = new WhiteHomeTheaterBundleStyle();
                break;
            case 4:
                bundleStyle = new WhiteHomeTheaterBundleStyle();
                break;
            default:
                throw new IllegalArgumentException("Invalid Choice");
        }

        Bundle chosenBundle = bundleStyle.getBundle();
//        chosenBundle.display();

        displayGoodbyeMessage();
    }

    private static void displayWelcomeMessage() {
        System.out.println("Welcome to the Sonos customer manager.");
    }

    private static void displayGoodbyeMessage() {
        System.out.println("Goodbye!");
    }
}
