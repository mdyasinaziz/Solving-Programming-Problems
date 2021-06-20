import java.util.*;
public class BinaryTree {
 
    Node root;
    
    // ...
    
    private Node addRecursive(Node current, int value) {
    if (current == null) {
        return new Node(value);
    }
 
    if (value < current.value) {
        current.left = addRecursive(current.left, value);
    } else if (value > current.value) {
        current.right = addRecursive(current.right, value);
    } else {
        // value already exists
        return current;
    }
 
    return current;
}
    
    
    public void add(int value) {
        root = addRecursive(root, value);
    }
    
    private boolean containsNodeRecursive(Node current, int value) {
    if (current == null) {
        return false;
    } 
    if (value == current.value) {
        return true;
    } 
    if (value < current.value) { return containsNodeRecursive(current.left, value); }
    else { return containsNodeRecursive(current.right, value); }
//    return value < current.value
//      ? containsNodeRecursive(current.left, value)
//      : containsNodeRecursive(current.right, value);
}
    
    public boolean containsNode(int value) {
    return containsNodeRecursive(root, value);
}
    
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.value+ " ");
            traverseInOrder(node.right);
        }
    }
    
    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(node.value+ " ");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    
    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.value+ " ");
        }
    }
    
    public void traverseDecOrder(Node node) {
        if (node != null) {
            traverseDecOrder(node.right);
            System.out.print(node.value+ " ");
            traverseDecOrder(node.left);
            
        }
        
    }
    
    public void traverseLevelOrder() {
        if (root == null) {
            return;
        }
        Queue <Node> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            
            Node node = nodes.remove();
            
            System.out.print(node.value+ " ");
            
            if (node.left != null) {
                
                nodes.add(node.left);
            }
            
            if (node.right!= null) {
                
                nodes.add(node.right);
            }
        }
    }
    
    public int size(Node n) {
        if (n == null)
            return 0;
        else
            return 1 + size(n.left) + size(n.right);
    }
    
    public Node copy(Node n) {
        if (n == null)
            return null;
        else {
            Node copy = new Node(n.value, copy(n.left), copy(n.right));
            return copy;
        }
    }
    
    public boolean same(Node n1, Node n2) {
        if (n1 == null || n2 == null) {
            if (n1 == null && n2 == null)
                return true;
            else
                return false;
        } else {
            return (n1.value == n2.value)
                && same(n1.left, n2.left)
                && same(n1.right, n2.right);
        }
    }
    
    public int maxDepth(Node node){ 
        if (node == null){
            return 0;
        }
        else { 
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left); 
            int rDepth = maxDepth(node.right); 
   
            /* use the larger one */
            if (lDepth > rDepth){
                return (lDepth + 1);
            }
            else{
                return (rDepth + 1);
            }
        }
    }
    
}