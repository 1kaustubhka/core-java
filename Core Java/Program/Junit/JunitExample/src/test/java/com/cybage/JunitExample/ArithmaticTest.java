package com.cybage.JunitExample;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

//@Disabled
@TestMethodOrder(MethodOrderer.MethodName.class)
class ArithmaticTest {

	
	@BeforeAll
	static void setup() {
		//db connection and other stuff before testing
		System.out.println("start");
	}
	
	
	@BeforeEach
	 void setupUnit() {
		//db connection and other stuff before testing
		System.out.println("before each");
	}
	
	@AfterEach
	 void AfterUnit() {
		//db connection and other stuff before testing
		System.out.println("after each");
	}
	Arithmatic ath = new Arithmatic();

//	@Disabled
	@RepeatedTest(10)
	void testAdd() {
		System.out.println("----TestAdd-----");
		int actual = ath.add(10,10);
		int expected = 20;
		
		assertEquals(20,ath.add(10,10));
		assertEquals(0,ath.add(-10,10));
		assertEquals(0,ath.add(0,0));
	}

	@Tag("Dev")
	@Test
	void testSub() {
		System.out.println("----TestSub-----");
		assertEquals(0,ath.sub(10,10));
		assertEquals(-20,ath.sub(-10,10));
		assertEquals(0,ath.sub(0,0));
		assertEquals(20,ath.sub(10,-10));
		assertEquals(0,ath.sub(-10,-10));
	}
	
	@Test
	void testDiv() {
		System.out.println("----TestDiv-----");
		assertThrows(ArithmeticException.class, ()-> ath.div(2, 0));
		
	}
	
	@Test
	void testArray() {
		System.out.println("----TestArr-----");
		int exp[] = {1,2,3,4,5};
		int act[] = {1,2,3,4,5};
		assertArrayEquals(exp,act);
	}
	
	@Test
	void testCollection() {
		System.out.println("----TestList----");
		List<Integer> exp = new ArrayList<>();
		exp.add(10);
		exp.add(20);
		exp.add(30);
		exp.add(40);
		
		List<Integer> act = Arrays.asList(10,20,30,40);
		
		assertIterableEquals(exp,act);
	}
	
//	@Test
//	void failTest() {
//		fail("it will always fail");
//	}
	
	//Conditional Test
	@Test
	@EnabledOnOs({OS.WINDOWS})
	void testOS()
	{
		System.out.println("--------------WINDOWSSSSS------------");
	}
	
	
	@Test
	@EnabledOnJre({JRE.OTHER})
	void testJre() {
		System.out.println("JREEEEEEE--------------");
	}
	
	
	@AfterAll
	static void shutdown() {
		System.out.println("end");
	}

}
