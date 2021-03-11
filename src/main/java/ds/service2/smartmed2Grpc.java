package ds.service2;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: service2.proto")
public final class smartmed2Grpc {

  private smartmed2Grpc() {}

  public static final String SERVICE_NAME = "smartmed2";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.service2.RequestMessage,
      ds.service2.ResponseMessage> getSmartmed3DoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "smartmed3_do",
      requestType = ds.service2.RequestMessage.class,
      responseType = ds.service2.ResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.service2.RequestMessage,
      ds.service2.ResponseMessage> getSmartmed3DoMethod() {
    io.grpc.MethodDescriptor<ds.service2.RequestMessage, ds.service2.ResponseMessage> getSmartmed3DoMethod;
    if ((getSmartmed3DoMethod = smartmed2Grpc.getSmartmed3DoMethod) == null) {
      synchronized (smartmed2Grpc.class) {
        if ((getSmartmed3DoMethod = smartmed2Grpc.getSmartmed3DoMethod) == null) {
          smartmed2Grpc.getSmartmed3DoMethod = getSmartmed3DoMethod = 
              io.grpc.MethodDescriptor.<ds.service2.RequestMessage, ds.service2.ResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartmed2", "smartmed3_do"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.RequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.ResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new smartmed2MethodDescriptorSupplier("smartmed3_do"))
                  .build();
          }
        }
     }
     return getSmartmed3DoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service2.RequestMessage,
      ds.service2.ResponseMessage> getSmartmed4DoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "smartmed4_do",
      requestType = ds.service2.RequestMessage.class,
      responseType = ds.service2.ResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service2.RequestMessage,
      ds.service2.ResponseMessage> getSmartmed4DoMethod() {
    io.grpc.MethodDescriptor<ds.service2.RequestMessage, ds.service2.ResponseMessage> getSmartmed4DoMethod;
    if ((getSmartmed4DoMethod = smartmed2Grpc.getSmartmed4DoMethod) == null) {
      synchronized (smartmed2Grpc.class) {
        if ((getSmartmed4DoMethod = smartmed2Grpc.getSmartmed4DoMethod) == null) {
          smartmed2Grpc.getSmartmed4DoMethod = getSmartmed4DoMethod = 
              io.grpc.MethodDescriptor.<ds.service2.RequestMessage, ds.service2.ResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smartmed2", "smartmed4_do"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.RequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service2.ResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new smartmed2MethodDescriptorSupplier("smartmed4_do"))
                  .build();
          }
        }
     }
     return getSmartmed4DoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static smartmed2Stub newStub(io.grpc.Channel channel) {
    return new smartmed2Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static smartmed2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new smartmed2BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static smartmed2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new smartmed2FutureStub(channel);
  }

  /**
   */
  public static abstract class smartmed2ImplBase implements io.grpc.BindableService {

    /**
     */
    public void smartmed3Do(ds.service2.RequestMessage request,
        io.grpc.stub.StreamObserver<ds.service2.ResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getSmartmed3DoMethod(), responseObserver);
    }

    /**
     */
    public void smartmed4Do(ds.service2.RequestMessage request,
        io.grpc.stub.StreamObserver<ds.service2.ResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getSmartmed4DoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSmartmed3DoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.service2.RequestMessage,
                ds.service2.ResponseMessage>(
                  this, METHODID_SMARTMED3_DO)))
          .addMethod(
            getSmartmed4DoMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.service2.RequestMessage,
                ds.service2.ResponseMessage>(
                  this, METHODID_SMARTMED4_DO)))
          .build();
    }
  }

  /**
   */
  public static final class smartmed2Stub extends io.grpc.stub.AbstractStub<smartmed2Stub> {
    private smartmed2Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartmed2Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartmed2Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartmed2Stub(channel, callOptions);
    }

    /**
     */
    public void smartmed3Do(ds.service2.RequestMessage request,
        io.grpc.stub.StreamObserver<ds.service2.ResponseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSmartmed3DoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void smartmed4Do(ds.service2.RequestMessage request,
        io.grpc.stub.StreamObserver<ds.service2.ResponseMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSmartmed4DoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class smartmed2BlockingStub extends io.grpc.stub.AbstractStub<smartmed2BlockingStub> {
    private smartmed2BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartmed2BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartmed2BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartmed2BlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.service2.ResponseMessage smartmed3Do(ds.service2.RequestMessage request) {
      return blockingUnaryCall(
          getChannel(), getSmartmed3DoMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ds.service2.ResponseMessage> smartmed4Do(
        ds.service2.RequestMessage request) {
      return blockingServerStreamingCall(
          getChannel(), getSmartmed4DoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class smartmed2FutureStub extends io.grpc.stub.AbstractStub<smartmed2FutureStub> {
    private smartmed2FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartmed2FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartmed2FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartmed2FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.service2.ResponseMessage> smartmed3Do(
        ds.service2.RequestMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getSmartmed3DoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SMARTMED3_DO = 0;
  private static final int METHODID_SMARTMED4_DO = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final smartmed2ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(smartmed2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SMARTMED3_DO:
          serviceImpl.smartmed3Do((ds.service2.RequestMessage) request,
              (io.grpc.stub.StreamObserver<ds.service2.ResponseMessage>) responseObserver);
          break;
        case METHODID_SMARTMED4_DO:
          serviceImpl.smartmed4Do((ds.service2.RequestMessage) request,
              (io.grpc.stub.StreamObserver<ds.service2.ResponseMessage>) responseObserver);
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

  private static abstract class smartmed2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    smartmed2BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.service2.Service2Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("smartmed2");
    }
  }

  private static final class smartmed2FileDescriptorSupplier
      extends smartmed2BaseDescriptorSupplier {
    smartmed2FileDescriptorSupplier() {}
  }

  private static final class smartmed2MethodDescriptorSupplier
      extends smartmed2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    smartmed2MethodDescriptorSupplier(String methodName) {
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
      synchronized (smartmed2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new smartmed2FileDescriptorSupplier())
              .addMethod(getSmartmed3DoMethod())
              .addMethod(getSmartmed4DoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
