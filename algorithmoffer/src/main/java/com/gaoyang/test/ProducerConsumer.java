package com.gaoyang.test;

import com.gaoyang.Utils;

public class ProducerConsumer {

    static class Producer implements Runnable {

        private Person person;
        private String producerName;

        public Producer(Person person, String producerName) {
            this.person = person;
            this.producerName = producerName;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    person.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Consumer implements Runnable {

        private Person person;
        private String consumerName;

        public Consumer(String consumerName, Person person) {
            this.consumerName = consumerName;
            this.person = person;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    person.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Person {
        private int foodNum = 0;
        private Object synObj = new Object();

        public void produce() throws InterruptedException {
            synchronized (synObj) {
                while (foodNum == 5) {
                    System.out.println("box is full, size = " + foodNum);
                    synObj.wait();
                }

                foodNum++;
                System.out.println("produce success foodNum = " + foodNum);
                synObj.notifyAll();
            }
        }

        public void consume() throws InterruptedException {
            synchronized (synObj) {
                while (foodNum == 0) {
                    System.out.println("box is empty, size = " + foodNum);
                    synObj.wait();
                }

                foodNum--;
                System.out.println("consume success foodNum = " + foodNum);
                synObj.notifyAll();
            }
        }
    }

    //    public static void main(String[] args) {
//        Person person = new Person();
//        new Thread(new Producer(person, "生产者"));
//        new Thread(new Consumer("消费者" , person));
//    }
    public static void main(String[] args) {
        int arrList[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int arrList1[] = {4, 6, 2, 1, 654, 43, 76, 90, 0, 21};
        int arrList2[] = {1, 0, 3, 4, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1};

        int[] arr = arrList;

        sortone(arr);

        Utils.printArr(arr);
    }

    private static void sortone(int[] arrs) {
        if (arrs == null || arrs.length == 0) {
            return;
        }

        sort(arrs, 0, arrs.length-1, arrs[0]);
    }

    private static void sort(int[] arrs, int left, int right, int key) {
        if (arrs == null || arrs.length == 0) {
            return;
        }

        int partition = quicksort(arrs, left, right, key);
        sort(arrs, left, partition - 1, partition);
        sort(arrs, partition + 1, right, partition);
    }

    private static int quicksort(int[] arrs, int left, int right, int key) {
        if (arrs == null || arrs.length == 0) {
            return -1;
        }

        while (left < right) {

            if (left < right && arrs[left] < key) {
                left++;
            }
            if (left < right && arrs[right] > key) {
                right--;
            }

            swap(arrs, left, right);
        }

        return arrs[left];
    }

    private static void swap(int[] arrs, int left, int right) {
        int tmp = arrs[left];
        arrs[left] = arrs[right];
        arrs[right] = tmp;
    }

}
