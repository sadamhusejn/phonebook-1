package javaschool.app;

public class Note extends Record {
    private String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return getId() + " " + getName() + " " + note;
    }

    public boolean contains(String str) {
        return super.contains(str) || note.contains(str);
    }

}