package com.ness.eshop.repositery;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import com.ness.eshop.entity.Entity;

public abstract class AbstractRepository<T extends Entity> implements Repository<T> {

	private static final AtomicInteger idGenerator = new AtomicInteger(1);
	private List<T> items;

	public AbstractRepository() {
		items = new ArrayList<>();
	}

	@Override
	public T save(T t) {

		if (unsetId(t)) {
			return insertAsNew(t);

		}

		else if (doesNotExist(t)) {
			return insert(t);
		}

		return update(t);

	}

	// if insert t = 0 -> New t
	private boolean unsetId(T t) {

		return t.getId() == 0;
	}

	// if insert t > 0 -> but does not exist in list
	private boolean doesNotExist(T t) {

		return !(items.stream().filter(item -> item.getId() == t.getId()).findFirst().isPresent());
	}

	// generate new ID for t
	private int genNewId() {

		// items.stream().map(T::getId).max(Integer::compareTo).orElse(0);
		return idGenerator.getAndIncrement();
	}

	// insert new t to do List
	private T insertAsNew(T t) {

		t.setId(genNewId());
		if (doesNotExist(t)) {
			insert(t);
		}
		return update(t);
	}

	// insert new t to the List
	private T insert(T t) {

		items.add(t);
		return t;
	}

	// update exist t
	private T update(T t) {

		items.removeIf(item -> item.getId() == t.getId());
		items.add(t);
		return t;
	}

	// find by ID
	@Override
	public Optional<T> findById(int id) {

		return items.stream().filter(item -> item.getId() == id).findFirst();
	}

	// find All
	@Override
	public List<T> findAll() {

		return items.stream().collect(Collectors.toList());
	}

}
