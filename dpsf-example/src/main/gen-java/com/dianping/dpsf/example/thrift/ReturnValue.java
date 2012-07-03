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

public class ReturnValue implements TBase<ReturnValue, ReturnValue._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ReturnValue");

  private static final TField MONEY_FIELD_DESC = new TField("money", TType.I32, (short)1);

  public int money;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    MONEY((short)1, "money");

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
        case 1: // MONEY
          return MONEY;
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
  private static final int __MONEY_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MONEY, new FieldMetaData("money", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(ReturnValue.class, metaDataMap);
  }

  public ReturnValue() {
  }

  public ReturnValue(
    int money)
  {
    this();
    this.money = money;
    setMoneyIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ReturnValue(ReturnValue other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.money = other.money;
  }

  public ReturnValue deepCopy() {
    return new ReturnValue(this);
  }

  @Deprecated
  public ReturnValue clone() {
    return new ReturnValue(this);
  }

  @Override
  public void clear() {
    setMoneyIsSet(false);
    this.money = 0;
  }

  public int getMoney() {
    return this.money;
  }

  public ReturnValue setMoney(int money) {
    this.money = money;
    setMoneyIsSet(true);
    return this;
  }

  public void unsetMoney() {
    __isset_bit_vector.clear(__MONEY_ISSET_ID);
  }

  /** Returns true if field money is set (has been asigned a value) and false otherwise */
  public boolean isSetMoney() {
    return __isset_bit_vector.get(__MONEY_ISSET_ID);
  }

  public void setMoneyIsSet(boolean value) {
    __isset_bit_vector.set(__MONEY_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MONEY:
      if (value == null) {
        unsetMoney();
      } else {
        setMoney((Integer)value);
      }
      break;

    }
  }

  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MONEY:
      return new Integer(getMoney());

    }
    throw new IllegalStateException();
  }

  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case MONEY:
      return isSetMoney();
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
    if (that instanceof ReturnValue)
      return this.equals((ReturnValue)that);
    return false;
  }

  public boolean equals(ReturnValue that) {
    if (that == null)
      return false;

    boolean this_present_money = true;
    boolean that_present_money = true;
    if (this_present_money || that_present_money) {
      if (!(this_present_money && that_present_money))
        return false;
      if (this.money != that.money)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ReturnValue other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ReturnValue typedOther = (ReturnValue)other;

    lastComparison = Boolean.valueOf(isSetMoney()).compareTo(typedOther.isSetMoney());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMoney()) {      lastComparison = TBaseHelper.compareTo(this.money, typedOther.money);
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
        case 1: // MONEY
          if (field.type == TType.I32) {
            this.money = iprot.readI32();
            setMoneyIsSet(true);
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
    oprot.writeFieldBegin(MONEY_FIELD_DESC);
    oprot.writeI32(this.money);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ReturnValue(");
    boolean first = true;

    sb.append("money:");
    sb.append(this.money);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

