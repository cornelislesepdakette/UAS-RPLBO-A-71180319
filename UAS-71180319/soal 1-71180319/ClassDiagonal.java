import java.io.*;
public class ClassDiagonal {
    public static void main(String[] argd){
        final String fileName = "TextFile.txt";

        try {
            var myFileObject = new FileInputStream(fileName)
                    int myData;
            while ( ( myData = myFileObject.read())!n= -1) {
                system.out.print((char)myData);
            }

        }
        catch (Exception ex){
            system.out.printIn("File read error!");
        }
    }
}
