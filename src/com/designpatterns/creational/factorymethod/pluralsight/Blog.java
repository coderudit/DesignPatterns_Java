package com.designpatterns.creational.factorymethod.pluralsight;

public class Blog extends Website{
	@Override
	public void createWebsite() {
		pages.add(new CommentPage());
		pages.add(new ContactPage());
		pages.add(new AboutPage());
	}
}
