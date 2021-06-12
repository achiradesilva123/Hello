import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import javax.swing.*;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        update("small");
    }

    public static void update(String s){
        if(s.equalsIgnoreCase("small") || s.equalsIgnoreCase("true")){
            System.out.println("Ok");
        }else{
            System.out.println("no");
        }
    }
}
