import java.util.HashSet;
import java.util.Set;

class RepOk {
    boolean repOk(DLList list) {
        return hasValidNodes(list) && amountOfNodesInList(list) == list.size;
    }

    private boolean hasValidNodes(DLList list) {
        return hasValidNodesOfEmptyList(list) || hasValidNodesOfNonEmptyList(list);
    }

    boolean hasValidNodesOfEmptyList(DLList list) {
        return list.first == null && list.last == null;
    }

    private boolean hasValidNodesOfNonEmptyList(DLList list) {
        return list.first != null && list.first.previous == null &&
                list.last != null && list.last.next == null &&
                reachesTheEnd(list) && allNodesAreDoublyConnected(list);
    }

    private boolean reachesTheEnd(DLList list) {
        Set<Node> visitedNodes = new HashSet<>();
        Node currentNode = list.first;
        while (currentNode != null && currentNode != list.last && !visitedNodes.contains(currentNode)) {
            visitedNodes.add(currentNode);
            currentNode = currentNode.next;
        }
        return currentNode == list.last;
    }

    private boolean allNodesAreDoublyConnected(DLList list) {
        boolean doublyConnected = true;
        Node currentNode = list.first;
        while (currentNode != list.last) {
            Node nextNode = currentNode.next;
            doublyConnected &= nextNode.previous == currentNode;
            currentNode = nextNode;
        }
        return doublyConnected;
    }

    private int amountOfNodesInList(DLList list) {
        int amount = 0;
        for (Node currentNode = list.first;
             currentNode != null;
             currentNode = currentNode.next) {
            amount++;
        }
        return amount;
    }
}


