/**
 * 
 */
package com.nublo.loadservice.dbrepository.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nublo.loadservice.dao.model.CardAccountLink;
import com.nublo.loadservice.dbrepository.ICardAccountLinkRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

/**
 * @author DELL
 *
 */
@Service
public class CardAccountLinkRepoImpl implements ICardAccountLinkRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public CardAccountLink getCardAccountLink(String bankId, String cardNumber) throws Exception {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<CardAccountLink> cq = cb.createQuery(CardAccountLink.class);
		Root<CardAccountLink> root = cq.from(CardAccountLink.class);

		Predicate bankIdPre = cb.equal(root.get("id").get("bankId"), bankId);
		Predicate cardPre = cb.equal(root.get("id").get("cardNumber"), cardNumber);
		cq.where(bankIdPre, cardPre);
		TypedQuery<CardAccountLink> query = em.createQuery(cq);
		List<CardAccountLink> list = query.getResultList();
		if (!list.isEmpty()) {
			return list.get(0);
		} else {
			return null;
		}

		/*
		 * Criteria criteria =
		 * em.unwrap(Session.class).createCriteria(CardAccountLink.class);
		 * criteria.add(Restrictions.eq("id.bankId", bankId));
		 * criteria.add(Restrictions.eq("id.cardNumber", cardNumber));
		 * 
		 * return (CardAccountLink) criteria.uniqueResult();
		 */
		//return null;

	}
}
