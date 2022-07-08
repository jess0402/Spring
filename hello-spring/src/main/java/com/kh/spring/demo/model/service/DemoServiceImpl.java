package com.kh.spring.demo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.spring.demo.model.dao.DemoDao;
import com.kh.spring.demo.model.dto.Dev;

/**
 * 
 * Service가 했던 일
 * - SqlSession 생성/반환
 * - dao 요청
 * - 트랜잭션 처리
 *
 * 하지만 이제는 SqlSession 생성/반환 하지 않아도 됨. -> 이제는 Dao에서 의존주입 받아서 처리함.
 * 트랜잭션 처리도 AOP로 구현할 것.
 */
@Service
public class DemoServiceImpl implements DemoService {
	
	@Autowired
	private DemoDao demoDao;

	@Override
	public int insertDev(Dev dev) {
		
		return demoDao.insertDev(dev);
	}

	@Override
	public List<Dev> selectDevList() {
		return demoDao.selectDevList();
	}

	@Override
	public int deleteDev(int no) {
		return demoDao.deleteDev(no);
	}
}
