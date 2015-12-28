// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MessageBody.proto

package server.proto;

public final class MessageBody {
  private MessageBody() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface MessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:server.proto.Message)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string Sender = 1;</code>
     *
     * <pre>
     *&#47;&lt; Идентификатор отправителя
     * </pre>
     */
    boolean hasSender();
    /**
     * <code>required string Sender = 1;</code>
     *
     * <pre>
     *&#47;&lt; Идентификатор отправителя
     * </pre>
     */
    java.lang.String getSender();
    /**
     * <code>required string Sender = 1;</code>
     *
     * <pre>
     *&#47;&lt; Идентификатор отправителя
     * </pre>
     */
    com.google.protobuf.ByteString
        getSenderBytes();

    /**
     * <code>required string Text = 2;</code>
     *
     * <pre>
     *&#47;&lt; Содержание сообщения
     * </pre>
     */
    boolean hasText();
    /**
     * <code>required string Text = 2;</code>
     *
     * <pre>
     *&#47;&lt; Содержание сообщения
     * </pre>
     */
    java.lang.String getText();
    /**
     * <code>required string Text = 2;</code>
     *
     * <pre>
     *&#47;&lt; Содержание сообщения
     * </pre>
     */
    com.google.protobuf.ByteString
        getTextBytes();

    /**
     * <code>optional string Data = 3;</code>
     *
     * <pre>
     *&#47;&lt; Internal field. Можно использовать для реализации каких-либо
     * </pre>
     */
    boolean hasData();
    /**
     * <code>optional string Data = 3;</code>
     *
     * <pre>
     *&#47;&lt; Internal field. Можно использовать для реализации каких-либо
     * </pre>
     */
    java.lang.String getData();
    /**
     * <code>optional string Data = 3;</code>
     *
     * <pre>
     *&#47;&lt; Internal field. Можно использовать для реализации каких-либо
     * </pre>
     */
    com.google.protobuf.ByteString
        getDataBytes();
  }
  /**
   * Protobuf type {@code server.proto.Message}
   *
   * <pre>
   * -------------------------------------------------------------------
   * / &#92;brief Message - сообщение, передаваемое между сервером и клиентами
   * -------------------------------------------------------------------
   * </pre>
   */
  public static final class Message extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:server.proto.Message)
      MessageOrBuilder {
    // Use Message.newBuilder() to construct.
    private Message(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Message(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Message defaultInstance;
    public static Message getDefaultInstance() {
      return defaultInstance;
    }

    public Message getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Message(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              sender_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              text_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              data_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return server.proto.MessageBody.internal_static_server_proto_Message_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return server.proto.MessageBody.internal_static_server_proto_Message_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              server.proto.MessageBody.Message.class, server.proto.MessageBody.Message.Builder.class);
    }

    public static com.google.protobuf.Parser<Message> PARSER =
        new com.google.protobuf.AbstractParser<Message>() {
      public Message parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Message(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Message> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int SENDER_FIELD_NUMBER = 1;
    private java.lang.Object sender_;
    /**
     * <code>required string Sender = 1;</code>
     *
     * <pre>
     *&#47;&lt; Идентификатор отправителя
     * </pre>
     */
    public boolean hasSender() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string Sender = 1;</code>
     *
     * <pre>
     *&#47;&lt; Идентификатор отправителя
     * </pre>
     */
    public java.lang.String getSender() {
      java.lang.Object ref = sender_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          sender_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string Sender = 1;</code>
     *
     * <pre>
     *&#47;&lt; Идентификатор отправителя
     * </pre>
     */
    public com.google.protobuf.ByteString
        getSenderBytes() {
      java.lang.Object ref = sender_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sender_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TEXT_FIELD_NUMBER = 2;
    private java.lang.Object text_;
    /**
     * <code>required string Text = 2;</code>
     *
     * <pre>
     *&#47;&lt; Содержание сообщения
     * </pre>
     */
    public boolean hasText() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string Text = 2;</code>
     *
     * <pre>
     *&#47;&lt; Содержание сообщения
     * </pre>
     */
    public java.lang.String getText() {
      java.lang.Object ref = text_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          text_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string Text = 2;</code>
     *
     * <pre>
     *&#47;&lt; Содержание сообщения
     * </pre>
     */
    public com.google.protobuf.ByteString
        getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DATA_FIELD_NUMBER = 3;
    private java.lang.Object data_;
    /**
     * <code>optional string Data = 3;</code>
     *
     * <pre>
     *&#47;&lt; Internal field. Можно использовать для реализации каких-либо
     * </pre>
     */
    public boolean hasData() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string Data = 3;</code>
     *
     * <pre>
     *&#47;&lt; Internal field. Можно использовать для реализации каких-либо
     * </pre>
     */
    public java.lang.String getData() {
      java.lang.Object ref = data_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          data_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string Data = 3;</code>
     *
     * <pre>
     *&#47;&lt; Internal field. Можно использовать для реализации каких-либо
     * </pre>
     */
    public com.google.protobuf.ByteString
        getDataBytes() {
      java.lang.Object ref = data_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        data_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      sender_ = "";
      text_ = "";
      data_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasSender()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasText()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getSenderBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getTextBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getDataBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getSenderBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getTextBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getDataBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static server.proto.MessageBody.Message parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static server.proto.MessageBody.Message parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static server.proto.MessageBody.Message parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static server.proto.MessageBody.Message parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static server.proto.MessageBody.Message parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static server.proto.MessageBody.Message parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static server.proto.MessageBody.Message parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static server.proto.MessageBody.Message parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static server.proto.MessageBody.Message parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static server.proto.MessageBody.Message parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(server.proto.MessageBody.Message prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code server.proto.Message}
     *
     * <pre>
     * -------------------------------------------------------------------
     * / &#92;brief Message - сообщение, передаваемое между сервером и клиентами
     * -------------------------------------------------------------------
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:server.proto.Message)
        server.proto.MessageBody.MessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return server.proto.MessageBody.internal_static_server_proto_Message_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return server.proto.MessageBody.internal_static_server_proto_Message_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                server.proto.MessageBody.Message.class, server.proto.MessageBody.Message.Builder.class);
      }

      // Construct using server.proto.MessageBody.Message.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        sender_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        text_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        data_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return server.proto.MessageBody.internal_static_server_proto_Message_descriptor;
      }

      public server.proto.MessageBody.Message getDefaultInstanceForType() {
        return server.proto.MessageBody.Message.getDefaultInstance();
      }

      public server.proto.MessageBody.Message build() {
        server.proto.MessageBody.Message result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public server.proto.MessageBody.Message buildPartial() {
        server.proto.MessageBody.Message result = new server.proto.MessageBody.Message(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.sender_ = sender_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.text_ = text_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.data_ = data_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof server.proto.MessageBody.Message) {
          return mergeFrom((server.proto.MessageBody.Message)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(server.proto.MessageBody.Message other) {
        if (other == server.proto.MessageBody.Message.getDefaultInstance()) return this;
        if (other.hasSender()) {
          bitField0_ |= 0x00000001;
          sender_ = other.sender_;
          onChanged();
        }
        if (other.hasText()) {
          bitField0_ |= 0x00000002;
          text_ = other.text_;
          onChanged();
        }
        if (other.hasData()) {
          bitField0_ |= 0x00000004;
          data_ = other.data_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasSender()) {
          
          return false;
        }
        if (!hasText()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        server.proto.MessageBody.Message parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (server.proto.MessageBody.Message) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object sender_ = "";
      /**
       * <code>required string Sender = 1;</code>
       *
       * <pre>
       *&#47;&lt; Идентификатор отправителя
       * </pre>
       */
      public boolean hasSender() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string Sender = 1;</code>
       *
       * <pre>
       *&#47;&lt; Идентификатор отправителя
       * </pre>
       */
      public java.lang.String getSender() {
        java.lang.Object ref = sender_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            sender_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string Sender = 1;</code>
       *
       * <pre>
       *&#47;&lt; Идентификатор отправителя
       * </pre>
       */
      public com.google.protobuf.ByteString
          getSenderBytes() {
        java.lang.Object ref = sender_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          sender_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string Sender = 1;</code>
       *
       * <pre>
       *&#47;&lt; Идентификатор отправителя
       * </pre>
       */
      public Builder setSender(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        sender_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string Sender = 1;</code>
       *
       * <pre>
       *&#47;&lt; Идентификатор отправителя
       * </pre>
       */
      public Builder clearSender() {
        bitField0_ = (bitField0_ & ~0x00000001);
        sender_ = getDefaultInstance().getSender();
        onChanged();
        return this;
      }
      /**
       * <code>required string Sender = 1;</code>
       *
       * <pre>
       *&#47;&lt; Идентификатор отправителя
       * </pre>
       */
      public Builder setSenderBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        sender_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object text_ = "";
      /**
       * <code>required string Text = 2;</code>
       *
       * <pre>
       *&#47;&lt; Содержание сообщения
       * </pre>
       */
      public boolean hasText() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string Text = 2;</code>
       *
       * <pre>
       *&#47;&lt; Содержание сообщения
       * </pre>
       */
      public java.lang.String getText() {
        java.lang.Object ref = text_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            text_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string Text = 2;</code>
       *
       * <pre>
       *&#47;&lt; Содержание сообщения
       * </pre>
       */
      public com.google.protobuf.ByteString
          getTextBytes() {
        java.lang.Object ref = text_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          text_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string Text = 2;</code>
       *
       * <pre>
       *&#47;&lt; Содержание сообщения
       * </pre>
       */
      public Builder setText(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        text_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string Text = 2;</code>
       *
       * <pre>
       *&#47;&lt; Содержание сообщения
       * </pre>
       */
      public Builder clearText() {
        bitField0_ = (bitField0_ & ~0x00000002);
        text_ = getDefaultInstance().getText();
        onChanged();
        return this;
      }
      /**
       * <code>required string Text = 2;</code>
       *
       * <pre>
       *&#47;&lt; Содержание сообщения
       * </pre>
       */
      public Builder setTextBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        text_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object data_ = "";
      /**
       * <code>optional string Data = 3;</code>
       *
       * <pre>
       *&#47;&lt; Internal field. Можно использовать для реализации каких-либо
       * </pre>
       */
      public boolean hasData() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string Data = 3;</code>
       *
       * <pre>
       *&#47;&lt; Internal field. Можно использовать для реализации каких-либо
       * </pre>
       */
      public java.lang.String getData() {
        java.lang.Object ref = data_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            data_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string Data = 3;</code>
       *
       * <pre>
       *&#47;&lt; Internal field. Можно использовать для реализации каких-либо
       * </pre>
       */
      public com.google.protobuf.ByteString
          getDataBytes() {
        java.lang.Object ref = data_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          data_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string Data = 3;</code>
       *
       * <pre>
       *&#47;&lt; Internal field. Можно использовать для реализации каких-либо
       * </pre>
       */
      public Builder setData(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string Data = 3;</code>
       *
       * <pre>
       *&#47;&lt; Internal field. Можно использовать для реализации каких-либо
       * </pre>
       */
      public Builder clearData() {
        bitField0_ = (bitField0_ & ~0x00000004);
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }
      /**
       * <code>optional string Data = 3;</code>
       *
       * <pre>
       *&#47;&lt; Internal field. Можно использовать для реализации каких-либо
       * </pre>
       */
      public Builder setDataBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        data_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:server.proto.Message)
    }

    static {
      defaultInstance = new Message(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:server.proto.Message)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_server_proto_Message_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_server_proto_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021MessageBody.proto\022\014server.proto\"5\n\007Mes" +
      "sage\022\016\n\006Sender\030\001 \002(\t\022\014\n\004Text\030\002 \002(\t\022\014\n\004Da" +
      "ta\030\003 \001(\t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_server_proto_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_server_proto_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_server_proto_Message_descriptor,
        new java.lang.String[] { "Sender", "Text", "Data", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
