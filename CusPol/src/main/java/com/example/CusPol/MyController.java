package com.example.CusPol;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MyController {
@Autowired
CustomerRepo crepo;


@GetMapping("/customers")
public List<Customer> getCustomers(){
	return (List<Customer>) crepo.findAll();
}
@PostMapping("/addCustomer")
public void addCustomer(@RequestBody Customer customer) {
	int id=(int) crepo.count();
	customer.setId(id+1);
//	crepo.save(new Customer(11,25,"s","j",500,9654712));
//crepo.save(new Customer(5,Integer.valueOf(customer.getAge()),customer.getFname(),customer.getLname(),customer.getMob(),Integer.valueOf(customer.getSalary())));
	crepo.save(customer);
}
@DeleteMapping("/deleteCustomer")
public void deleteCustomer(@RequestParam("id") String id){
	//System.out.println(id);
	int no=Integer.parseInt(id);
	crepo.deleteById(no);
}
@GetMapping("/login")
public boolean login(@RequestParam("username") String username, @RequestParam("password") String password) {
String userpass=username+password;
int no=Integer.parseInt(username);
		 Customer cust=new Customer();
 cust=crepo.findById(no).get();
String pass=no+cust.getFname();
	if(pass.equals(userpass)) {
		return true;
	}
	else {
		return false;
	}
}
@GetMapping("/find")
public Customer find(@RequestParam("username") String username){
	int no=Integer.parseInt(username);
	System.out.println(no);
	 System.out.println(crepo.findById(no).get());
	 Customer cust=new Customer();
	 cust=crepo.findById(no).get();
	 return cust;
}
}
