package com.example.talen.sportif;

import javax.annotation.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.talen.sportif.services.FilesStorageService;

@SpringBootApplication
public class SportifApplication {

	@Resource
	FilesStorageService storageService;

	public static void main(String[] args) {
		SpringApplication.run(SportifApplication.class, args);
	}

	public void run(String... arg) throws Exception {
		storageService.deleteAll();
		storageService.init();
	}

}
