package adda.fullstack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import adda.fullstack.dto.UserInfoDTO;
import adda.fullstack.exception.AddaException;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;


@SpringBootApplication
public class AddaDemoApplication implements CommandLineRunner{

	public static final Log LOGGER = LogFactory.getLog(AddaDemoApplication.class);
	
	@Autowired
	Environment environment;
	
	public static void main(String[] args) {
		
		SpringApplication.run(AddaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		UserInfoDTO userInfoDTO = new UserInfoDTO();
		LOGGER.info(environment.getProperty("Service.WRONG_CREDENTIAL"));
	}

}
