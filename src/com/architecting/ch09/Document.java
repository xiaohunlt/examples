/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.architecting.ch09;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Document extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Document\",\"namespace\":\"com.architecting.ch11\",\"fields\":[{\"name\":\"sin\",\"type\":\"long\"},{\"name\":\"firstName\",\"type\":\"string\"},{\"name\":\"lastName\",\"type\":\"string\"},{\"name\":\"comment\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public long sin;
  @Deprecated public java.lang.CharSequence firstName;
  @Deprecated public java.lang.CharSequence lastName;
  @Deprecated public java.lang.CharSequence comment;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Document() {}

  /**
   * All-args constructor.
   */
  public Document(java.lang.Long sin, java.lang.CharSequence firstName, java.lang.CharSequence lastName, java.lang.CharSequence comment) {
    this.sin = sin;
    this.firstName = firstName;
    this.lastName = lastName;
    this.comment = comment;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return sin;
    case 1: return firstName;
    case 2: return lastName;
    case 3: return comment;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: sin = (java.lang.Long)value$; break;
    case 1: firstName = (java.lang.CharSequence)value$; break;
    case 2: lastName = (java.lang.CharSequence)value$; break;
    case 3: comment = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'sin' field.
   */
  public java.lang.Long getSin() {
    return sin;
  }

  /**
   * Sets the value of the 'sin' field.
   * @param value the value to set.
   */
  public void setSin(java.lang.Long value) {
    this.sin = value;
  }

  /**
   * Gets the value of the 'firstName' field.
   */
  public java.lang.CharSequence getFirstName() {
    return firstName;
  }

  /**
   * Sets the value of the 'firstName' field.
   * @param value the value to set.
   */
  public void setFirstName(java.lang.CharSequence value) {
    this.firstName = value;
  }

  /**
   * Gets the value of the 'lastName' field.
   */
  public java.lang.CharSequence getLastName() {
    return lastName;
  }

  /**
   * Sets the value of the 'lastName' field.
   * @param value the value to set.
   */
  public void setLastName(java.lang.CharSequence value) {
    this.lastName = value;
  }

  /**
   * Gets the value of the 'comment' field.
   */
  public java.lang.CharSequence getComment() {
    return comment;
  }

  /**
   * Sets the value of the 'comment' field.
   * @param value the value to set.
   */
  public void setComment(java.lang.CharSequence value) {
    this.comment = value;
  }

  /** Creates a new Document RecordBuilder */
  public static com.architecting.ch09.Document.Builder newBuilder() {
    return new com.architecting.ch09.Document.Builder();
  }
  
  /** Creates a new Document RecordBuilder by copying an existing Builder */
  public static com.architecting.ch09.Document.Builder newBuilder(com.architecting.ch09.Document.Builder other) {
    return new com.architecting.ch09.Document.Builder(other);
  }
  
  /** Creates a new Document RecordBuilder by copying an existing Document instance */
  public static com.architecting.ch09.Document.Builder newBuilder(com.architecting.ch09.Document other) {
    return new com.architecting.ch09.Document.Builder(other);
  }
  
  /**
   * RecordBuilder for Document instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Document>
    implements org.apache.avro.data.RecordBuilder<Document> {

    private long sin;
    private java.lang.CharSequence firstName;
    private java.lang.CharSequence lastName;
    private java.lang.CharSequence comment;

    /** Creates a new Builder */
    private Builder() {
      super(com.architecting.ch09.Document.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.architecting.ch09.Document.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.sin)) {
        this.sin = data().deepCopy(fields()[0].schema(), other.sin);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.firstName)) {
        this.firstName = data().deepCopy(fields()[1].schema(), other.firstName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.lastName)) {
        this.lastName = data().deepCopy(fields()[2].schema(), other.lastName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.comment)) {
        this.comment = data().deepCopy(fields()[3].schema(), other.comment);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Document instance */
    private Builder(com.architecting.ch09.Document other) {
            super(com.architecting.ch09.Document.SCHEMA$);
      if (isValidValue(fields()[0], other.sin)) {
        this.sin = data().deepCopy(fields()[0].schema(), other.sin);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.firstName)) {
        this.firstName = data().deepCopy(fields()[1].schema(), other.firstName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.lastName)) {
        this.lastName = data().deepCopy(fields()[2].schema(), other.lastName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.comment)) {
        this.comment = data().deepCopy(fields()[3].schema(), other.comment);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'sin' field */
    public java.lang.Long getSin() {
      return sin;
    }
    
    /** Sets the value of the 'sin' field */
    public com.architecting.ch09.Document.Builder setSin(long value) {
      validate(fields()[0], value);
      this.sin = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'sin' field has been set */
    public boolean hasSin() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'sin' field */
    public com.architecting.ch09.Document.Builder clearSin() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'firstName' field */
    public java.lang.CharSequence getFirstName() {
      return firstName;
    }
    
    /** Sets the value of the 'firstName' field */
    public com.architecting.ch09.Document.Builder setFirstName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.firstName = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'firstName' field has been set */
    public boolean hasFirstName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'firstName' field */
    public com.architecting.ch09.Document.Builder clearFirstName() {
      firstName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'lastName' field */
    public java.lang.CharSequence getLastName() {
      return lastName;
    }
    
    /** Sets the value of the 'lastName' field */
    public com.architecting.ch09.Document.Builder setLastName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.lastName = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'lastName' field has been set */
    public boolean hasLastName() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'lastName' field */
    public com.architecting.ch09.Document.Builder clearLastName() {
      lastName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'comment' field */
    public java.lang.CharSequence getComment() {
      return comment;
    }
    
    /** Sets the value of the 'comment' field */
    public com.architecting.ch09.Document.Builder setComment(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.comment = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'comment' field has been set */
    public boolean hasComment() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'comment' field */
    public com.architecting.ch09.Document.Builder clearComment() {
      comment = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Document build() {
      try {
        Document record = new Document();
        record.sin = fieldSetFlags()[0] ? this.sin : (java.lang.Long) defaultValue(fields()[0]);
        record.firstName = fieldSetFlags()[1] ? this.firstName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.lastName = fieldSetFlags()[2] ? this.lastName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.comment = fieldSetFlags()[3] ? this.comment : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}