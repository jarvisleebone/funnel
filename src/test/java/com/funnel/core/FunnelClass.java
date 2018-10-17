/**
 * Zentech-Inc
 * Copyright (C) 2018 All Rights Reserved.
 */
package com.funnel.core;

import com.funnel.annotation.Pellet;

/**
 * @author lixiang
 * @version $Id FunnelClass.java, v 0.1 2018-10-17 14:31 lixiang Exp $$
 */
public class FunnelClass {

    @Pellet(expression = "{1m:10}")
    public void test() {
        System.out.println("funnel method test");
    }

}