package ecoconso.api.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecoconso.api.application.entity.Course;
import ecoconso.api.application.entity.User;
import ecoconso.api.application.repository.CourseRepository;
import ecoconso.api.application.service.ICourseService;

@Service
public class CourseServiceImpl implements ICourseService {

	@Autowired
	private CourseRepository repository;
	
	@Override
	public CourseRepository getRepository() {
		return repository;
	}

	@Override
	public Course getCourseById(Long id) {
		
		Course course = null;
		if (getRepository().findById(id).isPresent())
			course = getRepository().findById(id).get();
		
		return course;
	}
	
}
