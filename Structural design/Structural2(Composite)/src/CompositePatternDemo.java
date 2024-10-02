public class CompositePatternDemo {
    public static void main(String[] args) {
        // Creating individual file components
        FileComponent file1 = new FileLeaf("file1.txt");
        FileComponent file2 = new FileLeaf("file2.jpg");

        // Creating a directory composite and adding files to it
        DirectoryComposite directory = new DirectoryComposite("Documents");
        directory.addComponent(file1);
        directory.addComponent(file2);

        // Creating a subdirectory
        DirectoryComposite subDirectory = new DirectoryComposite("Pictures");
        FileComponent pictureFile = new FileLeaf("picture1.png");
        subDirectory.addComponent(pictureFile);

        // Adding the subdirectory to the main directory
        directory.addComponent(subDirectory);

        // Displaying the entire directory structure
        directory.showDetails();
    }
}
