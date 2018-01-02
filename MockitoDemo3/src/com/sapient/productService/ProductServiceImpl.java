package com.sapient.productService;

import java.util.List;
import java.util.Map;

import com.sapient.productDao.ProductDao;
import com.sapient.vo.Product;

public class ProductServiceImpl implements ProductService {

	private ProductDao dao;
	public void setDao(ProductDao dao) {
		this.dao = dao;
	}
	@Override
	public Product getProductInfo(String cat, int pid) throws NotFoundException {
		
		Map<String, Map<Integer,Product>> catMap=dao.getCatNPro();
		if(!catMap.containsKey(cat))
			throw new NotFoundException("Category not found");
		
		Map<Integer,Product> pMap=catMap.get(cat);
		
		
		if(!pMap.containsKey(pid))
			throw new NotFoundException("Product Id not found");
		Product product=pMap.get(pid);
		List<String> specList=dao.getProductSpec(product.getProductName());
		product.setSpecList(specList);
		return product;
	}

}
