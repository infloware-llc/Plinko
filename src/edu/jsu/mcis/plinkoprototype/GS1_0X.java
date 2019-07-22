package edu.jsu.mcis.plinkoprototype;

import java.util.HashMap;
import java.util.regex.Pattern;

public class GS1_0X extends GS1 {

    public GS1_0X() {
        
        super();
        
        super.matchers = new HashMap<>();
        
        super.matchers.put( "00", Pattern.compile("^00[0-9]{18}") ); // AI #00
        super.matchers.put( "01", Pattern.compile("^01[0-9]{14}") ); // AI #01
        super.matchers.put( "02", Pattern.compile("^02[0-9]{14}") ); // AI #02
        
    }
    
    public Object parse00(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        
        output.put("title", "SSCC");
        output.put("ai", element.substring(0, 2) );
        output.put("extension",( element.substring(3) ) );
        output.put("check",( element.substring(19) ) );
        output.put("datafield", ( element.substring(2 ) ) );
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse01(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        
        output.put("title", "GTIN");
        output.put("ai", element.substring(0, 2) );
        output.put("prefix", Integer.parseInt( element.substring(2, 10) ) );
        output.put("item", Integer.parseInt( element.substring(10, 15) ) );
        output.put("check", Integer.parseInt( element.substring(15) ) );
        output.put("datafield", ( element.substring(2 ) ) );
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse02(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        
        output.put("title", "CONTENT");
        output.put("ai", element.substring(0, 2) );
        output.put("prefix", Integer.parseInt( element.substring(2, 10) ) );
        output.put("item", Integer.parseInt( element.substring(10, 15) ) );
        output.put("check", Integer.parseInt( element.substring(15) ) );
        output.put("datafield", ( element.substring(2) ) );
        output.put("element", element);
        
        return output;
        
    }
    
}