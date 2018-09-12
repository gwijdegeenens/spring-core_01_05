package eu.noelvaes.housekeeping.services;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CleaningServiceImpl implements CleaningService {
	private CleaningTool tool;
	private float rate;

	public CleaningServiceImpl() {
		System.out.println("CleaningServiceImpl: constructor");
	}

	@Autowired
	public void setCleaningTool(
	   @Qualifier("shaggy") CleaningTool tool) {
		this.tool = tool;
	}

	@Value("9")
	public void setRate(float rate) {
		this.rate = rate;
	}

	public void clean() {
		System.out.println("Cleaning the house");
		tool.doCleanJob();
	}
}
