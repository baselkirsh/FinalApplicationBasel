package basel.kersh.finalapplicationbasel.data.MyTaskTable;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface MyTaskQuery {
    @Query("Select * FROM MyTask ORDER BY importance desc")
   LiveData <List<MyTask>> getAllTasks();
    @Query("SELECT * FROM MyTask WHERE userId=:userid_p ORDER BY time Desc")
    LiveData <List<MyTask>> getAllTaskOrederBy(long userid_p);
    @Query("SELECT * FROM MyTask WHERE userId=:userid_p AND isCompleted=:isCompleted_p   ORDER BY importance DESC")
    LiveData <List<MyTask>> getAllTaskOrderBy(long userid_p,boolean isCompleted_p);
    @Insert
    void insertTask(MyTask... t);
    @Update
    void updateTask(MyTask... tasks);
    @Delete
    void deleteTask(MyTask...tasks);
    @Query("DELETE FROM MyTask WHERE keyId=:kid")
    void deleteTask (long kid);
    @Query("SELECT * FROM MyTask WHERE subjId=:key_id ORDER BY importance DESC")
    List<MyTask>getTasksBySubjId(long key_id);
 @Query("SELECT * FROM MyTask WHERE userId=:userId ORDER BY importance DESC")

 LiveData<List<MyTask>> getTasksByUserId(long userId);
 @Query("SELECT * FROM MyTask WHERE taskId=:taskId ORDER BY importance DESC")

 LiveData<MyTask> getTaskById(long taskId);
 @Query("SELECT * FROM MyTask WHERE title=:title ORDER BY importance DESC")

 LiveData<List<MyTask>> getTasksByTitle(String title);
}