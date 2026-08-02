package weakassociation;

public class Library {
   private int libraryId;
    private String libraryName;

    public Library(int libraryId, String libraryName) {
        this.libraryId = libraryId;
        this.libraryName = libraryName;
    }

    public int getLibraryId() {
        return libraryId;
    }

    public String getLibraryName() {
        return libraryName;
    }
}
