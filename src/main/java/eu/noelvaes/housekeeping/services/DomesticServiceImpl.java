package eu.noelvaes.housekeeping.services;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

@Component("domesticService")
public class DomesticServiceImpl implements DomesticService {
   @Autowired
   private Logger logger;
   
   @Autowired
   @Qualifier("robot")
	private CleaningService cleaningService;
	
   @Autowired
   private GardeningService gardeningService;
		
	public void runHousehold() {
	   logger.info("Running household");
		cleaningService.clean();
		gardeningService.garden();
	}
}
