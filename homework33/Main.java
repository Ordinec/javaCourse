package homework33;

import homework33.diary.Diary;

public class Main {
    public static void main(String[] args) {
        Diary diary = new Diary();
        diary.addNote("system", "someNote");
        diary.updateNote("someNote", "someNote2");
        diary.removeNote(1);
    }
}
