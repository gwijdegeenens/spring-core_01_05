package eu.noelvaes.housekeeping.services;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Qualifier("robot")
public class CleaningRobot implements CleaningService {
   private List<CleaningTool> tools;

   @Autowired
   public void setCleaningTools(List<CleaningTool> tools) {
      this.tools = tools;
   }

   public void clean() {
      System.out.println("CleaningRobot cleaning the house");
       tools.forEach(CleaningTool::doCleanJob);
   }
}
