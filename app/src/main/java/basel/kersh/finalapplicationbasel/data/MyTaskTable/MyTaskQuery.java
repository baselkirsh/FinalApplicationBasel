package basel.kersh.finalapplicationbasel.data.MyTaskTable;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MyTaskQuery {
    @Query("Select * FROM MyTask ORDER BY importance desc")
    List<MyTask> getAllTasks();
    @Query("SELECT * FROM MyTask WHERE userId=:userid_p ORDER BY time Desc")
    List<MyTask> getAllTaskOrederBy(long userid_p);
    @Query("SELECT * FROM MyTask WHERE userId=:userid_p AND isCompleted=:isCompleted_p   ORDER BY importance DESC")
    List<MyTask> getAllTaskOrderBy(long userid_p,boolean isCompleted_p);
}