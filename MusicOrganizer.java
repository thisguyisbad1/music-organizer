import java.util.ArrayList;
import java.io.File;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 7.0
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
        files.add("tung1");
        files.add("tung2");
        files.add("tung3");
        files.add("tung4");
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    //qusetion 3
    public void listFile(int index)
    {
        if(validIndex(index) == true) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    //question 3
    public void removeFile(int index)
    {
        if(validIndex(index)==true) {
            files.remove(index);
        }
    }
    
    //question 1
    public void checkIndex(int i){
        if (i >= 0 && i < files.size()){
        
        }
        else{
            System.out.println("Error: invalid index. Enter index between 0 and " + (files.size()-1));
        }
    }
    
    //question 2
    public boolean validIndex(int i){
        if(i >= 0 && i < files.size()){
            return true;
        }
        else{
            return false;
        }
    }
    
    //question 4
    public void listAllFiles(){
        //question 7
        int position = 0;
        for (String myFiles: files){
            System.out.println(position + ": " + files.get(position));
            position ++;
        }
    }
    
    //question 8
    public void listMatching(String searchString){
        boolean found = false;
        for(String filename : files){
            if(filename.contains(searchString)){
                //a match
                System.out.println(filename);
                found = true;
            }
        }
        //question 9
        if (!found){
            System.out.println("not found");
        }
    }
}
