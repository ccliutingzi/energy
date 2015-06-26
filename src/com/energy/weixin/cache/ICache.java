/**
 * 
 */
package com.energy.weixin.cache;

/**
 * @author tf
 * 
 *         2015年6月26日
 */
public interface ICache<T> {
	T get(String id);

	void add(String id, T object);

	void remove(String id);

	void clear();
}
