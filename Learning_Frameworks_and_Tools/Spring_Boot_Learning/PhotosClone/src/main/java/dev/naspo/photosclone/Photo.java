package dev.naspo.photosclone;

// Photo Data Class
public class Photo {
    private String id;
    private String fileName;

    public Photo(String id, String fileName) {
        this.id = id;
        this.fileName = fileName;
    }

    // == Getters and Setters ==

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
