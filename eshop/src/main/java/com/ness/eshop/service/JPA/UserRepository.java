package com.ness.eshop.service.JPA;



import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ness.eshop.entity.User;

@Transactional
public interface UserRepository extends AbstractRepositoryJPA<User>  {
	
	
	
}
