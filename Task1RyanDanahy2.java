/*
 *  Design various classes and write a program to computerize the billing system of a hospital
 * 
 * @author- Ryan Danahy
 * @assignment- CSCI 333 Project Task 1
 * @date- 5/4/18 
 */

import java.util.*;

public class Task1RyanDanahy2
{
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        Patient newPatient = new Patient();
        Bill bill = new Bill();

        String str1, str2;

        System.out.print("Enter patient's ID: ");
        str1 = console.next();
        System.out.println();

        newPatient.setID(str1);
        bill.setID(str1);

        System.out.print("Enter patient's first name: ");
        str1 = console.next();
        System.out.println();

        System.out.print("Enter patient's last name: ");
        str2 = console.next();
        System.out.println();

        newPatient.setName(str1, str2);

        System.out.print("Enter doctor's first name: ");
        str1 = console.next();
        System.out.println();

        System.out.print("Enter doctor's last name: ");
        str2 = console.next();
        System.out.println();
        console.nextLine();

        newPatient.setDoctorName(str1, str2);

        System.out.print("Enter doctor's speciality: ");
        str1 = console.nextLine();
        System.out.println();

        newPatient.setDoctorSpl(str1);

        newPatient.setAdmDate(4, 15, 2009);
        newPatient.setDisDate(4, 21, 2009);

        bill.setPharmacyCharges(245.50);
        bill.setRoomRent(2500);
        bill.setDoctorFee(3500.38);

        System.out.println(newPatient);
        System.out.println(bill);
    }
}

