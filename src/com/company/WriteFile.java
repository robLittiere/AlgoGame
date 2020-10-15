package com.company;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * Class to write a file in a new file if it doesn't exist. Otherwise adds the content at the end of the file
 *
 */
public class WriteFile {

    public String path;
    public boolean append_to_file = true;

    /**
     * This function allows us to initiate a WriteFile object
     * @param file_path Receive the path name
     * @param append_value Gives an indication to overwrite or add the text at the end of the file
     */
    public WriteFile( String file_path , boolean append_value ) {

        path = file_path;
        append_to_file = append_value;

    }

    public WriteFile(String file_path){
        path = file_path;
    }

    /**
     * Write the string in argument to the chosen file
     * @param textLine
     * @throws IOException
     */
    public void writeToFile( String textLine ) throws IOException {

        FileWriter write = new FileWriter(path , append_to_file);
        PrintWriter print_line = new PrintWriter( write );
        print_line.printf( "%s" + "%n" , textLine);
        print_line.close();


    }


}
