package ds.service3;

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
    comments = "Source: service3.proto")
public final class smartmed3Grpc {

  private smartmed3Grpc() {}

  public static final String SERVICE_NAME = "smartmed3";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.service3.RequestMessage,
      ds.service3.ResponseMessage> getSmartmed5DoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "smartmed5_do",
      requestType = ds.service3.RequestMessage.class,
      responseType = ds.service3.ResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.service3.RequestMessage,
      ds.service3.ResponseMessage> getSmartmed5DoMethod() {
    io.grpc.MethodDescriptor<ds.service3.RequestMessage, ds.service3.ResponseMessage> getSmartmed5DoMethod;
    if ((getSmartmed5DoMethod = smartmed3Grpc.getSmartmed5DoMethod) == null) {
      synchronized (smartmed3Grpc.class) {
        if ((getSmartmed5DoMethod = smartmed3Grpc.getSmartmed5DoMethod) == null) {
          smartmed3Grpc.getSmartmed5DoMethod = getSmartmed5DoMethod = 
              io.grpc.MethodDescriptor.<ds.service3.RequestMessage, ds.service3.ResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smartmed3", "smartmed5_do"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.RequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.ResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new smartmed3MethodDescriptorSupplier("smartmed5_do"))
                  .build();
          }
        }
     }
     return getSmartmed5DoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.service3.RequestMessage,
      ds.service3.ResponseMessage> getSmartmed6DoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "smartmed6_do",
      requestType = ds.service3.RequestMessage.class,
      responseType = ds.service3.ResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ds.service3.RequestMessage,
      ds.service3.ResponseMessage> getSmartmed6DoMethod() {
    io.grpc.MethodDescriptor<ds.service3.RequestMessage, ds.service3.ResponseMessage> getSmartmed6DoMethod;
    if ((getSmartmed6DoMethod = smartmed3Grpc.getSmartmed6DoMethod) == null) {
      synchronized (smartmed3Grpc.class) {
        if ((getSmartmed6DoMethod = smartmed3Grpc.getSmartmed6DoMethod) == null) {
          smartmed3Grpc.getSmartmed6DoMethod = getSmartmed6DoMethod = 
              io.grpc.MethodDescriptor.<ds.service3.RequestMessage, ds.service3.ResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smartmed3", "smartmed6_do"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.RequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.service3.ResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new smartmed3MethodDescriptorSupplier("smartmed6_do"))
                  .build();
          }
        }
     }
     return getSmartmed6DoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static smartmed3Stub newStub(io.grpc.Channel channel) {
    return new smartmed3Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static smartmed3BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new smartmed3BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static smartmed3FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new smartmed3FutureStub(channel);
  }

  /**
   */
  public static abstract class smartmed3ImplBase implements io.grpc.BindableService {

    /**
     */
    public void smartmed5Do(ds.service3.RequestMessage request,
        io.grpc.stub.StreamObserver<ds.service3.ResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getSmartmed5DoMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.service3.RequestMessage> smartmed6Do(
        io.grpc.stub.StreamObserver<ds.service3.ResponseMessage> responseObserver) {
      return asyncUnimplementedStreamingCall(getSmartmed6DoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSmartmed5DoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.service3.RequestMessage,
                ds.service3.ResponseMessage>(
                  this, METHODID_SMARTMED5_DO)))
          .addMethod(
            getSmartmed6DoMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ds.service3.RequestMessage,
                ds.service3.ResponseMessage>(
                  this, METHODID_SMARTMED6_DO)))
          .build();
    }
  }

  /**
   */
  public static final class smartmed3Stub extends io.grpc.stub.AbstractStub<smartmed3Stub> {
    private smartmed3Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartmed3Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartmed3Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartmed3Stub(channel, callOptions);
    }

    /**
     */
    public void smartmed5Do(ds.service3.RequestMessage request,
        io.grpc.stub.StreamObserver<ds.service3.ResponseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSmartmed5DoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<ds.service3.RequestMessage> smartmed6Do(
        io.grpc.stub.StreamObserver<ds.service3.ResponseMessage> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSmartmed6DoMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class smartmed3BlockingStub extends io.grpc.stub.AbstractStub<smartmed3BlockingStub> {
    private smartmed3BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartmed3BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartmed3BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartmed3BlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.service3.ResponseMessage smartmed5Do(ds.service3.RequestMessage request) {
      return blockingUnaryCall(
          getChannel(), getSmartmed5DoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class smartmed3FutureStub extends io.grpc.stub.AbstractStub<smartmed3FutureStub> {
    private smartmed3FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartmed3FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartmed3FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartmed3FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.service3.ResponseMessage> smartmed5Do(
        ds.service3.RequestMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getSmartmed5DoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SMARTMED5_DO = 0;
  private static final int METHODID_SMARTMED6_DO = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final smartmed3ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(smartmed3ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SMARTMED5_DO:
          serviceImpl.smartmed5Do((ds.service3.RequestMessage) request,
              (io.grpc.stub.StreamObserver<ds.service3.ResponseMessage>) responseObserver);
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
        case METHODID_SMARTMED6_DO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.smartmed6Do(
              (io.grpc.stub.StreamObserver<ds.service3.ResponseMessage>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class smartmed3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    smartmed3BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.service3.Service3Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("smartmed3");
    }
  }

  private static final class smartmed3FileDescriptorSupplier
      extends smartmed3BaseDescriptorSupplier {
    smartmed3FileDescriptorSupplier() {}
  }

  private static final class smartmed3MethodDescriptorSupplier
      extends smartmed3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    smartmed3MethodDescriptorSupplier(String methodName) {
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
      synchronized (smartmed3Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new smartmed3FileDescriptorSupplier())
              .addMethod(getSmartmed5DoMethod())
              .addMethod(getSmartmed6DoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
