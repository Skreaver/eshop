package com.ness.eshop.repositery.JPA;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import com.ness.eshop.entity.EntityInterface;

@NoRepositoryBean
public interface AbstractRepositoryJPA<T extends EntityInterface> extends JpaRepository<T, Long> {

	@Query("select t from #{#entityName} t where t.id = ?1")
	T findById(int id);

	
}
