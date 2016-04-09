package com.linkedin.events.example.or_test;

/**
 * Created by zhiwei on 16/4/4.
 */
@SuppressWarnings("all")
public class Person_V2 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"Person_V2\",\"namespace\":\"com.linkedin.events.example.or_test\",\"fields\":[{\"name\":\"txn\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=TXN;dbFieldPosition=0;\"},{\"name\":\"key\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=KEY;dbFieldPosition=1;\"},{\"name\":\"firstName\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=FIRST_NAME;dbFieldPosition=2;\"},{\"name\":\"lastName\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=LAST_NAME;dbFieldPosition=3;\"},{\"name\":\"birthDate\",\"type\":[\"long\",\"null\"],\"meta\":\"dbFieldName=BIRTH_DATE;dbFieldPosition=4;\"},{\"name\":\"deleted\",\"type\":[\"string\",\"null\"],\"meta\":\"dbFieldName=DELETED;dbFieldPosition=5;\"}],\"meta\":\"dbFieldName=sy$person;pk=key;\"}");
    public java.lang.Long txn;
    public java.lang.Long key;
    public java.lang.CharSequence firstName;
    public java.lang.CharSequence lastName;
    public java.lang.Long birthDate;
    public java.lang.CharSequence deleted;
    public org.apache.avro.Schema getSchema() { return SCHEMA$; }
    // Used by DatumWriter.  Applications should not call.
    public java.lang.Object get(int field$) {
        switch (field$) {
            case 0: return txn;
            case 1: return key;
            case 2: return firstName;
            case 3: return lastName;
            case 4: return birthDate;
            case 5: return deleted;
            default: throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }
    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value="unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0: txn = (java.lang.Long)value$; break;
            case 1: key = (java.lang.Long)value$; break;
            case 2: firstName = (java.lang.CharSequence)value$; break;
            case 3: lastName = (java.lang.CharSequence)value$; break;
            case 4: birthDate = (java.lang.Long)value$; break;
            case 5: deleted = (java.lang.CharSequence)value$; break;
            default: throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }
}