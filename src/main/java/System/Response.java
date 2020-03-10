package src.main.java.System;

/**
 * Response used to notify the user of operation
 *
 */
public class Response {
   
   public boolean successful;    // True if operation was successful
   public String info;           // Information to provide to user
   
   public Response(){
      this.successful = false;
      this.info = "";
   }

}
