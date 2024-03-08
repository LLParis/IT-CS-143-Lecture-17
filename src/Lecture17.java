class Lecture17 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 17");

        // Self-Check Problems:
        // Section 17.2: Tree Traversals

        // 9. Write a method called printMirror that could be added to the IntTree class
        // and that prints a backward inorder traversal of the tree.
        // That is, for a given node, it examines the right subtree, then the node
        // itself, then the left subtree.

        // Section 17.3: Common Tree Operations

        // 10. Why do many recursive tree methods use a public/private pair?
        // What is the difference between the header of the public method and that of
        // the private method?

        // 11. Write a method called size that could be added to the IntTree class and
        // that returns the total number of nodes in the tree.

        // 12. Write methods called min and max that could be added to the IntTree class
        // and that return the smallest and largest values in the tree, respectively.
        // For example, if a variable called tree stores the values shown in Self-Check
        // Problem 5, the call of tree.min() should return –2 and the call of tree.max()
        // should return 94. If the tree is empty, the methods should throw an
        // IllegalStateException.

        // Section 17.4: Binary Search Trees

        // 14. What is the difference between a regular binary tree and a binary search
        // tree?

        // 16.  What will be true about the results of an inorder traversal of a binary
        // search tree?

        // For each of the next four problems, draw the binary search tree that would
        // result if the given elements were added to an empty binary search tree in the
        // given order. Then write the elements of the tree in the order that they would
        // be visited by each kind of traversal (preorder, inorder, and postorder).

        // 17. Leia, Boba, Darth, R2D2, Han, Luke, Chewy, Jabba

        // 18. Meg, Stewie, Peter, Joe, Lois, Brian, Quagmire, Cleveland

        // 19. Kirk, Spock, Scotty, McCoy, Chekov, Uhuru, Sulu, Khaaaan!

        // 20. Lisa, Bart, Marge, Homer, Maggie, Flanders, Smithers, Milhouse

        // 22. What is the x = change(x) pattern, and how is it used with binary trees?

        // 23. How many nodes at most would be examined in a call to contains on a
        // perfect binary search tree of height N?

        // 24. Consider the following implementation of the contains method.

        // How does it differ from the one we showed in Section 17.4? Is it better or
        // worse, and why?

        // private boolean contains(IntTreeNode root, int value) {
        //     if (root == null) {
        //         return false;
        //     } else if (value == root.data) {
        //         return true;
        //     } else {
        //         return contains(root.left, value) || contains(root.right, value);
        //     }
        // }

        // 25. Rewrite the min and max methods from Self-Check Problem 12 so that they
        // will work on a binary search tree.
        // The methods should take advantage of the fact that the tree is sorted and
        // should not examine nodes unless necessary.

        // Exercises:

        // None
    }
}
