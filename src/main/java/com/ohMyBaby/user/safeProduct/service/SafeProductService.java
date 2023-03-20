package com.ohMyBaby.user.safeProduct.service;

import java.util.List;

import com.ohMyBaby.user.safeProduct.vo.SafeProductVO;

public interface SafeProductService {

	public List<SafeProductVO> selectSafeProductList();
	
	public SafeProductVO selectSafeProductDetail(SafeProductVO spvo);
	
}
