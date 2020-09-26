package com.adp3.service.bridge.impl;

import com.adp3.entity.bridge.EmployeeSalary;
import com.adp3.repository.bridge.EmployeeSalaryRepository;
import com.adp3.repository.bridge.impl.EmployeeSalaryRepositoryImpl;
import com.adp3.service.bridge.EmployeeSalaryService;

import java.util.Set;

/**
 * Author: Liesl Gounden-Wentzel
 * Class: Part Time
 * Student number: 202104133
 * Description:EmployeeSalaryServiceImpl - implementation of EmployeeSalaryService as a concrete class
 */

public class EmployeeSalaryServiceImpl implements EmployeeSalaryService {

    private static EmployeeSalaryService service = null;
    private EmployeeSalaryRepository repository;

    EmployeeSalaryServiceImpl(){
        this.repository = EmployeeSalaryRepositoryImpl.getRepository();
    }

    public static EmployeeSalaryService getService(){
        if (service == null)
            service = new EmployeeSalaryServiceImpl();
        return service;
    }

    @Override
    public Set<EmployeeSalary> getAll() {
        return this.repository.getAll();
    }

    @Override
    public EmployeeSalary create(EmployeeSalary empSal) {
        return this.repository.create(empSal);
    }

    @Override
    public EmployeeSalary read(String s) {
        return this.repository.read(s);
    }

    @Override
    public EmployeeSalary update(EmployeeSalary t) {
        return this.repository.update(t);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }
}
