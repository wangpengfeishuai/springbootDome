package cn;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.dream.Application;
import cn.dream.entity.Area;
import cn.dream.mapper.AreaMapper;

/**
 * @author 18396
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class AreaDaoTest {
	@Autowired
	private AreaMapper dao;
	@Test
	public void queryArea() {
		List<Area> queryArea = dao.queryArea();
		queryArea.forEach(a -> System.out.println(a));
	}
}
