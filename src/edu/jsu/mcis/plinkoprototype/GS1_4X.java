package edu.jsu.mcis.plinkoprototype;

import java.util.HashMap;
import java.util.regex.Pattern;

public class GS1_4X extends GS1 {
    
    public GS1_4X(){
        
        super();
        
        super.matchers = new HashMap<>();
        
        super.matchers.put( "400", Pattern.compile("^400[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,30}[%\\x1D]") );          // AI #400       
        super.matchers.put( "400eol", Pattern.compile("^400[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,30}$") );              // AI #400 (eol)       
        super.matchers.put( "401", Pattern.compile("^401[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,30}[%\\x1D]") );          // AI #401 
        super.matchers.put( "401eol", Pattern.compile("^401[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,30}$") );              // AI #401 (eol)
        super.matchers.put( "402", Pattern.compile("^402[0-9]{17}"));                   // AI #402
        super.matchers.put( "402eol", Pattern.compile("^402[0-9]{17}$") );              // AI #402 (eol)
        super.matchers.put( "403", Pattern.compile("^403[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,30}[%\\x1D]") );          // AI #403
        super.matchers.put( "403eol", Pattern.compile("^403[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,30}$") );              // AI #403 (eol)
        super.matchers.put( "410", Pattern.compile("^410[0-9]{13}") );                  // AI #410
        super.matchers.put( "411", Pattern.compile("^411[0-9]{13}") );                  // AI #411
        super.matchers.put( "412", Pattern.compile("^412[0-9]{13}") );                  // AI #412
        super.matchers.put( "413", Pattern.compile("^413[0-9]{13}") );                  // AI #413
        super.matchers.put( "414", Pattern.compile("^414[0-9]{13}") );                  // AI #414
        super.matchers.put( "415", Pattern.compile("^415[0-9]{13}") );                  // AI #415
        super.matchers.put( "416", Pattern.compile("^416[0-9]{13}") );                  // AI #416
        super.matchers.put( "420", Pattern.compile("^420[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,20}[%\\x1D]") );          // AI #420
        super.matchers.put( "420eol", Pattern.compile("^420[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,20}$") );              // AI #420 (eol)
        super.matchers.put( "421", Pattern.compile("^421[0-9]{3}[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,9}[%\\x1D]") );   // AI #421
        super.matchers.put( "421eol", Pattern.compile("^21[0-9]{3}[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,9}$") );        // AI #421 (eol)
        super.matchers.put( "422", Pattern.compile("^422[0-9]{3}") );                   // AI #422
        super.matchers.put( "422eol", Pattern.compile("^422[0-9]{3}$") );               // AI #422 (eol)
        super.matchers.put( "423", Pattern.compile("^423[0-9]{3}[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,12}[%\\x1D]") );  // AI #423
        super.matchers.put( "423eol", Pattern.compile("^423[0-9]{3}[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,12}$") );      // AI #423 (eol)
        super.matchers.put( "424", Pattern.compile("^424[0-9]{3}") );                   // AI #424
        super.matchers.put( "424eol", Pattern.compile("^424[0-9]{3}$") );               // AI #424 (eol)
        super.matchers.put( "425", Pattern.compile("^425[0-9]{3}[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,12}[%\\x1D]") );  // AI #425
        super.matchers.put( "425eol", Pattern.compile("^425[0-9]{3}[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,12}$") );      // AI #425 (eol)
        super.matchers.put( "426", Pattern.compile("^426[0-9]{3}") );                   // AI #426
        super.matchers.put( "426eol", Pattern.compile("^426[0-9]{3}$") );               // AI #426 (eol)
        super.matchers.put( "427", Pattern.compile("^427[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,3}[%\\x1D]") );           // AI #427
        super.matchers.put( "427eol", Pattern.compile("^427[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,3}$") );               // AI #427 (eol)
        
    }
   
    public Object parse400(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
    
        output.put("title", "ORDER NUMBER");
        output.put("ai", element.substring(0, 3) );
        output.put("datafield",( element.substring(3, element.length() - 1) ) );
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse400eol(String element) {
        
        return ( parse400(element));
        
    }
    
    public Object parse401(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
    
        output.put("title", "GINC");
        output.put("ai", element.substring(0, 3) );
        output.put("datafield",( element.substring(3, element.length() - 1) ) );
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse401eol(String element) {
        
        return ( parse401(element));
        
    }
    
    public Object parse402(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
    
        output.put("title", "GSIN");
        output.put("ai", element.substring(0, 3) );
        output.put("datafield",( element.substring(3, element.length() - 1) ) );
        output.put("element", element);
        
        return output;
        
    }    
    
    public Object parse402eol(String element) {
        
        return ( parse402(element));
        
    }
    
    public Object parse403(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
    
        output.put("title", "ROUTE");
        output.put("ai", element.substring(0, 3) );
        output.put("datafield",( element.substring(3, element.length() - 1) ) );
        output.put("element", element);
        
        return output;
        
    }
        
    public Object parse403eol(String element) {
        
        return ( parse403(element));
        
    }
    
    public Object parse410(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
    
        output.put("title", "SHIP TO LOC");
        output.put("ai", element.substring(0, 3) );
        output.put("datafield", ( element.substring(3) ) );
        output.put("element", element);
        
        return output;
        
    }
                 
    public Object parse411(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
    
        output.put("title", "BILL TO");
        output.put("ai", element.substring(0, 3) );
        output.put("datafield", ( element.substring(3) ) );
        output.put("element", element);
        
        return output;
        
    }
                 
    public Object parse412(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
    
        output.put("title", "PURCHASE FROM");
        output.put("ai", element.substring(0, 3) );
        output.put("datafield", ( element.substring(3) ) );
        output.put("element", element);
        
        return output;
        
    }
                     
    public Object parse413(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
    
        output.put("title", "SHIP FOR LOC");
        output.put("ai", element.substring(0, 3) );
        output.put("datafield", ( element.substring(3) ) );
        output.put("element", element);
        
        return output;
        
    }    
                     
    public Object parse414(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
    
        output.put("title", "LOC No");
        output.put("ai", element.substring(0, 3) );
        output.put("datafield", ( element.substring(3) ) );
        output.put("element", element);
        
        return output;
        
    }
                     
    public Object parse415(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
    
        output.put("title", "PAY TO");
        output.put("ai", element.substring(0, 3) );
        output.put("datafield", ( element.substring(3) ) );
        output.put("element", element);
        
        return output;
        
    }
                     
    public Object parse416(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
    
        output.put("title", "PROD/SERV LOC");
        output.put("ai", element.substring(0, 3) );
        output.put("datafield", ( element.substring(3) ) );
        output.put("element", element);
        
        return output;
        
    }
            
    public Object parse420(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
    
        output.put("title", "SHIP TO POST");
        output.put("ai", element.substring(0, 3) );
        output.put("datafield",( element.substring(3, element.length() - 1) ) );
        output.put("element", element);
        
        return output;
        
    }
        
    public Object parse420eol(String element) {
        
        return ( parse420(element));
        
    }
    
    public Object parse421(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
    
        output.put("title", "SHIP TO POST");
        //N3+N3+X..9
        output.put("ai", element.substring(0, 3) );
        output.put("datafield",( element.substring(3, element.length() - 1) ) );
        output.put("element", element);
        
        return output;
        
    }
        
    public Object parse421eol(String element) {
        
        return ( parse421(element));
        
    }
     
    public Object parse422(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
    
        output.put("title", "ORIGIN");
        output.put("ai", element.substring(0, 3) );
        output.put("datafield",( element.substring(3, element.length() - 1) ) );
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse422eol(String element) {
        
        return ( parse422(element));
        
    }
    
    public Object parse423(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
    
        output.put("title", "COUNTRY - INITIAL PROCESS");
        output.put("ai", element.substring(0, 3) );
        output.put("datafield",( element.substring(3, element.length() - 1) ) );
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse423eol(String element) {
        
        return ( parse423(element));
        
    }
    
    public Object parse424(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
    
        output.put("title", "COUNTRY - PROCESS");
        output.put("ai", element.substring(0, 3) );
        output.put("datafield",( element.substring(3, element.length() - 1) ) );
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse424eol(String element) {
        
        return ( parse424(element));
        
    }
            
    public Object parse425(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
    
        output.put("title", "COUNTRY - DISASSEMBLY");
        output.put("ai", element.substring(0, 3) );
        output.put("datafield",( element.substring(3, element.length() - 1) ) );
        output.put("element", element);
        
        return output;
        
    }
        
    public Object parse425eol(String element) {
        
        return ( parse425(element));
        
    }
                
    public Object parse426(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        
        output.put("title", "COUNTRY - FULL PROCESS");
        output.put("ai", element.substring(0, 3) );
        output.put("datafield",( element.substring(3, element.length() - 1) ) );
        output.put("element", element);
        
        return output;
    }    
    
    public Object parse426eol(String element) {
        
        return ( parse426(element));
        
    }    
    
    public Object parse427(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
    
        output.put("title", "ORIGIN SUBDIVISION");
        output.put("ai", element.substring(0, 3) );
        output.put("datafield",( element.substring(3, element.length() - 1) ) );
        output.put("element", element);
        
        return output;
        
    }
        
    public Object parse427eol(String element) {
        
        return ( parse427(element));
        
    }
    
}