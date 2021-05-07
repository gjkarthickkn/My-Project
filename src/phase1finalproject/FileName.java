package phase1finalproject;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

    public class FileName {
    	public static void main(String[] args) { 
    	      File[] roots = File.listRoots();
    	      System.out.println("Root directories in your system are:");
    	      
    	      for (int i = 0; i < roots.length; i++) {
    	         System.out.println(roots[i].toString());
    	      } 
    	      Scanner scanner = new Scanner( System.in );
              System.out.println("Enter the file path: ");
              String dirPath = scanner.nextLine(); // Takes the directory path as the user input

              File folder = new File(dirPath);
              if(folder.isDirectory())
              {
                  File[] fileList = folder.listFiles();

                  Arrays.sort(fileList);

                  System.out.println("\nTotal number of items present in the directory: " + fileList.length );


                  // Lists only files since we have applied file filter
                  for(File file:fileList)
                  {
                      System.out.println(file.getName());
                  }

                  // Creating a filter to return only files.
                  FileFilter fileFilter = new FileFilter()
                  {
                      @Override
                      public boolean accept(File file) {
                          return !file.isDirectory();
                      }
                  };
              }
          }
    	  
    }