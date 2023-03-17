package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
    Map<String,AddressBook> Dictionary= new HashMap<>();
    Scanner in = new Scanner(System.in);


    public void addAddressBook() {
        AddressBook addressBook = new AddressBook();

        System.out.println("Enter the name of the address book: ");
        addressBook.setAddressBookName(in.nextLine());

        Dictionary.put(addressBook.getAddressBookName(),addressBook);
        System.out.println(addressBook);
        System.out.println("Address Book Added!!!");
        System.out.println();
    }

    public void addContacts() {
        System.out.println("Enter the name of the address book you want to add contact:");
        String name = in.nextLine();

        if(Dictionary.containsKey(name)) {
            AddressBook Temp= Dictionary.get(name);
            Temp.addContact();
            System.out.println(Temp);
            System.out.println("Contact Added!!!");
            System.out.println();
        }
        else
            System.out.println("Given Address Book not Found!!!\n");
    }

    public void displayAddressBook(){
        System.out.println("Enter the name of the address book you want to Display:");
        String name = in.nextLine();
        if(Dictionary.containsKey(name)) {
            AddressBook Temp = Dictionary.get(name);
            System.out.println(Temp);
        }
        else
            System.out.println("Given Address Book not Found!!!\n");
    }


    @Override
    public String toString() {
        return "AddressBookMain{" +
                "Dictionary=\n" + Dictionary +
                '}';
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AddressBookMain addressBookMain= new AddressBookMain();
        boolean status= true;
        while(status) {
            System.out.println("******************MENU:******************");
            System.out.println("=> To Add Address Book: PRESS 1");
            System.out.println("=> To Add Contact: PRESS 2");
            System.out.println("=> To Display Dictionary of Address Books: PRESS 3");
            System.out.println("=> To Display Address Books Of Contacts: PRESS 4");
            System.out.println("=> To EXIT: PRESS 5");
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    addressBookMain.addAddressBook();
                    System.out.println(addressBookMain);
                    System.out.println();
                    break;
                case 2:
                    addressBookMain.addContacts();
                    break;
                case 3:
                    System.out.println(addressBookMain);
                    break;
                case 4:
                    addressBookMain.displayAddressBook();
                default:
                    status=false;
                    break;
            }
        }
    }
}
