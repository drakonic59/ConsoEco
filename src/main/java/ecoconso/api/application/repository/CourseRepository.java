package ecoconso.api.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ecoconso.api.application.entity.Course;


@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
