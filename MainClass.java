
public class MainClass{

    public static void main(String[] args){
       
        System.out.println("App is running \n"); 

        AppConfiguration config = AppConfiguration.getInstance(); 

        System.out.println(config.getClassName());

        // Adding configuration 

        config.addConfigurationItem("AppName", "Singleton Example"); 
        config.addConfigurationItem("AppKey", "MyVerySecureKey123"); 

        // removing configuration 

        config.removeConfigurationItem("AppId"); 

        // showing all configuration

        config.showAllConfiguration(); 
    }
}