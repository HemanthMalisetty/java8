package com.sapient.productDao;

import java.util.List;
import java.util.Map;

import com.sapient.vo.Product;

public interface ProductDao {
	Map<String,Map<Integer,Product>> getCatNPro();
	
	List<String> getProductSpec(String productName);
}
