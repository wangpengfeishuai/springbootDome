package cn.dream.service;

import java.util.List;

import cn.dream.entity.Area;

/**
 * @author 18396
 *
 */
public interface AreaService {
	/**
	 * 查询区域
	 * @return
	 */
	public List<Area> findAllArea();
	/**
	 * 根据ID查询区域
	 * @param areaId
	 * @return
	 */
	public Area findById(int areaId);
	/**
	 * 区域
	 * @param area
	 * @return
	 */
	public int insertArea(Area area);
	/**
	 * 区域
	 * @param area
	 * @return
	 */
	int udateArea(Area area);
	/**
	 * 区域
	 * @param areaID
	 * @return
	 */
	int deleteArea(int areaID);
}
