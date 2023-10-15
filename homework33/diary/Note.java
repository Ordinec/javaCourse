package homework33.diary;

import static homework33.diary.Utils.getCurrentTime;

public class Note {
    private String authorName;
    private String noteValue;
    private String addedAt;
    private int id;
    private String updatedAt = "";

    Note(String author, String noteValue){
        this.authorName = author;
        this.noteValue = noteValue;
        this.addedAt = getCurrentTime();
    }

    void setNoteId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public String getValue() {
        return this.noteValue;
    }

    public void setNoteValue(String newValue){
        this.noteValue = newValue;
        this.updatedAt = getCurrentTime();
    }

    public String getAuthor() {
        return this.authorName;
    }

    public String getAddedAt() {
        return this.addedAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }
}

