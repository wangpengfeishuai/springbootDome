package cn.dream.utils;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xx
 *
 */
@Slf4j
@Component
public class ScheduledService {

//	@Scheduled(cron = "0/5 * * * * *")
	public void scheduled() {

		System.out.println("this is scheduled");
	}

//	@Scheduled(fixedRate = 5000)
	public void scheduled1() {
		System.out.println("=====>>>>>使用fixedRate{}" + System.currentTimeMillis());
	}

//	@Scheduled(fixedDelay = 5000)
	public void scheduled2() {
		System.out.println("=====>>>>>fixedDelay{}" + System.currentTimeMillis());
	}

}
