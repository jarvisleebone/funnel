/**
 * Zentech-Inc
 * Copyright (C) 2018 All Rights Reserved.
 */
package com.funnel.util;

import java.util.List;

/**
 * @author lixiang
 * @version $Id ClassUtilTest.java, v 0.1 2018-10-17 14:16 lixiang Exp $$
 */
public class ClassUtilTest {

    public static void main(String[] args) throws Exception {
        List<Class<?>> classes = ClassUtil.getClasses("com.funnel.core", true);
        for (Class cls : classes) {
            System.out.println(cls.getName());
        }
    }

}