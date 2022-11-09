package ecoconso.api.application.service;

import ecoconso.api.application.entity.Course;
import ecoconso.api.application.repository.CourseRepository;

public interface ICourseService {

	public CourseRepository getRepository();
	
	public Course getCourseById(Long id);
	
}
