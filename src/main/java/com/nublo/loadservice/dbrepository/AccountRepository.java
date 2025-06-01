package com.nublo.loadservice.dbrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nublo.loadservice.dao.model.Account;
import com.nublo.loadservice.dao.model.pk.AccountPK;

public interface AccountRepository extends JpaRepository<Account, AccountPK>{
	List<Account> findByIdBankIdAndIdAccNumber(String bankId, String accNumber);
}
