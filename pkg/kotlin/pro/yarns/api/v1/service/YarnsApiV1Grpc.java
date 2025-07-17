package pro.yarns.api.v1.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.73.0)",
    comments = "Source: v1/service/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class YarnsApiV1Grpc {

  private YarnsApiV1Grpc() {}

  public static final java.lang.String SERVICE_NAME = "pro.yarns.api.v1.service.YarnsApiV1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pro.yarns.api.v1.service.RegisterUserRequest,
      pro.yarns.api.v1.service.RegisterUserResponse> getRegisterUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterUser",
      requestType = pro.yarns.api.v1.service.RegisterUserRequest.class,
      responseType = pro.yarns.api.v1.service.RegisterUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pro.yarns.api.v1.service.RegisterUserRequest,
      pro.yarns.api.v1.service.RegisterUserResponse> getRegisterUserMethod() {
    io.grpc.MethodDescriptor<pro.yarns.api.v1.service.RegisterUserRequest, pro.yarns.api.v1.service.RegisterUserResponse> getRegisterUserMethod;
    if ((getRegisterUserMethod = YarnsApiV1Grpc.getRegisterUserMethod) == null) {
      synchronized (YarnsApiV1Grpc.class) {
        if ((getRegisterUserMethod = YarnsApiV1Grpc.getRegisterUserMethod) == null) {
          YarnsApiV1Grpc.getRegisterUserMethod = getRegisterUserMethod =
              io.grpc.MethodDescriptor.<pro.yarns.api.v1.service.RegisterUserRequest, pro.yarns.api.v1.service.RegisterUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pro.yarns.api.v1.service.RegisterUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pro.yarns.api.v1.service.RegisterUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new YarnsApiV1MethodDescriptorSupplier("RegisterUser"))
              .build();
        }
      }
    }
    return getRegisterUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pro.yarns.api.v1.service.GetUsersByIdsRequest,
      pro.yarns.api.v1.service.GetUsersByIdsResponse> getGetUsersByIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUsersByIds",
      requestType = pro.yarns.api.v1.service.GetUsersByIdsRequest.class,
      responseType = pro.yarns.api.v1.service.GetUsersByIdsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pro.yarns.api.v1.service.GetUsersByIdsRequest,
      pro.yarns.api.v1.service.GetUsersByIdsResponse> getGetUsersByIdsMethod() {
    io.grpc.MethodDescriptor<pro.yarns.api.v1.service.GetUsersByIdsRequest, pro.yarns.api.v1.service.GetUsersByIdsResponse> getGetUsersByIdsMethod;
    if ((getGetUsersByIdsMethod = YarnsApiV1Grpc.getGetUsersByIdsMethod) == null) {
      synchronized (YarnsApiV1Grpc.class) {
        if ((getGetUsersByIdsMethod = YarnsApiV1Grpc.getGetUsersByIdsMethod) == null) {
          YarnsApiV1Grpc.getGetUsersByIdsMethod = getGetUsersByIdsMethod =
              io.grpc.MethodDescriptor.<pro.yarns.api.v1.service.GetUsersByIdsRequest, pro.yarns.api.v1.service.GetUsersByIdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUsersByIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pro.yarns.api.v1.service.GetUsersByIdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pro.yarns.api.v1.service.GetUsersByIdsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new YarnsApiV1MethodDescriptorSupplier("GetUsersByIds"))
              .build();
        }
      }
    }
    return getGetUsersByIdsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pro.yarns.api.v1.service.SendMessageRequest,
      pro.yarns.api.v1.service.SendMessageResponse> getSendMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendMessage",
      requestType = pro.yarns.api.v1.service.SendMessageRequest.class,
      responseType = pro.yarns.api.v1.service.SendMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pro.yarns.api.v1.service.SendMessageRequest,
      pro.yarns.api.v1.service.SendMessageResponse> getSendMessageMethod() {
    io.grpc.MethodDescriptor<pro.yarns.api.v1.service.SendMessageRequest, pro.yarns.api.v1.service.SendMessageResponse> getSendMessageMethod;
    if ((getSendMessageMethod = YarnsApiV1Grpc.getSendMessageMethod) == null) {
      synchronized (YarnsApiV1Grpc.class) {
        if ((getSendMessageMethod = YarnsApiV1Grpc.getSendMessageMethod) == null) {
          YarnsApiV1Grpc.getSendMessageMethod = getSendMessageMethod =
              io.grpc.MethodDescriptor.<pro.yarns.api.v1.service.SendMessageRequest, pro.yarns.api.v1.service.SendMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pro.yarns.api.v1.service.SendMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pro.yarns.api.v1.service.SendMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new YarnsApiV1MethodDescriptorSupplier("SendMessage"))
              .build();
        }
      }
    }
    return getSendMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pro.yarns.api.v1.service.CheckMessagesRequest,
      pro.yarns.api.v1.service.CheckMessagesResponse> getCheckMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckMessages",
      requestType = pro.yarns.api.v1.service.CheckMessagesRequest.class,
      responseType = pro.yarns.api.v1.service.CheckMessagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pro.yarns.api.v1.service.CheckMessagesRequest,
      pro.yarns.api.v1.service.CheckMessagesResponse> getCheckMessagesMethod() {
    io.grpc.MethodDescriptor<pro.yarns.api.v1.service.CheckMessagesRequest, pro.yarns.api.v1.service.CheckMessagesResponse> getCheckMessagesMethod;
    if ((getCheckMessagesMethod = YarnsApiV1Grpc.getCheckMessagesMethod) == null) {
      synchronized (YarnsApiV1Grpc.class) {
        if ((getCheckMessagesMethod = YarnsApiV1Grpc.getCheckMessagesMethod) == null) {
          YarnsApiV1Grpc.getCheckMessagesMethod = getCheckMessagesMethod =
              io.grpc.MethodDescriptor.<pro.yarns.api.v1.service.CheckMessagesRequest, pro.yarns.api.v1.service.CheckMessagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pro.yarns.api.v1.service.CheckMessagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pro.yarns.api.v1.service.CheckMessagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new YarnsApiV1MethodDescriptorSupplier("CheckMessages"))
              .build();
        }
      }
    }
    return getCheckMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pro.yarns.api.v1.service.ConfirmMessagesRequest,
      pro.yarns.api.v1.service.ConfirmMessagesResponse> getConfirmMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfirmMessages",
      requestType = pro.yarns.api.v1.service.ConfirmMessagesRequest.class,
      responseType = pro.yarns.api.v1.service.ConfirmMessagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pro.yarns.api.v1.service.ConfirmMessagesRequest,
      pro.yarns.api.v1.service.ConfirmMessagesResponse> getConfirmMessagesMethod() {
    io.grpc.MethodDescriptor<pro.yarns.api.v1.service.ConfirmMessagesRequest, pro.yarns.api.v1.service.ConfirmMessagesResponse> getConfirmMessagesMethod;
    if ((getConfirmMessagesMethod = YarnsApiV1Grpc.getConfirmMessagesMethod) == null) {
      synchronized (YarnsApiV1Grpc.class) {
        if ((getConfirmMessagesMethod = YarnsApiV1Grpc.getConfirmMessagesMethod) == null) {
          YarnsApiV1Grpc.getConfirmMessagesMethod = getConfirmMessagesMethod =
              io.grpc.MethodDescriptor.<pro.yarns.api.v1.service.ConfirmMessagesRequest, pro.yarns.api.v1.service.ConfirmMessagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfirmMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pro.yarns.api.v1.service.ConfirmMessagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pro.yarns.api.v1.service.ConfirmMessagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new YarnsApiV1MethodDescriptorSupplier("ConfirmMessages"))
              .build();
        }
      }
    }
    return getConfirmMessagesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static YarnsApiV1Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<YarnsApiV1Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<YarnsApiV1Stub>() {
        @java.lang.Override
        public YarnsApiV1Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new YarnsApiV1Stub(channel, callOptions);
        }
      };
    return YarnsApiV1Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static YarnsApiV1BlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<YarnsApiV1BlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<YarnsApiV1BlockingV2Stub>() {
        @java.lang.Override
        public YarnsApiV1BlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new YarnsApiV1BlockingV2Stub(channel, callOptions);
        }
      };
    return YarnsApiV1BlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static YarnsApiV1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<YarnsApiV1BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<YarnsApiV1BlockingStub>() {
        @java.lang.Override
        public YarnsApiV1BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new YarnsApiV1BlockingStub(channel, callOptions);
        }
      };
    return YarnsApiV1BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static YarnsApiV1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<YarnsApiV1FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<YarnsApiV1FutureStub>() {
        @java.lang.Override
        public YarnsApiV1FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new YarnsApiV1FutureStub(channel, callOptions);
        }
      };
    return YarnsApiV1FutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void registerUser(pro.yarns.api.v1.service.RegisterUserRequest request,
        io.grpc.stub.StreamObserver<pro.yarns.api.v1.service.RegisterUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterUserMethod(), responseObserver);
    }

    /**
     */
    default void getUsersByIds(pro.yarns.api.v1.service.GetUsersByIdsRequest request,
        io.grpc.stub.StreamObserver<pro.yarns.api.v1.service.GetUsersByIdsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUsersByIdsMethod(), responseObserver);
    }

    /**
     */
    default void sendMessage(pro.yarns.api.v1.service.SendMessageRequest request,
        io.grpc.stub.StreamObserver<pro.yarns.api.v1.service.SendMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMessageMethod(), responseObserver);
    }

    /**
     */
    default void checkMessages(pro.yarns.api.v1.service.CheckMessagesRequest request,
        io.grpc.stub.StreamObserver<pro.yarns.api.v1.service.CheckMessagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckMessagesMethod(), responseObserver);
    }

    /**
     */
    default void confirmMessages(pro.yarns.api.v1.service.ConfirmMessagesRequest request,
        io.grpc.stub.StreamObserver<pro.yarns.api.v1.service.ConfirmMessagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmMessagesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service YarnsApiV1.
   */
  public static abstract class YarnsApiV1ImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return YarnsApiV1Grpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service YarnsApiV1.
   */
  public static final class YarnsApiV1Stub
      extends io.grpc.stub.AbstractAsyncStub<YarnsApiV1Stub> {
    private YarnsApiV1Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected YarnsApiV1Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new YarnsApiV1Stub(channel, callOptions);
    }

    /**
     */
    public void registerUser(pro.yarns.api.v1.service.RegisterUserRequest request,
        io.grpc.stub.StreamObserver<pro.yarns.api.v1.service.RegisterUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUsersByIds(pro.yarns.api.v1.service.GetUsersByIdsRequest request,
        io.grpc.stub.StreamObserver<pro.yarns.api.v1.service.GetUsersByIdsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUsersByIdsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendMessage(pro.yarns.api.v1.service.SendMessageRequest request,
        io.grpc.stub.StreamObserver<pro.yarns.api.v1.service.SendMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkMessages(pro.yarns.api.v1.service.CheckMessagesRequest request,
        io.grpc.stub.StreamObserver<pro.yarns.api.v1.service.CheckMessagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void confirmMessages(pro.yarns.api.v1.service.ConfirmMessagesRequest request,
        io.grpc.stub.StreamObserver<pro.yarns.api.v1.service.ConfirmMessagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmMessagesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service YarnsApiV1.
   */
  public static final class YarnsApiV1BlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<YarnsApiV1BlockingV2Stub> {
    private YarnsApiV1BlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected YarnsApiV1BlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new YarnsApiV1BlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public pro.yarns.api.v1.service.RegisterUserResponse registerUser(pro.yarns.api.v1.service.RegisterUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public pro.yarns.api.v1.service.GetUsersByIdsResponse getUsersByIds(pro.yarns.api.v1.service.GetUsersByIdsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUsersByIdsMethod(), getCallOptions(), request);
    }

    /**
     */
    public pro.yarns.api.v1.service.SendMessageResponse sendMessage(pro.yarns.api.v1.service.SendMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public pro.yarns.api.v1.service.CheckMessagesResponse checkMessages(pro.yarns.api.v1.service.CheckMessagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckMessagesMethod(), getCallOptions(), request);
    }

    /**
     */
    public pro.yarns.api.v1.service.ConfirmMessagesResponse confirmMessages(pro.yarns.api.v1.service.ConfirmMessagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmMessagesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service YarnsApiV1.
   */
  public static final class YarnsApiV1BlockingStub
      extends io.grpc.stub.AbstractBlockingStub<YarnsApiV1BlockingStub> {
    private YarnsApiV1BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected YarnsApiV1BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new YarnsApiV1BlockingStub(channel, callOptions);
    }

    /**
     */
    public pro.yarns.api.v1.service.RegisterUserResponse registerUser(pro.yarns.api.v1.service.RegisterUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public pro.yarns.api.v1.service.GetUsersByIdsResponse getUsersByIds(pro.yarns.api.v1.service.GetUsersByIdsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUsersByIdsMethod(), getCallOptions(), request);
    }

    /**
     */
    public pro.yarns.api.v1.service.SendMessageResponse sendMessage(pro.yarns.api.v1.service.SendMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public pro.yarns.api.v1.service.CheckMessagesResponse checkMessages(pro.yarns.api.v1.service.CheckMessagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckMessagesMethod(), getCallOptions(), request);
    }

    /**
     */
    public pro.yarns.api.v1.service.ConfirmMessagesResponse confirmMessages(pro.yarns.api.v1.service.ConfirmMessagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmMessagesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service YarnsApiV1.
   */
  public static final class YarnsApiV1FutureStub
      extends io.grpc.stub.AbstractFutureStub<YarnsApiV1FutureStub> {
    private YarnsApiV1FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected YarnsApiV1FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new YarnsApiV1FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pro.yarns.api.v1.service.RegisterUserResponse> registerUser(
        pro.yarns.api.v1.service.RegisterUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pro.yarns.api.v1.service.GetUsersByIdsResponse> getUsersByIds(
        pro.yarns.api.v1.service.GetUsersByIdsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUsersByIdsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pro.yarns.api.v1.service.SendMessageResponse> sendMessage(
        pro.yarns.api.v1.service.SendMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pro.yarns.api.v1.service.CheckMessagesResponse> checkMessages(
        pro.yarns.api.v1.service.CheckMessagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckMessagesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pro.yarns.api.v1.service.ConfirmMessagesResponse> confirmMessages(
        pro.yarns.api.v1.service.ConfirmMessagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmMessagesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_USER = 0;
  private static final int METHODID_GET_USERS_BY_IDS = 1;
  private static final int METHODID_SEND_MESSAGE = 2;
  private static final int METHODID_CHECK_MESSAGES = 3;
  private static final int METHODID_CONFIRM_MESSAGES = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_USER:
          serviceImpl.registerUser((pro.yarns.api.v1.service.RegisterUserRequest) request,
              (io.grpc.stub.StreamObserver<pro.yarns.api.v1.service.RegisterUserResponse>) responseObserver);
          break;
        case METHODID_GET_USERS_BY_IDS:
          serviceImpl.getUsersByIds((pro.yarns.api.v1.service.GetUsersByIdsRequest) request,
              (io.grpc.stub.StreamObserver<pro.yarns.api.v1.service.GetUsersByIdsResponse>) responseObserver);
          break;
        case METHODID_SEND_MESSAGE:
          serviceImpl.sendMessage((pro.yarns.api.v1.service.SendMessageRequest) request,
              (io.grpc.stub.StreamObserver<pro.yarns.api.v1.service.SendMessageResponse>) responseObserver);
          break;
        case METHODID_CHECK_MESSAGES:
          serviceImpl.checkMessages((pro.yarns.api.v1.service.CheckMessagesRequest) request,
              (io.grpc.stub.StreamObserver<pro.yarns.api.v1.service.CheckMessagesResponse>) responseObserver);
          break;
        case METHODID_CONFIRM_MESSAGES:
          serviceImpl.confirmMessages((pro.yarns.api.v1.service.ConfirmMessagesRequest) request,
              (io.grpc.stub.StreamObserver<pro.yarns.api.v1.service.ConfirmMessagesResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getRegisterUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              pro.yarns.api.v1.service.RegisterUserRequest,
              pro.yarns.api.v1.service.RegisterUserResponse>(
                service, METHODID_REGISTER_USER)))
        .addMethod(
          getGetUsersByIdsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              pro.yarns.api.v1.service.GetUsersByIdsRequest,
              pro.yarns.api.v1.service.GetUsersByIdsResponse>(
                service, METHODID_GET_USERS_BY_IDS)))
        .addMethod(
          getSendMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              pro.yarns.api.v1.service.SendMessageRequest,
              pro.yarns.api.v1.service.SendMessageResponse>(
                service, METHODID_SEND_MESSAGE)))
        .addMethod(
          getCheckMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              pro.yarns.api.v1.service.CheckMessagesRequest,
              pro.yarns.api.v1.service.CheckMessagesResponse>(
                service, METHODID_CHECK_MESSAGES)))
        .addMethod(
          getConfirmMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              pro.yarns.api.v1.service.ConfirmMessagesRequest,
              pro.yarns.api.v1.service.ConfirmMessagesResponse>(
                service, METHODID_CONFIRM_MESSAGES)))
        .build();
  }

  private static abstract class YarnsApiV1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    YarnsApiV1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pro.yarns.api.v1.service.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("YarnsApiV1");
    }
  }

  private static final class YarnsApiV1FileDescriptorSupplier
      extends YarnsApiV1BaseDescriptorSupplier {
    YarnsApiV1FileDescriptorSupplier() {}
  }

  private static final class YarnsApiV1MethodDescriptorSupplier
      extends YarnsApiV1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    YarnsApiV1MethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (YarnsApiV1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new YarnsApiV1FileDescriptorSupplier())
              .addMethod(getRegisterUserMethod())
              .addMethod(getGetUsersByIdsMethod())
              .addMethod(getSendMessageMethod())
              .addMethod(getCheckMessagesMethod())
              .addMethod(getConfirmMessagesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
