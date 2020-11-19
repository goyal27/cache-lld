package com.codeyapa.algorithms;

import lombok.Getter;

public class DoublyLinkedListNode<E> {
    @Getter
    E element;
    DoublyLinkedListNode<E> prev;
    DoublyLinkedListNode<E> next;

    public DoublyLinkedListNode(E element) {
        this.element = element;
        this.prev = null;
        this.next = null;
    }
}
