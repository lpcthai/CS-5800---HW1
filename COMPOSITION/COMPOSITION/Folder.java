package COMPOSITION;
import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String folderName;
    private List<File> files;
    private List<Folder> subFolders;

    public  Folder(String folderName) {
        this.folderName = folderName;
        this.files = new ArrayList<>();
        this.subFolders = new ArrayList<>();
    }

    public String getFolderName() {
        return folderName;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void addSubFolder(Folder subFolder) {
        subFolders.add(subFolder);
    }

    public void removeSubFolder(Folder subFolder) {
        subFolders.remove(subFolder);
    }

    public void printFolder(String indent) {
        System.out.println(indent + folderName);
        String newIndent = indent + "    ";
        for (File file : files) {
            file.print(newIndent);
        }
        for (Folder subFolder : subFolders) {
            subFolder.printFolder(newIndent);
        }
    }
}
