package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {


    @Test

    public void calculateCashbackBeforeBoundary() {

        CashbackHackService cashback = new CashbackHackService();
        int amount = 900;

        int actual = cashback.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);

    }

    @Test

    public void calculateCashbackAfterBoundary() {

        CashbackHackService cashback = new CashbackHackService();
        int amount = 1700;

        int actual = cashback.remain(amount);
        int expected = 300;

        assertEquals(expected, actual);
    }
    @Test

    public void calculateCashbackEqualsBoundary() {

        CashbackHackService cashback = new CashbackHackService();
        int amount = 1000;

        int actual = cashback.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}
