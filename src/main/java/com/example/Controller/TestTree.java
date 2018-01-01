package com.example.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    public static void main(String[] arg) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");

        do{
            System.out.println(br.readLine());
        }while(br.readLine().equals("qq"));
    }
}
