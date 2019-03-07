package cn.dream.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.dream.entity.Area;
import cn.dream.mapper.AreaMapper;
import cn.dream.service.AreaService;

/**
 * @author 18396
 *
 */
@Service
public class AreaServiceImpl implements AreaService {
	@Autowired
	AreaMapper mapper;

	@Override
	public List<Area> findAllArea() {
		return mapper.queryArea();
	}

	@Override
	public Area findById(int areaId) {
		return mapper.queryAreaById(areaId);
	}

	@Override
	public int insertArea(Area area) {
		return mapper.insertArea(area);
	}

	@Override
	public int udateArea(Area area) {
		return mapper.udateArea(area);
	}

	@Override
	public int deleteArea(int areaID) {
		return mapper.deleteArea(areaID);
	}

}
