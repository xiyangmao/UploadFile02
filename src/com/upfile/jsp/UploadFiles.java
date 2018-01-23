package com.upfile.jsp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadFiles extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private List<String> fileName;

	private List<String> fileContentType;

	private List<File> uploadfile;

	private String result;

	@Override
	public String execute() throws Exception {

		String path = ServletActionContext.getServletContext().getRealPath("/aa");

		System.out.println(path);
		// for (int i = 0; i < fileList.size(); i++) {
		// FileInputStream fis = new FileInputStream(fileList.get(i));
		// FileOutputStream fos = new FileOutputStream(new File(path,
		// fileName.get(i)));
		//
		// byte[] buffer = new byte[1024];
		// int len = 0;
		//
		// while ((len = fis.read(buffer)) > 0) {
		// fos.write(buffer, 0, len);
		// }
		//
		// if (fos != null) {
		// fos.close();
		// }
		// if (fis != null) {
		// fis.close();
		// }
		// }

		result = "上传成功";
		return "success";
	}

	public List<String> getFileName() {
		return fileName;
	}

	public void setFileName(List<String> fileName) {
		this.fileName = fileName;
	}

	public List<String> getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(List<String> fileContentType) {
		this.fileContentType = fileContentType;
	}

	public List<File> getUploadfile() {
		return uploadfile;
	}

	public void setUploadfile(List<File> uploadfile) {
		this.uploadfile = uploadfile;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
