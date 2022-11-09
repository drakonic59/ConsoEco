package ecoconso.api.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecoconso.api.application.entity.User;
import ecoconso.api.application.repository.UserRepository;
import ecoconso.api.application.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository repository;
	
	@Override
	public UserRepository getRepository() {
		return repository;
	}

	@Override
	public User getUserById(Long id) {
		
		User user = null;
		if (getRepository().findById(id).isPresent())
			user = getRepository().findById(id).get();
		
		return user;
	}
	
}
