/**
 * 
 */
package com.nublo.loadservice.dao.model.datetime;

import java.sql.Timestamp;

/**
 * @author DELL
 *
 */
public interface IDateTimestampEntity {
	public void setCreated(Timestamp created);
	public void setUpdated(Timestamp updated);
	void setUserCreate(String userCreate);
	void setUserModif(String userModif);
}
