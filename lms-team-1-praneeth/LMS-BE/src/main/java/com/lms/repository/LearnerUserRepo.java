package com.lms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.entity.LearnerUser;

@Repository
public interface LearnerUserRepo extends JpaRepository<LearnerUser, Long> {

	boolean existsByemail(String email);

	Optional<LearnerUser> findByemail(String email);
	

}
