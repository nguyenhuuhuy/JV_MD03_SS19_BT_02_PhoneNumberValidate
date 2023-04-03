package demo.bt2;

import java.util.Scanner;

public class ValidatePhoneTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ValidatePhone validatePhone = new ValidatePhone();
        System.out.println("Enter your phone: ");
        String phone = sc.nextLine();
        System.out.println(phone + " is " + validatePhone.validate(phone));
    }
}
