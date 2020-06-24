package com.example.CustomerPersonalInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CustomerPersonalInfoController {
	@Autowired
	private RestTemplate resttemplate;

@Autowired
CustomerPersonalInfo pf;

@RequestMapping("home")
public String home() {
	return "home.jsp";
}
@RequestMapping("newCustomer")
public String newCustomer() {
	return "NewCustomer.jsp";
}
	@RequestMapping("getcustInfo")
	public String getcustInfo(@RequestParam int custNo,Model model){
	//	ModelAndView mv=new ModelAndView("showPolicyNo.jsp");
	CustomerPolicyNo cusno=resttemplate.getForObject("http://CustomerPolicyNoInfo/CustomerPolicyNo/"+custNo,CustomerPolicyNo.class);
	CustomerPolicy cupol=resttemplate.getForObject("http://CustomerPolicyInfo/PolicyInfo/"+cusno.getPolicyNo(), CustomerPolicy.class);
		//pf.setCustNo(cusno.getCustNo());

	//	Policy pol=resttemplate.getForObject("http://CustomerPolicyNoInfo/CustomerPolicyNo/"+custNo,Policy.class);
/*
		List<CustomerPersonalInfo> lists= pol.getList().stream().map(CustomerPolicyNo ->{
			CustomerPolicy cupol=resttemplate.getForObject("http://CustomerPolicyInfo/PolicyInfo/"+CustomerPolicyNo.getPolicyNo(), CustomerPolicy.class);
			return new CustomerPersonalInfo(CustomerPolicyNo.getCustNo(),cupol.getPolicyNo(),cupol.getPolicyInfo());
		}).collect(Collectors.toList());
		
		String arrays=lists.toString();
		*/
	//	String splits[]=arrays.split(arrays);
		
		model.addAttribute("cusno", cusno.getCustNo());
		model.addAttribute("policyNo", cusno.getPolicyNo());
		model.addAttribute("policyInfo",cupol.getPolicyInfo());
//		mv.addObject("custNo", cupol);
	
	//	return mv;
	/*	List<CustomerPersonalInfo> lis=new ArrayList<CustomerPersonalInfo>();
		CustomerPersonalInfo cuss=new CustomerPersonalInfo();
		cuss.setCustNo(55);
		cuss.setPolicyInfo("lifetime");
		cuss.setPolicyNo(56);
		lis.add(cuss);
		return lis;
		
*/
		 return "showPolicyNo.jsp";
	}
}
