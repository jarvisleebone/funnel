/**
 * Zentech-Inc
 * Copyright (C) 2018 All Rights Reserved.
 */
package com.funnel.core;

import com.funnel.annotation.Pellet;
import com.funnel.util.ClassUtil;

import java.lang.reflect.Method;
import java.util.List;

public class FunnelMan {

    private String id;

    private List<FMethod> FMethods;

    public FunnelMan loadMethod(String packagePath) {
        List<Class<?>> classes = ClassUtil.getClasses(packagePath, true);

        for (Class<?> cls : classes) {
            for (Method method : cls.getMethods()) {
                Pellet p = method.getAnnotation(Pellet.class);
                if (p != null) {




                    System.out.println(method.getName());
                    System.out.println(p.expression());
                }
            }
        }

        return this;
    }

    public void start() {



    }


}