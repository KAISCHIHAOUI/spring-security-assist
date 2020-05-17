package com.payroll.resttuto;


class EmployeeNotFoundException extends RuntimeException {

	EmployeeNotFoundException(Long id) {
		super("Could not find employee " + id);
	}
}
