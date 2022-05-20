import java.util.LinkedList;
import java.util.Queue;

public class GenTree {

    Node rootNode;

    public GenTree(Node rootNode) {
        this.rootNode = rootNode;
    }

    public void levelOrderTraveral(){
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(rootNode);

        while(!nodeQueue.isEmpty()){
            int noChildrenToTraverse = nodeQueue.size();

            while(noChildrenToTraverse>0){
                Node nextElementInQ = nodeQueue.remove();
                System.out.print(nextElementInQ.name+" ");
                nextElementInQ.children.forEach(node -> nodeQueue.add(node));
                noChildrenToTraverse--;
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        System.out.println("**********************");

        /* Let us create below tree
         *             10
         *     / / \ \
         *     2 34 56 100
         *     / \         | / | \
         *     77 88     1 7 8 9
         */
        Node root = new Node("10");
        (root.getChildren()).add(new Node("2"));
        (root.getChildren()).add(new Node("34"));
        (root.getChildren()).add(new Node("56"));
        (root.getChildren()).add(new Node("100"));
        (root.getChildren().get(0).getChildren()).add(new Node("77"));
        (root.getChildren().get(0).getChildren()).add(new Node("88"));
        (root.getChildren().get(2).getChildren()).add(new Node("1"));
        (root.getChildren().get(3).getChildren()).add(new Node("7"));
        (root.getChildren().get(3).getChildren()).add(new Node("8"));
        (root.getChildren().get(3).getChildren()).add(new Node("9"));

        System.out.println("Level order traversal " +
                "Before Mirroring ");
        GenTree genTree = new GenTree(root);
        genTree.levelOrderTraveral();
    }
}
