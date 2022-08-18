package com.aia.innovationCity.service;

import com.aia.innovationCity.entity.City;
import com.aia.innovationCity.entity.Role;

public interface RoleService {
        public Role findByRoleId(int roleId);
        public Role findByIsDefault(int value);
}
