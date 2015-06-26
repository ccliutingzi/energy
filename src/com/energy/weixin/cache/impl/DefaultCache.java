/**
 * 
 */
package com.energy.weixin.cache.impl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.energy.weixin.cache.ICache;

/**
 * @author tf
 * 
 *         2015年6月26日
 */
public class DefaultCache<T> implements ICache<T> {

	private static final Logger LOGGER = Logger.getLogger(DefaultCache.class);

	protected Map<String, T> cache;

	/** Cache with no limit */
	public DefaultCache() {
		this.cache = new HashMap<String, T>();
	}

	/**
	 * Cache which has a hard limit: no more elements will be cached than the
	 * limit.
	 */
	public DefaultCache(final int limit) {
		this.cache = new LinkedHashMap<String, T>(limit + 1, 0.75f, true) {
			// +1 is needed, because the entry is inserted first, before it is
			// removed
			// 0.75 is the default (see javadocs)
			// true will keep the 'access-order', which is needed to have a real
			// LRU cache
			private static final long serialVersionUID = 1L;

			protected boolean removeEldestEntry(java.util.Map.Entry<String, T> eldest) {
				boolean removeEldest = size() > limit;
				if (removeEldest) {
					LOGGER.trace("Cache limit is reached, {} will be evicted," + eldest.getKey());
				}
				return removeEldest;
			}
		};
	}

	@Override
	public T get(String id) {
		return cache.get(id);
	}

	@Override
	public void add(String id, T object) {
		cache.put(id, object);
	}

	@Override
	public void remove(String id) {
		cache.remove(id);
	}

	@Override
	public void clear() {
		cache.clear();
	}
}
