package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    void shouldReturn100IfAmount900(){
        CashbackHackService service=new CashbackHackService();

        int actual=service.remain(900);
        int expected=100;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @Test
    void shouldReturn1000IfAmount0(){
        CashbackHackService service=new CashbackHackService();

        int actual=service.remain(0);
        int expected=1000;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @Test
    void shouldReturn0IfAmount1000(){
        CashbackHackService service=new CashbackHackService();

        int actual=service.remain(1000);
        int expected=0;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @Test
    void shouldReturn1IfAmount999(){
        CashbackHackService service=new CashbackHackService();

        int actual=service.remain(999);
        int expected=1;

        org.testng.Assert.assertEquals(actual, expected);
    }
}