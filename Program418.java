import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;

class Program418
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {

            File fobj = new File(FolderName);

            System.out.println("Enter the name of packed file : ");
            System.out.println("Note : Packed file should be in the current directory.");

            String PackFile = sobj.nextLine();

            File fpackobj = new File(PackFile);

            fpackobj.createNewFile();

            FileOutputStream fout = new FileOutputStream(fpackobj);

            if(fin.exists())
            {
               System.out.println("") 
            } 
            else
            {
                System.out.println("There is no such folder..");
            }

        }//End of try
        catch(Exception obj)
        {
            System.out.println("Exception occured : "+obj);
        }
    }//end of main

}// end of Class