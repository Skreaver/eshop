package com.ness.eshop.repositery;

import java.util.List;
import java.util.Optional;

import com.ness.eshop.entity.Entity;

public interface Repository<T extends Entity> {

    T save(T t);

	Optional<T> findById(int id);

	List<T> findAll();

}