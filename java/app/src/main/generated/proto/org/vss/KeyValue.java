// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vss.proto

package org.vss;

/**
 * <pre>
 * Represents a key-value pair to be stored or retrieved.
 * </pre>
 * <p>
 * Protobuf type {@code vss.KeyValue}
 */
public final class KeyValue extends
		com.google.protobuf.GeneratedMessageV3 implements
		// @@protoc_insertion_point(message_implements:vss.KeyValue)
		KeyValueOrBuilder {
	private static final long serialVersionUID = 0L;

	// Use KeyValue.newBuilder() to construct.
	private KeyValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
		super(builder);
	}

	private KeyValue() {
		key_ = "";
		value_ = com.google.protobuf.ByteString.EMPTY;
	}

	@java.lang.Override
	@SuppressWarnings({"unused"})
	protected java.lang.Object newInstance(
			UnusedPrivateParameter unused) {
		return new KeyValue();
	}

	@java.lang.Override
	public final com.google.protobuf.UnknownFieldSet
	getUnknownFields() {
		return this.unknownFields;
	}

	public static final com.google.protobuf.Descriptors.Descriptor
	getDescriptor() {
		return org.vss.Vss.internal_static_vss_KeyValue_descriptor;
	}

	@java.lang.Override
	protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
	internalGetFieldAccessorTable() {
		return org.vss.Vss.internal_static_vss_KeyValue_fieldAccessorTable
				.ensureFieldAccessorsInitialized(
						org.vss.KeyValue.class, org.vss.KeyValue.Builder.class);
	}

	public static final int KEY_FIELD_NUMBER = 1;
	private volatile java.lang.Object key_;

	/**
	 * <pre>
	 * Key against which the value is stored.
	 * </pre>
	 *
	 * <code>string key = 1;</code>
	 *
	 * @return The key.
	 */
	@java.lang.Override
	public java.lang.String getKey() {
		java.lang.Object ref = key_;
		if (ref instanceof java.lang.String) {
			return (java.lang.String) ref;
		} else {
			com.google.protobuf.ByteString bs =
					(com.google.protobuf.ByteString) ref;
			java.lang.String s = bs.toStringUtf8();
			key_ = s;
			return s;
		}
	}

	/**
	 * <pre>
	 * Key against which the value is stored.
	 * </pre>
	 *
	 * <code>string key = 1;</code>
	 *
	 * @return The bytes for key.
	 */
	@java.lang.Override
	public com.google.protobuf.ByteString
	getKeyBytes() {
		java.lang.Object ref = key_;
		if (ref instanceof java.lang.String) {
			com.google.protobuf.ByteString b =
					com.google.protobuf.ByteString.copyFromUtf8(
							(java.lang.String) ref);
			key_ = b;
			return b;
		} else {
			return (com.google.protobuf.ByteString) ref;
		}
	}

	public static final int VERSION_FIELD_NUMBER = 2;
	private long version_;

	/**
	 * <pre>
	 * Version field is used for key-level versioning.
	 * For first write of key, `version` should be '0'. If the write succeeds, clients must increment
	 * their corresponding key version (client-side) by 1.
	 * The server increments key version (server-side) for every successful write, hence this
	 * client-side increment is required to ensure matching versions. These updated key versions should
	 * be used in subsequent `PutObjectRequest`s for the keys.
	 * </pre>
	 *
	 * <code>int64 version = 2;</code>
	 *
	 * @return The version.
	 */
	@java.lang.Override
	public long getVersion() {
		return version_;
	}

	public static final int VALUE_FIELD_NUMBER = 3;
	private com.google.protobuf.ByteString value_;

	/**
	 * <pre>
	 * Object value in bytes which is stored (in put) and fetched (in get).
	 * Clients must encrypt the secret contents of this blob client-side before sending it over the
	 * wire to the server in order to preserve privacy and security.
	 * Clients may use a `Storable` object, serialize it and set it here.
	 * </pre>
	 *
	 * <code>bytes value = 3;</code>
	 *
	 * @return The value.
	 */
	@java.lang.Override
	public com.google.protobuf.ByteString getValue() {
		return value_;
	}

	private byte memoizedIsInitialized = -1;

	@java.lang.Override
	public final boolean isInitialized() {
		byte isInitialized = memoizedIsInitialized;
		if (isInitialized == 1) return true;
		if (isInitialized == 0) return false;

		memoizedIsInitialized = 1;
		return true;
	}

	@java.lang.Override
	public void writeTo(com.google.protobuf.CodedOutputStream output)
			throws java.io.IOException {
		if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
			com.google.protobuf.GeneratedMessageV3.writeString(output, 1, key_);
		}
		if (version_ != 0L) {
			output.writeInt64(2, version_);
		}
		if (!value_.isEmpty()) {
			output.writeBytes(3, value_);
		}
		getUnknownFields().writeTo(output);
	}

	@java.lang.Override
	public int getSerializedSize() {
		int size = memoizedSize;
		if (size != -1) return size;

		size = 0;
		if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
			size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, key_);
		}
		if (version_ != 0L) {
			size += com.google.protobuf.CodedOutputStream
					.computeInt64Size(2, version_);
		}
		if (!value_.isEmpty()) {
			size += com.google.protobuf.CodedOutputStream
					.computeBytesSize(3, value_);
		}
		size += getUnknownFields().getSerializedSize();
		memoizedSize = size;
		return size;
	}

	@java.lang.Override
	public boolean equals(final java.lang.Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof org.vss.KeyValue)) {
			return super.equals(obj);
		}
		org.vss.KeyValue other = (org.vss.KeyValue) obj;

		if (!getKey()
				.equals(other.getKey())) return false;
		if (getVersion()
				!= other.getVersion()) return false;
		if (!getValue()
				.equals(other.getValue())) return false;
		if (!getUnknownFields().equals(other.getUnknownFields())) return false;
		return true;
	}

	@java.lang.Override
	public int hashCode() {
		if (memoizedHashCode != 0) {
			return memoizedHashCode;
		}
		int hash = 41;
		hash = (19 * hash) + getDescriptor().hashCode();
		hash = (37 * hash) + KEY_FIELD_NUMBER;
		hash = (53 * hash) + getKey().hashCode();
		hash = (37 * hash) + VERSION_FIELD_NUMBER;
		hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
				getVersion());
		hash = (37 * hash) + VALUE_FIELD_NUMBER;
		hash = (53 * hash) + getValue().hashCode();
		hash = (29 * hash) + getUnknownFields().hashCode();
		memoizedHashCode = hash;
		return hash;
	}

	public static org.vss.KeyValue parseFrom(
			java.nio.ByteBuffer data)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static org.vss.KeyValue parseFrom(
			java.nio.ByteBuffer data,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static org.vss.KeyValue parseFrom(
			com.google.protobuf.ByteString data)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static org.vss.KeyValue parseFrom(
			com.google.protobuf.ByteString data,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static org.vss.KeyValue parseFrom(byte[] data)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static org.vss.KeyValue parseFrom(
			byte[] data,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static org.vss.KeyValue parseFrom(java.io.InputStream input)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3
				.parseWithIOException(PARSER, input);
	}

	public static org.vss.KeyValue parseFrom(
			java.io.InputStream input,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3
				.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static org.vss.KeyValue parseDelimitedFrom(java.io.InputStream input)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3
				.parseDelimitedWithIOException(PARSER, input);
	}

	public static org.vss.KeyValue parseDelimitedFrom(
			java.io.InputStream input,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3
				.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
	}

	public static org.vss.KeyValue parseFrom(
			com.google.protobuf.CodedInputStream input)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3
				.parseWithIOException(PARSER, input);
	}

	public static org.vss.KeyValue parseFrom(
			com.google.protobuf.CodedInputStream input,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3
				.parseWithIOException(PARSER, input, extensionRegistry);
	}

	@java.lang.Override
	public Builder newBuilderForType() {
		return newBuilder();
	}

	public static Builder newBuilder() {
		return DEFAULT_INSTANCE.toBuilder();
	}

	public static Builder newBuilder(org.vss.KeyValue prototype) {
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
	}

	@java.lang.Override
	public Builder toBuilder() {
		return this == DEFAULT_INSTANCE
				? new Builder() : new Builder().mergeFrom(this);
	}

	@java.lang.Override
	protected Builder newBuilderForType(
			com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
		Builder builder = new Builder(parent);
		return builder;
	}

	/**
	 * <pre>
	 * Represents a key-value pair to be stored or retrieved.
	 * </pre>
	 * <p>
	 * Protobuf type {@code vss.KeyValue}
	 */
	public static final class Builder extends
			com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
			// @@protoc_insertion_point(builder_implements:vss.KeyValue)
			org.vss.KeyValueOrBuilder {
		public static final com.google.protobuf.Descriptors.Descriptor
		getDescriptor() {
			return org.vss.Vss.internal_static_vss_KeyValue_descriptor;
		}

		@java.lang.Override
		protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
		internalGetFieldAccessorTable() {
			return org.vss.Vss.internal_static_vss_KeyValue_fieldAccessorTable
					.ensureFieldAccessorsInitialized(
							org.vss.KeyValue.class, org.vss.KeyValue.Builder.class);
		}

		// Construct using org.vss.KeyValue.newBuilder()
		private Builder() {

		}

		private Builder(
				com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
			super(parent);

		}

		@java.lang.Override
		public Builder clear() {
			super.clear();
			key_ = "";

			version_ = 0L;

			value_ = com.google.protobuf.ByteString.EMPTY;

			return this;
		}

		@java.lang.Override
		public com.google.protobuf.Descriptors.Descriptor
		getDescriptorForType() {
			return org.vss.Vss.internal_static_vss_KeyValue_descriptor;
		}

		@java.lang.Override
		public org.vss.KeyValue getDefaultInstanceForType() {
			return org.vss.KeyValue.getDefaultInstance();
		}

		@java.lang.Override
		public org.vss.KeyValue build() {
			org.vss.KeyValue result = buildPartial();
			if (!result.isInitialized()) {
				throw newUninitializedMessageException(result);
			}
			return result;
		}

		@java.lang.Override
		public org.vss.KeyValue buildPartial() {
			org.vss.KeyValue result = new org.vss.KeyValue(this);
			result.key_ = key_;
			result.version_ = version_;
			result.value_ = value_;
			onBuilt();
			return result;
		}

		@java.lang.Override
		public Builder clone() {
			return super.clone();
		}

		@java.lang.Override
		public Builder setField(
				com.google.protobuf.Descriptors.FieldDescriptor field,
				java.lang.Object value) {
			return super.setField(field, value);
		}

		@java.lang.Override
		public Builder clearField(
				com.google.protobuf.Descriptors.FieldDescriptor field) {
			return super.clearField(field);
		}

		@java.lang.Override
		public Builder clearOneof(
				com.google.protobuf.Descriptors.OneofDescriptor oneof) {
			return super.clearOneof(oneof);
		}

		@java.lang.Override
		public Builder setRepeatedField(
				com.google.protobuf.Descriptors.FieldDescriptor field,
				int index, java.lang.Object value) {
			return super.setRepeatedField(field, index, value);
		}

		@java.lang.Override
		public Builder addRepeatedField(
				com.google.protobuf.Descriptors.FieldDescriptor field,
				java.lang.Object value) {
			return super.addRepeatedField(field, value);
		}

		@java.lang.Override
		public Builder mergeFrom(com.google.protobuf.Message other) {
			if (other instanceof org.vss.KeyValue) {
				return mergeFrom((org.vss.KeyValue) other);
			} else {
				super.mergeFrom(other);
				return this;
			}
		}

		public Builder mergeFrom(org.vss.KeyValue other) {
			if (other == org.vss.KeyValue.getDefaultInstance()) return this;
			if (!other.getKey().isEmpty()) {
				key_ = other.key_;
				onChanged();
			}
			if (other.getVersion() != 0L) {
				setVersion(other.getVersion());
			}
			if (other.getValue() != com.google.protobuf.ByteString.EMPTY) {
				setValue(other.getValue());
			}
			this.mergeUnknownFields(other.getUnknownFields());
			onChanged();
			return this;
		}

		@java.lang.Override
		public final boolean isInitialized() {
			return true;
		}

		@java.lang.Override
		public Builder mergeFrom(
				com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			if (extensionRegistry == null) {
				throw new java.lang.NullPointerException();
			}
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
						case 0:
							done = true;
							break;
						case 10: {
							key_ = input.readStringRequireUtf8();

							break;
						} // case 10
						case 16: {
							version_ = input.readInt64();

							break;
						} // case 16
						case 26: {
							value_ = input.readBytes();

							break;
						} // case 26
						default: {
							if (!super.parseUnknownField(input, extensionRegistry, tag)) {
								done = true; // was an endgroup tag
							}
							break;
						} // default:
					} // switch (tag)
				} // while (!done)
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.unwrapIOException();
			} finally {
				onChanged();
			} // finally
			return this;
		}

		private java.lang.Object key_ = "";

		/**
		 * <pre>
		 * Key against which the value is stored.
		 * </pre>
		 *
		 * <code>string key = 1;</code>
		 *
		 * @return The key.
		 */
		public java.lang.String getKey() {
			java.lang.Object ref = key_;
			if (!(ref instanceof java.lang.String)) {
				com.google.protobuf.ByteString bs =
						(com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				key_ = s;
				return s;
			} else {
				return (java.lang.String) ref;
			}
		}

		/**
		 * <pre>
		 * Key against which the value is stored.
		 * </pre>
		 *
		 * <code>string key = 1;</code>
		 *
		 * @return The bytes for key.
		 */
		public com.google.protobuf.ByteString
		getKeyBytes() {
			java.lang.Object ref = key_;
			if (ref instanceof String) {
				com.google.protobuf.ByteString b =
						com.google.protobuf.ByteString.copyFromUtf8(
								(java.lang.String) ref);
				key_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		/**
		 * <pre>
		 * Key against which the value is stored.
		 * </pre>
		 *
		 * <code>string key = 1;</code>
		 *
		 * @param value The key to set.
		 * @return This builder for chaining.
		 */
		public Builder setKey(
				java.lang.String value) {
			if (value == null) {
				throw new NullPointerException();
			}

			key_ = value;
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 * Key against which the value is stored.
		 * </pre>
		 *
		 * <code>string key = 1;</code>
		 *
		 * @return This builder for chaining.
		 */
		public Builder clearKey() {

			key_ = getDefaultInstance().getKey();
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 * Key against which the value is stored.
		 * </pre>
		 *
		 * <code>string key = 1;</code>
		 *
		 * @param value The bytes for key to set.
		 * @return This builder for chaining.
		 */
		public Builder setKeyBytes(
				com.google.protobuf.ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			checkByteStringIsUtf8(value);

			key_ = value;
			onChanged();
			return this;
		}

		private long version_;

		/**
		 * <pre>
		 * Version field is used for key-level versioning.
		 * For first write of key, `version` should be '0'. If the write succeeds, clients must increment
		 * their corresponding key version (client-side) by 1.
		 * The server increments key version (server-side) for every successful write, hence this
		 * client-side increment is required to ensure matching versions. These updated key versions should
		 * be used in subsequent `PutObjectRequest`s for the keys.
		 * </pre>
		 *
		 * <code>int64 version = 2;</code>
		 *
		 * @return The version.
		 */
		@java.lang.Override
		public long getVersion() {
			return version_;
		}

		/**
		 * <pre>
		 * Version field is used for key-level versioning.
		 * For first write of key, `version` should be '0'. If the write succeeds, clients must increment
		 * their corresponding key version (client-side) by 1.
		 * The server increments key version (server-side) for every successful write, hence this
		 * client-side increment is required to ensure matching versions. These updated key versions should
		 * be used in subsequent `PutObjectRequest`s for the keys.
		 * </pre>
		 *
		 * <code>int64 version = 2;</code>
		 *
		 * @param value The version to set.
		 * @return This builder for chaining.
		 */
		public Builder setVersion(long value) {

			version_ = value;
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 * Version field is used for key-level versioning.
		 * For first write of key, `version` should be '0'. If the write succeeds, clients must increment
		 * their corresponding key version (client-side) by 1.
		 * The server increments key version (server-side) for every successful write, hence this
		 * client-side increment is required to ensure matching versions. These updated key versions should
		 * be used in subsequent `PutObjectRequest`s for the keys.
		 * </pre>
		 *
		 * <code>int64 version = 2;</code>
		 *
		 * @return This builder for chaining.
		 */
		public Builder clearVersion() {

			version_ = 0L;
			onChanged();
			return this;
		}

		private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;

		/**
		 * <pre>
		 * Object value in bytes which is stored (in put) and fetched (in get).
		 * Clients must encrypt the secret contents of this blob client-side before sending it over the
		 * wire to the server in order to preserve privacy and security.
		 * Clients may use a `Storable` object, serialize it and set it here.
		 * </pre>
		 *
		 * <code>bytes value = 3;</code>
		 *
		 * @return The value.
		 */
		@java.lang.Override
		public com.google.protobuf.ByteString getValue() {
			return value_;
		}

		/**
		 * <pre>
		 * Object value in bytes which is stored (in put) and fetched (in get).
		 * Clients must encrypt the secret contents of this blob client-side before sending it over the
		 * wire to the server in order to preserve privacy and security.
		 * Clients may use a `Storable` object, serialize it and set it here.
		 * </pre>
		 *
		 * <code>bytes value = 3;</code>
		 *
		 * @param value The value to set.
		 * @return This builder for chaining.
		 */
		public Builder setValue(com.google.protobuf.ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}

			value_ = value;
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 * Object value in bytes which is stored (in put) and fetched (in get).
		 * Clients must encrypt the secret contents of this blob client-side before sending it over the
		 * wire to the server in order to preserve privacy and security.
		 * Clients may use a `Storable` object, serialize it and set it here.
		 * </pre>
		 *
		 * <code>bytes value = 3;</code>
		 *
		 * @return This builder for chaining.
		 */
		public Builder clearValue() {

			value_ = getDefaultInstance().getValue();
			onChanged();
			return this;
		}

		@java.lang.Override
		public final Builder setUnknownFields(
				final com.google.protobuf.UnknownFieldSet unknownFields) {
			return super.setUnknownFields(unknownFields);
		}

		@java.lang.Override
		public final Builder mergeUnknownFields(
				final com.google.protobuf.UnknownFieldSet unknownFields) {
			return super.mergeUnknownFields(unknownFields);
		}


		// @@protoc_insertion_point(builder_scope:vss.KeyValue)
	}

	// @@protoc_insertion_point(class_scope:vss.KeyValue)
	private static final org.vss.KeyValue DEFAULT_INSTANCE;

	static {
		DEFAULT_INSTANCE = new org.vss.KeyValue();
	}

	public static org.vss.KeyValue getDefaultInstance() {
		return DEFAULT_INSTANCE;
	}

	private static final com.google.protobuf.Parser<KeyValue>
			PARSER = new com.google.protobuf.AbstractParser<KeyValue>() {
		@java.lang.Override
		public KeyValue parsePartialFrom(
				com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			Builder builder = newBuilder();
			try {
				builder.mergeFrom(input, extensionRegistry);
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(builder.buildPartial());
			} catch (com.google.protobuf.UninitializedMessageException e) {
				throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(e)
						.setUnfinishedMessage(builder.buildPartial());
			}
			return builder.buildPartial();
		}
	};

	public static com.google.protobuf.Parser<KeyValue> parser() {
		return PARSER;
	}

	@java.lang.Override
	public com.google.protobuf.Parser<KeyValue> getParserForType() {
		return PARSER;
	}

	@java.lang.Override
	public org.vss.KeyValue getDefaultInstanceForType() {
		return DEFAULT_INSTANCE;
	}

}

