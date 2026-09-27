package basel.kersh.finalapplicationbasel.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import basel.kersh.finalapplicationbasel.data.MyTaskTable.MyTask;
import basel.kersh.finalapplicationbasel.data.MyUserTable.MyUser;
import basel.kersh.finalapplicationbasel.data.mySubjectTable.MySubject;

@Database(entities = {MyUser.class, MySubject.class, MyTask.class}, version =1)
public class AppDataBase {
    public abstract class AppDatabase extends RoomDatabase {


    }
}