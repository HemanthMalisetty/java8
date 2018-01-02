package com.sapient.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.sapient.productDao.ProductDao;
import com.sapient.productService.NotFoundException;
import com.sapient.productService.ProductService;
import com.sapient.productService.ProductServiceImpl;
import com.sapient.vo.Product;

import name.falgout.jeffrey.testing.junit5.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class ProductTest {

	@Mock
	ProductDao dao;
	
	@InjectMocks
	ProductService ser=new ProductServiceImpl();
	
	private static Product p1,p2,p3,p4;
	private static Map<String,Map<Integer,Product>> catMap;
	private static Map<Integer,Product> compMap;
	private static Map<Integer,Product> mobileMap;
	private static List<String> p1Spec,p2Spec,p3Spec,p4Spec;
	
	@BeforeAll
	public static void beforeAll(){
		p1=new Product(1001, "aspire", 45000);
		p2=new Product(1002, "thinkpad", 87000);
		p3=new Product(1003, "galaxy7", 12000);
		p4=new Product(1004, "s8", 24000);
		
		
		compMap=new HashMap<Integer,Product>();
		compMap.put(p1.getProductId(), p1);
		compMap.put(p2.getProductId(), p2);
		
		mobileMap=new HashMap<Integer,Product>();
		mobileMap.put(p3.getProductId(), p3);
		mobileMap.put(p4.getProductId(), p4);
		
		catMap=new HashMap<>();
		catMap.put("computer", compMap);
		catMap.put("mobile", mobileMap);
		
		
		p1Spec = Arrays.asList("4gb ram","1tb hdd","pentium i3");
		p2Spec = Arrays.asList("8gb ram","2tb hdd","pentium i3");
		p3Spec = Arrays.asList("2gb ram","14mp camera","64gb storage");
		p4Spec = Arrays.asList("4gb ram","16mp camera","128gb storage"); 
		
		
	}
	
	@Test
	public void testProduct1() throws NotFoundException{
		when(dao.getCatNPro()).thenReturn(catMap);
		when(dao.getProductSpec("thinkpad")).thenReturn(p2Spec);
		Product expected =new Product(1002, "thinkpad", 87000);
		expected.setSpecList(p2Spec);
		assertEquals(expected, ser.getProductInfo("computer", 1002));
		
		InOrder order=Mockito.inOrder(dao);
		order.verify(dao).getCatNPro();
		order.verify(dao).getProductSpec("thinkpad");
	}
	
	@Test
	public void testProduct2() throws NotFoundException{
		when(dao.getCatNPro()).thenReturn(catMap);
		when(dao.getProductSpec("aspire")).thenReturn(p1Spec);
		Product expected =new Product(1001, "aspire", 45000);
		expected.setSpecList(p1Spec);
		assertEquals(expected, ser.getProductInfo("computer", 1001));
		
		InOrder order=Mockito.inOrder(dao);
		order.verify(dao).getCatNPro();
		order.verify(dao).getProductSpec("aspire");
	}
	
	@Test
	public void testProduct3() throws NotFoundException{
		when(dao.getCatNPro()).thenReturn(catMap);
		when(dao.getProductSpec("galaxy7")).thenReturn(p3Spec);
		Product expected =new Product(1003, "galaxy7", 12000);
		expected.setSpecList(p3Spec);
		assertEquals(expected, ser.getProductInfo("mobile", 1003));
		
		InOrder order=Mockito.inOrder(dao);
		order.verify(dao).getCatNPro();
		order.verify(dao).getProductSpec("galaxy7");
	}
	
	@Test
	public void testProduct4() throws NotFoundException{
		when(dao.getCatNPro()).thenReturn(catMap);
		when(dao.getProductSpec("s8")).thenReturn(p4Spec);
		Product expected =new Product(1004, "s8", 24000);
		expected.setSpecList(p4Spec);
		assertEquals(expected, ser.getProductInfo("mobile", 1004));
		
		InOrder order=Mockito.inOrder(dao);
		order.verify(dao).getCatNPro();
		order.verify(dao).getProductSpec("s8");
	}
	
	@Test
	public void testProduct5() throws NotFoundException{
		when(dao.getCatNPro()).thenReturn(catMap);
		
		assertThrows(NotFoundException.class, ()->ser.getProductInfo("computer", 1003));
	}
	
	@Test
	public void testProduct6() throws NotFoundException{
		when(dao.getCatNPro()).thenReturn(catMap);
		
		assertThrows(NotFoundException.class, ()->ser.getProductInfo("mobile", 1001));
	}
	
	@Test
	public void testProduct7() throws NotFoundException{
		when(dao.getCatNPro()).thenReturn(catMap);
		
		assertThrows(NotFoundException.class, ()->ser.getProductInfo("zyz", 1001));
	}
	
	
}
