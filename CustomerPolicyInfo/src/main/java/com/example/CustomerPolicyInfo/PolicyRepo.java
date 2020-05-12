package com.example.CustomerPolicyInfo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PolicyRepo extends CrudRepository<CustomerPolicy,Integer>{
	
CustomerPolicy findByPolicyNo(int policyNo);
}
