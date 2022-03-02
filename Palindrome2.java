//WAP to check whether the number is palindrome or not.

// 121 (org) - (Rev) 121 -> Palindrome
// 123 (org) - (Rev) 321 -> X Palindrome

// 121 - 121 -> Palindrome

import java.util.Scanner;

class Palindrome2 {
public static void main(String[] args) {
int num, reversedNum = 0, remainder;
Scanner sc = new Scanner(System.in);
System.out.println("Enter any Number : ");
num = sc.nextInt();
// store the number to originalNum
int originalNum = num;
// get the reverse of originalNum
// store it in variable
while (num != 0) {
remainder = num % 10;
reversedNum = reversedNum * 10 + remainder;
num = num / 10;
}
// check if reversedNum and originalNum are equal
if (originalNum == reversedNum) {
System.out.println(originalNum + " is Palindrome.");
}
else {
System.out.println(originalNum + " is not Palindrome.");
}
}
}