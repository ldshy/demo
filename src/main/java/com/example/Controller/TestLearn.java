package com.example.Controller;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
public class TestLearn {
    /*
    public static void  main(String arg[]){
        String path="test.txt";
        File file =new File(path);
        InputStream is = new FileInputStream(file);
        byte b[] = new byte[1024];
        int a =is.read(b);
        System.gc();
    }

    public static void main(String b[]){
        int a[]={1,4,3,2};
        int temp;String str="201710100909";
       System.out.print( str.substring(10,12));
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++ ){
                if(a[j]>a[i]){
                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
                }
            }
        }
    }*/



    public static int getMiddle(int[] numbers, int low,int high)
    {
        int temp = numbers[low]; //数组的第一个作为中轴
        while(low < high)
        {
            while(low < high && numbers[high] > temp)
            {
                high--;
            }
            numbers[low] = numbers[high];//比中轴小的记录移到低端
            while(low < high && numbers[low] < temp)
            {
                low++;
            }
            numbers[high] = numbers[low] ; //比中轴大的记录移到高端
        }
        numbers[low] = temp ; //中轴记录到尾
        return low ; // 返回中轴的位置
    }

    public static void quickSort(int[] numbers,int low,int high)
    {
        if(low < high){int middle = getMiddle(numbers,low,high); //将numbers数组进行一分为二
        quickSort(numbers,low,middle-1);   //对低字段表进行递归排序
        quickSort(numbers,middle+1,high); //对高字段表进行递归排序
        }

    }

    public static void quick(int[] numbers)
    {
        if(numbers.length > 0)   //查看数组是否为空
        {
            quickSort(numbers, 0, numbers.length-1);
        }
    }

    public static void printArr(int[] numbers)
    {
        for(int i = 0 ; i < numbers.length ; i ++ )
        {
            System.out.print(numbers[i] + ",");
        }
        System.out.println("");
    }

    public static void bubbleSort(int[] numbers)
    {
        int temp = 0;
        int size = numbers.length;
        for(int i = 0 ; i < size-1; i ++)
        {
            for(int j = 0 ;j < size-1-i ; j++)
            {
                if(numbers[j] > numbers[j+1])  //交换两数位置
                {
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[] numbers = {10,20,15,0,6,7,2,1,-5,55};
        System.out.print("排序前：");
        printArr(numbers);

        bubbleSort(numbers);
        System.out.print("冒泡排序后：");
        printArr(numbers);


        quick(numbers);
        System.out.print("快速排序后：");
        printArr(numbers);
    }
}
