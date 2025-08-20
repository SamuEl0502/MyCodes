import java.util.ArrayList;

public class GestStudents {
    private ArrayList<student> listStudent = new ArrayList<>();
    private ArrayList<subject> subject = new ArrayList<>();


public GestStudents(){
    String[] student = new String[100];
    String[] subject = new String[100];
}

public void addStudent(student s) {
    listStudent.add(s);
}

public void addSubject(subject su) {
    subject.add(su);
}

public student searchID(int ID) {
    for (student s : listStudent) {
        if (s.getID() == ID) {
            return s;
        }
    }
    return null;
}

public boolean DeleteStudent(int ID) {
    student s = searchID(ID);
    if (s != null){
        listStudent.remove(s);
        return true;
    }
    return false;
}

public boolean EditStudent(int ID, int ID_new, String name_new, int sem_new) {
    student s = searchID(ID);
    if (s != null){
        s.setID(ID_new);
        s.setName(name_new);
        s.setSem(sem_new);
        return true;
    }
    return false;
}
}