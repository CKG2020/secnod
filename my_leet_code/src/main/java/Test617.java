
class TreeNode {
   int val;
   TreeNode left;
  TreeNode right;
    TreeNode(int x) { val = x; }
  }

class Solution {
    public void mergeLeftTrees(TreeNode t1, TreeNode t2) {
        if(t1==null && t2==null)
            System.out.println("已经没有子树");

        if(t1==null && t2!=null)
//            return t2.val;
            System.out.println(t2.val);
        if(t1!=null && t2==null)
//            return t1.val;
            System.out.println(t1.val);
        else {
        t1.val=t1.val+t2.val;
        System.out.println(t1.val);

        }
        if (t1!=null&t2!=null)
            mergeLeftTrees(t1.left,t2.left);

        }
//        return t1.val;


    public void mergeRightTrees(TreeNode t1, TreeNode t2) {
        if(t1==null && t2==null)
            System.out.println("已经没有子树");

        if(t1==null && t2!=null)
//            return t2.val;
            System.out.println(t2.val);
        if(t1!=null && t2==null)
//            return t1.val;
            System.out.println(t1.val);
        else {
            t1.val=t1.val+t2.val;
            System.out.println(t1.val);

        }
        if (t1!=null&t2!=null)
            mergeRightTrees(t1.right,t2.right);

    }







    }

public class Test617 {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.left=new TreeNode(3);
        treeNode1.right=new TreeNode(2);
        treeNode1.left.left=new TreeNode(5);

     TreeNode treeNode2= new TreeNode(2);
     treeNode2.left=new TreeNode(1);
     treeNode2.right=new TreeNode(3);
     treeNode2.left.right=new TreeNode(4);
     treeNode2.right.right=new TreeNode(7);

        Solution solution = new Solution();
//        System.out.println(solution.mergeTrees(treeNode1, treeNode2));
        solution.mergeLeftTrees(treeNode1,treeNode2);
        solution.mergeRightTrees(treeNode1,treeNode2);


    }
}
