package com.rodrigo;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class Timethread extends Thread{

    private String parameter;

    public Timethread(String parameter) {
        this.parameter = parameter;
    }

    @Override
    public void run() {
        while (!"exit".equals(this.parameter)) {
            LocalTime currentTime = LocalTime.now();
            System.out.println(currentTime);
            pauseOneSecond();
        }
    }

    private static void pauseOneSecond() {
        try {
            TimeUnit.SECONDS.sleep(1);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }
}
