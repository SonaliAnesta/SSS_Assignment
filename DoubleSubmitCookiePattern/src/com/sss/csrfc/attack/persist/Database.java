package com.sss.csrfc.attack.persist;

public class Database
{

	private static final String usr = "admin";		//default hard-coded User name

	  private static final String pwd = "password";		//default hard-coded Password

  public static boolean isValidUser(String usrname, String pass)
  {
	  return usr.equalsIgnoreCase(usrname) && pwd.equalsIgnoreCase(pass);
  }
}
