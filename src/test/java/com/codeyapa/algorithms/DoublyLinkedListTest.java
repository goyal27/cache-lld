package com.codeyapa.algorithms;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {
    @Test
    void testDllNodesAddition() {
        DoublyLinkedListNode<Integer> node1 = new DoublyLinkedListNode<>(1);
        DoublyLinkedListNode<Integer> node2 = new DoublyLinkedListNode<>(1);
        DoublyLinkedListNode<Integer> node3 = new DoublyLinkedListNode<>(1);
        DoublyLinkedListNode<Integer> node4 = new DoublyLinkedListNode<>(1);

        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();

        dll.insertNodeAtEnd(node1);
        verifyDLL(dll, ImmutableList.of(1));

        dll.insertNodeAtEnd(node2);
        verifyDLL(dll, ImmutableList.of(1, 2));

        dll.insertNodeAtEnd(node3);
        verifyDLL(dll, ImmutableList.of(1, 2, 3));

        dll.insertNodeAtEnd(node4);
        verifyDLL(dll, ImmutableList.of(1, 2, 3, 4));
    }

    void verifyDLL(DoublyLinkedList<Integer> dll, List<Integer> expectedListElements) {
        assertEquals(expectedListElements.get(expectedListElements.size() - 1), dll.getLastNode().getElement());
        assertEquals(expectedListElements.get(0), dll.getFirstNode().getElement());

        DoublyLinkedListNode<Integer> currentNode = dll.getFirstNode();
        for (Integer expectedListElement : expectedListElements) {
            assertNotNull(currentNode);
            assertEquals(expectedListElement, currentNode.getElement());
            currentNode = currentNode.getNext();
        }
        assertNull(currentNode.next);
    }
}
