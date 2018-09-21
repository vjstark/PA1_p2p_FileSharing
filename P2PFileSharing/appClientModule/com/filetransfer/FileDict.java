package com.filetransfer;

public class FileDict {
    private String peerId;
    private String filename;
    private String portNum;
    private String directoryName;
    
	String getPeerId() {
		return peerId;
	}
	void setPeerId(String peerId) {
		this.peerId = peerId;
	}
	String getFileName() {
		return filename;
	}
	void setFileName(String fileName) {
		filename = fileName;
	}
	String getPortNum() {
		return portNum;
	}
	void setPortNum(String portNum) {
		this.portNum = portNum;
	}
	String getDirectoryName() {
		return directoryName;
	}
	void setDirectoryName(String directoryName) {
		this.directoryName = directoryName;
	}
}
