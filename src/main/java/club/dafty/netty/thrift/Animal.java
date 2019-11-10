/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package club.dafty.netty.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-11-10")
public class Animal implements org.apache.thrift.TBase<Animal, Animal._Fields>, java.io.Serializable, Cloneable, Comparable<Animal> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Animal");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField LEGS_FIELD_DESC = new org.apache.thrift.protocol.TField("legs", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField EAT_FIELD_DESC = new org.apache.thrift.protocol.TField("eat", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AnimalStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AnimalTupleSchemeFactory();

  public String name; // optional
  public int legs; // optional
  public boolean eat; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    LEGS((short)2, "legs"),
    EAT((short)3, "eat");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NAME
          return NAME;
        case 2: // LEGS
          return LEGS;
        case 3: // EAT
          return EAT;
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
  private static final int __LEGS_ISSET_ID = 0;
  private static final int __EAT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.NAME,_Fields.LEGS,_Fields.EAT};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "String")));
    tmpMap.put(_Fields.LEGS, new org.apache.thrift.meta_data.FieldMetaData("legs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "int")));
    tmpMap.put(_Fields.EAT, new org.apache.thrift.meta_data.FieldMetaData("eat", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL        , "boolean")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Animal.class, metaDataMap);
  }

  public Animal() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Animal(Animal other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.legs = other.legs;
    this.eat = other.eat;
  }

  public Animal deepCopy() {
    return new Animal(this);
  }

  @Override
  public void clear() {
    this.name = null;
    setLegsIsSet(false);
    this.legs = 0;
    setEatIsSet(false);
    this.eat = false;
  }

  public String getName() {
    return this.name;
  }

  public Animal setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public int getLegs() {
    return this.legs;
  }

  public Animal setLegs(int legs) {
    this.legs = legs;
    setLegsIsSet(true);
    return this;
  }

  public void unsetLegs() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LEGS_ISSET_ID);
  }

  /** Returns true if field legs is set (has been assigned a value) and false otherwise */
  public boolean isSetLegs() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LEGS_ISSET_ID);
  }

  public void setLegsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LEGS_ISSET_ID, value);
  }

  public boolean isEat() {
    return this.eat;
  }

  public Animal setEat(boolean eat) {
    this.eat = eat;
    setEatIsSet(true);
    return this;
  }

  public void unsetEat() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __EAT_ISSET_ID);
  }

  /** Returns true if field eat is set (has been assigned a value) and false otherwise */
  public boolean isSetEat() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __EAT_ISSET_ID);
  }

  public void setEatIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __EAT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case LEGS:
      if (value == null) {
        unsetLegs();
      } else {
        setLegs((Integer)value);
      }
      break;

    case EAT:
      if (value == null) {
        unsetEat();
      } else {
        setEat((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case LEGS:
      return getLegs();

    case EAT:
      return isEat();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case LEGS:
      return isSetLegs();
    case EAT:
      return isSetEat();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Animal)
      return this.equals((Animal)that);
    return false;
  }

  public boolean equals(Animal that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_legs = true && this.isSetLegs();
    boolean that_present_legs = true && that.isSetLegs();
    if (this_present_legs || that_present_legs) {
      if (!(this_present_legs && that_present_legs))
        return false;
      if (this.legs != that.legs)
        return false;
    }

    boolean this_present_eat = true && this.isSetEat();
    boolean that_present_eat = true && that.isSetEat();
    if (this_present_eat || that_present_eat) {
      if (!(this_present_eat && that_present_eat))
        return false;
      if (this.eat != that.eat)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetLegs()) ? 131071 : 524287);
    if (isSetLegs())
      hashCode = hashCode * 8191 + legs;

    hashCode = hashCode * 8191 + ((isSetEat()) ? 131071 : 524287);
    if (isSetEat())
      hashCode = hashCode * 8191 + ((eat) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(Animal other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLegs()).compareTo(other.isSetLegs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLegs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.legs, other.legs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEat()).compareTo(other.isSetEat());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEat()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.eat, other.eat);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Animal(");
    boolean first = true;

    if (isSetName()) {
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetLegs()) {
      if (!first) sb.append(", ");
      sb.append("legs:");
      sb.append(this.legs);
      first = false;
    }
    if (isSetEat()) {
      if (!first) sb.append(", ");
      sb.append("eat:");
      sb.append(this.eat);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AnimalStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AnimalStandardScheme getScheme() {
      return new AnimalStandardScheme();
    }
  }

  private static class AnimalStandardScheme extends org.apache.thrift.scheme.StandardScheme<Animal> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Animal struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LEGS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.legs = iprot.readI32();
              struct.setLegsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EAT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.eat = iprot.readBool();
              struct.setEatIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Animal struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetLegs()) {
        oprot.writeFieldBegin(LEGS_FIELD_DESC);
        oprot.writeI32(struct.legs);
        oprot.writeFieldEnd();
      }
      if (struct.isSetEat()) {
        oprot.writeFieldBegin(EAT_FIELD_DESC);
        oprot.writeBool(struct.eat);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AnimalTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AnimalTupleScheme getScheme() {
      return new AnimalTupleScheme();
    }
  }

  private static class AnimalTupleScheme extends org.apache.thrift.scheme.TupleScheme<Animal> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Animal struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetLegs()) {
        optionals.set(1);
      }
      if (struct.isSetEat()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetLegs()) {
        oprot.writeI32(struct.legs);
      }
      if (struct.isSetEat()) {
        oprot.writeBool(struct.eat);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Animal struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.legs = iprot.readI32();
        struct.setLegsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.eat = iprot.readBool();
        struct.setEatIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
