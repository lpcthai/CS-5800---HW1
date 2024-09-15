package COMPOSITION2;
public class File {
    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void printFile(String indent) {
        System.out.println(indent + fileName);
    }
}
