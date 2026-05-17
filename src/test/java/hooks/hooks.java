package hooks;

import base.baseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks extends baseClass {


    @Before
    public void browserStart(){

       browsersetup();
    }
    @After
    public void browserclose(){
        quitbrowser();
    }
}
