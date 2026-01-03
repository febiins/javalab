


class PriorityThread extends Thread {

    public PriorityThread(String name, int priority) {
        setName(name);
        setPriority(priority);
    }

    public void run() {
        System.out.println("Thread Name: " + getName() +
                           " | Priority: " + getPriority());
    }
}

public class P34 {
    public static void main(String[] args) {

        PriorityThread t1 =
            new PriorityThread("Low Priority Thread", Thread.MIN_PRIORITY);

        PriorityThread t2 =
            new PriorityThread("Normal Priority Thread", Thread.NORM_PRIORITY);

        PriorityThread t3 =
            new PriorityThread("High Priority Thread", Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}

