package ru.netology;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100IfAmount900(){
        CashbackHackService service=new CashbackHackService();

        int actual=service.remain(900);
        int expected=100;

        org.junit.Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1000IfAmount0(){
        CashbackHackService service=new CashbackHackService();

        int actual=service.remain(0);
        int expected=1000;

        org.junit.Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0IfAmount1000(){
        CashbackHackService service=new CashbackHackService();

        int actual=service.remain(1000);
        int expected=0;

        org.junit.Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1IfAmount999(){
        CashbackHackService service=new CashbackHackService();

        int actual=service.remain(999);
        int expected=1;

        org.junit.Assert.assertEquals(actual, expected);
    }
}