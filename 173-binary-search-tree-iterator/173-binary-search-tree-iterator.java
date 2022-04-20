/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    // TreeNode root;
    Stack<TreeNode> st=new Stack<>();
    public BSTIterator(TreeNode root) {
        // this.root=root;
        fill_left(root);
    }
    
    public void fill_left(TreeNode left){
        while(left!=null){
            st.push(left);
            left=left.left;
        }
    }
    public int next() {
        TreeNode temp=st.pop();
        fill_left(temp.right);
        return temp.val;
    }
    
    public boolean hasNext() {
        if(st.isEmpty()) return false;
        return true;
        
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */