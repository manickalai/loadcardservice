/**
 * 
 */
package com.nublo.loadservice.dbrepository;

import com.nublo.loadservice.dao.model.CardAccountLink;

/**
 * @author DELL
 *
 */
public interface ICardAccountLinkRepository {
	public CardAccountLink getCardAccountLink(String bankId, String cardNumber) throws Exception;
}
