package org.example.exception;

import java.io.IOException;

public class TestException {
    public static void main(String[] args) {

        try {

            foo();
        }catch (IOException e){
            e.printStackTrace();
        }
        catch (RuntimeException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }

    }

private static void foo() throws IOException{
  System.out.println("Called");
}

}
