package com.kh.spring.demo.model.dao;

import java.util.List;

import com.kh.spring.demo.model.dto.Dev;

public interface DemoDao {

	int insertDev(Dev dev);

	List<Dev> selectDevList();

	int deleteDev(int no);

	Dev selectOneDev(int no);

	int updateDev(Dev dev);

}
