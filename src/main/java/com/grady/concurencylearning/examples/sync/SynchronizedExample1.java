package com.grady.concurencylearning.examples.sync;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @version 1.0
 * @Author HUAWEI
 * @DATE 2021/2/19 20:35
 */
@Slf4j
public class SynchronizedExample1 {

    //修饰一个代码块
    public void test1(){
        synchronized (this){
            for (int i = 0; i < 10; i++) {
                log.info("test1 {}",i);
            }
        }
    }

    public synchronized void test2(int j){
        for (int i = 0; i < 10; i++) {
            log.info("test2 {}-{}",j,i);
        }
    }

    public static void main(String[] args) {
        SynchronizedExample1 example1 = new SynchronizedExample1();
        SynchronizedExample1 example2 = new SynchronizedExample1();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(()->{
            example1.test1();
        });
        executorService.execute(()->{
            example1.test1();
        });
    }
}
