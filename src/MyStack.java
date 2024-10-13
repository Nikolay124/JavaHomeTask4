import java.util.LinkedList;
public class MyStack {
    private LinkedList<String> stack = new LinkedList<>();

    /**
     * Добавляет элемент на вершину стека.
     */
    public void push(String element) {
        stack.addFirst(element);
    }

    /**
     * Возвращает элемент с вершины стека и удаляет его.
     */
    public String pop() {
        return stack.removeFirst();
    }

    /**
     * Возвращает элемент с вершины стека без его удаления.
     */
    public String peek() {
        return stack.peekFirst();
    }

    /**
     * Возвращает все элементы стека.
     */
    public Iterable<String> getElements() {
        return stack;
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        myStack.push("Element 1");
        myStack.push("Element 2");
        myStack.push("Element 3");

        System.out.println("Pop: " + myStack.pop());
        System.out.println("Peek: " + myStack.peek());
        System.out.println("Elements: " + myStack.getElements());
    }
}
