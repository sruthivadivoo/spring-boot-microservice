package com.example.CustomerPersonalInfo;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity
public class CustomerPolicyNo {
@Id
int custNo;
int policyNo;

public CustomerPolicyNo() {
	super();
}
public int getCustNo() {
	return custNo;
}
public void setCustNo(int custNo) {
	this.custNo = custNo;
}
public int getPolicyNo() {
	return policyNo;
}
public void setPolicyNo(int policyNo) {
	this.policyNo = policyNo;
}
@Override
public String toString() {
	return "CustomerPolicyNo [custNo=" + custNo + ", policyNo=" + policyNo + "]";
}
public CustomerPolicyNo(int custNo, int policyNo) {
	super();
	this.custNo = custNo;
	this.policyNo = policyNo;
}

}
