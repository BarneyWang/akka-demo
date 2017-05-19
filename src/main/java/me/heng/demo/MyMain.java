package me.heng.demo;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

/**
 * AUTHOR: heyong.wd(和庸)
 * DATE: 2017/3/5
 * TIME: 下午5:09
 */
public class MyMain {


    public static void main(String[] args) {
        ActorSystem actorSystem = ActorSystem.create("mysystem");
        ActorRef myactor = actorSystem.actorOf(Props.create(MyActor.class), "myActor");
        ActorRef myactor2 = actorSystem.actorOf(Props.create(MyActor2.class), "myActor2");

        myactor.tell("hello world !",myactor);
        myactor2.tell("hello world 2 !",ActorRef.noSender());

        actorSystem.shutdown();

    }
}
