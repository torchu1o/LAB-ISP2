package ro.ulbs.paradigme.lab2.doublechained;

import ro.ulbs.paradigme.lab2.api.MyList;
import ro.ulbs.paradigme.lab2.api.Node;

public class DoubleChainedList implements MyList {
    private DoubleChainedNode head;

    @Override
    public boolean isSorted() {
        return false;
    }

    @Override
    public void addValue(int value) {
        DoubleChainedNode newNode = new DoubleChainedNode(value);
        if (head == null) {
            head = newNode;
        } else {
            DoubleChainedNode temp = head;
            while (temp.getNextNode() != null) {
                temp = temp.getNextNode();
            }
            temp.setNextNode(newNode);
            newNode.setPrevNode(temp);
        }
    }

    @Override
    public void listNodes() {

    }

    @Override
    public Node getNodeByValue(int value) {
        return null;
    }

    @Override
    public void removeNodeByValue(int value) {

    }
}