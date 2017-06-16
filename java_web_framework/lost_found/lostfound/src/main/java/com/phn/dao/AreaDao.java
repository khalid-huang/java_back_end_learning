/**
 * 
 */
package com.phn.dao;

import java.util.List;

import com.phn.entity.Area;

/**
 * @author admin
 * @date 2014-10-13
 */
public interface AreaDao {
	public boolean insert(Area area);
	public boolean update(Area area);
	public boolean delete(int index);
	public Area find(int index);
	/**
	 * @return
	 */
	public List<Area> getAll();
}
