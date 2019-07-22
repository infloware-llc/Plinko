package edu.jsu.mcis.plinkoprototype;

public class Main {
    
    public static void main(String[] args) {
        
        PlinkoMasterParser p = new PlinkoMasterParser();
        
        String s = p.parse("01095011015300031715011910AB-123");
        
        System.out.println(s);
        
    }
    
}