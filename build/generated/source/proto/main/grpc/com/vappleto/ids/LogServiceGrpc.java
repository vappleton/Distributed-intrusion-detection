package com.vappleto.ids;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: log.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LogServiceGrpc {

  private LogServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ids.LogService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.vappleto.ids.LogRequest,
      com.vappleto.ids.LogResponse> getSendLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendLog",
      requestType = com.vappleto.ids.LogRequest.class,
      responseType = com.vappleto.ids.LogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.vappleto.ids.LogRequest,
      com.vappleto.ids.LogResponse> getSendLogMethod() {
    io.grpc.MethodDescriptor<com.vappleto.ids.LogRequest, com.vappleto.ids.LogResponse> getSendLogMethod;
    if ((getSendLogMethod = LogServiceGrpc.getSendLogMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getSendLogMethod = LogServiceGrpc.getSendLogMethod) == null) {
          LogServiceGrpc.getSendLogMethod = getSendLogMethod =
              io.grpc.MethodDescriptor.<com.vappleto.ids.LogRequest, com.vappleto.ids.LogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendLog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vappleto.ids.LogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vappleto.ids.LogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("sendLog"))
              .build();
        }
      }
    }
    return getSendLogMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LogServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogServiceStub>() {
        @java.lang.Override
        public LogServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogServiceStub(channel, callOptions);
        }
      };
    return LogServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LogServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogServiceBlockingStub>() {
        @java.lang.Override
        public LogServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogServiceBlockingStub(channel, callOptions);
        }
      };
    return LogServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LogServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogServiceFutureStub>() {
        @java.lang.Override
        public LogServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogServiceFutureStub(channel, callOptions);
        }
      };
    return LogServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void sendLog(com.vappleto.ids.LogRequest request,
        io.grpc.stub.StreamObserver<com.vappleto.ids.LogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendLogMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LogService.
   */
  public static abstract class LogServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LogServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LogService.
   */
  public static final class LogServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LogServiceStub> {
    private LogServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendLog(com.vappleto.ids.LogRequest request,
        io.grpc.stub.StreamObserver<com.vappleto.ids.LogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendLogMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LogService.
   */
  public static final class LogServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LogServiceBlockingStub> {
    private LogServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.vappleto.ids.LogResponse sendLog(com.vappleto.ids.LogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendLogMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LogService.
   */
  public static final class LogServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LogServiceFutureStub> {
    private LogServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.vappleto.ids.LogResponse> sendLog(
        com.vappleto.ids.LogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendLogMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_LOG = 0;

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
        case METHODID_SEND_LOG:
          serviceImpl.sendLog((com.vappleto.ids.LogRequest) request,
              (io.grpc.stub.StreamObserver<com.vappleto.ids.LogResponse>) responseObserver);
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
          getSendLogMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.vappleto.ids.LogRequest,
              com.vappleto.ids.LogResponse>(
                service, METHODID_SEND_LOG)))
        .build();
  }

  private static abstract class LogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LogServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.vappleto.ids.Log.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LogService");
    }
  }

  private static final class LogServiceFileDescriptorSupplier
      extends LogServiceBaseDescriptorSupplier {
    LogServiceFileDescriptorSupplier() {}
  }

  private static final class LogServiceMethodDescriptorSupplier
      extends LogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LogServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LogServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LogServiceFileDescriptorSupplier())
              .addMethod(getSendLogMethod())
              .build();
        }
      }
    }
    return result;
  }
}
