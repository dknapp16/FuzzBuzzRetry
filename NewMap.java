package edu.dmacc.codedsm.mvcfizzbuzz;

import java.io.PrintWriter;
import java.io.PrintWriter;

import java.util.HashMap;

import java.util.Map;
public class NewMap implements MapRepository {
    private Map<Integer, Result> storage = new HashMap<Integer, Result>();



    @Override

    public void save(Result result) {

        print(result);

        storage.put(1, result);

    }
    public void print(Result result) {

        PrintWriter writer = null;

        try {

            writer = new PrintWriter("fizzbuzz_result.txt");

            writer.println("Result is " + result);

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            if (writer != null) {

                writer.close();

            }

        }

    }

}



