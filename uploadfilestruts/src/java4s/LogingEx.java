package java4s;
import java.io.File;
 
import org.apache.commons.io.FileUtils;
 
import com.opensymphony.xwork2.ActionSupport;
 
public class LogingEx extends ActionSupport{
	private static final long serialVersionUID = 1L;
 
	private File uploadFile;
	private String uploadFileContentType;
	private String uploadFileFileName;	
 
	public File getUploadFile() {
		return uploadFile;
	}
	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}
 
	public String getUploadFileContentType() {
		return uploadFileContentType;
	}
	public void setUploadFileContentType(String uploadFileContentType) {
		this.uploadFileContentType = uploadFileContentType;
	}
 
	public String getUploadFileFileName() {
		return uploadFileFileName;
	}
	public void setUploadFileFileName(String uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}
 
	public String execute()
	{
		try{
		String filePath = "c:/Myuploads";  // Path where uploaded file will be stored
        System.out.println("Server path:" + filePath); // check your path in console
        File fileToCreate = new File(filePath, uploadFileFileName);// Create file name  same as original
        FileUtils.copyFile(uploadFile, fileToCreate); // Just copy temp file content tos this file		
 
		}catch(Exception e)
		{
			e.printStackTrace();
            addActionError(e.getMessage());
            return INPUT;
 
		}
		return SUCCESS;
	}
 
}
// Context pirnt.....