package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    ArrayList<AddressBook> Dictionary= new ArrayList<>();
    Scanner in = new Scanner(System.in);


    public void addAddressBook(){
        AddressBook addressBook= new AddressBook();

        System.out.println("Enter the name of the address book: ");
        addressBook.setAddressBookName(in.nextLine());

        System.out.println("Address Book Added!!!");
        System.out.println(addressBook.toString());

        for(int i=0;i<100;i++) {
            System.out.println("******************MENU:******************");
            System.out.println("=> To Add Contact in the Address Book: PRESS 1");
            System.out.println("=> To Close the Address Book: PRESS 2");
            int choice = in.nextInt();

            if(choice==1) {
                addressBook.addContact();
            }
            else
                i=100;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AddressBookMain addressBookMain= new AddressBookMain();
        for(int i=0;i<100;i++) {
            System.out.println("******************MENU:******************");
            System.out.println("=> To Add Address Book: PRESS 1");
            System.out.println("=> To EXIT: PRESS 2");
            int choice = in.nextInt();

            if (choice == 1) {
                addressBookMain.addAddressBook();
            }
            else
                i = 100;
        }
    }
}
