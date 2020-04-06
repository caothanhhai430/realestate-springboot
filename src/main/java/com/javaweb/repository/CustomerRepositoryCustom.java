package com.javaweb.repository;

import com.javaweb.builder.CustomerSearchBuilder;
import com.javaweb.entity.CustomerEntity;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerRepositoryCustom {
	List<CustomerEntity> findAll(CustomerSearchBuilder builder, Pageable pageable);
	public long count(CustomerSearchBuilder builder);
}
