package com.ness.eshop.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.ness.eshop.entity.EntityInterface;
import com.ness.eshop.repositery.Repository;

public class AbstractRepositerySORM<T extends EntityInterface> implements Repository<T> {

	private Class<T> type;

	public AbstractRepositerySORM(Class<T> type) {
		this.type = type;
	}

	@Override
	public T save(T t) {
		try (Connection connection = DriverManager.getConnection(DatabaseSetting.URL, DatabaseSetting.USER,
				DatabaseSetting.PASSWORD);) {

			SORM sorm = new SORM(connection);
			List<T> items = sorm.select(type, "WHERE id = '" + t.getId() + "'");
			if (items.isEmpty()) {
				sorm.insert(t);
			} else {
				if (items.size() == 1) {
					sorm.update(t);
				} else
					System.out.println("Unexcepted error. There are more objects wit the same id.");
			}

		} catch (Exception e) {
			System.out.println("Problem with insert new object");
		}
		return t;
	}

	@Override
	public Optional<T> findById(int id) {

		Optional<T> t = null;
		try (Connection connection = DriverManager.getConnection(DatabaseSetting.URL, DatabaseSetting.USER,
				DatabaseSetting.PASSWORD);) {

			SORM sorm = new SORM(connection);

			t = sorm.select(type, "WHERE id = '" + id + "'").stream().findFirst();

		} catch (Exception e) {

			e.printStackTrace();
		}
		return t;

	}

	@Override
	public List<T> findAll() {

		List<T> item = new ArrayList<>();
		try (Connection connection = DriverManager.getConnection(DatabaseSetting.URL, DatabaseSetting.USER,
				DatabaseSetting.PASSWORD);) {

			SORM sorm = new SORM(connection);

			return sorm.select(type, "");

		} catch (Exception e) {

			e.printStackTrace();
		}
		return item;
	}

}
