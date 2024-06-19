package org.example.java8;

public class LamdaExpressionDemo {






    public static void main(String[] args) {

        IShape rc = (x, y) -> System.out.println(x*y);
        rc.draw(4,5);

      IFoo foo = ()-> "need hello world return";
       System.out.println(foo.bar());

    }


    interface IShape {

        void draw(int x, int y);
    }

   interface IFoo {
        String bar();
   }


}
