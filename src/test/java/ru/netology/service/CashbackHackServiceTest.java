package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    @Test
    public void shouldRecommendToBuyIfAmountLessThan1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldRecommendToBuyIfAmountMoreThan1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(1900);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotRecommendToBuyIfAmount1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(expected, actual);
    }
}
