package de.kone1k1.games.FootballManager2k18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankTest {

	private Bank testBank;

	@BeforeEach
	void initParms() {
		testBank = new Bank(100000);
		testBank.setCreditLimit(20000);

	}

	@Test
	void testPayAmount() {

		assertTrue(testBank.payAmount(20000));
		assertEquals(80000, testBank.getMoney());
		assertFalse(testBank.payAmount(80001));
	}

	@Test
	void testOrderCredit() {

		assertTrue(testBank.orderCredit(20000));
		assertFalse(testBank.orderCredit(10));
	}

	@Test
	void testPayOff() {

		assertTrue(testBank.orderCredit(20000));
		assertTrue(testBank.payOff(20000));
		assertFalse(testBank.payOff(20000));
	}

}
