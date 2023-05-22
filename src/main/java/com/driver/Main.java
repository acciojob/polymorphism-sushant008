package com.driver;

public class Main {
    public static class  Product{

        public double product(double a, double b) {
            return a*b;
        }

        public int product(int x, int y, int z) {
            return x*y*z;
        }

        public int product(int x, int y) {
            return x*y;
        }

//        public Product() {
//        }
    }

    public static void main(String[] args) {

        Product p = new Product();
        System.out.println(p.product(2,5));
        System.out.println(p.product(2,5,9));
        System.out.println(p.product(2.0,5.0));
    }

}