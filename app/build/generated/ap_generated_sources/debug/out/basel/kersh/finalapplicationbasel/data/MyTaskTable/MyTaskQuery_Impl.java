package basel.kersh.finalapplicationbasel.data.MyTaskTable;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class MyTaskQuery_Impl implements MyTaskQuery {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MyTask> __insertionAdapterOfMyTask;

  private final EntityDeletionOrUpdateAdapter<MyTask> __deletionAdapterOfMyTask;

  private final EntityDeletionOrUpdateAdapter<MyTask> __updateAdapterOfMyTask;

  private final SharedSQLiteStatement __preparedStmtOfUpdateTask;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTask;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTaskById;

  public MyTaskQuery_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMyTask = new EntityInsertionAdapter<MyTask>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `MyTask` (`taskId`,`title`,`description`,`priority`,`keyId`,`importance`,`shortTile`,`text`,`time`,`isCompleted`,`subjId`,`userId`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement, final MyTask entity) {
        statement.bindLong(1, entity.getTaskId());
        if (entity.getTitle() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getTitle());
        }
        if (entity.getDescription() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getDescription());
        }
        statement.bindLong(4, entity.getPriority());
        statement.bindLong(5, entity.keyId);
        statement.bindLong(6, entity.importance);
        if (entity.shortTile == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.shortTile);
        }
        if (entity.text == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.text);
        }
        statement.bindLong(9, entity.time);
        final int _tmp = entity.isCompleted ? 1 : 0;
        statement.bindLong(10, _tmp);
        statement.bindLong(11, entity.subjId);
        statement.bindLong(12, entity.userId);
      }
    };
    this.__deletionAdapterOfMyTask = new EntityDeletionOrUpdateAdapter<MyTask>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `MyTask` WHERE `taskId` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement, final MyTask entity) {
        statement.bindLong(1, entity.getTaskId());
      }
    };
    this.__updateAdapterOfMyTask = new EntityDeletionOrUpdateAdapter<MyTask>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `MyTask` SET `taskId` = ?,`title` = ?,`description` = ?,`priority` = ?,`keyId` = ?,`importance` = ?,`shortTile` = ?,`text` = ?,`time` = ?,`isCompleted` = ?,`subjId` = ?,`userId` = ? WHERE `taskId` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement, final MyTask entity) {
        statement.bindLong(1, entity.getTaskId());
        if (entity.getTitle() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getTitle());
        }
        if (entity.getDescription() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getDescription());
        }
        statement.bindLong(4, entity.getPriority());
        statement.bindLong(5, entity.keyId);
        statement.bindLong(6, entity.importance);
        if (entity.shortTile == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.shortTile);
        }
        if (entity.text == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.text);
        }
        statement.bindLong(9, entity.time);
        final int _tmp = entity.isCompleted ? 1 : 0;
        statement.bindLong(10, _tmp);
        statement.bindLong(11, entity.subjId);
        statement.bindLong(12, entity.userId);
        statement.bindLong(13, entity.getTaskId());
      }
    };
    this.__preparedStmtOfUpdateTask = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE MyTask SET title = ?, description = ?, priority = ? WHERE taskId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteTask = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM MyTask WHERE keyId=?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteTaskById = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM MyTask WHERE taskId = ?";
        return _query;
      }
    };
  }

  @Override
  public void insertTask(final MyTask... t) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMyTask.insert(t);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final MyTask[] tasks) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMyTask.insert(tasks);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteTask(final MyTask... tasks) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfMyTask.handleMultiple(tasks);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final MyTask[] tasks) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfMyTask.handleMultiple(tasks);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateTask(final MyTask... tasks) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfMyTask.handleMultiple(tasks);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final MyTask[] tasks) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfMyTask.handleMultiple(tasks);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateTask(final long taskId, final String title, final String description,
      final int priority) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateTask.acquire();
    int _argIndex = 1;
    if (title == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, title);
    }
    _argIndex = 2;
    if (description == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, description);
    }
    _argIndex = 3;
    _stmt.bindLong(_argIndex, priority);
    _argIndex = 4;
    _stmt.bindLong(_argIndex, taskId);
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfUpdateTask.release(_stmt);
    }
  }

  @Override
  public void deleteTask(final long kid) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteTask.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, kid);
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteTask.release(_stmt);
    }
  }

  @Override
  public void deleteTaskById(final long taskId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteTaskById.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, taskId);
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDeleteTaskById.release(_stmt);
    }
  }

  @Override
  public LiveData<List<MyTask>> getAllTasks() {
    final String _sql = "Select * FROM MyTask ORDER BY importance desc";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[] {"MyTask"}, false, new Callable<List<MyTask>>() {
      @Override
      @Nullable
      public List<MyTask> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTaskId = CursorUtil.getColumnIndexOrThrow(_cursor, "taskId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
          final int _cursorIndexOfKeyId = CursorUtil.getColumnIndexOrThrow(_cursor, "keyId");
          final int _cursorIndexOfImportance = CursorUtil.getColumnIndexOrThrow(_cursor, "importance");
          final int _cursorIndexOfShortTile = CursorUtil.getColumnIndexOrThrow(_cursor, "shortTile");
          final int _cursorIndexOfText = CursorUtil.getColumnIndexOrThrow(_cursor, "text");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfIsCompleted = CursorUtil.getColumnIndexOrThrow(_cursor, "isCompleted");
          final int _cursorIndexOfSubjId = CursorUtil.getColumnIndexOrThrow(_cursor, "subjId");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final List<MyTask> _result = new ArrayList<MyTask>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final MyTask _item;
            _item = new MyTask();
            final long _tmpTaskId;
            _tmpTaskId = _cursor.getLong(_cursorIndexOfTaskId);
            _item.setTaskId(_tmpTaskId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item.setTitle(_tmpTitle);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            _item.setDescription(_tmpDescription);
            final int _tmpPriority;
            _tmpPriority = _cursor.getInt(_cursorIndexOfPriority);
            _item.setPriority(_tmpPriority);
            _item.keyId = _cursor.getLong(_cursorIndexOfKeyId);
            _item.importance = _cursor.getInt(_cursorIndexOfImportance);
            if (_cursor.isNull(_cursorIndexOfShortTile)) {
              _item.shortTile = null;
            } else {
              _item.shortTile = _cursor.getString(_cursorIndexOfShortTile);
            }
            if (_cursor.isNull(_cursorIndexOfText)) {
              _item.text = null;
            } else {
              _item.text = _cursor.getString(_cursorIndexOfText);
            }
            _item.time = _cursor.getLong(_cursorIndexOfTime);
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsCompleted);
            _item.isCompleted = _tmp != 0;
            _item.subjId = _cursor.getLong(_cursorIndexOfSubjId);
            _item.userId = _cursor.getLong(_cursorIndexOfUserId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<MyTask>> getAllTaskOrederBy(final long userid_p) {
    final String _sql = "SELECT * FROM MyTask WHERE userId=? ORDER BY time Desc";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, userid_p);
    return __db.getInvalidationTracker().createLiveData(new String[] {"MyTask"}, false, new Callable<List<MyTask>>() {
      @Override
      @Nullable
      public List<MyTask> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTaskId = CursorUtil.getColumnIndexOrThrow(_cursor, "taskId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
          final int _cursorIndexOfKeyId = CursorUtil.getColumnIndexOrThrow(_cursor, "keyId");
          final int _cursorIndexOfImportance = CursorUtil.getColumnIndexOrThrow(_cursor, "importance");
          final int _cursorIndexOfShortTile = CursorUtil.getColumnIndexOrThrow(_cursor, "shortTile");
          final int _cursorIndexOfText = CursorUtil.getColumnIndexOrThrow(_cursor, "text");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfIsCompleted = CursorUtil.getColumnIndexOrThrow(_cursor, "isCompleted");
          final int _cursorIndexOfSubjId = CursorUtil.getColumnIndexOrThrow(_cursor, "subjId");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final List<MyTask> _result = new ArrayList<MyTask>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final MyTask _item;
            _item = new MyTask();
            final long _tmpTaskId;
            _tmpTaskId = _cursor.getLong(_cursorIndexOfTaskId);
            _item.setTaskId(_tmpTaskId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item.setTitle(_tmpTitle);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            _item.setDescription(_tmpDescription);
            final int _tmpPriority;
            _tmpPriority = _cursor.getInt(_cursorIndexOfPriority);
            _item.setPriority(_tmpPriority);
            _item.keyId = _cursor.getLong(_cursorIndexOfKeyId);
            _item.importance = _cursor.getInt(_cursorIndexOfImportance);
            if (_cursor.isNull(_cursorIndexOfShortTile)) {
              _item.shortTile = null;
            } else {
              _item.shortTile = _cursor.getString(_cursorIndexOfShortTile);
            }
            if (_cursor.isNull(_cursorIndexOfText)) {
              _item.text = null;
            } else {
              _item.text = _cursor.getString(_cursorIndexOfText);
            }
            _item.time = _cursor.getLong(_cursorIndexOfTime);
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsCompleted);
            _item.isCompleted = _tmp != 0;
            _item.subjId = _cursor.getLong(_cursorIndexOfSubjId);
            _item.userId = _cursor.getLong(_cursorIndexOfUserId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<MyTask>> getAllTaskOrderBy(final long userid_p,
      final boolean isCompleted_p) {
    final String _sql = "SELECT * FROM MyTask WHERE userId=? AND isCompleted=?   ORDER BY importance DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, userid_p);
    _argIndex = 2;
    final int _tmp = isCompleted_p ? 1 : 0;
    _statement.bindLong(_argIndex, _tmp);
    return __db.getInvalidationTracker().createLiveData(new String[] {"MyTask"}, false, new Callable<List<MyTask>>() {
      @Override
      @Nullable
      public List<MyTask> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTaskId = CursorUtil.getColumnIndexOrThrow(_cursor, "taskId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
          final int _cursorIndexOfKeyId = CursorUtil.getColumnIndexOrThrow(_cursor, "keyId");
          final int _cursorIndexOfImportance = CursorUtil.getColumnIndexOrThrow(_cursor, "importance");
          final int _cursorIndexOfShortTile = CursorUtil.getColumnIndexOrThrow(_cursor, "shortTile");
          final int _cursorIndexOfText = CursorUtil.getColumnIndexOrThrow(_cursor, "text");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfIsCompleted = CursorUtil.getColumnIndexOrThrow(_cursor, "isCompleted");
          final int _cursorIndexOfSubjId = CursorUtil.getColumnIndexOrThrow(_cursor, "subjId");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final List<MyTask> _result = new ArrayList<MyTask>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final MyTask _item;
            _item = new MyTask();
            final long _tmpTaskId;
            _tmpTaskId = _cursor.getLong(_cursorIndexOfTaskId);
            _item.setTaskId(_tmpTaskId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item.setTitle(_tmpTitle);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            _item.setDescription(_tmpDescription);
            final int _tmpPriority;
            _tmpPriority = _cursor.getInt(_cursorIndexOfPriority);
            _item.setPriority(_tmpPriority);
            _item.keyId = _cursor.getLong(_cursorIndexOfKeyId);
            _item.importance = _cursor.getInt(_cursorIndexOfImportance);
            if (_cursor.isNull(_cursorIndexOfShortTile)) {
              _item.shortTile = null;
            } else {
              _item.shortTile = _cursor.getString(_cursorIndexOfShortTile);
            }
            if (_cursor.isNull(_cursorIndexOfText)) {
              _item.text = null;
            } else {
              _item.text = _cursor.getString(_cursorIndexOfText);
            }
            _item.time = _cursor.getLong(_cursorIndexOfTime);
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsCompleted);
            _item.isCompleted = _tmp_1 != 0;
            _item.subjId = _cursor.getLong(_cursorIndexOfSubjId);
            _item.userId = _cursor.getLong(_cursorIndexOfUserId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public List<MyTask> getTasksBySubjId(final long key_id) {
    final String _sql = "SELECT * FROM MyTask WHERE subjId=? ORDER BY importance DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, key_id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTaskId = CursorUtil.getColumnIndexOrThrow(_cursor, "taskId");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
      final int _cursorIndexOfKeyId = CursorUtil.getColumnIndexOrThrow(_cursor, "keyId");
      final int _cursorIndexOfImportance = CursorUtil.getColumnIndexOrThrow(_cursor, "importance");
      final int _cursorIndexOfShortTile = CursorUtil.getColumnIndexOrThrow(_cursor, "shortTile");
      final int _cursorIndexOfText = CursorUtil.getColumnIndexOrThrow(_cursor, "text");
      final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
      final int _cursorIndexOfIsCompleted = CursorUtil.getColumnIndexOrThrow(_cursor, "isCompleted");
      final int _cursorIndexOfSubjId = CursorUtil.getColumnIndexOrThrow(_cursor, "subjId");
      final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
      final List<MyTask> _result = new ArrayList<MyTask>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final MyTask _item;
        _item = new MyTask();
        final long _tmpTaskId;
        _tmpTaskId = _cursor.getLong(_cursorIndexOfTaskId);
        _item.setTaskId(_tmpTaskId);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        _item.setTitle(_tmpTitle);
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        _item.setDescription(_tmpDescription);
        final int _tmpPriority;
        _tmpPriority = _cursor.getInt(_cursorIndexOfPriority);
        _item.setPriority(_tmpPriority);
        _item.keyId = _cursor.getLong(_cursorIndexOfKeyId);
        _item.importance = _cursor.getInt(_cursorIndexOfImportance);
        if (_cursor.isNull(_cursorIndexOfShortTile)) {
          _item.shortTile = null;
        } else {
          _item.shortTile = _cursor.getString(_cursorIndexOfShortTile);
        }
        if (_cursor.isNull(_cursorIndexOfText)) {
          _item.text = null;
        } else {
          _item.text = _cursor.getString(_cursorIndexOfText);
        }
        _item.time = _cursor.getLong(_cursorIndexOfTime);
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsCompleted);
        _item.isCompleted = _tmp != 0;
        _item.subjId = _cursor.getLong(_cursorIndexOfSubjId);
        _item.userId = _cursor.getLong(_cursorIndexOfUserId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<MyTask>> getTasksByUserId(final long userId) {
    final String _sql = "SELECT * FROM MyTask WHERE userId=? ORDER BY importance DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, userId);
    return __db.getInvalidationTracker().createLiveData(new String[] {"MyTask"}, false, new Callable<List<MyTask>>() {
      @Override
      @Nullable
      public List<MyTask> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTaskId = CursorUtil.getColumnIndexOrThrow(_cursor, "taskId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
          final int _cursorIndexOfKeyId = CursorUtil.getColumnIndexOrThrow(_cursor, "keyId");
          final int _cursorIndexOfImportance = CursorUtil.getColumnIndexOrThrow(_cursor, "importance");
          final int _cursorIndexOfShortTile = CursorUtil.getColumnIndexOrThrow(_cursor, "shortTile");
          final int _cursorIndexOfText = CursorUtil.getColumnIndexOrThrow(_cursor, "text");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfIsCompleted = CursorUtil.getColumnIndexOrThrow(_cursor, "isCompleted");
          final int _cursorIndexOfSubjId = CursorUtil.getColumnIndexOrThrow(_cursor, "subjId");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final List<MyTask> _result = new ArrayList<MyTask>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final MyTask _item;
            _item = new MyTask();
            final long _tmpTaskId;
            _tmpTaskId = _cursor.getLong(_cursorIndexOfTaskId);
            _item.setTaskId(_tmpTaskId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item.setTitle(_tmpTitle);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            _item.setDescription(_tmpDescription);
            final int _tmpPriority;
            _tmpPriority = _cursor.getInt(_cursorIndexOfPriority);
            _item.setPriority(_tmpPriority);
            _item.keyId = _cursor.getLong(_cursorIndexOfKeyId);
            _item.importance = _cursor.getInt(_cursorIndexOfImportance);
            if (_cursor.isNull(_cursorIndexOfShortTile)) {
              _item.shortTile = null;
            } else {
              _item.shortTile = _cursor.getString(_cursorIndexOfShortTile);
            }
            if (_cursor.isNull(_cursorIndexOfText)) {
              _item.text = null;
            } else {
              _item.text = _cursor.getString(_cursorIndexOfText);
            }
            _item.time = _cursor.getLong(_cursorIndexOfTime);
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsCompleted);
            _item.isCompleted = _tmp != 0;
            _item.subjId = _cursor.getLong(_cursorIndexOfSubjId);
            _item.userId = _cursor.getLong(_cursorIndexOfUserId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<MyTask> getTaskById(final long taskId) {
    final String _sql = "SELECT * FROM MyTask WHERE taskId=? ORDER BY importance DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, taskId);
    return __db.getInvalidationTracker().createLiveData(new String[] {"MyTask"}, false, new Callable<MyTask>() {
      @Override
      @Nullable
      public MyTask call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTaskId = CursorUtil.getColumnIndexOrThrow(_cursor, "taskId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
          final int _cursorIndexOfKeyId = CursorUtil.getColumnIndexOrThrow(_cursor, "keyId");
          final int _cursorIndexOfImportance = CursorUtil.getColumnIndexOrThrow(_cursor, "importance");
          final int _cursorIndexOfShortTile = CursorUtil.getColumnIndexOrThrow(_cursor, "shortTile");
          final int _cursorIndexOfText = CursorUtil.getColumnIndexOrThrow(_cursor, "text");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfIsCompleted = CursorUtil.getColumnIndexOrThrow(_cursor, "isCompleted");
          final int _cursorIndexOfSubjId = CursorUtil.getColumnIndexOrThrow(_cursor, "subjId");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final MyTask _result;
          if (_cursor.moveToFirst()) {
            _result = new MyTask();
            final long _tmpTaskId;
            _tmpTaskId = _cursor.getLong(_cursorIndexOfTaskId);
            _result.setTaskId(_tmpTaskId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _result.setTitle(_tmpTitle);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            _result.setDescription(_tmpDescription);
            final int _tmpPriority;
            _tmpPriority = _cursor.getInt(_cursorIndexOfPriority);
            _result.setPriority(_tmpPriority);
            _result.keyId = _cursor.getLong(_cursorIndexOfKeyId);
            _result.importance = _cursor.getInt(_cursorIndexOfImportance);
            if (_cursor.isNull(_cursorIndexOfShortTile)) {
              _result.shortTile = null;
            } else {
              _result.shortTile = _cursor.getString(_cursorIndexOfShortTile);
            }
            if (_cursor.isNull(_cursorIndexOfText)) {
              _result.text = null;
            } else {
              _result.text = _cursor.getString(_cursorIndexOfText);
            }
            _result.time = _cursor.getLong(_cursorIndexOfTime);
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsCompleted);
            _result.isCompleted = _tmp != 0;
            _result.subjId = _cursor.getLong(_cursorIndexOfSubjId);
            _result.userId = _cursor.getLong(_cursorIndexOfUserId);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<MyTask>> getTasksByTitle(final String title) {
    final String _sql = "SELECT * FROM MyTask WHERE title=? ORDER BY importance DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (title == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, title);
    }
    return __db.getInvalidationTracker().createLiveData(new String[] {"MyTask"}, false, new Callable<List<MyTask>>() {
      @Override
      @Nullable
      public List<MyTask> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTaskId = CursorUtil.getColumnIndexOrThrow(_cursor, "taskId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
          final int _cursorIndexOfKeyId = CursorUtil.getColumnIndexOrThrow(_cursor, "keyId");
          final int _cursorIndexOfImportance = CursorUtil.getColumnIndexOrThrow(_cursor, "importance");
          final int _cursorIndexOfShortTile = CursorUtil.getColumnIndexOrThrow(_cursor, "shortTile");
          final int _cursorIndexOfText = CursorUtil.getColumnIndexOrThrow(_cursor, "text");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfIsCompleted = CursorUtil.getColumnIndexOrThrow(_cursor, "isCompleted");
          final int _cursorIndexOfSubjId = CursorUtil.getColumnIndexOrThrow(_cursor, "subjId");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final List<MyTask> _result = new ArrayList<MyTask>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final MyTask _item;
            _item = new MyTask();
            final long _tmpTaskId;
            _tmpTaskId = _cursor.getLong(_cursorIndexOfTaskId);
            _item.setTaskId(_tmpTaskId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item.setTitle(_tmpTitle);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            _item.setDescription(_tmpDescription);
            final int _tmpPriority;
            _tmpPriority = _cursor.getInt(_cursorIndexOfPriority);
            _item.setPriority(_tmpPriority);
            _item.keyId = _cursor.getLong(_cursorIndexOfKeyId);
            _item.importance = _cursor.getInt(_cursorIndexOfImportance);
            if (_cursor.isNull(_cursorIndexOfShortTile)) {
              _item.shortTile = null;
            } else {
              _item.shortTile = _cursor.getString(_cursorIndexOfShortTile);
            }
            if (_cursor.isNull(_cursorIndexOfText)) {
              _item.text = null;
            } else {
              _item.text = _cursor.getString(_cursorIndexOfText);
            }
            _item.time = _cursor.getLong(_cursorIndexOfTime);
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsCompleted);
            _item.isCompleted = _tmp != 0;
            _item.subjId = _cursor.getLong(_cursorIndexOfSubjId);
            _item.userId = _cursor.getLong(_cursorIndexOfUserId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<MyTask>> getTasksByDescription(final String description) {
    final String _sql = "SELECT * FROM MyTask WHERE description=? ORDER BY importance DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (description == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, description);
    }
    return __db.getInvalidationTracker().createLiveData(new String[] {"MyTask"}, false, new Callable<List<MyTask>>() {
      @Override
      @Nullable
      public List<MyTask> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTaskId = CursorUtil.getColumnIndexOrThrow(_cursor, "taskId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
          final int _cursorIndexOfKeyId = CursorUtil.getColumnIndexOrThrow(_cursor, "keyId");
          final int _cursorIndexOfImportance = CursorUtil.getColumnIndexOrThrow(_cursor, "importance");
          final int _cursorIndexOfShortTile = CursorUtil.getColumnIndexOrThrow(_cursor, "shortTile");
          final int _cursorIndexOfText = CursorUtil.getColumnIndexOrThrow(_cursor, "text");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfIsCompleted = CursorUtil.getColumnIndexOrThrow(_cursor, "isCompleted");
          final int _cursorIndexOfSubjId = CursorUtil.getColumnIndexOrThrow(_cursor, "subjId");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final List<MyTask> _result = new ArrayList<MyTask>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final MyTask _item;
            _item = new MyTask();
            final long _tmpTaskId;
            _tmpTaskId = _cursor.getLong(_cursorIndexOfTaskId);
            _item.setTaskId(_tmpTaskId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item.setTitle(_tmpTitle);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            _item.setDescription(_tmpDescription);
            final int _tmpPriority;
            _tmpPriority = _cursor.getInt(_cursorIndexOfPriority);
            _item.setPriority(_tmpPriority);
            _item.keyId = _cursor.getLong(_cursorIndexOfKeyId);
            _item.importance = _cursor.getInt(_cursorIndexOfImportance);
            if (_cursor.isNull(_cursorIndexOfShortTile)) {
              _item.shortTile = null;
            } else {
              _item.shortTile = _cursor.getString(_cursorIndexOfShortTile);
            }
            if (_cursor.isNull(_cursorIndexOfText)) {
              _item.text = null;
            } else {
              _item.text = _cursor.getString(_cursorIndexOfText);
            }
            _item.time = _cursor.getLong(_cursorIndexOfTime);
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsCompleted);
            _item.isCompleted = _tmp != 0;
            _item.subjId = _cursor.getLong(_cursorIndexOfSubjId);
            _item.userId = _cursor.getLong(_cursorIndexOfUserId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<MyTask>> getTasksByPriority(final int priority) {
    final String _sql = "SELECT * FROM MyTask WHERE priority=? ORDER BY importance DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, priority);
    return __db.getInvalidationTracker().createLiveData(new String[] {"MyTask"}, false, new Callable<List<MyTask>>() {
      @Override
      @Nullable
      public List<MyTask> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTaskId = CursorUtil.getColumnIndexOrThrow(_cursor, "taskId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
          final int _cursorIndexOfKeyId = CursorUtil.getColumnIndexOrThrow(_cursor, "keyId");
          final int _cursorIndexOfImportance = CursorUtil.getColumnIndexOrThrow(_cursor, "importance");
          final int _cursorIndexOfShortTile = CursorUtil.getColumnIndexOrThrow(_cursor, "shortTile");
          final int _cursorIndexOfText = CursorUtil.getColumnIndexOrThrow(_cursor, "text");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfIsCompleted = CursorUtil.getColumnIndexOrThrow(_cursor, "isCompleted");
          final int _cursorIndexOfSubjId = CursorUtil.getColumnIndexOrThrow(_cursor, "subjId");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final List<MyTask> _result = new ArrayList<MyTask>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final MyTask _item;
            _item = new MyTask();
            final long _tmpTaskId;
            _tmpTaskId = _cursor.getLong(_cursorIndexOfTaskId);
            _item.setTaskId(_tmpTaskId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item.setTitle(_tmpTitle);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            _item.setDescription(_tmpDescription);
            final int _tmpPriority;
            _tmpPriority = _cursor.getInt(_cursorIndexOfPriority);
            _item.setPriority(_tmpPriority);
            _item.keyId = _cursor.getLong(_cursorIndexOfKeyId);
            _item.importance = _cursor.getInt(_cursorIndexOfImportance);
            if (_cursor.isNull(_cursorIndexOfShortTile)) {
              _item.shortTile = null;
            } else {
              _item.shortTile = _cursor.getString(_cursorIndexOfShortTile);
            }
            if (_cursor.isNull(_cursorIndexOfText)) {
              _item.text = null;
            } else {
              _item.text = _cursor.getString(_cursorIndexOfText);
            }
            _item.time = _cursor.getLong(_cursorIndexOfTime);
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsCompleted);
            _item.isCompleted = _tmp != 0;
            _item.subjId = _cursor.getLong(_cursorIndexOfSubjId);
            _item.userId = _cursor.getLong(_cursorIndexOfUserId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<MyTask>> getTasksByUserIdAndTitle(final long userId, final String title) {
    final String _sql = "SELECT * FROM MyTask WHERE userId=? AND title=? ORDER BY importance DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, userId);
    _argIndex = 2;
    if (title == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, title);
    }
    return __db.getInvalidationTracker().createLiveData(new String[] {"MyTask"}, false, new Callable<List<MyTask>>() {
      @Override
      @Nullable
      public List<MyTask> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTaskId = CursorUtil.getColumnIndexOrThrow(_cursor, "taskId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
          final int _cursorIndexOfKeyId = CursorUtil.getColumnIndexOrThrow(_cursor, "keyId");
          final int _cursorIndexOfImportance = CursorUtil.getColumnIndexOrThrow(_cursor, "importance");
          final int _cursorIndexOfShortTile = CursorUtil.getColumnIndexOrThrow(_cursor, "shortTile");
          final int _cursorIndexOfText = CursorUtil.getColumnIndexOrThrow(_cursor, "text");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfIsCompleted = CursorUtil.getColumnIndexOrThrow(_cursor, "isCompleted");
          final int _cursorIndexOfSubjId = CursorUtil.getColumnIndexOrThrow(_cursor, "subjId");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final List<MyTask> _result = new ArrayList<MyTask>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final MyTask _item;
            _item = new MyTask();
            final long _tmpTaskId;
            _tmpTaskId = _cursor.getLong(_cursorIndexOfTaskId);
            _item.setTaskId(_tmpTaskId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item.setTitle(_tmpTitle);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            _item.setDescription(_tmpDescription);
            final int _tmpPriority;
            _tmpPriority = _cursor.getInt(_cursorIndexOfPriority);
            _item.setPriority(_tmpPriority);
            _item.keyId = _cursor.getLong(_cursorIndexOfKeyId);
            _item.importance = _cursor.getInt(_cursorIndexOfImportance);
            if (_cursor.isNull(_cursorIndexOfShortTile)) {
              _item.shortTile = null;
            } else {
              _item.shortTile = _cursor.getString(_cursorIndexOfShortTile);
            }
            if (_cursor.isNull(_cursorIndexOfText)) {
              _item.text = null;
            } else {
              _item.text = _cursor.getString(_cursorIndexOfText);
            }
            _item.time = _cursor.getLong(_cursorIndexOfTime);
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsCompleted);
            _item.isCompleted = _tmp != 0;
            _item.subjId = _cursor.getLong(_cursorIndexOfSubjId);
            _item.userId = _cursor.getLong(_cursorIndexOfUserId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
