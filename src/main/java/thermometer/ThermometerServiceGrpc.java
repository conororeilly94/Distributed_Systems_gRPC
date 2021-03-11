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
    comments = "Source: thermometer.proto")
public final class ThermometerServiceGrpc {

  private ThermometerServiceGrpc() {}

  public static final String SERVICE_NAME = "thermometer.ThermometerService";

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
    if ((getPowerSwitchMethod = ThermometerServiceGrpc.getPowerSwitchMethod) == null) {
      synchronized (ThermometerServiceGrpc.class) {
        if ((getPowerSwitchMethod = ThermometerServiceGrpc.getPowerSwitchMethod) == null) {
          ThermometerServiceGrpc.getPowerSwitchMethod = getPowerSwitchMethod = 
              io.grpc.MethodDescriptor.<thermometer.PowerRequest, thermometer.PowerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "thermometer.ThermometerService", "powerSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  thermometer.PowerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  thermometer.PowerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ThermometerServiceMethodDescriptorSupplier("powerSwitch"))
                  .build();
          }
        }
     }
     return getPowerSwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<thermometer.Empty,
      thermometer.TempResponse> getChangeTempMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeTemp",
      requestType = thermometer.Empty.class,
      responseType = thermometer.TempResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<thermometer.Empty,
      thermometer.TempResponse> getChangeTempMethod() {
    io.grpc.MethodDescriptor<thermometer.Empty, thermometer.TempResponse> getChangeTempMethod;
    if ((getChangeTempMethod = ThermometerServiceGrpc.getChangeTempMethod) == null) {
      synchronized (ThermometerServiceGrpc.class) {
        if ((getChangeTempMethod = ThermometerServiceGrpc.getChangeTempMethod) == null) {
          ThermometerServiceGrpc.getChangeTempMethod = getChangeTempMethod = 
              io.grpc.MethodDescriptor.<thermometer.Empty, thermometer.TempResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "thermometer.ThermometerService", "changeTemp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  thermometer.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  thermometer.TempResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ThermometerServiceMethodDescriptorSupplier("changeTemp"))
                  .build();
          }
        }
     }
     return getChangeTempMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ThermometerServiceStub newStub(io.grpc.Channel channel) {
    return new ThermometerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ThermometerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ThermometerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ThermometerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ThermometerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ThermometerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void powerSwitch(thermometer.PowerRequest request,
        io.grpc.stub.StreamObserver<thermometer.PowerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPowerSwitchMethod(), responseObserver);
    }

    /**
     */
    public void changeTemp(thermometer.Empty request,
        io.grpc.stub.StreamObserver<thermometer.TempResponse> responseObserver) {
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
                thermometer.Empty,
                thermometer.TempResponse>(
                  this, METHODID_CHANGE_TEMP)))
          .build();
    }
  }

  /**
   */
  public static final class ThermometerServiceStub extends io.grpc.stub.AbstractStub<ThermometerServiceStub> {
    private ThermometerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ThermometerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ThermometerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ThermometerServiceStub(channel, callOptions);
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
    public void changeTemp(thermometer.Empty request,
        io.grpc.stub.StreamObserver<thermometer.TempResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getChangeTempMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ThermometerServiceBlockingStub extends io.grpc.stub.AbstractStub<ThermometerServiceBlockingStub> {
    private ThermometerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ThermometerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ThermometerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ThermometerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public thermometer.PowerResponse powerSwitch(thermometer.PowerRequest request) {
      return blockingUnaryCall(
          getChannel(), getPowerSwitchMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<thermometer.TempResponse> changeTemp(
        thermometer.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getChangeTempMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ThermometerServiceFutureStub extends io.grpc.stub.AbstractStub<ThermometerServiceFutureStub> {
    private ThermometerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ThermometerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ThermometerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ThermometerServiceFutureStub(channel, callOptions);
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
    private final ThermometerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ThermometerServiceImplBase serviceImpl, int methodId) {
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
          serviceImpl.changeTemp((thermometer.Empty) request,
              (io.grpc.stub.StreamObserver<thermometer.TempResponse>) responseObserver);
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

  private static abstract class ThermometerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ThermometerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return thermometer.ThermometerServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ThermometerService");
    }
  }

  private static final class ThermometerServiceFileDescriptorSupplier
      extends ThermometerServiceBaseDescriptorSupplier {
    ThermometerServiceFileDescriptorSupplier() {}
  }

  private static final class ThermometerServiceMethodDescriptorSupplier
      extends ThermometerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ThermometerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ThermometerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ThermometerServiceFileDescriptorSupplier())
              .addMethod(getPowerSwitchMethod())
              .addMethod(getChangeTempMethod())
              .build();
        }
      }
    }
    return result;
  }
}
