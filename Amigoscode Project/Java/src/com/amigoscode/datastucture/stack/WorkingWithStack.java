package com.amigoscode.datastucture.stack;

import java.util.Stack;

public class WorkingWithStack {

    /**
     * Common Use Cases for Stacks
     * Function call management (call stack in JVM)
     *
     * Expression evaluation (infix to postfix conversion)
     *
     * Syntax parsing (matching brackets, XML/HTML tags)
     *
     * Undo/Redo operations in applications
     *
     * Back/Forward navigation in browsers
     *
     * Tree/Graph traversals (DFS algorithm)
     * @param args
     */

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek()+" Stack Peek methods ");
        System.out.println(stack.size()+" Stack Size methods ");
        System.out.println(stack.pop());
        System.out.println(stack.size()+" Stack Size methods ");
        System.out.println(stack.peek()+" Stack Peek methods ");

        System.out.println(stack.isEmpty()+" Stack Empty methods ");

    }


}
