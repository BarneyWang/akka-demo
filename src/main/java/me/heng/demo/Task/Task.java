package me.heng.demo.Task;

/**
 * AUTHOR: wangdi
 * DATE: 2017/5/24
 * TIME: 下午4:15
 */
public class Task {

    private final String name;

    private final Integer priority;

    public Task(String name, Integer priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public Integer getPriority() {
        return priority;
    }
}
