package aircon;

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
    comments = "Source: aircon.proto")
public final class AirconServiceGrpc {

  private AirconServiceGrpc() {}

  public static final String SERVICE_NAME = "aircon.AirconService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<aircon.PowerRequest,
      aircon.PowerResponse> getPowerSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "powerSwitch",
      requestType = aircon.PowerRequest.class,
      responseType = aircon.PowerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<aircon.PowerRequest,
      aircon.PowerResponse> getPowerSwitchMethod() {
    io.grpc.MethodDescriptor<aircon.PowerRequest, aircon.PowerResponse> getPowerSwitchMethod;
    if ((getPowerSwitchMethod = AirconServiceGrpc.getPowerSwitchMethod) == null) {
      synchronized (AirconServiceGrpc.class) {
        if ((getPowerSwitchMethod = AirconServiceGrpc.getPowerSwitchMethod) == null) {
          AirconServiceGrpc.getPowerSwitchMethod = getPowerSwitchMethod = 
              io.grpc.MethodDescriptor.<aircon.PowerRequest, aircon.PowerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "aircon.AirconService", "powerSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aircon.PowerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aircon.PowerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirconServiceMethodDescriptorSupplier("powerSwitch"))
                  .build();
          }
        }
     }
     return getPowerSwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<aircon.Empty,
      aircon.AdjustTempResponse> getGetHeatingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHeating",
      requestType = aircon.Empty.class,
      responseType = aircon.AdjustTempResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<aircon.Empty,
      aircon.AdjustTempResponse> getGetHeatingMethod() {
    io.grpc.MethodDescriptor<aircon.Empty, aircon.AdjustTempResponse> getGetHeatingMethod;
    if ((getGetHeatingMethod = AirconServiceGrpc.getGetHeatingMethod) == null) {
      synchronized (AirconServiceGrpc.class) {
        if ((getGetHeatingMethod = AirconServiceGrpc.getGetHeatingMethod) == null) {
          AirconServiceGrpc.getGetHeatingMethod = getGetHeatingMethod = 
              io.grpc.MethodDescriptor.<aircon.Empty, aircon.AdjustTempResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "aircon.AirconService", "getHeating"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aircon.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  aircon.AdjustTempResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AirconServiceMethodDescriptorSupplier("getHeating"))
                  .build();
          }
        }
     }
     return getGetHeatingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AirconServiceStub newStub(io.grpc.Channel channel) {
    return new AirconServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AirconServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AirconServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AirconServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AirconServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AirconServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void powerSwitch(aircon.PowerRequest request,
        io.grpc.stub.StreamObserver<aircon.PowerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPowerSwitchMethod(), responseObserver);
    }

    /**
     */
    public void getHeating(aircon.Empty request,
        io.grpc.stub.StreamObserver<aircon.AdjustTempResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHeatingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPowerSwitchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                aircon.PowerRequest,
                aircon.PowerResponse>(
                  this, METHODID_POWER_SWITCH)))
          .addMethod(
            getGetHeatingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                aircon.Empty,
                aircon.AdjustTempResponse>(
                  this, METHODID_GET_HEATING)))
          .build();
    }
  }

  /**
   */
  public static final class AirconServiceStub extends io.grpc.stub.AbstractStub<AirconServiceStub> {
    private AirconServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirconServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirconServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirconServiceStub(channel, callOptions);
    }

    /**
     */
    public void powerSwitch(aircon.PowerRequest request,
        io.grpc.stub.StreamObserver<aircon.PowerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPowerSwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHeating(aircon.Empty request,
        io.grpc.stub.StreamObserver<aircon.AdjustTempResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHeatingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AirconServiceBlockingStub extends io.grpc.stub.AbstractStub<AirconServiceBlockingStub> {
    private AirconServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirconServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirconServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirconServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public aircon.PowerResponse powerSwitch(aircon.PowerRequest request) {
      return blockingUnaryCall(
          getChannel(), getPowerSwitchMethod(), getCallOptions(), request);
    }

    /**
     */
    public aircon.AdjustTempResponse getHeating(aircon.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetHeatingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AirconServiceFutureStub extends io.grpc.stub.AbstractStub<AirconServiceFutureStub> {
    private AirconServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirconServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirconServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirconServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<aircon.PowerResponse> powerSwitch(
        aircon.PowerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPowerSwitchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<aircon.AdjustTempResponse> getHeating(
        aircon.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHeatingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POWER_SWITCH = 0;
  private static final int METHODID_GET_HEATING = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AirconServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AirconServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_POWER_SWITCH:
          serviceImpl.powerSwitch((aircon.PowerRequest) request,
              (io.grpc.stub.StreamObserver<aircon.PowerResponse>) responseObserver);
          break;
        case METHODID_GET_HEATING:
          serviceImpl.getHeating((aircon.Empty) request,
              (io.grpc.stub.StreamObserver<aircon.AdjustTempResponse>) responseObserver);
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

  private static abstract class AirconServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AirconServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return aircon.AirconImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AirconService");
    }
  }

  private static final class AirconServiceFileDescriptorSupplier
      extends AirconServiceBaseDescriptorSupplier {
    AirconServiceFileDescriptorSupplier() {}
  }

  private static final class AirconServiceMethodDescriptorSupplier
      extends AirconServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AirconServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AirconServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AirconServiceFileDescriptorSupplier())
              .addMethod(getPowerSwitchMethod())
              .addMethod(getGetHeatingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
