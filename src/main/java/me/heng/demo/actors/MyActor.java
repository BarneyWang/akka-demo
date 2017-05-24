package me.heng.demo.actors;

import akka.actor.UntypedActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * AUTHOR: heyong.wd(和庸)
 * DATE: 2017/3/5
 * TIME: 下午5:05
 */
@Component
@Scope("prototype")
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
