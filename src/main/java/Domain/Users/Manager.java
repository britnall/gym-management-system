package src.main.java.Domain.Users;

import src.main.java.Domain.Users.UserInfo.PersonalInformation;

/**
 * Manager of the Gym System
 *
 */
public class Manager extends Employee {

   /**
    * @param userInfo - user information for login
    * @param personalInfo - personal information
    */
   public Manager(User userInfo, PersonalInformation personalInfo) {
      super(userInfo, personalInfo, UserType.MANAGER);    
   }
}
