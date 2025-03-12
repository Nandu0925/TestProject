package com.jspider.Array;

import java.util.Scanner;

public class Mainclass8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("ArmStrong in the array are :");
        int sum=0;
        for (int i=0;i<array.length;i++) {
            if (isArm(array[i])) {
                sum=sum+array[i];
            }
        }
        System.out.println(sum);
	}
	static boolean isArm(int n) {
		int temp=n;
		int cd=Countdigit(n);
		int sum=0;
		while(n>0) {
			int rem=n%10;
			int pow=(int)Math.pow(rem, cd);
			sum=sum+pow;
			n=n/10;
		}
		return sum==temp;
	}
		static int Countdigit(int n) {
			int Count=0;
			while(n>0) {
				Count++;
				n=n/10;
			}
			return Count;
		}
	}

