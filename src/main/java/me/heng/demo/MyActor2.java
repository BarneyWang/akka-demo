package me.heng.demo;

import akka.actor.UntypedActor;

/**
 * AUTHOR: heyong.wd(和庸)
 * DATE: 2017/3/7
 * TIME: 下午10:19
 */
public class MyActor2  extends UntypedActor {
    public void onReceive(Object message) throws Exception {
        System.out.println(message);
    }
}
