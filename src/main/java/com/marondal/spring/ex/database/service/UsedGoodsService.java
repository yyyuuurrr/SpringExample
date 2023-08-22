package com.marondal.spring.ex.database.service;

import org.springframework.stereotype.Service;

// 로직 (business) 담당 
@Service
public class UsedGoodsService {

	
	
	// used_goods 모든 데이터 조회
	public getUsedGoodsList() {
		UsedGoodsRepository repository = new UsedGoodsRepository();
		
		repository.selectUsedGoodsList();
	}
	
}
