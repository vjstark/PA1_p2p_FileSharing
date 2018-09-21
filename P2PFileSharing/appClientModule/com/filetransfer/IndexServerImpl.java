package com.filetransfer;

import java.rmi.RemoteException;

import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;

import java.util.*; 

public class IndexServerImpl implements IndexServerInterface {

	// Defining a hash table for indexing the file details.
//	private ArrayList<FileDict> fileDictionary = new ArrayList<FileDict>();
	private MultivaluedMap<String, ArrayList<String>> fileDictionary = new MultivaluedHashMap<>();
	
	@Override
	public void registryFiles(String rd,String filename, String peerid, String port_num, String directory) throws RemoteException {
		// TODO Auto-generated method stub
		//Registering "new"
		if(rd.equalsIgnoreCase("new")){
			ArrayList<String> arrFileDtl = new ArrayList<String>();
			arrFileDtl.add(filename);
			arrFileDtl.add(peerid);
			arrFileDtl.add(port_num);
			arrFileDtl.add(directory);
			System.out.println(arrFileDtl);
			this.fileDictionary.add(filename, arrFileDtl);			
		}
		//deleting "del"
		else if(rd.equalsIgnoreCase("del")){
			Collection<ArrayList<String>> delArrFile = new ArrayList<ArrayList<String>>();
			if(this.fileDictionary.containsKey(filename)){
				delArrFile = this.fileDictionary.get(filename);
				for(ArrayList<String> als : delArrFile){
					if(als.get(1).equalsIgnoreCase(peerid)){
						System.out.println(filename+" -- "+als);
						System.out.println(this.fileDictionary.remove(filename, als));
						System.out.println("Index Server Updated & Specified Record Deleted");
					}
				}	
			}
			else{
				System.out.println("Delete Request: No entry detected for filename");
			}
		}
		else{
			System.out.println("Invalid Request.");
		}
		System.out.println("####################################");
		System.out.println("THE UPDATED INDEX at " + System.currentTimeMillis());
//		System.out.println(this.fileDictionary);
		System.out.println("####################################");
	}

	@Override
	public Collection<ArrayList<String>> searchFile(String filename) throws RemoteException {
		// TODO Auto-generated method stub
		Collection<ArrayList<String>> resultArrFile = new ArrayList<ArrayList<String>>();
		if(this.fileDictionary.containsKey(filename)){
			resultArrFile = this.fileDictionary.get(filename);
		}	
		return resultArrFile;
	}
}
