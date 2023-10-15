package homework33.diary;

import static homework33.db.DbHandler.*;

public class Diary {

    public void addNote(String author, String noteValue){
        Note note = new Note(author, noteValue);
        // +1 used to avoid 0 id value
        note.setNoteId(getNextAvailableId());
        addNoteRecord(note);
    }

    public void removeNote(int id){
        removeNoteRecord(id);
    }

    public void removeNote(String noteValue){
        removeNoteRecord(noteValue);
    }

    public void updateNote(int id, String newNoteValue){
        updateNoteRecord(id, newNoteValue);
    }


    public void updateNote(String noteValue, String newNoteValue){
        updateNoteRecord(noteValue, newNoteValue);
    }
}
