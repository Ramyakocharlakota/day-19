package com.User_reges;
public class UserRegistration {

public static void main( String[] args ) {
    System.out.println(firstName("Ramya"));
 }
 // validate first name
 public static boolean firstName( String firstName ) {
    return firstName.matches( "[A-Z][a-z]*" );
 }
}