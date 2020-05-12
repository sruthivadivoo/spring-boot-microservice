package com.example.CustomerPersonalInfo;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
public class CustomerPersonalInfo {

int custNo;
int policyNo;
String policyInfo;
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
public String getPolicyInfo() {
	return policyInfo;
}
public void setPolicyInfo(String policyInfo) {
	this.policyInfo = policyInfo;
}
@Override
public String toString() {
	return "CustomerPersonalInfo [custNo=" + custNo + ", policyNo=" + policyNo + ", policyInfo=" + policyInfo + "]";
}
public CustomerPersonalInfo(int custNo, int policyNo, String policyInfo) {
	super();
	this.custNo = custNo;
	this.policyNo = policyNo;
	this.policyInfo = policyInfo;
}
public CustomerPersonalInfo() {
	super();
	// TODO Auto-generated constructor stub
}



}
