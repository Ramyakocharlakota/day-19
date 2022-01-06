package com.User_reges;

public class UserRegestrationUC2 {

		public static void main( String[] args ) {
		    System.out.println(LastName("KOCHARLAKOTA"));
		 }
		 // validate first name
		 public static boolean LastName( String LastName ) {
		    return LastName.matches( "[A-Z]+([ '-][a-zA-Z]+)*");
		 }
}