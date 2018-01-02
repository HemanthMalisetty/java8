package com.sapient.productService;

import com.sapient.vo.Product;

public interface ProductService {
public 	Product getProductInfo(String cat,int pid) throws NotFoundException;
}
