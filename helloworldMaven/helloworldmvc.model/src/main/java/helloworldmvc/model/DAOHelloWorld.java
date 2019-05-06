package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DAOHelloWorld {
private String FileName = "TXT";
private DAOHelloWorld instance = null;
private String helloWorldMessage = null;

public DAOHelloWorld() {
    
}

public void readFile() {
    try {
        final BufferedReader buffer = new BufferedReader(new FileReader(FileName));
        helloWorldMessage = buffer.readLine();
        buffer.close();
    }
    catch (Exception e) {
        System.out.println("t'es un peu trop nul pour nous" +e.getMessage());
    }
    
}
public DAOHelloWorld getInstance() {
    return instance;
}

public void setInstance(DAOHelloWorld instance) {
    this.instance = instance;
}

public String getHelloWorldMessage() {
    return helloWorldMessage;
}

public void setHelloWorldMessage(String helloWorldMessage) {
    this.helloWorldMessage = helloWorldMessage;
}

}