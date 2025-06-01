/**
 * 
 */
package com.nublo.loadservice.services;

import com.nublo.loadservice.api.model.LoadCardBalanceRequest;
import com.nublo.loadservice.api.model.LoadForexCardApiResponse;
import com.nublo.loadservice.api.model.LoadForexCardRequest;

/**
 * @author DELL
 *
 */

public interface ILoadCardService {
	public void loadCardBalance(LoadCardBalanceRequest loadCardRequest);

	public LoadForexCardApiResponse loadForexCard(LoadForexCardRequest loadForexCardReq) throws Exception;
}
