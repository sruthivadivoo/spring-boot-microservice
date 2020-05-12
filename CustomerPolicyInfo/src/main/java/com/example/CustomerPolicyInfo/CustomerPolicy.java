package com.example.CustomerPolicyInfo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerPolicy {
	@Id
int policyNo;
String policyInfo;
public int getPolicyNo() {
	return policyNo;
}
public void setPolicyNo(int policyNo) {
	this.policyNo = policyNo;
}
public String getPolicyInfo() {
	return policyInfo;
}
public void setPolicyInfo(String policyInfo) {
	this.policyInfo = policyInfo;
}
public CustomerPolicy(int policyNo, String policyInfo) {
	super();
	this.policyNo = policyNo;
	this.policyInfo = policyInfo;
}
public CustomerPolicy() {
	super();
}
@Override
public String toString() {
	return "CustomerPolicy [policyNo=" + policyNo + ", policyInfo=" + policyInfo + "]";
}

}
