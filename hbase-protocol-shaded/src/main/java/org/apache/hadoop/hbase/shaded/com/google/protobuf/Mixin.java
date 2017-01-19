// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/api.proto

package org.apache.hadoop.hbase.shaded.com.google.protobuf;

/**
 * <pre>
 * Declares an API to be included in this API. The including API must
 * redeclare all the methods from the included API, but documentation
 * and options are inherited as follows:
 * - If after comment and whitespace stripping, the documentation
 *   string of the redeclared method is empty, it will be inherited
 *   from the original method.
 * - Each annotation belonging to the service config (http,
 *   visibility) which is not set in the redeclared method will be
 *   inherited.
 * - If an http annotation is inherited, the path pattern will be
 *   modified as follows. Any version prefix will be replaced by the
 *   version of the including API plus the [root][] path if specified.
 * Example of a simple mixin:
 *     package google.acl.v1;
 *     service AccessControl {
 *       // Get the underlying ACL object.
 *       rpc GetAcl(GetAclRequest) returns (Acl) {
 *         option (google.api.http).get = "/v1/{resource=**}:getAcl";
 *       }
 *     }
 *     package google.storage.v2;
 *     service Storage {
 *       rpc GetAcl(GetAclRequest) returns (Acl);
 *       // Get a data record.
 *       rpc GetData(GetDataRequest) returns (Data) {
 *         option (google.api.http).get = "/v2/{resource=**}";
 *       }
 *     }
 * Example of a mixin configuration:
 *     apis:
 *     - name: google.storage.v2.Storage
 *       mixins:
 *       - name: google.acl.v1.AccessControl
 * The mixin construct implies that all methods in `AccessControl` are
 * also declared with same name and request/response types in
 * `Storage`. A documentation generator or annotation processor will
 * see the effective `Storage.GetAcl` method after inherting
 * documentation and annotations as follows:
 *     service Storage {
 *       // Get the underlying ACL object.
 *       rpc GetAcl(GetAclRequest) returns (Acl) {
 *         option (google.api.http).get = "/v2/{resource=**}:getAcl";
 *       }
 *       ...
 *     }
 * Note how the version in the path pattern changed from `v1` to `v2`.
 * If the `root` field in the mixin is specified, it should be a
 * relative path under which inherited HTTP paths are placed. Example:
 *     apis:
 *     - name: google.storage.v2.Storage
 *       mixins:
 *       - name: google.acl.v1.AccessControl
 *         root: acls
 * This implies the following inherited HTTP annotation:
 *     service Storage {
 *       // Get the underlying ACL object.
 *       rpc GetAcl(GetAclRequest) returns (Acl) {
 *         option (google.api.http).get = "/v2/acls/{resource=**}:getAcl";
 *       }
 *       ...
 *     }
 * </pre>
 *
 * Protobuf type {@code google.protobuf.Mixin}
 */
public  final class Mixin extends
    org.apache.hadoop.hbase.shaded.com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.protobuf.Mixin)
    MixinOrBuilder {
  // Use Mixin.newBuilder() to construct.
  private Mixin(org.apache.hadoop.hbase.shaded.com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Mixin() {
    name_ = "";
    root_ = "";
  }

  @java.lang.Override
  public final org.apache.hadoop.hbase.shaded.com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return org.apache.hadoop.hbase.shaded.com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Mixin(
      org.apache.hadoop.hbase.shaded.com.google.protobuf.CodedInputStream input,
      org.apache.hadoop.hbase.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.hadoop.hbase.shaded.com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            root_ = s;
            break;
          }
        }
      }
    } catch (org.apache.hadoop.hbase.shaded.com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new org.apache.hadoop.hbase.shaded.com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final org.apache.hadoop.hbase.shaded.com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.hadoop.hbase.shaded.com.google.protobuf.ApiProto.internal_static_google_protobuf_Mixin_descriptor;
  }

  protected org.apache.hadoop.hbase.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.hadoop.hbase.shaded.com.google.protobuf.ApiProto.internal_static_google_protobuf_Mixin_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin.class, org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The fully qualified name of the API which is included.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString bs = 
          (org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The fully qualified name of the API which is included.
   * </pre>
   *
   * <code>optional string name = 1;</code>
   */
  public org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString b = 
          org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROOT_FIELD_NUMBER = 2;
  private volatile java.lang.Object root_;
  /**
   * <pre>
   * If non-empty specifies a path under which inherited HTTP paths
   * are rooted.
   * </pre>
   *
   * <code>optional string root = 2;</code>
   */
  public java.lang.String getRoot() {
    java.lang.Object ref = root_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString bs = 
          (org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      root_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * If non-empty specifies a path under which inherited HTTP paths
   * are rooted.
   * </pre>
   *
   * <code>optional string root = 2;</code>
   */
  public org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString
      getRootBytes() {
    java.lang.Object ref = root_;
    if (ref instanceof java.lang.String) {
      org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString b = 
          org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      root_ = b;
      return b;
    } else {
      return (org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(org.apache.hadoop.hbase.shaded.com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      org.apache.hadoop.hbase.shaded.com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getRootBytes().isEmpty()) {
      org.apache.hadoop.hbase.shaded.com.google.protobuf.GeneratedMessageV3.writeString(output, 2, root_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += org.apache.hadoop.hbase.shaded.com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getRootBytes().isEmpty()) {
      size += org.apache.hadoop.hbase.shaded.com.google.protobuf.GeneratedMessageV3.computeStringSize(2, root_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin)) {
      return super.equals(obj);
    }
    org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin other = (org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && getRoot()
        .equals(other.getRoot());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + ROOT_FIELD_NUMBER;
    hash = (53 * hash) + getRoot().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin parseFrom(
      org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString data)
      throws org.apache.hadoop.hbase.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin parseFrom(
      org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString data,
      org.apache.hadoop.hbase.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.hadoop.hbase.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin parseFrom(byte[] data)
      throws org.apache.hadoop.hbase.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin parseFrom(
      byte[] data,
      org.apache.hadoop.hbase.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.hadoop.hbase.shaded.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return org.apache.hadoop.hbase.shaded.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin parseFrom(
      java.io.InputStream input,
      org.apache.hadoop.hbase.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.hadoop.hbase.shaded.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return org.apache.hadoop.hbase.shaded.com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin parseDelimitedFrom(
      java.io.InputStream input,
      org.apache.hadoop.hbase.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.hadoop.hbase.shaded.com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin parseFrom(
      org.apache.hadoop.hbase.shaded.com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return org.apache.hadoop.hbase.shaded.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin parseFrom(
      org.apache.hadoop.hbase.shaded.com.google.protobuf.CodedInputStream input,
      org.apache.hadoop.hbase.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.hadoop.hbase.shaded.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      org.apache.hadoop.hbase.shaded.com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Declares an API to be included in this API. The including API must
   * redeclare all the methods from the included API, but documentation
   * and options are inherited as follows:
   * - If after comment and whitespace stripping, the documentation
   *   string of the redeclared method is empty, it will be inherited
   *   from the original method.
   * - Each annotation belonging to the service config (http,
   *   visibility) which is not set in the redeclared method will be
   *   inherited.
   * - If an http annotation is inherited, the path pattern will be
   *   modified as follows. Any version prefix will be replaced by the
   *   version of the including API plus the [root][] path if specified.
   * Example of a simple mixin:
   *     package google.acl.v1;
   *     service AccessControl {
   *       // Get the underlying ACL object.
   *       rpc GetAcl(GetAclRequest) returns (Acl) {
   *         option (google.api.http).get = "/v1/{resource=**}:getAcl";
   *       }
   *     }
   *     package google.storage.v2;
   *     service Storage {
   *       rpc GetAcl(GetAclRequest) returns (Acl);
   *       // Get a data record.
   *       rpc GetData(GetDataRequest) returns (Data) {
   *         option (google.api.http).get = "/v2/{resource=**}";
   *       }
   *     }
   * Example of a mixin configuration:
   *     apis:
   *     - name: google.storage.v2.Storage
   *       mixins:
   *       - name: google.acl.v1.AccessControl
   * The mixin construct implies that all methods in `AccessControl` are
   * also declared with same name and request/response types in
   * `Storage`. A documentation generator or annotation processor will
   * see the effective `Storage.GetAcl` method after inherting
   * documentation and annotations as follows:
   *     service Storage {
   *       // Get the underlying ACL object.
   *       rpc GetAcl(GetAclRequest) returns (Acl) {
   *         option (google.api.http).get = "/v2/{resource=**}:getAcl";
   *       }
   *       ...
   *     }
   * Note how the version in the path pattern changed from `v1` to `v2`.
   * If the `root` field in the mixin is specified, it should be a
   * relative path under which inherited HTTP paths are placed. Example:
   *     apis:
   *     - name: google.storage.v2.Storage
   *       mixins:
   *       - name: google.acl.v1.AccessControl
   *         root: acls
   * This implies the following inherited HTTP annotation:
   *     service Storage {
   *       // Get the underlying ACL object.
   *       rpc GetAcl(GetAclRequest) returns (Acl) {
   *         option (google.api.http).get = "/v2/acls/{resource=**}:getAcl";
   *       }
   *       ...
   *     }
   * </pre>
   *
   * Protobuf type {@code google.protobuf.Mixin}
   */
  public static final class Builder extends
      org.apache.hadoop.hbase.shaded.com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.protobuf.Mixin)
      org.apache.hadoop.hbase.shaded.com.google.protobuf.MixinOrBuilder {
    public static final org.apache.hadoop.hbase.shaded.com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hbase.shaded.com.google.protobuf.ApiProto.internal_static_google_protobuf_Mixin_descriptor;
    }

    protected org.apache.hadoop.hbase.shaded.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hbase.shaded.com.google.protobuf.ApiProto.internal_static_google_protobuf_Mixin_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin.class, org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin.Builder.class);
    }

    // Construct using org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        org.apache.hadoop.hbase.shaded.com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (org.apache.hadoop.hbase.shaded.com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      name_ = "";

      root_ = "";

      return this;
    }

    public org.apache.hadoop.hbase.shaded.com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.hadoop.hbase.shaded.com.google.protobuf.ApiProto.internal_static_google_protobuf_Mixin_descriptor;
    }

    public org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin getDefaultInstanceForType() {
      return org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin.getDefaultInstance();
    }

    public org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin build() {
      org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin buildPartial() {
      org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin result = new org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin(this);
      result.name_ = name_;
      result.root_ = root_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        org.apache.hadoop.hbase.shaded.com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        org.apache.hadoop.hbase.shaded.com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        org.apache.hadoop.hbase.shaded.com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        org.apache.hadoop.hbase.shaded.com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        org.apache.hadoop.hbase.shaded.com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(org.apache.hadoop.hbase.shaded.com.google.protobuf.Message other) {
      if (other instanceof org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin) {
        return mergeFrom((org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin other) {
      if (other == org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getRoot().isEmpty()) {
        root_ = other.root_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        org.apache.hadoop.hbase.shaded.com.google.protobuf.CodedInputStream input,
        org.apache.hadoop.hbase.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (org.apache.hadoop.hbase.shaded.com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The fully qualified name of the API which is included.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString bs =
            (org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The fully qualified name of the API which is included.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString b = 
            org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The fully qualified name of the API which is included.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fully qualified name of the API which is included.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fully qualified name of the API which is included.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public Builder setNameBytes(
        org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object root_ = "";
    /**
     * <pre>
     * If non-empty specifies a path under which inherited HTTP paths
     * are rooted.
     * </pre>
     *
     * <code>optional string root = 2;</code>
     */
    public java.lang.String getRoot() {
      java.lang.Object ref = root_;
      if (!(ref instanceof java.lang.String)) {
        org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString bs =
            (org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        root_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * If non-empty specifies a path under which inherited HTTP paths
     * are rooted.
     * </pre>
     *
     * <code>optional string root = 2;</code>
     */
    public org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString
        getRootBytes() {
      java.lang.Object ref = root_;
      if (ref instanceof String) {
        org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString b = 
            org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        root_ = b;
        return b;
      } else {
        return (org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * If non-empty specifies a path under which inherited HTTP paths
     * are rooted.
     * </pre>
     *
     * <code>optional string root = 2;</code>
     */
    public Builder setRoot(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      root_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If non-empty specifies a path under which inherited HTTP paths
     * are rooted.
     * </pre>
     *
     * <code>optional string root = 2;</code>
     */
    public Builder clearRoot() {
      
      root_ = getDefaultInstance().getRoot();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If non-empty specifies a path under which inherited HTTP paths
     * are rooted.
     * </pre>
     *
     * <code>optional string root = 2;</code>
     */
    public Builder setRootBytes(
        org.apache.hadoop.hbase.shaded.com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      root_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final org.apache.hadoop.hbase.shaded.com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final org.apache.hadoop.hbase.shaded.com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.protobuf.Mixin)
  }

  // @@protoc_insertion_point(class_scope:google.protobuf.Mixin)
  private static final org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin();
  }

  public static org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final org.apache.hadoop.hbase.shaded.com.google.protobuf.Parser<Mixin>
      PARSER = new org.apache.hadoop.hbase.shaded.com.google.protobuf.AbstractParser<Mixin>() {
    public Mixin parsePartialFrom(
        org.apache.hadoop.hbase.shaded.com.google.protobuf.CodedInputStream input,
        org.apache.hadoop.hbase.shaded.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hadoop.hbase.shaded.com.google.protobuf.InvalidProtocolBufferException {
        return new Mixin(input, extensionRegistry);
    }
  };

  public static org.apache.hadoop.hbase.shaded.com.google.protobuf.Parser<Mixin> parser() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.hadoop.hbase.shaded.com.google.protobuf.Parser<Mixin> getParserForType() {
    return PARSER;
  }

  public org.apache.hadoop.hbase.shaded.com.google.protobuf.Mixin getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
