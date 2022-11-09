package ecoconso.api.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ecoconso.api.application.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
