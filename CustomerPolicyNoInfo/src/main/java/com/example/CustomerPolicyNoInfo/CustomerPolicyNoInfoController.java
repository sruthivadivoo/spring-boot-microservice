package com.example.CustomerPolicyNoInfo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController
@RequestMapping("CustomerPolicyNo")
public class CustomerPolicyNoInfoController {

	@Autowired
	CustomerPolicyRepo custPolRepo;

@RequestMapping("{custNo}")
	public  CustomerPolicyNo getPolicyNo(@PathVariable("custNo")int custNo) {
		
	 CustomerPolicyNo cus=custPolRepo.findByCustNo(custNo);
	return cus;
	// List<CustomerPolicyNo> uss=Arrays.asList(new CustomerPolicyNo(cus.getCustNo(),cus.getPolicyNo()));
	
		//Policy pol=new Policy();
		//pol.setList(uss);
//return pol;
	 
	}

}
