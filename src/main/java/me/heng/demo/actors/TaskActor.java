package me.heng.demo.actors;

import akka.actor.UntypedActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TaskActor extends UntypedActor {

    private final LoggingAdapter log = Logging
        .getLogger(getContext().system(), "TaskProcessor");

//    @Autowired
//    private TaskDAO taskDAO;

    @Override
    public void onReceive(Object message) throws Exception {

        Long result = System.currentTimeMillis();
        log.debug("Created task {}", result);
    }
}
