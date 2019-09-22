package ca.quickheaven.ocjp.practice.test.one;

import java.util.Arrays;
import java.util.concurrent.RecursiveTask;

public class Question1 {

    // Which of the following statements is correct about the class above?
    class MyTask extends RecursiveTask<Integer> {

        private int[] intArray;
        private final int THRESHOLD = 4;

        public MyTask(int[] intArray) {
            this.intArray = intArray;
        }

        public int calculate(int number) {
            // do something
            return 2 * number;
        }

        @Override
        protected Integer compute() {
            if (intArray.length <= THRESHOLD) {
                int summary = 0;
                for (int i = 0; i < intArray.length; i++) {
                    summary = summary + calculate(intArray[i]);
                }
                return summary;
            } else {
                int middle = intArray.length / 2; // 1
                MyTask newTask1 = new MyTask(Arrays.copyOfRange(intArray, 0, middle));
                MyTask newTask2 = new MyTask(Arrays.copyOfRange(intArray, middle, intArray.length));
                newTask2.fork();

                int firstResult = newTask1.compute();
                int secondResult = newTask2.join();
                return firstResult + secondResult;
            }
        }
    }

}

