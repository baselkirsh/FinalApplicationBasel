package basel.kersh.finalapplicationbasel.data.mySubjectTable;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class MySubjectQuery_Impl implements MySubjectQuery {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MySubject> __insertionAdapterOfMySubject;

  private final EntityDeletionOrUpdateAdapter<MySubject> __deletionAdapterOfMySubject;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public MySubjectQuery_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMySubject = new EntityInsertionAdapter<MySubject>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `MySubject` (`key_id`,`title`) VALUES (nullif(?, 0),?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement, final MySubject entity) {
        statement.bindLong(1, entity.key_id);
        if (entity.title == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.title);
        }
      }
    };
    this.__deletionAdapterOfMySubject = new EntityDeletionOrUpdateAdapter<MySubject>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `MySubject` WHERE `key_id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement, final MySubject entity) {
        statement.bindLong(1, entity.key_id);
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM MySubject WHERE key_id=?";
        return _query;
      }
    };
  }

  @Override
  public void insert(final MySubject... s) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMySubject.insert(s);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteTask(final MySubject... s) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfMySubject.handleMultiple(s);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final long keyid) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, keyid);
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDelete.release(_stmt);
    }
  }

  @Override
  public List<MySubject> getAllSubjects() {
    final String _sql = "SELECT * FROM MySubject";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfKeyId = CursorUtil.getColumnIndexOrThrow(_cursor, "key_id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final List<MySubject> _result = new ArrayList<MySubject>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final MySubject _item;
        _item = new MySubject();
        _item.key_id = _cursor.getLong(_cursorIndexOfKeyId);
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _item.title = null;
        } else {
          _item.title = _cursor.getString(_cursorIndexOfTitle);
        }
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public MySubject checkSubject(final String sub) {
    final String _sql = "SELECT * From MySubject WHERE title=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (sub == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, sub);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfKeyId = CursorUtil.getColumnIndexOrThrow(_cursor, "key_id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final MySubject _result;
      if (_cursor.moveToFirst()) {
        _result = new MySubject();
        _result.key_id = _cursor.getLong(_cursorIndexOfKeyId);
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _result.title = null;
        } else {
          _result.title = _cursor.getString(_cursorIndexOfTitle);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
