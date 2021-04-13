package com.rodrigo;
public class App
{
    public static void main( String[] args ) throws InterruptedException {
        Timethread hilo1 = new Timethread("Uno");
        hilo1.start();

        /*
        DESCOMENTA ESTO PARA DETENER EL HILO

        TimeUnit.SECONDS.sleep(1);
        hilo1.setParameter("exit");
         */
    }
}
