/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.22.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.storm.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.22.0)")
public class KillOptions implements org.apache.storm.thrift.TBase<KillOptions, KillOptions._Fields>, java.io.Serializable, Cloneable, Comparable<KillOptions> {
  private static final org.apache.storm.thrift.protocol.TStruct STRUCT_DESC = new org.apache.storm.thrift.protocol.TStruct("KillOptions");

  private static final org.apache.storm.thrift.protocol.TField WAIT_SECS_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("wait_secs", org.apache.storm.thrift.protocol.TType.I32, (short)1);

  private static final org.apache.storm.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new KillOptionsStandardSchemeFactory();
  private static final org.apache.storm.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new KillOptionsTupleSchemeFactory();

  private int wait_secs; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.storm.thrift.TFieldIdEnum {
    WAIT_SECS((short)1, "wait_secs");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.storm.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // WAIT_SECS
          return WAIT_SECS;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.storm.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __WAIT_SECS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields[] optionals = {_Fields.WAIT_SECS};
  public static final java.util.Map<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.WAIT_SECS, new org.apache.storm.thrift.meta_data.FieldMetaData("wait_secs", org.apache.storm.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.storm.thrift.meta_data.FieldValueMetaData(org.apache.storm.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.storm.thrift.meta_data.FieldMetaData.addStructMetaDataMap(KillOptions.class, metaDataMap);
  }

  public KillOptions() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public KillOptions(KillOptions other) {
    __isset_bitfield = other.__isset_bitfield;
    this.wait_secs = other.wait_secs;
  }

  @Override
  public KillOptions deepCopy() {
    return new KillOptions(this);
  }

  @Override
  public void clear() {
    set_wait_secs_isSet(false);
    this.wait_secs = 0;
  }

  public int get_wait_secs() {
    return this.wait_secs;
  }

  public void set_wait_secs(int wait_secs) {
    this.wait_secs = wait_secs;
    set_wait_secs_isSet(true);
  }

  public void unset_wait_secs() {
    __isset_bitfield = org.apache.storm.thrift.EncodingUtils.clearBit(__isset_bitfield, __WAIT_SECS_ISSET_ID);
  }

  /** Returns true if field wait_secs is set (has been assigned a value) and false otherwise */
  public boolean is_set_wait_secs() {
    return org.apache.storm.thrift.EncodingUtils.testBit(__isset_bitfield, __WAIT_SECS_ISSET_ID);
  }

  public void set_wait_secs_isSet(boolean value) {
    __isset_bitfield = org.apache.storm.thrift.EncodingUtils.setBit(__isset_bitfield, __WAIT_SECS_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.storm.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case WAIT_SECS:
      if (value == null) {
        unset_wait_secs();
      } else {
        set_wait_secs((java.lang.Integer)value);
      }
      break;

    }
  }

  @org.apache.storm.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case WAIT_SECS:
      return get_wait_secs();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  @Override
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case WAIT_SECS:
      return is_set_wait_secs();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof KillOptions)
      return this.equals((KillOptions)that);
    return false;
  }

  public boolean equals(KillOptions that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_wait_secs = true && this.is_set_wait_secs();
    boolean that_present_wait_secs = true && that.is_set_wait_secs();
    if (this_present_wait_secs || that_present_wait_secs) {
      if (!(this_present_wait_secs && that_present_wait_secs))
        return false;
      if (this.wait_secs != that.wait_secs)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((is_set_wait_secs()) ? 131071 : 524287);
    if (is_set_wait_secs())
      hashCode = hashCode * 8191 + wait_secs;

    return hashCode;
  }

  @Override
  public int compareTo(KillOptions other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(is_set_wait_secs(), other.is_set_wait_secs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_wait_secs()) {
      lastComparison = org.apache.storm.thrift.TBaseHelper.compareTo(this.wait_secs, other.wait_secs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.storm.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  @Override
  public void read(org.apache.storm.thrift.protocol.TProtocol iprot) throws org.apache.storm.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  @Override
  public void write(org.apache.storm.thrift.protocol.TProtocol oprot) throws org.apache.storm.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("KillOptions(");
    boolean first = true;

    if (is_set_wait_secs()) {
      sb.append("wait_secs:");
      sb.append(this.wait_secs);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.storm.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.storm.thrift.protocol.TCompactProtocol(new org.apache.storm.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.storm.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.storm.thrift.protocol.TCompactProtocol(new org.apache.storm.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.storm.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class KillOptionsStandardSchemeFactory implements org.apache.storm.thrift.scheme.SchemeFactory {
    @Override
    public KillOptionsStandardScheme getScheme() {
      return new KillOptionsStandardScheme();
    }
  }

  private static class KillOptionsStandardScheme extends org.apache.storm.thrift.scheme.StandardScheme<KillOptions> {

    @Override
    public void read(org.apache.storm.thrift.protocol.TProtocol iprot, KillOptions struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.storm.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // WAIT_SECS
            if (schemeField.type == org.apache.storm.thrift.protocol.TType.I32) {
              struct.wait_secs = iprot.readI32();
              struct.set_wait_secs_isSet(true);
            } else { 
              org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    @Override
    public void write(org.apache.storm.thrift.protocol.TProtocol oprot, KillOptions struct) throws org.apache.storm.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.is_set_wait_secs()) {
        oprot.writeFieldBegin(WAIT_SECS_FIELD_DESC);
        oprot.writeI32(struct.wait_secs);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class KillOptionsTupleSchemeFactory implements org.apache.storm.thrift.scheme.SchemeFactory {
    @Override
    public KillOptionsTupleScheme getScheme() {
      return new KillOptionsTupleScheme();
    }
  }

  private static class KillOptionsTupleScheme extends org.apache.storm.thrift.scheme.TupleScheme<KillOptions> {

    @Override
    public void write(org.apache.storm.thrift.protocol.TProtocol prot, KillOptions struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TTupleProtocol oprot = (org.apache.storm.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.is_set_wait_secs()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.is_set_wait_secs()) {
        oprot.writeI32(struct.wait_secs);
      }
    }

    @Override
    public void read(org.apache.storm.thrift.protocol.TProtocol prot, KillOptions struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TTupleProtocol iprot = (org.apache.storm.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.wait_secs = iprot.readI32();
        struct.set_wait_secs_isSet(true);
      }
    }
  }

  private static <S extends org.apache.storm.thrift.scheme.IScheme> S scheme(org.apache.storm.thrift.protocol.TProtocol proto) {
    return (org.apache.storm.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

