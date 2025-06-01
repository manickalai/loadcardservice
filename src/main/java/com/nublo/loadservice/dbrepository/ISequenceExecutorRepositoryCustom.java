/**
 * 
 */
package com.nublo.loadservice.dbrepository;

/**
 * @author DELL
 *
 */
public interface ISequenceExecutorRepositoryCustom {
	public String getNextNumber(String sequenceName, String bankId) throws Exception;
}
