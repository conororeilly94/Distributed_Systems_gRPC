package thermometer;

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
    comments = "Source: service1.proto")
public final class smartmed1Grpc {

  private smartmed1Grpc() {}

  public static final String SERVICE_NAME = "thermometer.smartmed1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<thermometer.PowerRequest,
      thermometer.PowerResponse> getPowerSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "powerSwitch",
      requestType = thermometer.PowerRequest.class,
      responseType = thermometer.PowerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<thermometer.PowerRequest,
      thermometer.PowerResponse> getPowerSwitchMethod() {
    io.grpc.MethodDescriptor<thermometer.PowerRequest, thermometer.PowerResponse> getPowerSwitchMethod;
    if ((getPowerSwitchMethod = smartmed1Grpc.getPowerSwitchMethod) == null) {
      synchronized (smartmed1Grpc.class) {
        if ((getPowerSwitchMethod = smartmed1Grpc.getPowerSwitchMethod) == null) {
          smartmed1Grpc.getPowerSwitchMethod = getPowerSwitchMethod = 
              io.grpc.MethodDescriptor.<thermometer.PowerRequest, thermometer.PowerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "thermometer.smartmed1", "powerSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  thermometer.PowerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  thermometer.PowerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new smartmed1MethodDescriptorSupplier("powerSwitch"))
                  .build();
          }
        }
     }
     return getPowerSwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<thermometer.TemperatureRequest,
      thermometer.TemperatureResponse> getChangeTempMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeTemp",
      requestType = thermometer.TemperatureRequest.class,
      responseType = thermometer.TemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<thermometer.TemperatureRequest,
      thermometer.TemperatureResponse> getChangeTempMethod() {
    io.grpc.MethodDescriptor<thermometer.TemperatureRequest, thermometer.TemperatureResponse> getChangeTempMethod;
    if ((getChangeTempMethod = smartmed1Grpc.getChangeTempMethod) == null) {
      synchronized (smartmed1Grpc.class) {
        if ((getChangeTempMethod = smartmed1Grpc.getChangeTempMethod) == null) {
          smartmed1Grpc.getChangeTempMethod = getChangeTempMethod = 
              io.grpc.MethodDescriptor.<thermometer.TemperatureRequest, thermometer.TemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "thermometer.smartmed1", "changeTemp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  thermometer.TemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  thermometer.TemperatureResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new smartmed1MethodDescriptorSupplier("changeTemp"))
                  .build();
          }
        }
     }
     return getChangeTempMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static smartmed1Stub newStub(io.grpc.Channel channel) {
    return new smartmed1Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static smartmed1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new smartmed1BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static smartmed1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new smartmed1FutureStub(channel);
  }

  /**
   */
  public static abstract class smartmed1ImplBase implements io.grpc.BindableService {

    /**
     */
    public void powerSwitch(thermometer.PowerRequest request,
        io.grpc.stub.StreamObserver<thermometer.PowerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPowerSwitchMethod(), responseObserver);
    }

    /**
     */
    public void changeTemp(thermometer.TemperatureRequest request,
        io.grpc.stub.StreamObserver<thermometer.TemperatureResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeTempMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPowerSwitchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                thermometer.PowerRequest,
                thermometer.PowerResponse>(
                  this, METHODID_POWER_SWITCH)))
          .addMethod(
            getChangeTempMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                thermometer.TemperatureRequest,
                thermometer.TemperatureResponse>(
                  this, METHODID_CHANGE_TEMP)))
          .build();
    }
  }

  /**
   */
  public static final class smartmed1Stub extends io.grpc.stub.AbstractStub<smartmed1Stub> {
    private smartmed1Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartmed1Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartmed1Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartmed1Stub(channel, callOptions);
    }

    /**
     */
    public void powerSwitch(thermometer.PowerRequest request,
        io.grpc.stub.StreamObserver<thermometer.PowerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPowerSwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeTemp(thermometer.TemperatureRequest request,
        io.grpc.stub.StreamObserver<thermometer.TemperatureResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeTempMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class smartmed1BlockingStub extends io.grpc.stub.AbstractStub<smartmed1BlockingStub> {
    private smartmed1BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartmed1BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartmed1BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartmed1BlockingStub(channel, callOptions);
    }

    /**
     */
    public thermometer.PowerResponse powerSwitch(thermometer.PowerRequest request) {
      return blockingUnaryCall(
          getChannel(), getPowerSwitchMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<thermometer.TemperatureResponse> changeTemp(
        thermometer.TemperatureRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeTempMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class smartmed1FutureStub extends io.grpc.stub.AbstractStub<smartmed1FutureStub> {
    private smartmed1FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private smartmed1FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected smartmed1FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new smartmed1FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<thermometer.PowerResponse> powerSwitch(
        thermometer.PowerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPowerSwitchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POWER_SWITCH = 0;
  private static final int METHODID_CHANGE_TEMP = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final smartmed1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(smartmed1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_POWER_SWITCH:
          serviceImpl.powerSwitch((thermometer.PowerRequest) request,
              (io.grpc.stub.StreamObserver<thermometer.PowerResponse>) responseObserver);
          break;
        case METHODID_CHANGE_TEMP:
          serviceImpl.changeTemp((thermometer.TemperatureRequest) request,
              (io.grpc.stub.StreamObserver<thermometer.TemperatureResponse>) responseObserver);
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

  private static abstract class smartmed1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    smartmed1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return thermometer.Service1Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("smartmed1");
    }
  }

  private static final class smartmed1FileDescriptorSupplier
      extends smartmed1BaseDescriptorSupplier {
    smartmed1FileDescriptorSupplier() {}
  }

  private static final class smartmed1MethodDescriptorSupplier
      extends smartmed1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    smartmed1MethodDescriptorSupplier(String methodName) {
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
      synchronized (smartmed1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new smartmed1FileDescriptorSupplier())
              .addMethod(getPowerSwitchMethod())
              .addMethod(getChangeTempMethod())
              .build();
        }
      }
    }
    return result;
  }
}
