package COMPOSITION2;
public class Main {
    public static void main(String[] args) {
        File file1 = new File(".htaccess");
        File file2 = new File(".htrouter.php");
        File file3 = new File("index.html");

        Folder phpDemo1 = new Folder("php demo1");
        Folder sourceFiles = new Folder("Source Files");
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migration = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");

        Folder cache = new Folder(".cache");
        Folder publicFolder = new Folder("public");
        publicFolder.addFile(file1);
        publicFolder.addFile(file2);
        publicFolder.addFile(file3);

        sourceFiles.addSubFolder(cache);
        sourceFiles.addSubFolder(publicFolder);

        app.addSubFolder(config);
        app.addSubFolder(controllers);
        app.addSubFolder(library);
        app.addSubFolder(migration);
        app.addSubFolder(models);
        app.addSubFolder(views);

        sourceFiles.addSubFolder(phalcon);
        sourceFiles.addSubFolder(app);

        Folder includePath = new Folder("Include path");
        Folder remoteFiles = new Folder("Remote Files");

        phpDemo1.addSubFolder(sourceFiles);
        phpDemo1.addSubFolder(includePath);
        phpDemo1.addSubFolder(remoteFiles);

        // Remove the app folder
        sourceFiles.removeSubFolder(app);

        phpDemo1.printFolder("");
    }
}
