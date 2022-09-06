package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {


    @Test

    public void calculateCashback() {

        CashbackHackService cashback = new CashbackHackService();
        int amount = 900;

        int actual = cashback.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }
}
