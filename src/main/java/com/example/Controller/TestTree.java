package com.example.Controller;

public class TestTree {
    class TreeNode{
        int val;
        //左孩子
        TreeNode left;
        //右孩子
        TreeNode right;
    }

    int maxDeath(TreeNode node){
        if(node==null){
            return 0;
        }
        int left = maxDeath(node.left);
        int right = maxDeath(node.right);
        return Math.max(left,right) + 1;
    }

}
