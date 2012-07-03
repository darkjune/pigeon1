/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.dianping.dpsf.example.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class InvalidOperation extends Exception implements TBase<InvalidOperation, InvalidOperation._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("InvalidOperation");

  private static final TField WHAT_FIELD_DESC = new TField("what", TType.I32, (short)1);
  private static final TField WHY_FIELD_DESC = new TField("why", TType.STRING, (short)2);

  public int what;
  public String why;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    WHAT((short)1, "what"),
    WHY((short)2, "why");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // WHAT
          return WHAT;
        case 2: // WHY
          return WHY;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __WHAT_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.WHAT, new FieldMetaData("what", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.WHY, new FieldMetaData("why", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(InvalidOperation.class, metaDataMap);
  }

  public InvalidOperation() {
  }

  public InvalidOperation(
    int what,
    String why)
  {
    this();
    this.what = what;
    setWhatIsSet(true);
    this.why = why;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public InvalidOperation(InvalidOperation other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.what = other.what;
    if (other.isSetWhy()) {
      this.why = other.why;
    }
  }

  public InvalidOperation deepCopy() {
    return new InvalidOperation(this);
  }

  @Deprecated
  public InvalidOperation clone() {
    return new InvalidOperation(this);
  }

  public void clear() {
    setWhatIsSet(false);
    this.what = 0;
    this.why = null;
  }

  public int getWhat() {
    return this.what;
  }

  public InvalidOperation setWhat(int what) {
    this.what = what;
    setWhatIsSet(true);
    return this;
  }

  public void unsetWhat() {
    __isset_bit_vector.clear(__WHAT_ISSET_ID);
  }

  /** Returns true if field what is set (has been asigned a value) and false otherwise */
  public boolean isSetWhat() {
    return __isset_bit_vector.get(__WHAT_ISSET_ID);
  }

  public void setWhatIsSet(boolean value) {
    __isset_bit_vector.set(__WHAT_ISSET_ID, value);
  }

  public String getWhy() {
    return this.why;
  }

  public InvalidOperation setWhy(String why) {
    this.why = why;
    return this;
  }

  public void unsetWhy() {
    this.why = null;
  }

  /** Returns true if field why is set (has been asigned a value) and false otherwise */
  public boolean isSetWhy() {
    return this.why != null;
  }

  public void setWhyIsSet(boolean value) {
    if (!value) {
      this.why = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case WHAT:
      if (value == null) {
        unsetWhat();
      } else {
        setWhat((Integer)value);
      }
      break;

    case WHY:
      if (value == null) {
        unsetWhy();
      } else {
        setWhy((String)value);
      }
      break;

    }
  }

  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case WHAT:
      return new Integer(getWhat());

    case WHY:
      return getWhy();

    }
    throw new IllegalStateException();
  }

  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case WHAT:
      return isSetWhat();
    case WHY:
      return isSetWhy();
    }
    throw new IllegalStateException();
  }

  public boolean isSet(int fieldID) {
    return isSet(_Fields.findByThriftIdOrThrow(fieldID));
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof InvalidOperation)
      return this.equals((InvalidOperation)that);
    return false;
  }

  public boolean equals(InvalidOperation that) {
    if (that == null)
      return false;

    boolean this_present_what = true;
    boolean that_present_what = true;
    if (this_present_what || that_present_what) {
      if (!(this_present_what && that_present_what))
        return false;
      if (this.what != that.what)
        return false;
    }

    boolean this_present_why = true && this.isSetWhy();
    boolean that_present_why = true && that.isSetWhy();
    if (this_present_why || that_present_why) {
      if (!(this_present_why && that_present_why))
        return false;
      if (!this.why.equals(that.why))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(InvalidOperation other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    InvalidOperation typedOther = (InvalidOperation)other;

    lastComparison = Boolean.valueOf(isSetWhat()).compareTo(typedOther.isSetWhat());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWhat()) {      lastComparison = TBaseHelper.compareTo(this.what, typedOther.what);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWhy()).compareTo(typedOther.isSetWhy());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWhy()) {      lastComparison = TBaseHelper.compareTo(this.why, typedOther.why);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // WHAT
          if (field.type == TType.I32) {
            this.what = iprot.readI32();
            setWhatIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // WHY
          if (field.type == TType.STRING) {
            this.why = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(WHAT_FIELD_DESC);
    oprot.writeI32(this.what);
    oprot.writeFieldEnd();
    if (this.why != null) {
      oprot.writeFieldBegin(WHY_FIELD_DESC);
      oprot.writeString(this.why);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("InvalidOperation(");
    boolean first = true;

    sb.append("what:");
    sb.append(this.what);
    first = false;
    if (!first) sb.append(", ");
    sb.append("why:");
    if (this.why == null) {
      sb.append("null");
    } else {
      sb.append(this.why);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

