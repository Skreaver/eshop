package com.ness.eshop.mapper;

import java.util.function.Function;

import com.ness.eshop.domain.SupplierDTO;
import com.ness.eshop.entity.Supplier;

public class MapperSupplierToDTO  implements Function<Supplier, SupplierDTO>{

	@Override
	public SupplierDTO apply(Supplier supplier) {

		SupplierDTO supplierDTO = new SupplierDTO(supplier.getLogin(), supplier.getPassword(), supplier.getName());
		return supplierDTO;
	}

}
