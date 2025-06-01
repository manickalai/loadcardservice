package com.nublo.loadservice.dbrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nublo.loadservice.dao.model.Card;
import com.nublo.loadservice.dao.model.pk.CardPK;

public interface CardRepository extends JpaRepository<Card, CardPK>{

	public Card findByCardPkDeviceNumber(String deviceNumber);
}
