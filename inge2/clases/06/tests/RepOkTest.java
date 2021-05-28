import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RepOkTest {

    private DLList createListOfSize(int size) {
        List<Node> nodes = new ArrayList<>();
        IntStream.range(0, size).forEach((i) -> {
            nodes.add(new Node());
        });
        IntStream.range(1, size).forEach((i) -> {
            nodes.get(i).previous = nodes.get(i - 1);
        });
        IntStream.range(0, size - 1).forEach((i) -> {
            nodes.get(i).next = nodes.get(i + 1);
        });
        DLList list = new DLList();
        list.first = nodes.get(0);
        list.last = nodes.get(size - 1);
        list.size = size;
        return list;
    }

    private void assertIsValid(DLList list) {
        assertTrue(new RepOk().repOk(list));
    }

    private void assertIsNotValid(DLList list) {
        assertFalse(new RepOk().repOk(list));
    }

    @Test
    public void anEmptyListIsValidTest() {
        DLList list = new DLList();
        list.first = null;
        list.last = null;
        list.size = 0;

        assertIsValid(list);
    }

    @Test
    public void aListCannnotHaveNegativeSize() {
        DLList list = new DLList();
        list.first = null;
        list.last = null;
        list.size = -1;

        assertIsNotValid(list);
    }

    @Test
    public void aListWithOneElementNeedsToHaveSizeOne() {
        assertIsValid(createListOfSize(1));
    }

    @Test
    public void aListWithSizeZeroHasToHaveFirstAsNull() {
        Node node = new Node();
        DLList list = new DLList();
        list.first = node;
        list.last = null;
        list.size = 0;

        assertIsNotValid(list);
    }

    @Test
    public void aListWithSizeZeroHasToHaveSecondAsNull() {
        Node node = new Node();
        DLList list = new DLList();
        list.first = null;
        list.last = node;
        list.size = 0;

        assertIsNotValid(list);
    }

    @Test
    public void aListWithOneElementHasToHaveTheFirstDifferentFromNull() {
        Node node = new Node();
        DLList list = new DLList();
        list.first = null;
        list.last = node;
        list.size = 1;

        assertIsNotValid(list);
    }

    @Test
    public void aListWithOneElementHasToHaveTheLastDifferentFromNull() {
        Node node = new Node();
        DLList list = new DLList();
        list.first = node;
        list.last = null;
        list.size = 1;

        assertIsNotValid(list);
    }

    @Test
    public void theFirstAndLastNodeHaveToBeTheSameInAListWithOneElement() {
        DLList list = createListOfSize(1);
        list.last = new Node();

        assertIsNotValid(list);
    }

    @Test
    public void theFirstAndLastNodeHaveToBeDifferentInAListWithMoreThanOneElement() {
        Node node = new Node();
        node.next = node;
        node.previous = node;
        DLList list = new DLList();
        list.first = node;
        list.last = node;
        list.size = 2;

        assertIsNotValid(list);
    }

    @Test
    public void theFirstNodeCannotBeNullInAListWithMoreThanOneElement() {
        DLList list = createListOfSize(2);
        list.first = null;

        assertIsNotValid(list);
    }

    @Test
    public void theLastNodeCannotBeNullInAListWithMoreThanOneElement() {
        DLList list = createListOfSize(2);
        list.last = null;

        assertIsNotValid(list);
    }

    @Test
    public void theLastNodeOfAListShouldHaveItsNextAsNull() {
        DLList list = createListOfSize(1);
        list.first.next = list.first;

        assertIsNotValid(list);
    }

    @Test
    public void theFirstNodeOfAListShouldHaveItsPreviousAsNull() {
        DLList list = createListOfSize(1);
        list.first.previous = list.first;

        assertIsNotValid(list);
    }

    @Test
    public void theFirstNodeOfATwoNodeListCannotHaveItsNextAsNull() {
        DLList list = createListOfSize(2);
        list.first.next = null;

        assertIsNotValid(list);
    }

    @Test
    public void theFirstNodeOfATwoNodeListCannotHaveItsNextAsOtherNode() {
        DLList list = createListOfSize(2);
        list.first.next = new Node();

        assertIsNotValid(list);
    }

    @Test
    public void theLastNodeOfATwoNodeListCannotHaveItsPreviousAsNull() {
        DLList list = createListOfSize(2);
        list.last.previous = null;

        assertIsNotValid(list);
    }

    @Test
    public void theLastNodeOfATwoNodeListCannotHaveItsPreviousAsOtherNode() {
        DLList list = createListOfSize(2);
        list.last.previous = new Node();

        assertIsNotValid(list);
    }

    @Test
    public void aListWithTwoElementsCanBeValid() {
        assertIsValid(createListOfSize(2));
    }

    @Test
    public void aListOfSizeGreaterThanTwoCanHaveAnIntermediateNodeBetweenTheFirstAndTheLast() {
        assertIsValid(createListOfSize(3));
    }

    @Test
    public void aListOfSizeGreaterThanTwoNeedsToReachTheLastNodeWhenFollowingTheNextNodesFromTheFirst() {
        DLList list = createListOfSize(3);
        list.first.next = new Node();

        assertIsNotValid(list);
    }

    @Test
    public void aListOfSizeGreaterThanTwoNeedsToReachTheFirstNodeWhenFollowingThePreviousNodesFromThelast() {
        DLList list = createListOfSize(3);
        list.last.previous = new Node();

        assertIsNotValid(list);
    }

    @Test
    public void aNodeInTheMiddleOfTheListMustBeTheSameWhenTransversingItForwardsOrBackwards() {
        DLList list = createListOfSize(3);
        Node node = new Node();
        node.previous = list.first;
        list.last.previous = node;

        assertIsNotValid(list);
    }

    @Test
    public void theAmountOfNodesMustCorrespondToTheSize() {
        DLList list = createListOfSize(2);
        list.size = 3;

        assertIsNotValid(list);
    }

    @Test
    public void aNodeCannotHaveItselfAsNext() {
        DLList list = createListOfSize(2);
        list.first.next = list.first;

        assertIsNotValid(list);
    }

    @Test
    public void aNodeCannotCreateACycleWithOtherNodes() {
        DLList list = createListOfSize(3);
        list.first.next.next = list.first;

        assertIsNotValid(list);
    }
}
