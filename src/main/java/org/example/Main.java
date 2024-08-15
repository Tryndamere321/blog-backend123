package org.example;

public class Main {
    public static void main(String[] args) {

//        int qiymet=51;
//        if (qiymet>=51 && qiymet<61) {
//            System.out.println("sizin qiymetini E");
//        }
//        int a=5;
//        int b=7;
//
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println(a);
//        System.out.println(b);

//        int a=5;
//        System.out.println(a);
//        int[] b={2,4,6};
//        System.out.println(b);

//        int[] a={1,2,3,4,5};
//        for(int i=0;i<a.length;i++){
//            if(a[i]%2==0){
//                System.out.println(a[i]);
//            }
//        }
//        String text="SALAM";//salam
//        text=text.toLowerCase();
//        System.out.println(text);
  int[]a={1,3,5,6,7,4,90};
  int min=a[0];
  int max=a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

      int e = 8;
      int f=72;
      e=f;

    }
}