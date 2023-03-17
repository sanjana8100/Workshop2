package com.bridgelabz;


import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    ArrayList<AddressBook> Dictionary= new ArrayList<>();
    Scanner in = new Scanner(System.in);


    public void addAddressBook() {
        AddressBook addressBook = new AddressBook();

        System.out.println("Enter the name of the address book: ");
        addressBook.setAddressBookName(in.nextLine());

        Dictionary.add(addressBook);
        System.out.println(addressBook);
        System.out.println("Address Book Added!!!");
        System.out.println();
    }

    public void addContacts() {
        System.out.println("Enter the name of the address book you want to add contact:");
        String Aname = in.nextLine();

        for(int i=0;i< Dictionary.size();i++) {
            AddressBook Temp= Dictionary.get(i);
            if(Temp.getAddressBookName().equals(Aname)){
                Temp.addContact();
                System.out.println(Temp);
                System.out.println("Contact Added!!!");
                System.out.println();
            }
            else
                System.out.println("Address Book not found!!!");
        }
    }


    @Override
    public String toString() {
        return "AddressBookMain{" +
                "\nDictionary=" + Dictionary +
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
            System.out.println("=> To EXIT: PRESS 3");
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
                default:
                    status=false;
                    break;
            }
        }
    }
}
