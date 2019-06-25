package db;

import entities.User;
import exceptions.AdmException;
import exceptions.UserException;
import javafx.collections.ObservableList;

public interface UserDBInterface {

	public User getUser(String username);

	public ObservableList<User> getUsers();
	
	public void changePass(String username, String newPass) throws UserException, AdmException;
	
	public void changeUser(String username, String newUser) throws UserException, AdmException;
	
	public void addUser(String username, String pass);
	
}