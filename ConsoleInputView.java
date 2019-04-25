
package edu.dmacc.codedsm.mvcfizzbuzz;


import javax.xml.transform.Result;

public class ConsoleInputView implements edu.dmacc.codedsm.mvcfizzbuzz.InputView {



    private Result result;



    public ConsoleInputView(Result result) {

        this.result = result;

    }
    public ConsoleInputView(edu.dmacc.codedsm.mvcfizzbuzz.Result result) {
    }


    public void render() {

        System.out.println("result = " + result);

    }

}