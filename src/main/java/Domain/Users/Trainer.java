package src.main.java.Domain.Users;

import src.main.java.Domain.Users.UserInfo.PersonalInformation;
import src.main.java.Domain.Users.UserInfo.Schedule;

/**
 * Trainer of Gym System
 *
 */
public class Trainer extends Employee{
   private Schedule schedule;       // Schedule of trainer
   
   /**
    * @param userInfo - user information for login
    * @param personalInfo - personal information
    */   
   public Trainer(User userInfo, PersonalInformation personalInfo) {
      super(userInfo, personalInfo, UserType.TRAINER);    
   }
   
   /**
    * @param schedule - schedule of trainer
    */
   public void setSchedule(Schedule schedule)
   {
      this.schedule = schedule;
   }
   
   /**
    * @return schedule of trainer
    */
   public Schedule getSchedule()
   {
      return this.schedule;
   }
}
