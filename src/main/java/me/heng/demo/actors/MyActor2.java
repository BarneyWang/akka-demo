package me.heng.demo.actors;

import akka.actor.UntypedActor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * AUTHOR: heyong.wd(和庸)
 * DATE: 2017/3/7
 * TIME: 下午10:19
 */
@Component
@Scope("prototype")
public class MyActor2 extends UntypedActor {

    public void onReceive(Object message) throws Exception {
        System.out.println(message+"222222");
        throw new RuntimeException();
     }
}
