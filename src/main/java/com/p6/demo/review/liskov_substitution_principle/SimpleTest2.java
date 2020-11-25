//package com.p6.demo.review.liskov_substitution_principle;
//
///**
// * @author 扫地僧 xshlxx@126.com
// * @since 2020/11/18
// */
//public class SimpleTest2 {
//
//    public static void resize(Quadrilateral quadrilateral) {
//
//        while (quadrilateral.getWidth() >= quadrilateral.getHeight()) {
//
//            quadrilateral.setHeight(quadrilateral.getHeight() + 1);
//            System.out.println("width: " + quadrilateral.getWidth() + ",Height" + quadrilateral.getHeight());
//        }
//
//        System.out.println("resize() End, width: " + quadrilateral.getWidth() + ",Height" + quadrilateral.getHeight());
//    }
//
//    public static void main(String[] args) {
//
////        Rectangle rectangle = new Rectangle();
////
////        rectangle.setWidth(20);
////        rectangle.setHeight(10);
////
////        resize(rectangle);
//
//        Square square = new Square();
//
//        square.setLength(10);
//        resize(square);
//
//    }
//}
