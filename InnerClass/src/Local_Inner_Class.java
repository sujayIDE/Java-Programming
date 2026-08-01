class FileProcessor{
    void processFile(String fileName)
    {
        class FileValidator{
            boolean validate()
            {
                if(fileName.endsWith(".txt"))
                {
                    return true;
                }else
                    return false;
            }
        }
        FileValidator f=new FileValidator();
        if(f.validate())
        {
            System.out.println("File is valid");
        }else{
        System.out.println("FileNotFound");
    }
    }
}
public class Local_Inner_Class {
    public static void main(String[] args) {
        FileProcessor fp=new FileProcessor();
        fp.processFile("s.txt");
    }
}
