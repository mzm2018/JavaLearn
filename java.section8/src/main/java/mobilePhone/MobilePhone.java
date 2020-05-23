package mobilePhone;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private  ArrayList<Contact> myContacts = new ArrayList<Contact>();


      public MobilePhone() {
    }

    public boolean AddContact(Contact contact) {

       if (findContact(contact.getName()) >=0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);

    }

    private int findContact(String contactName) {
        for (int i=0;i<this.myContacts.size();i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }
    public String queryContact(Contact contact) {
        if(findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >=0 ) {
            return this.myContacts.get(position);
        }
        return null;

    }



    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if (position < 0) {
            System.out.println(this.myContacts.get(position) + ",was not found");
            return false;
        }
        this.myContacts.remove(position);
        System.out.println(contact.getName() + ",was deleted");
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " ,was not found");
            return false;
        }
        else if(findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name : " + newContact.getName() + "already exists, Update was not successful");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ",was replaced with " + newContact.getName());
        return true;
    }

    public void printContacts() {
        if (this.myContacts == null) {
            System.out.println("No Contacts available yet");
        } else {
            for (int i = 0; i < this.myContacts.size(); i++) {
                System.out.println((i + 1) + "." + this.myContacts.get(i).getName() + "->" + this.myContacts.get(i).getPhoneNumber());
            }
        }
    }


}




