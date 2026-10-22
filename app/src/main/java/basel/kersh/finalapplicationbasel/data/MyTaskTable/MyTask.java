package basel.kersh.finalapplicationbasel.data.MyTaskTable;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class MyTask {
    @PrimaryKey(autoGenerate = true)
    private long taskId;
    private String title;
    private String description;
    private int priority;

    public long keyId;
    public int importance;
    public String shortTile;
    public  String text;
    public long time;
    public boolean isCompleted;
    public long subjId;
    public long userId;

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public long getKeyId() {
        return keyId;
    }

    public void setKeyId(long keyId) {
        this.keyId = keyId;
    }

    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    public String getShortTile() {
        return shortTile;
    }

    public void setShortTile(String shortTile) {
        this.shortTile = shortTile;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public long getSubjId() {
        return subjId;
    }

    public void setSubjId(long subjId) {
        this.subjId = subjId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;

    }
}
