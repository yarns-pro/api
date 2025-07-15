package ru.kamenetskii.yarns.api.v1.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.73.0)",
    comments = "Source: v1/service/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class YarnsApiV1Grpc {

  private YarnsApiV1Grpc() {}

  public static final java.lang.String SERVICE_NAME = "ru.kamenetskii.yarns.api.v1.service.YarnsApiV1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ru.kamenetskii.yarns.api.v1.service.RegisterRequest,
      ru.kamenetskii.yarns.api.v1.service.RegisterResponse> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Register",
      requestType = ru.kamenetskii.yarns.api.v1.service.RegisterRequest.class,
      responseType = ru.kamenetskii.yarns.api.v1.service.RegisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.kamenetskii.yarns.api.v1.service.RegisterRequest,
      ru.kamenetskii.yarns.api.v1.service.RegisterResponse> getRegisterMethod() {
    io.grpc.MethodDescriptor<ru.kamenetskii.yarns.api.v1.service.RegisterRequest, ru.kamenetskii.yarns.api.v1.service.RegisterResponse> getRegisterMethod;
    if ((getRegisterMethod = YarnsApiV1Grpc.getRegisterMethod) == null) {
      synchronized (YarnsApiV1Grpc.class) {
        if ((getRegisterMethod = YarnsApiV1Grpc.getRegisterMethod) == null) {
          YarnsApiV1Grpc.getRegisterMethod = getRegisterMethod =
              io.grpc.MethodDescriptor.<ru.kamenetskii.yarns.api.v1.service.RegisterRequest, ru.kamenetskii.yarns.api.v1.service.RegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.kamenetskii.yarns.api.v1.service.RegisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.kamenetskii.yarns.api.v1.service.RegisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new YarnsApiV1MethodDescriptorSupplier("Register"))
              .build();
        }
      }
    }
    return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.kamenetskii.yarns.api.v1.service.GetByIdRequest,
      ru.kamenetskii.yarns.api.v1.service.GetByIdResponse> getGetByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetById",
      requestType = ru.kamenetskii.yarns.api.v1.service.GetByIdRequest.class,
      responseType = ru.kamenetskii.yarns.api.v1.service.GetByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ru.kamenetskii.yarns.api.v1.service.GetByIdRequest,
      ru.kamenetskii.yarns.api.v1.service.GetByIdResponse> getGetByIdMethod() {
    io.grpc.MethodDescriptor<ru.kamenetskii.yarns.api.v1.service.GetByIdRequest, ru.kamenetskii.yarns.api.v1.service.GetByIdResponse> getGetByIdMethod;
    if ((getGetByIdMethod = YarnsApiV1Grpc.getGetByIdMethod) == null) {
      synchronized (YarnsApiV1Grpc.class) {
        if ((getGetByIdMethod = YarnsApiV1Grpc.getGetByIdMethod) == null) {
          YarnsApiV1Grpc.getGetByIdMethod = getGetByIdMethod =
              io.grpc.MethodDescriptor.<ru.kamenetskii.yarns.api.v1.service.GetByIdRequest, ru.kamenetskii.yarns.api.v1.service.GetByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.kamenetskii.yarns.api.v1.service.GetByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.kamenetskii.yarns.api.v1.service.GetByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new YarnsApiV1MethodDescriptorSupplier("GetById"))
              .build();
        }
      }
    }
    return getGetByIdMethod;
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
    default void register(ru.kamenetskii.yarns.api.v1.service.RegisterRequest request,
        io.grpc.stub.StreamObserver<ru.kamenetskii.yarns.api.v1.service.RegisterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     */
    default void getById(ru.kamenetskii.yarns.api.v1.service.GetByIdRequest request,
        io.grpc.stub.StreamObserver<ru.kamenetskii.yarns.api.v1.service.GetByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByIdMethod(), responseObserver);
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
    public void register(ru.kamenetskii.yarns.api.v1.service.RegisterRequest request,
        io.grpc.stub.StreamObserver<ru.kamenetskii.yarns.api.v1.service.RegisterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getById(ru.kamenetskii.yarns.api.v1.service.GetByIdRequest request,
        io.grpc.stub.StreamObserver<ru.kamenetskii.yarns.api.v1.service.GetByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request, responseObserver);
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
    public ru.kamenetskii.yarns.api.v1.service.RegisterResponse register(ru.kamenetskii.yarns.api.v1.service.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.kamenetskii.yarns.api.v1.service.GetByIdResponse getById(ru.kamenetskii.yarns.api.v1.service.GetByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByIdMethod(), getCallOptions(), request);
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
    public ru.kamenetskii.yarns.api.v1.service.RegisterResponse register(ru.kamenetskii.yarns.api.v1.service.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public ru.kamenetskii.yarns.api.v1.service.GetByIdResponse getById(ru.kamenetskii.yarns.api.v1.service.GetByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByIdMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<ru.kamenetskii.yarns.api.v1.service.RegisterResponse> register(
        ru.kamenetskii.yarns.api.v1.service.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.kamenetskii.yarns.api.v1.service.GetByIdResponse> getById(
        ru.kamenetskii.yarns.api.v1.service.GetByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_GET_BY_ID = 1;

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
        case METHODID_REGISTER:
          serviceImpl.register((ru.kamenetskii.yarns.api.v1.service.RegisterRequest) request,
              (io.grpc.stub.StreamObserver<ru.kamenetskii.yarns.api.v1.service.RegisterResponse>) responseObserver);
          break;
        case METHODID_GET_BY_ID:
          serviceImpl.getById((ru.kamenetskii.yarns.api.v1.service.GetByIdRequest) request,
              (io.grpc.stub.StreamObserver<ru.kamenetskii.yarns.api.v1.service.GetByIdResponse>) responseObserver);
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
          getRegisterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ru.kamenetskii.yarns.api.v1.service.RegisterRequest,
              ru.kamenetskii.yarns.api.v1.service.RegisterResponse>(
                service, METHODID_REGISTER)))
        .addMethod(
          getGetByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ru.kamenetskii.yarns.api.v1.service.GetByIdRequest,
              ru.kamenetskii.yarns.api.v1.service.GetByIdResponse>(
                service, METHODID_GET_BY_ID)))
        .build();
  }

  private static abstract class YarnsApiV1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    YarnsApiV1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.kamenetskii.yarns.api.v1.service.ServiceProto.getDescriptor();
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
              .addMethod(getRegisterMethod())
              .addMethod(getGetByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
