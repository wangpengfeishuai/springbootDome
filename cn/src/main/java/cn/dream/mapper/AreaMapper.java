package cn.dream.mapper;

import java.util.List;


import cn.dream.entity.Area;
/**
 * @author 18396
 *
 */
public interface AreaMapper {
	/**
	 * 查询区域
	 * @return
	 */
	List<Area> queryArea();
	/**
	 * 根据ID查询区域
	 * @param areaId
	 * @return
	 */
	Area queryAreaById(int areaId);
	/**
	 * 插入区域
	 * @param area
	 * @return
	 */
	int insertArea(Area area);
	/**
	 * 更新区域
	 * @param area
	 * @return
	 */
	int udateArea(Area area);
	/**
	 * 删除区域
	 * @param areaID
	 * @return
	 */
	int deleteArea(int areaID);
	
}
