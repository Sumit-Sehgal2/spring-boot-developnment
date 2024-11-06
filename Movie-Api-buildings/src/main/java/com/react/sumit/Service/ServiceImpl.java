 package com.react.sumit.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
@Service

public class ServiceImpl implements FileService{

	@Override
	public String Uploadfile(String path, MultipartFile file) throws IOException {
		// get the name of the file 
		String filename=file.getOriginalFilename();
		//now we have to merge the file with their orginal path
		String filepath=path  + File.separator +filename;
		File f=new File(path);
		if(!f.exists())
		{
			f.mkdir();
			
		}
		Files.copy(file.getInputStream(),Paths.get(filepath),StandardCopyOption.REPLACE_EXISTING);
		
		return filename;
	}

	@Override
	public InputStream getresource(String Path, String Filename) throws FileNotFoundException {
		 String filepath=Path + File.separator + Filename;
		 
		
		return new FileInputStream(filepath);
	}

}
