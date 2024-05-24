package com.example.spring_cloud_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerApplication.class, args);
	}

	static String checkNumber(String number){
		StringBuilder sb = new StringBuilder(number);
		sb.reverse();
		String numbReverse = sb.toString();

		//bo 2 so lap
		int lengthLoop = 2;
		for(int i= 1; i < 8; i++){
			if(numbReverse.substring(0,2).equals(numbReverse.substring(i*2, i*2 +2))){
				lengthLoop += 2;
			}
			else if(lengthLoop >2){
				return lengthLoop + ", " + number.substring(number.length()-2, number.length());
			}else{
				break;
			}
		}

		//bo 3 so lap
		lengthLoop = 3;
		for(int i= 1; i < 6; i++){
			if(numbReverse.substring(0,3).equals(numbReverse.substring(i*3, i*3 +3))){
				lengthLoop += 3;
			}
			else if(lengthLoop >3){
				return lengthLoop + ", " + number.substring(number.length()-3, number.length());
			}else{
				break;
			}
		}

		lengthLoop = 4;
		for(int i= 1; i < 5; i++){
			if(numbReverse.substring(0,2).equals(numbReverse.substring(i*4, i*4 +4))){
				lengthLoop += 4;
			}
			else if(lengthLoop >4){
				return lengthLoop + ", " + number.substring(number.length()-4, number.length());
			}else{
				break;
			}
		}

		return "deo lap cai gi het ok chua?";
	}

}
