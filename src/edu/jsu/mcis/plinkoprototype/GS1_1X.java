package edu.jsu.mcis.plinkoprototype;

import java.util.HashMap;
import java.util.regex.Pattern;

public class GS1_1X extends GS1 {

    public GS1_1X() {
        
        super();
        
        super.matchers = new HashMap<>();
		 
        super.matchers.put( "10", Pattern.compile("^10[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,20}[%\\x1D]") ); // AI #10
        super.matchers.put( "10eol", Pattern.compile("^10[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,20}$") );     // AI #10 (eol)
        super.matchers.put( "11", Pattern.compile("^11[0-9]{6}") );          // AI #11 
        super.matchers.put( "12", Pattern.compile("^12[0-9]{6}") );          // AI #12
        super.matchers.put( "13", Pattern.compile("^13[0-9]{6}") );          // AI #13 
        super.matchers.put( "15", Pattern.compile("^15[0-9]{6}") );          // AI #15 
        super.matchers.put( "16", Pattern.compile("^16[0-9]{6}") );          // AI #16 
        super.matchers.put( "17", Pattern.compile("^17[0-9]{6}") );          // AI #17 

    }
	
    public Object parse10(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        
        output.put("title", "BATCH/LOT");
        output.put("ai", element.substring(0, 2) );
        output.put("datafield", element.substring(2, element.length() - 1) );
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse10eol(String element) {
        
        return ( parse10(element) );
		
    }
	
    public Object parse11(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        
        output.put("title", "PROD DATE");
        output.put("ai", element.substring(0, 2) );
        output.put("year", Integer.parseInt( element.substring(2, 4) ));
        output.put("month", Integer.parseInt( element.substring(4, 6) ));
        output.put("day", Integer.parseInt( element.substring(6, 8) ));
        output.put("element", element);
        output.put("datafield", ( element.substring(2 ) ) );
        
        return output;
        
    }
	
    public Object parse12(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        
        output.put("title", "DUE DATE");
        output.put("ai", element.substring(0, 2) );
        output.put("year", Integer.parseInt( element.substring(2, 4) ));
        output.put("month", Integer.parseInt( element.substring(4, 6) ));
        output.put("day", Integer.parseInt( element.substring(6, 8) ));
        output.put("element", element);
        output.put("datafield", ( element.substring(2 ) ) );
        
        return output;
        
    }
	
    public Object parse13(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        
        output.put("title", "PACK DATE");
        output.put("ai", element.substring(0, 2) );
        output.put("year", Integer.parseInt( element.substring(2, 4) ));
        output.put("month", Integer.parseInt( element.substring(4, 6) ));
        output.put("day", Integer.parseInt( element.substring(6, 8) ));
        output.put("element", element);
        output.put("datafield", ( element.substring(2 ) ) );
        
        return output;
        
    }
	
    public Object parse15(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        
        output.put("title", "BEST BEFORE or BEST BUY");
        output.put("ai", element.substring(0, 2) );
        output.put("year", Integer.parseInt( element.substring(2, 4) ));
        output.put("month", Integer.parseInt( element.substring(4, 6) ));
        output.put("day", Integer.parseInt( element.substring(6, 8) ));
        output.put("element", element);
        output.put("datafield", ( element.substring(2 ) ) );
        
        return output;
        
    }
	
    public Object parse16(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        
        output.put("title", "SELL BY");
        output.put("ai", element.substring(0, 2) );
        output.put("year", Integer.parseInt( element.substring(2, 4) ));
        output.put("month", Integer.parseInt( element.substring(4, 6) ));
        output.put("day", Integer.parseInt( element.substring(6, 8) ));
        output.put("element", element);
        output.put("datafield", ( element.substring(2 ) ) );
        
        return output;
        
    }
    
    public Object parse17(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        
        output.put("title", "USE BY OR EXPIRY");
        output.put("ai", element.substring(0, 2) );
        output.put("year", Integer.parseInt( element.substring(2, 4) ));
        output.put("month", Integer.parseInt( element.substring(4, 6) ));
        output.put("day", Integer.parseInt( element.substring(6, 8) ));
        output.put("element", element);
        output.put("datafield", ( element.substring(2 ) ) );
        
        return output;
        
    }
        
}