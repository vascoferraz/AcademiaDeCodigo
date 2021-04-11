package org.academiadecodigo.containers;

import java.util.List;

public class TypeSafetyExample {

    public static void main(String[] args) {
        TypeSafetyExample test = new TypeSafetyExample();
    }

    public void example() {

        List<Data> dataList = new java.util.LinkedList();
        dataList.add(new Data("first element"));
        dataList.add(new Data("second element"));
        dataList.add(new Data("third element"));

        // Compiler prevents programmer from doing type unsafe operations
        //dataList.add("Ooooops...");

        dump(dataList);

    }

    public void dump(List dataList) {

        for (int i = 0; i < dataList.size(); i++) {

            // Explicit casting to Data type
            ((Data) dataList.get(i)).getMessage();

        }
    }

    private class Data {

        private String message;

        Data(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
