package eu.noelvaes.housekeeping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class GardeningServiceImpl implements GardeningService{
//	@Autowired
	private GardeningTool tool;
	
   public void init() {
      System.out.println("GardeningService preparing for work.");
   }

   public void destroy() {
      System.out.println("GardeningService cleaning up.");
   }

//	@Autowired
//	public void setGardeningTool(GardeningTool tool) {
//		this.tool = tool;
//	}
  

//   @Autowired
//   public void setGardeningTool(GardeningTool tool) {
//      this.tool = tool;
//   }

//   @Autowired(required=false)
//   @Lazy
//   public void configure(GardeningTool tool) {
//      this.tool = tool;
//   }

	
	@Autowired
	public GardeningServiceImpl(GardeningTool tool) {
		this.tool = tool;
	}

	public void garden() {
   	System.out.println("Working in the garden.");
   	tool.doGardenJob();
   }
}
