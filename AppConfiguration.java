
import java.util.*;  

public class AppConfiguration {

    public static AppConfiguration INSTANCE = new AppConfiguration(); 
    private Map<String, String> config = new HashMap<String, String> (); 

    private AppConfiguration(){

    }

    public static AppConfiguration getInstance(){
        /***
         * this is more common when doing Lazy Initialization where INSNTANCE IS NULL
         */
        if(INSTANCE == null){
            
            INSTANCE = new AppConfiguration(); 
        }

        return INSTANCE; 
    }

    private void initConfig(){
        Double id = Math.random(); 
        config.put( "AppId" , id.toString());
    
    }

    public String getConfigurationItem(String key){
        
        if(config == null || config.isEmpty() ) return ""; 

        return config.get(key); 
    }

    public Map addConfigurationItem(String key, String value){
        
        if(config == null) return null; 

        config.put(key, value); 

        return config;
    }

    public Map removeConfigurationItem(String key){
        
        if(config == null) return null; 

        config.remove(key); 

        return config; 
    }

    public void showAllConfiguration(){
        
        System.out.println ("======== CONFIGURATION ===== \n");
        
        for(Map.Entry m:config.entrySet()){  
            System.out.println(m.getKey() + ": " + m.getValue() + " \n");  
        }  
        
        System.out.println ("======== ============= =====");
    }

    public String getClassName(){
        return "Class Name :: " + this.getClass().getSimpleName() + " \n";
    }
}