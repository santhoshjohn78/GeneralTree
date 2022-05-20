import java.util.Vector;

public class Node {
    String name;
    Vector<Node> children;

    public Node(String name) {
        this.name = name;
        this.children = new Vector<>();
    }

    public Node(String name, Vector<Node> children) {
        this.name = name;
        this.children = children;
    }

    public void addChildren(Node node){
        this.children.add(node);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector<Node> getChildren() {
        return children;
    }

    public void setChildren(Vector<Node> children) {
        this.children = children;
    }
}
