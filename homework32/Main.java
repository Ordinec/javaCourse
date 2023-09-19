package homework32;

import java.sql.SQLException;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException, SQLException {
        DbHandler.storeStudent(new Student("Svyatoslav", "Khorobriy", "Nobles"));
        System.out.println(DbHandler.selectStudent("Svyatoslav"));
    }
}
