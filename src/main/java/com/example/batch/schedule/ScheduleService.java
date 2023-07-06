package com.example.batch.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class ScheduleService {
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	private static final Logger log = LoggerFactory.getLogger(ScheduleService.class);
	
	@Scheduled(fixedRate = 5000)
	public void printCurrentTime() {
		log.info("The time is noe {}", dateFormat.format(new Date()));
		
	}

}
