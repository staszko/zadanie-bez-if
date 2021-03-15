package pl.org.staszko.zadanie.bezif;

public class App {
    public static void main(String... args) {

        Node root = new MultiplyOperatorNode(
                new Leaf(2), new AddOperatorNode(
                                        new Leaf(17), new DivideOperatorNode(
                                                                new Leaf(6), new SubstractOperatorNode(
                                                                                        new Leaf(5), new Leaf(2)
                                                                                    )
                                                            )
                                    )
        );

        System.out.println(root.evaluate());
    }
}

interface Node {
    double evaluate();
}

class Leaf implements Node {
    private double value;

    public Leaf(double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }
}

abstract class OperatorNode implements Node {
    protected Node leftChild;
    protected Node rightChild;

    public OperatorNode(Node leftChild, Node rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}

class AddOperatorNode extends OperatorNode {

    public AddOperatorNode(Node leftChild, Node rightChild) {
        super(leftChild, rightChild);
    }

    @Override
    public double evaluate() {
        return leftChild.evaluate() + rightChild.evaluate();
    }
}

class SubstractOperatorNode extends OperatorNode {

    public SubstractOperatorNode(Node leftChild, Node rightChild) {
        super(leftChild, rightChild);
    }

    @Override
    public double evaluate() {
        return leftChild.evaluate() - rightChild.evaluate();
    }
}

class MultiplyOperatorNode extends OperatorNode {

    public MultiplyOperatorNode(Node leftChild, Node rightChild) {
        super(leftChild, rightChild);
    }

    @Override
    public double evaluate() {
        return leftChild.evaluate() * rightChild.evaluate();
    }
}

class DivideOperatorNode extends OperatorNode {

    public DivideOperatorNode(Node leftChild, Node rightChild) {
        super(leftChild, rightChild);
    }

    @Override
    public double evaluate() {
        return leftChild.evaluate() / rightChild.evaluate();
    }
}


