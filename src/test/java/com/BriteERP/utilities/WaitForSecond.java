package com.BriteERP.utilities;

public class WaitForSecond {

    public static void waitForSecond(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
