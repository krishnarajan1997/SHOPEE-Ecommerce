package org.pom;

public class PomClass {
public HomePage home;
public Cart cart;
public Login log;
public Search search;
public HomePage homePage() {
	return home=(home==null)?home=new HomePage():home;
}
public Cart cartpage() {
	return cart=(cart==null)?cart=new Cart():cart;
}
public Search search() {
	return search=(search==null)?search=new Search():search;
}
public Login loginpage() {
	return log=(log==null)?log=new Login():log;
}




}
