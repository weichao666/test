package com.huawei.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectz0w8 {

        Projectz0w8Delegate projectz0w8Delegate = new Projectz0w8Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectz0w8Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}