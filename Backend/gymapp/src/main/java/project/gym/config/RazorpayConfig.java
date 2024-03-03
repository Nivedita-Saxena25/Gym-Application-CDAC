package project.gym.config;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

	@Configuration
	public class RazorpayConfig {

	    @Value("${razorpay.api.key.id}")
	    private String apiKeyId;

	    @Value("${razorpay.api.key.secret}")
	    private String apiKeySecret;

	    @Bean
	    public RazorpayClient razorpayClient() throws RazorpayException {
	        return new RazorpayClient(apiKeyId, apiKeySecret);
	    }
	}



