package org.academiadecodigo.containers;

public class TypeUnsafetyExample {

    public static void main(String[] args) {

        TypeUnsafetyExample test = new TypeUnsafetyExample();
        test.example();

    }

    public void example() {

        LinkedList dataList = new LinkedList();
        dataList.add(new Data("first element"));
        dataList.add(new Data("second element"));
        dataList.add(new Data("third element"));

        dump(dataList);

        // Programmer makes a huge mistake.....
        dataList.add("Ooooops...");

        // Can you guess what will happen?
        dump(dataList);

    }

    public void dump(LinkedList dataList) {

        for (int i=0; i < dataList.size(); i++) {

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
