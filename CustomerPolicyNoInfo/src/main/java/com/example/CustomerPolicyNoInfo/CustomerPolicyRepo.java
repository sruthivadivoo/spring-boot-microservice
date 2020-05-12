package com.example.CustomerPolicyNoInfo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface CustomerPolicyRepo extends JpaRepository<CustomerPolicyNo,Integer>{
	
CustomerPolicyNo findByCustNo(int custNo);
}
