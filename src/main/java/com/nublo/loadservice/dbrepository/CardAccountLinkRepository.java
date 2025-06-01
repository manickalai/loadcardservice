package com.nublo.loadservice.dbrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nublo.loadservice.dao.model.CardAccountLink;
import com.nublo.loadservice.dao.model.pk.CardAccountPK;

public interface CardAccountLinkRepository extends JpaRepository<CardAccountLink, CardAccountPK>{

}
