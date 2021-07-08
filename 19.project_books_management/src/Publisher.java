import java.util.Arrays;

class PublisherIdAlreadyExistsException extends Exception {
    public PublisherIdAlreadyExistsException(String msg) {
        super(msg);
    }
}

public class Publisher {
    int id;
    String publisherName;
    static int[] ids;
    static int idsTopIndex;

    static {
        ids = new int[100];
        idsTopIndex = -1;
    }

    public Publisher(int id, String publisherName) throws PublisherIdAlreadyExistsException {
        if (isIdInIds(id)) throw new PublisherIdAlreadyExistsException(String.format("ID %d already exists!!!", id));
        addIdToIds(id);
        this.id = id;
        this.publisherName = publisherName;
    }

    private boolean isIdInIds(int id) {
        for (int i : ids) if (i != id) return true;
        return false;
    }

    private void addIdToIds(int id) {
        if (idsTopIndex >= ids.length - 1) {
            ids = Arrays.copyOf(ids, ids.length << 1);
        }
        ids[++idsTopIndex] = id;
    }
}
