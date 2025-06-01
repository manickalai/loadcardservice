/**
 * 
 */
package com.nublo.loadservice.dbrepository.impl;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.nublo.loadservice.dbrepository.ISequenceExecutorRepositoryCustom;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 * @author DELL
 *
 */
@Service
public class SequenceExecutorRepoCustomImpl implements ISequenceExecutorRepositoryCustom {

	@PersistenceContext
	private EntityManager em;

	@Autowired
	Environment env;

	@SuppressWarnings({ "rawtypes" })
	@Override
	public String getNextNumber(String sequenceName, String bankId) throws Exception {
		String dbName = env.getProperty("db_name");
		Query query = (Query) em
				.createNativeQuery("select " + dbName + ".nextval('" + bankId + "','" + sequenceName + "')");

		Long seqId = (Long) query.uniqueResult();

		return seqId.toString();
	}

}
