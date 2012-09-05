package com.skcc.tutorial.integration;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.FileCopyUtils;

public class FileToStringConverter implements Converter<File, String>{
	private volatile Charset charset = Charset.defaultCharset();
	
	public String convert(File file) {
		InputStreamReader reader;
		try {
			reader = new InputStreamReader(new FileInputStream(file), this.charset);
			return FileCopyUtils.copyToString(reader);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

}
