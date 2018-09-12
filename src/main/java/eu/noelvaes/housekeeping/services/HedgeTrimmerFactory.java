package eu.noelvaes.housekeeping.services;
import java.time.LocalTime;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Component
public class HedgeTrimmerFactory {
	@Bean
	@Primary
	public GardeningTool hedgeTrimmer() {
		int hour = LocalTime.now().getHour();
		if (hour > 8 || hour < 18) {
			return () -> System.out.println("Trimming electric (noisily)");
		} else {
			return () -> System.out.println("Trimming manual (silently)");
		}
	}
}
