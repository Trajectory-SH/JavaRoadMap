package mid02.collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {
    private Queue<Task> tasks = new ArrayDeque<>();
    private int remainingTaskNum;

    public void addTask(Task task) {
        tasks.offer(task);
        remainingTaskNum++;
    }

    public int getRemainingTasks() {
        return remainingTaskNum;
    }

    public void processNextTask() {
        tasks.poll().excute();
        remainingTaskNum--;
    }
}
