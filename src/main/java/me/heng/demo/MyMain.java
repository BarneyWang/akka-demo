package me.heng.demo;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import me.heng.demo.exetension.SpringExtension;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * AUTHOR: heyong.wd(和庸)
 * DATE: 2017/3/5
 * TIME: 下午5:09
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan("me.heng.demo.config")
public class MyMain {


    public static void main(String[] args) {
        ApplicationContext context =
                SpringApplication.run(MyMain.class, args);
        ActorSystem system = context.getBean(ActorSystem.class);
        final LoggingAdapter log = Logging.getLogger(system, "Application");
        log.info("Starting up");

        SpringExtension ext = context.getBean(SpringExtension.class);
        ActorRef taskActor = system.actorOf(
                ext.props("myActor"));
        ActorRef myActor2 = system.actorOf(
                ext.props("myActor2"));
        taskActor.tell("hello world !",myActor2);
        myActor2.tell("hello world 2 !",ActorRef.noSender());
        system.shutdown();

//        ActorSystem actorSystem = ActorSystem.create("mysystem");
//        ActorRef myactor = actorSystem.actorOf(Props.create(MyActor.class), "myActor");
//        ActorRef myactor2 = actorSystem.actorOf(Props.create(MyActor2.class), "myActor2");
//
//        myactor.tell("hello world !",myactor);
//        myactor2.tell("hello world 2 !",ActorRef.noSender());
//
//        actorSystem.shutdown();

    }
}
