package com.company;

public class Main {

    public static void main(String[] args) {
//	int value = 3;
//	if(value == 1) {
//        System.out.println("Value was one");
//    }else if(value == 2) {
//        System.out.println("Value was two");
//    } else {
//        System.out.println("Was not one or two");
//
//    }

	int switchValue = 3;

	switch (switchValue) {
        case 1:
            System.out.println("Value was one");
            break;

        case 2:
            System.out.println("Value was two");
            break;
        case 3: case 4: case 5:
            System.out.println("was a 3, or a 4, or a 5");
            System.out.println("Actually it was " + switchValue);
            break;

        default:
            System.out.println("Was not one or two");
            break;
    }

    char charValue = 'A';
	switch(charValue) {

        case 'A':
            System.out.println("A was found");
            break;
        case 'B':
            System.out.println("B was found");
            break;
        case 'C': case 'D': case 'E':
            System.out.println(charValue + " was found");
            break;
        default:
            System.out.println("Could not find C or D or E");
            break;
    }




    }
}
