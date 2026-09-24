package basel.kersh.finalapplicationbasel.data.MyTaskTable;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class MyTask {
    @PrimaryKey(autoGenerate = true)
    public long keyId;
    public int importance;
    public String shortTile;
    public  String text;
    public long time;
    public boolean isCompleted;
    public long subjId;
    public long userId;


}
