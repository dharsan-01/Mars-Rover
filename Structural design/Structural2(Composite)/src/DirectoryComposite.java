import java.util.ArrayList;
import java.util.List;

// Class representing a directory (composite in the composite pattern)
public class DirectoryComposite implements FileComponent {
    private String name;
    private List<FileComponent> components = new ArrayList<>();

    // Constructor to initialize the directory name
    public DirectoryComposite(String name) {
        this.name = name;
    }

    // Method to add a file or directory to this directory
    public void addComponent(FileComponent component) {
        components.add(component);
    }

    // Method to display the details of the directory and its contents
    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        for (FileComponent component : components) {
            component.showDetails();
        }
    }
}
