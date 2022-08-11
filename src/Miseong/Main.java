package Miseong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while(true){
            System.out.print("Enter 4 digits number: ");
            int i = inp.nextInt();
            int i1,i2,i3,i4;
            i4 = i/1000;
            i3 = (i/100)%10;
            i2 = (i/10)%10;
            i1 = i%10;

        if (i<1000 || i>9999) {
            System.out.println(i+" is not valid number");
        }

        else{
            if (i4+i3 == i2+i1) {
                System.out.println(i + " is lucky number");
            }
            else {
                    System.out.println(i+" is not lucky number");
                }}
    }}}


