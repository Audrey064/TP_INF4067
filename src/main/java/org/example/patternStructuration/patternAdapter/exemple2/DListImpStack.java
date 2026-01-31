package org.example.patternStructuration.patternAdapter.exemple2;

public class DListImpStack extends DList implements Stack {
    @Override
    public void push(Object o) {
        insertTail(o);
    }

    @Override
    public Object pop() {
        return removeTail();
    }

    @Override
    public Object top() {
        return getTail();
    }
}
