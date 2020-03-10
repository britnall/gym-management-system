package src.main.java.Test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import src.main.java.Domain.Users.UserInfo.Schedule;
import src.main.java.Domain.Users.UserInfo.TimeOfDay;
import src.main.java.Domain.Users.UserInfo.Weekday;
import src.main.java.Domain.Users.UserInfo.WorkTime;

class ScheduleTest {
   Schedule testSchedule;
   WorkTime worktime;
   
   @BeforeEach
   void setUp() throws Exception {
      testSchedule = new Schedule();
      worktime = new WorkTime(TimeOfDay._10AM, TimeOfDay._1PM, Weekday.MONDAY);
   }

   @AfterEach
   void tearDown() throws Exception {
      worktime = null;
   }
   
   @Test
   void testAddWorkTime() {
      testSchedule.addWorkTime(worktime);
      Assertions.assertTrue(testSchedule.getWorkTime().contains(worktime));
   }
   
   void testRemoveWorkTime() 
   {
      testSchedule.addWorkTime(worktime);
      testSchedule.removeWorkTime(worktime);
      Assertions.assertFalse(testSchedule.getWorkTime().contains(worktime));
   }

}
