package com.ohMyBaby.user.safeProduct.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ohMyBaby.user.safeProduct.vo.SafeProductVO;

@Mapper
public interface SafeProductDAO {
	
	public List<SafeProductVO> selectSafeProductList();
	
	public SafeProductVO selectSafeProductDetail(SafeProductVO spvo);
	
	public SafeProductVO login(SafeProductVO spvo);

}
