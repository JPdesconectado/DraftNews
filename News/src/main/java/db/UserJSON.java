package db;

import java.util.ArrayList;

import entities.User;
import exceptions.AdmException;
import exceptions.UserException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class UserJSON implements UserDBInterface {

	private static ObservableList<User> users;

	@Override
	public User getUser(String username) {
		users = getUsers();
		for (User user : users)
			if (user.getName().contentEquals(username))
				return user;
		return null;
	}

	@Override
	public ObservableList<User> getUsers() {
		if (users == null) {
			users = FXCollections.observableArrayList(new ArrayList<User>());
			users.add(new User("admin", "admin"));
		}
		return users;
	}

	@Override
	public void changePass(String username, String newPass) throws UserException, AdmException {
		
		try {
			if (newPass.equals("")) {
				throw new UserException(1);
			}
		} catch (NullPointerException ex) {
			throw new UserException(1);
		
		}
		
		User user = getUser(username);
		
		if (username.equals("admin")) {
			throw new AdmException();
		}
		
		user.setPass(newPass);
		
	}

	@Override
	public void changeUser(String username, String newUser) throws UserException, AdmException {
		
		try {
			if(newUser.equals("")) {
				throw new UserException(2);
			}
		} catch (NullPointerException ex) {
			throw new UserException(2);
		}
		
		User user = getUser(username);
		
		if (username.equals("admin")) {
			throw new AdmException();
		}
		user.setName(newUser);
	}
	
	@Override
	public void addUser(String username, String pass) {
		getUsers().add(new User(username, pass));
	}
}