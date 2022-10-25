package it.radium;

import java.util.stream.IntStream;

public class LambdaExpression {


   public void lambda(){




                // Declarative way of programming in java 8
                int sum = IntStream.rangeClosed(0, 100).sum();
                System.out.println("sum:" + sum);




                // Lambda expression example ()->{};
                Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("1.Legacy way");
                    }
                };

                new Thread(runnable).start();


                //Second way
                Runnable runnable1 = () -> {
                    System.out.println("2.Runnable using lambda");
                };
                new Thread(runnable1).start();

                // 3rd way
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("3.Inside Runnable lambda variation1");
                    }
                }).start();
                new Thread(()->{
                    System.out.println("Even simpler Version of lambda");
                }).start();

            }
        }



