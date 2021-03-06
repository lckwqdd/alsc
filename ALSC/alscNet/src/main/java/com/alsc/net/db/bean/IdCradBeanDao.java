package com.alsc.net.db.bean;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "ID_CRAD_BEAN".
*/
public class IdCradBeanDao extends AbstractDao<IdCradBean, Long> {

    public static final String TABLENAME = "ID_CRAD_BEAN";

    /**
     * Properties of entity IdCradBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Sex = new Property(2, String.class, "sex", false, "SEX");
        public final static Property Nation = new Property(3, String.class, "nation", false, "NATION");
        public final static Property Birth = new Property(4, String.class, "birth", false, "BIRTH");
        public final static Property Address = new Property(5, String.class, "address", false, "ADDRESS");
        public final static Property IdNumber = new Property(6, String.class, "idNumber", false, "ID_NUMBER");
        public final static Property Depart = new Property(7, String.class, "depart", false, "DEPART");
        public final static Property Photo = new Property(8, byte[].class, "photo", false, "PHOTO");
        public final static Property ValidityTime = new Property(9, String.class, "validityTime", false, "VALIDITY_TIME");
    }


    public IdCradBeanDao(DaoConfig config) {
        super(config);
    }
    
    public IdCradBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ID_CRAD_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"NAME\" TEXT," + // 1: name
                "\"SEX\" TEXT," + // 2: sex
                "\"NATION\" TEXT," + // 3: nation
                "\"BIRTH\" TEXT," + // 4: birth
                "\"ADDRESS\" TEXT," + // 5: address
                "\"ID_NUMBER\" TEXT," + // 6: idNumber
                "\"DEPART\" TEXT," + // 7: depart
                "\"PHOTO\" BLOB," + // 8: photo
                "\"VALIDITY_TIME\" TEXT);"); // 9: validityTime
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ID_CRAD_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, IdCradBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String sex = entity.getSex();
        if (sex != null) {
            stmt.bindString(3, sex);
        }
 
        String nation = entity.getNation();
        if (nation != null) {
            stmt.bindString(4, nation);
        }
 
        String birth = entity.getBirth();
        if (birth != null) {
            stmt.bindString(5, birth);
        }
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(6, address);
        }
 
        String idNumber = entity.getIdNumber();
        if (idNumber != null) {
            stmt.bindString(7, idNumber);
        }
 
        String depart = entity.getDepart();
        if (depart != null) {
            stmt.bindString(8, depart);
        }
 
        byte[] photo = entity.getPhoto();
        if (photo != null) {
            stmt.bindBlob(9, photo);
        }
 
        String validityTime = entity.getValidityTime();
        if (validityTime != null) {
            stmt.bindString(10, validityTime);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, IdCradBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String sex = entity.getSex();
        if (sex != null) {
            stmt.bindString(3, sex);
        }
 
        String nation = entity.getNation();
        if (nation != null) {
            stmt.bindString(4, nation);
        }
 
        String birth = entity.getBirth();
        if (birth != null) {
            stmt.bindString(5, birth);
        }
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(6, address);
        }
 
        String idNumber = entity.getIdNumber();
        if (idNumber != null) {
            stmt.bindString(7, idNumber);
        }
 
        String depart = entity.getDepart();
        if (depart != null) {
            stmt.bindString(8, depart);
        }
 
        byte[] photo = entity.getPhoto();
        if (photo != null) {
            stmt.bindBlob(9, photo);
        }
 
        String validityTime = entity.getValidityTime();
        if (validityTime != null) {
            stmt.bindString(10, validityTime);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public IdCradBean readEntity(Cursor cursor, int offset) {
        IdCradBean entity = new IdCradBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // sex
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // nation
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // birth
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // address
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // idNumber
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // depart
            cursor.isNull(offset + 8) ? null : cursor.getBlob(offset + 8), // photo
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9) // validityTime
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, IdCradBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setSex(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setNation(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setBirth(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setAddress(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setIdNumber(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setDepart(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setPhoto(cursor.isNull(offset + 8) ? null : cursor.getBlob(offset + 8));
        entity.setValidityTime(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(IdCradBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(IdCradBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(IdCradBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
