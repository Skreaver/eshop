package com.ness.eshop.mapper;

import java.util.function.Function;

import com.ness.eshop.domain.SupplierDTO;
import com.ness.eshop.entity.Supplier;

public class MapperDTOtoSupplier implements Function<SupplierDTO, Supplier> {

	@Override
	public Supplier apply(SupplierDTO supplierDTO) {

		Supplier supplier = new Supplier(supplierDTO.getLogin(), supplierDTO.getPassword(), supplierDTO.getName());
		return supplier;
	}

}
