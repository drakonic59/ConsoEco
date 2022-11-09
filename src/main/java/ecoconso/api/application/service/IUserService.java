package ecoconso.api.application.service;

import ecoconso.api.application.entity.User;
import ecoconso.api.application.repository.UserRepository;

public interface IUserService {

	public UserRepository getRepository();
	
	public User getUserById(Long id);
	
}
