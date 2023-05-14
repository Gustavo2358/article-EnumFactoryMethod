package org.example;

public class Main {
    public static void main(String[] args) {

        //Parameter that comes from an external source;
        Parameter param = Parameter.PARAM_1;

//        Layout layout;
//
//        switch (param){
//            case PARAM_1:
//                layout = new LayoutImplementation1();
//                break;
//            case PARAM_2:
//                layout = new LayoutImplementation2();
//                break;
//            case PARAM_3:
//                layout = new LayoutImplementation3();
//                break;
//            case PARAM_4:
//                layout = new LayoutImplementation4();
//                break;
//            case PARAM_5:
//                layout = new LayoutImplementation5();
//                break;
//            default:
//                throw new IllegalArgumentException("There is no layout number " + param + ".");
//        }

        Layout layout = EnumLayoutFactory.getInstance(param);

        layout.execute();



    }
}