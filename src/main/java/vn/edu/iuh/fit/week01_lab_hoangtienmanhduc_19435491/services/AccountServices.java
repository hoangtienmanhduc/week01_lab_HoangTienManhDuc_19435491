package vn.edu.iuh.fit.week01_lab_hoangtienmanhduc_19435491.services;

import vn.edu.iuh.fit.week01_lab_hoangtienmanhduc_19435491.entities.Account;
import vn.edu.iuh.fit.week01_lab_hoangtienmanhduc_19435491.repositories.AccountRepository;

public class AccountServices {
    private AccountRepository accountRepository;

    public AccountServices() {
        accountRepository = new AccountRepository();
    }

    public Account save(Account account) {
        return accountRepository.insert(account);
    }
}
