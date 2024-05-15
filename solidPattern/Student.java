package solidPattern;
import java.util.ArrayList;
import java.util.List;
public class Student {
    private List<LibraryResource> borrowedResources = new ArrayList<>();

    public void borrowResource(LibraryResource resource) {
        resource.borrow();
        borrowedResources.add(resource);
    }
}
