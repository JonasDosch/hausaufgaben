package Telefonbuch;

public class DictionaryTest {
    public static void main(String[] args) {
       
    	LinearDictionary<String, String> Test = new LinearDictionary<>();
     
        Test.put("Baum", "Birke");
        Test.put("Ahornsirup", "Kanada");
        Test.put("Penis", "Vagina");
        
        System.out.println(Test.containsKey("Baum"));
        
        if(Test.containsKey("Baum")) {
        	System.out.println(Test.get("Baum"));
        }
        
        if(Test.containsKey("Ahornsirup")) {
        	System.out.println(Test.get("Ahornsirup"));
        }
        
        if(Test.containsKey("Penis")) {
        	System.out.println(Test.get("Penis"));
        }
        
        for(String key : Test) {
        	System.out.println(Test.get(key));
        	
        }
        
    }
}

