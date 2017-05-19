package me.heng.demo;

import akka.actor.UntypedActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;

/**
 * AUTHOR: heyong.wd(和庸)
 * DATE: 2017/3/5
 * TIME: 下午5:05
 */
public class MyActor extends UntypedActor {

    @Override
    public void preStart() throws Exception{
        System.out.println("pre");
    }

    @Override
    public void onReceive(Object message) throws Exception {
        System.out.println(message);
    }


    @Override
    public void postStop() throws  Exception{
        System.out.println("stop");
    }
}
