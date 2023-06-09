package com.ohMyBaby.user.safeProduct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohMyBaby.user.safeProduct.dao.SafeProductDAO;
import com.ohMyBaby.user.safeProduct.vo.SafeProductVO;

import lombok.Setter;

@Service
public class SafeProductServiceImpl implements SafeProductService {
	
	@Setter(onMethod_ = @Autowired)
	private SafeProductDAO safeProductDAO;

	@Override
	public List<SafeProductVO> selectSafeProductList() {
		List<SafeProductVO> list = null;
		list = safeProductDAO.selectSafeProductList();
		
		return list;
	}

	@Override
	public SafeProductVO selectSafeProductDetail(SafeProductVO spvo) {
		
		SafeProductVO detail = null;
		
		
		detail = safeProductDAO.selectSafeProductDetail(spvo);
		
		if(detail!=null) {
			
			detail.setSp_content(detail.getSp_content().toString().replaceAll("\n", "<br />"));
		}
		
		return detail;
	}

}
