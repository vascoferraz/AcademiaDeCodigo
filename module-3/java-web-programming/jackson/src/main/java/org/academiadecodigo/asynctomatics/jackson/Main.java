package org.academiadecodigo.asynctomatics.jackson;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        MyTest myTest = new MyTest();

        //myTest.setName("Pedro");
        //myTest.setAge(23);

        mapper.writeValue(new File("result.json"), myTest);
        byte[] jsonBytes = mapper.writeValueAsBytes(myTest);
        String jsonString = mapper.writeValueAsString(myTest);

        //MyTest myTest1 = mapper.readValue(new File("data.json"), MyTest.class);
        MyTest myTest2 = mapper.readValue(new URL("http://jsonplaceholder.typicode.com/posts/1"), MyTest.class);
        //MyTest myTest3 = mapper.readValue("{\"name\":\"Pedro\", \"age\":23}", MyTest.class);
        System.out.println(myTest2);

    }

}
