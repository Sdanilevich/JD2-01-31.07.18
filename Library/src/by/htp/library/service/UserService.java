package by.htp.library.service;

import by.htp.library.bean.User;

public interface UserService {
	User signIn(String login, String password) throws ServiceException;
	void registration(User user) throws ServiceException;
}
