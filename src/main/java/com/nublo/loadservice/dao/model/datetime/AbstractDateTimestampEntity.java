/**
 * 
 */
package com.nublo.loadservice.dao.model.datetime;

import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

/**
 * @author DELL
 *
 */
@MappedSuperclass
public class AbstractDateTimestampEntity implements IDateTimestampEntity {

	@Column(name = "dt_crt")
	private Timestamp created;

	@Column(name = "dt_modif")
	private Timestamp updated;

	@Column(name = "usr_crt")
	private String userCreate;

	@Column(name = "usr_modif")
	private String userModif;

	public Date getCreated() {
		return created;
	}

	@Override
	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	@Override
	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}

	public String getUserCreate() {
		return userCreate;
	}

	@Override
	public void setUserCreate(String userCreate) {
		this.userCreate = userCreate;
	}

	public String getUserModif() {
		return userModif;
	}

	@Override
	public void setUserModif(String userModif) {
		this.userModif = userModif;
	}

}
