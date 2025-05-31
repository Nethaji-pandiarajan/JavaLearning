package com.MethodReference;

public class ReferenceToConstructor {

	// ClassName :: new 
	
	public static void main(String[] args) {
		
		IUser user = User :: new;
		
		User u = user.getUser("Nethaji");
		System.out.println(u.getName()); 
		
	}
}

@FunctionalInterface
interface IUser{
	User getUser(String name);
}

class User implements IUser{
	
	public User(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int id;
	
	private String name;

	@Override
	public User getUser(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

