package com.ness.eshop.repositery;

import java.util.List;
import java.util.Optional;

import com.ness.eshop.entity.EntityInterface;

public interface Repository<T extends EntityInterface> {

    T save(T t);

	Optional<T> findById(int id);

	List<T> findAll();

}