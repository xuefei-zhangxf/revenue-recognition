package com.sunlands.trade.revenuerecognition.process;

import com.sunlands.trade.revenuerecognition.process.mapper.PromiseMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RevenueRecognitionProcessApplication implements CommandLineRunner{

	private final PromiseMapper promiseMapper;

	public RevenueRecognitionProcessApplication(@SuppressWarnings("SpringJavaAutowiringInspection") PromiseMapper promiseMapper) {
		this.promiseMapper = promiseMapper;
	}

	public static void main(String[] args) {
		SpringApplication.run(RevenueRecognitionProcessApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		System.out.println(this.promiseMapper.findByStatus("init"));
		System.out.println(this.promiseMapper.count());
	}
}
