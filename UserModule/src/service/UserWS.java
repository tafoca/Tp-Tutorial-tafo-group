package service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import entity.Users;

@WebService
public interface UserWS {
	@WebMethod public String addUser(@WebParam(name="User") Users addRequest);
	@WebMethod public String deleteUser(@WebParam(name="UserID") int userID);
	@WebMethod public String updateUser(Users updateUserRequest);
	@WebMethod public Users getUser(@WebParam(name="UserName") String userName);
	@WebMethod public List<Users> getAllUsers();
}

