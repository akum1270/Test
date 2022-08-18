package com.aia.innovationCity.serviceImpl;

import com.aia.innovationCity.entity.Role;
import com.aia.innovationCity.repository.RoleRepository;
import com.aia.innovationCity.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role findByRoleId(int roleId) {
        return roleRepository.findByRoleId(roleId);
    }

    @Override
    public Role findByIsDefault(int value) {
        return roleRepository.findByIsDefault(value);
    }


}
