package com.godlike.databus.model;

import org.apache.avro.AvroRuntimeException;
import org.apache.avro.Schema;
import org.apache.avro.specific.SpecificRecord;
import org.apache.avro.specific.SpecificRecordBase;


/**
 * person 对象
 */
@SuppressWarnings("all")
public class Person extends SpecificRecordBase implements SpecificRecord {

    public static final Schema SCHEMA$ = Schema.parse("{\"type\":\"record\",\"name\":\"Person_V1\",\"namespace\":\"com.linkedin.events.example.or_test\",\"fields\":[{\"name\":\"id\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=ID;dbFieldPosition=0;\"},{\"name\":\"firstName\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=FIRST_NAME;dbFieldPosition=1;\"},{\"name\":\"lastName\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=LAST_NAME;dbFieldPosition=2;\"},{\"name\":\"birthDate\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=BIRTH_DATE;dbFieldPosition=3;\"},{\"name\":\"deleted\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=DELETED;dbFieldPosition=4;\"}],\"meta\":\"dbFieldName=person;pk=id;\"}");
    public java.lang.Long txn;
    public java.lang.Long key;
    public java.lang.CharSequence firstName;
    public java.lang.CharSequence lastName;
    public java.lang.Long birthDate;
    public java.lang.CharSequence deleted;
    public Schema getSchema() { return SCHEMA$; }

    // Used by DatumWriter.
    // Applications should not call.
    public java.lang.Object get(int field$) {
        switch (field$) {
            case 0: return txn;
            case 1: return key;
            case 2: return firstName;
            case 3: return lastName;
            case 4: return birthDate;
            case 5: return deleted;
            default: throw new AvroRuntimeException("Bad index");
        }
    }

    // Used by DatumReader.
    // Applications should not call.
    @SuppressWarnings(value="unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0: txn = (java.lang.Long)value$; break;
            case 1: key = (java.lang.Long)value$; break;
            case 2: firstName = (java.lang.CharSequence)value$; break;
            case 3: lastName = (java.lang.CharSequence)value$; break;
            case 4: birthDate = (java.lang.Long)value$; break;
            case 5: deleted = (java.lang.CharSequence)value$; break;
            default: throw new AvroRuntimeException("Bad index");
        }
    }

}
