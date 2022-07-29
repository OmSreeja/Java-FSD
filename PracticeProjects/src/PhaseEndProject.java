import java.io.File;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;
public class PhaseEndProject
{
	public static void main(String[] args) 
	{
        		 Scanner scan=new Scanner(System.in);
		System.out.println("**************************************\n");
        		System.out.println("\nWelcome to TheDesk \n");
        		System.out.println("**************************************");
        		while(true)
		{
			System.out.println("1.Want to sort the files in ascending order\n");
            			System.out.println("2. Want to perform business operations on file \n");
            			System.out.println("3. Close the Application");
            			System.out.println("*****Enter the option you want to do*****  \n");
			int option = scan.nextInt();
            			switch(option)
            			{
                				case 1:sortFiles();
					break;
				case 2:
                    					Boolean temp = true;
                    					while(temp) 
						{
                        						System.out.println("Option 1 :- To Add a file ");
                        						System.out.println("Option 2 :- To Delete a file from the existing files ");
                        						System.out.println("Option 3 :- To Search a user specified file from ");
                        						System.out.println("Option 4 :- Navigate to main menu");
                        						System.out.println("Option 5 :- Close the Application");
							int option2 = scan.nextInt();
							switch (option2) 
							{
                            							case 1:
									newFile();
                                								break;
								case 2:
									deleteFile();
									break;
								case 3:
									searchFile();
									break;
								case 4:
									temp = false;
                                								break;

                            							case 5:
									System.out.println("*********Application Closed Successfully***********");
                                								System.exit(0);
                           							default:
                                								System.out.println("please choose correct option");
							}
						}
                    					break;
				case 3:
                    				System.out.println("*********Application Closed Successfully***********");
                    				System.exit(0);
				default:
                    				System.out.println("please choose correct option ");
                    				break;
			}
		}
	}
	public static void newFile()
    	{
        		String strPath = "", strName = "";
		try 
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            			System.out.println("Enter the file name:");
            			strName = br.readLine();
            			System.out.println("Enter the file path:");
            			strPath = br.readLine();
  			File file1= new File(strPath + "" + strName + ".txt");
			if(file1.createNewFile())
			{
				System.out.println("File Created\n"+file1.getName());
			}
			else
			{
				System.out.println("File Already Exists..");
			} 
        		}
 		catch (Exception ex1) 
		{
			System.out.println("Error Occured");
        		}
	}
	public static void searchFile()
	{
		String strName = "";
		try
		{
			File directory = new File("C:\\javafsd\\javademos\\PracticeProjects\\Files");
 			String[] flist = directory.list()	;
			int flag = 0;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            			System.out.println("Enter the file name:");
            			strName = br.readLine();
        			if (flist == null) 
			{
            				System.out.println("Empty directory.");
        			}
        			else 
			{
  				for (int i = 0; i < flist.length; i++) 
				{
                					String filename = flist[i];
                					if (filename.equalsIgnoreCase(strName)) 
					{
                    					System.out.println(filename + " found");
                    					flag = 1;
                    					break;
                					}
            				}
        			}
  			if (flag == 0) 
			{
            				System.out.println("File Not Found");
        			}
		}
		catch (Exception ex1) 
		{
			System.out.println("Error Occured");
        		}
		
	}
	public static void deleteFile()
	{
		String strPath = "", strName = "";
		try
		{
			File directory = new File("C:\\javafsd\\javademos\\PracticeProjects\\Files");
 			String[] flist = directory.list();
    			for(int i=0;i<flist.length;i++)
			{
   				String f4=flist[i];
				System.out.println(f4);
			}
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        			System.out.println("Enter the file name:");
        			strName = br.readLine();
        			System.out.println("Enter the file path:");
        			strPath = br.readLine();
 			File file1= new File(strPath + "" + strName + ".txt");
 			if (file1.delete()) 
			{
            				System.out.println("File deleted successfully");
        			}
        			else 
			{
            				System.out.println("Failed to delete the file");
        			}
		}
		catch (Exception ex1) 
		{
			System.out.println("Error Occured");
        		}
	}
	public static void sortFiles(){
            String strpath="";
		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            			System.out.println("Enter the file path:");
            			strpath = br.readLine();
		File f=new File(strpath);
		File s[]=f.listFiles();
		Arrays.sort(s);

                    for(int i=0;i<s.length;i++)
                        System.out.println(s[i].getName());
		}
		catch(Exception e){
			System.out.println(e);
		}
                        
	}
	
}