/**
 * Zentech-Inc
 * Copyright (C) 2018 All Rights Reserved.
 */
package com.funnel.core;


/**
 *
 *
 * 框架介绍
 * java流量控制工具，基于中间件实现流量整形的功能，可以通过配置文件的方式控制http url、java方法、java代码块的访问频率
 *
 *
 * 控制的内容
 * http url：
 * 通过配置文件或注解的方式
 *
 * java方法：
 * 通过注解或维护一个静态的hash表
 *
 * java代码块：
 * 使用FunnelMan类加载代码块
 *
 *
 * 阻塞 or 非阻塞
 * 默认情况下被限频的内容执行时，如果超过了限制的数量，会阻塞当前线程；
 * 用户可以通过全局配置或者api修改为非阻塞，如果为非阻塞的话，必须提供回调类
 *
 *
 *
 */
public class Funnel {
}