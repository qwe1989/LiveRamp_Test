package com.ruizhi.concurrenttool.common;

import com.ruizhi.concurrenttool.task.TaskWrapper;

import java.util.Map;


/**
 * every task should implements this interface
 */
public interface ITask<IN, OUT> {


    /**
     * the task business logic
     *
     * @param param:        task input param
     * @param taskWrappers: taskWrapper id -> taskWrapper
     * @return task result
     */
    OUT doTask(IN param, Map<String, TaskWrapper> taskWrappers);


    /**
     * default result for exception scene
     *
     * @return default result
     */
    default OUT defaultReturn() {
        return null;
    }
}
