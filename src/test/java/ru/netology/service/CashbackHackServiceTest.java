package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldRecommendToBuyIfAmountLessThan1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRecommendToBuyIfAmountMoreThan1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(1900);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldNotRecommendToBuyIfAmount1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(actual, expected);
    }
}
