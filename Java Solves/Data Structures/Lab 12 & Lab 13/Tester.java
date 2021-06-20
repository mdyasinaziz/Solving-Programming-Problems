public class Tester {
    public static void main (String [] args) {
        
        BinaryTree bt = new BinaryTree();
        
        bt.add(10);
        bt.add(4);
        bt.add(15);
        bt.add(1);
        bt.add(7);
        bt.add(13);
        bt.add(18);
        
        bt.add(-2);
        bt.add(2);
        bt.add(5);
        bt.add(9);
        bt.add(12);
        bt.add(14);
        bt.add(17);
        bt.add(20); //Clear view of the Tree at the bottom.
        
        System.out.println (bt.containsNode(17));  // Searching value is there or not (T/F)
        
        bt.traverseInOrder(bt.root); // accending order print - in order - LSR
        System.out.println ();
        
        bt.traversePreOrder(bt.root); // pre order print - SLR
        System.out.println ();  
        
        bt.traversePostOrder(bt.root); // post order print - LRS
        System.out.println ();
        
        bt.traverseDecOrder(bt.root); // decending order print - RSL
        System.out.println ();
        
        bt.traverseLevelOrder(); // bfs printing - Level Order
        
        
        System.out.println ("\n"+bt.size(bt.root)); // no of nodes (size)
        
        
        Node notun = null;
        notun = bt.copy (bt.root); // copying and making a new tree
        
        System.out.println (bt.same(bt.root, notun)); //duita tree is same or not (true/false)
        
        System.out.println (bt.maxDepth(bt.root)); //determining the height of a tree.
    }
}

/* -------------------------the tree looks like this ---------------------------
 
 *                                     10
 *                  4                                       15
 *          1              7                          13               18
 *     -2       2      5       9                 12        14      17       20

-------------------------------------- END -------------------------------------- */

