package futurerouter;



public class Router {
    
    RouterConfigMode mode;
    
    String ip;
    
    String mac;
    
    public void setMode(RouterConfigMode changed){
        mode = changed;
        
    }
    
    public void changeIp( int ip ){
 
        
    }
    
    public void changeMac(int newmac){
    

        
    }
    
    public void changePassword(){
        
        
    }
    
      public void addDevice(){
        
           
    }
      
      
      public void removeDevice(){
        
        
          
    }
      
    
      public void addGuest(){
        
       
    }
      
    
      public void modemDeteced(){
     
          
    }
    
     public void troubleshoot (){
            
         
    }
     
     public void restartRouter (){
            
         
    }
       public void resetModem (){
            
         
    }
          public boolean powerOnRouter(){
        switch(mode){
            case Change:
            System.out.println("Change Settings");    
                return true;
            case Inputs:
            System.out.println("Inputs Detected");    
                return true;
            case Connection:
            System.out.println("Connection Changed");    
                return false;
            case ConnectionDropped:
            System.out.println("Connection Dropped");    
                return false;
            default:
                return true;
            }
          }
      
    public void printStatus(){
    
        System.out.println("router status:");
        System.out.println("mode:"+ mode);
        System.out.println("Current Ip: 169845:");
        System.out.println("Current Mac: 178623");
        
}
    
}

