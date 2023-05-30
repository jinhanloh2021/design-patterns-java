package com.coffeepoweredcrew.bridge;

//A refined abstraction, implements FifoCollection, concrete class
public class Queue<T> implements FifoCollection<T> {
    private LinkedList<T> list; // bridges to LinkedList, which is an interface

    public Queue(LinkedList<T> list) {
        this.list = list;
    }

    @Override
    public void offer(T element) {
        list.addLast(element);
    }

    @Override
    public T poll() {
        return list.removeFirst();
    }

}
