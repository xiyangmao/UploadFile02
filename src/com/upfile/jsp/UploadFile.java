package com.upfile.jsp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.servlet.annotation.WebServlet;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadFile extends ActionSupport {
	private static final long serialVersionUID = 1L;
   
	private String result;
	private String uploadContentType;
	private String uploadFileName;
	private File upload;

	@Override
	public String execute() throws Exception {
		System.out.println(upload);

		String path = ServletActionContext.getServletContext().getRealPath("/qwe");
		System.out.println(path);

		File file = new File(path);
		FileInputStream fis = new FileInputStream(getUpload());
		FileOutputStream fos = new FileOutputStream(file);

		byte[] buffer = new byte[1024];
		int len = 0;
		while ((len = fis.read(buffer)) > 0) {
			fos.write(buffer, 0, len);
		}

		if (fos != null) {
			fos.close();
		}
		if (fis != null) {
			fis.close();
		}

		result = "上传成功";

		return "success";

	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

}
