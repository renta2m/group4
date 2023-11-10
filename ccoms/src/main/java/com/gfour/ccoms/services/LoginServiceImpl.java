package com.gfour.ccoms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gfour.ccoms.dtos.LoginDTO;
import com.gfour.ccoms.entities.Employee;
import com.gfour.ccoms.entities.Student;
import com.gfour.ccoms.repositories.EmployeeRepo;
import com.gfour.ccoms.repositories.StudentRepo;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public LoginDTO login(LoginDTO loginDTO) throws Exception {
        Student student = null;
        Employee employee = null;

        if (loginDTO.getDesignation().equals("student")) {
            student = studentRepo.findByGlobalIdAndPassword(loginDTO.getUserName(), loginDTO.getPassword());
        } else {
            employee = employeeRepo.findByEmailIdAndPassword(loginDTO.getUserName(), loginDTO.getPassword());
        }

        if (student == null && employee == null) {
            throw new Exception("user does not exist");
        }

        if (employee != null) {
            loginDTO.setDesignation(employee.getRole());
        }

        loginDTO.setPassword(null);
        return loginDTO;
    }
}
