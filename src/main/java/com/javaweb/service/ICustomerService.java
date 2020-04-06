package com.javaweb.service;

import com.javaweb.dto.CustomerDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {
	public List<CustomerDTO> findAll(CustomerDTO dto, Pageable pageable);
	public List<CustomerDTO> findAll();
	public CustomerDTO findById(long id);
	public Long save(CustomerDTO building);
	public Long update(CustomerDTO building);
	public boolean delete(Long id);
	public boolean delete(List<Long> ids);
	public long count(CustomerDTO dto);
}
