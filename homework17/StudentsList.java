package homework17;


import java.util.AbstractList;
import java.util.List;
import java.util.Objects;

public class StudentsList<Student> extends AbstractList implements List {
    private int capacity;
    private int size;
    private Object[] elementData = new Object[10];


    Student elementData(int index) {
        return (Student) elementData[index];
    }

    public StudentsList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.capacity = initialCapacity;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                    initialCapacity);
        }
    }
    @Override
    public Student get(int index) {
        Objects.checkIndex(index, size);
        return elementData(index);
    }

    @Override
    public int size() {
        return size;
    }

    private void add(Student student, Student[] elementData, int s) {
        elementData[s] = student;
        size = s + 1;
    }

    public boolean add(Object student) {
        modCount++;
        add((Student) student, (Student[]) elementData, size);
        return true;
    }
}
