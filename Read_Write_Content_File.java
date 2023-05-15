package Java_Assisment_3ed_week;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_Write_Content_File {
        public static void main(String[] args)
        {
            try {
                FileWriter fw = new FileWriter("avi.txt");
                FileReader fr = new FileReader("avi.txt");
                String str = "I Love india";


                int i;
                while ((i = fr.read()) != -1) {
                    str += (char)i;
                }
                System.out.println(str);
                fw.write(str);

                fw.close();
                fr.close();
                System.out.println("\nFile Read and write done");
            }

            catch (IOException e) {
                System.out.println(
                        "There are some IOException");
            }

        }
    }
