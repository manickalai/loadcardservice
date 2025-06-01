package com.nublo.loadservice.dbrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nublo.loadservice.dao.model.AccountBalance;
import com.nublo.loadservice.dao.model.pk.BalancePK;

public interface AccountBalanceRepository extends JpaRepository<AccountBalance, BalancePK>{

}
