package com.grady.concurencylearning.examples.atomic;

import com.grady.concurencylearning.annotations.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @version 1.0
 * @Author HUAWEI
 * @DATE 2021/2/19 20:16
 */

@Slf4j
@ThreadSafe
public class AtomicExample4 {
    private static AtomicReference<Integer> count = new AtomicReference<>(0);

    public static void main(String[] args) {
        count.compareAndSet(0, 2); // 2
        count.compareAndSet(0, 1); // no
        count.compareAndSet(1, 3); // no
        count.compareAndSet(2, 4); // 4
        count.compareAndSet(3, 5); // no
        log.info("count:{}", count.get());
    }
}
