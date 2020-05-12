package com.example.CustomerPolicyInfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("PolicyInfo")
public class CustomerPolicyInfoController {

	@Autowired
	PolicyRepo policyInt;
	

	@RequestMapping("{policyNo}")
	public CustomerPolicy getpolicyInfo(@PathVariable("policyNo") int policyNo) {
	CustomerPolicy cus=policyInt.findByPolicyNo(policyNo);
	return cus;
	}
}
