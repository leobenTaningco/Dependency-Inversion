import java.util.ArrayList;
import java.util.List;
class Library implements ResourceRepository {
    private List<Resource> borrowedResources;

    public Library() {
        borrowedResources = new ArrayList<>();
    }

    @Override
    public void borrowResource(Resource resource) {
        borrowedResources.add(resource);
        System.out.println("Borrowed: " + resource.getTitle());
    }

    @Override
    public void returnResource(Resource resource) {
        boolean removed = borrowedResources.removeIf(r -> r.getTitle().equals(resource.getTitle()));
        if (removed) {
            System.out.println("Returned: " + resource.getTitle());
        } else {
            System.out.println(resource.getTitle() + " was not borrowed.");
        }
    }
}
