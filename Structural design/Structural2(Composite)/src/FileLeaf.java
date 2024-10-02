// Class representing a file (leaf in the composite pattern)
public class FileLeaf implements FileComponent {
    private String name;

    // Constructor to initialize the file name
    public FileLeaf(String name) {
        this.name = name;
    }

    // Method to show file details
    @Override
    public void showDetails() {
        System.out.println("File: " + name);
    }
}
