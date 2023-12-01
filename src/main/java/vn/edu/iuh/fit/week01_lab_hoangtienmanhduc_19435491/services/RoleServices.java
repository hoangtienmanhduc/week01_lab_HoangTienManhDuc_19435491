package vn.edu.iuh.fit.week01_lab_hoangtienmanhduc_19435491.services;

import vn.edu.iuh.fit.week01_lab_hoangtienmanhduc_19435491.entities.Role;
import vn.edu.iuh.fit.week01_lab_hoangtienmanhduc_19435491.repositories.RoleRepository;

public class RoleServices {
    private RoleRepository repository;

    public RoleServices() {
        repository=new RoleRepository();
    }

    public void addRole(Role role){
        repository.addRole(role);
    }
}
