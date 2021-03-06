// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: thermometer.proto

package thermometer;

public final class ThermometerServiceImpl {
  private ThermometerServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_thermometer_PowerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_thermometer_PowerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_thermometer_PowerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_thermometer_PowerResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_thermometer_TempRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_thermometer_TempRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_thermometer_TempResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_thermometer_TempResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021thermometer.proto\022\013thermometer\"\035\n\014Powe" +
      "rRequest\022\r\n\005power\030\001 \001(\010\"\036\n\rPowerResponse" +
      "\022\r\n\005power\030\001 \001(\010\"\"\n\013TempRequest\022\023\n\013temper" +
      "ature\030\001 \001(\005\"#\n\014TempResponse\022\023\n\013temperatu" +
      "re\030\001 \001(\0052\242\001\n\022ThermometerService\022F\n\013power" +
      "Switch\022\031.thermometer.PowerRequest\032\032.ther" +
      "mometer.PowerResponse\"\000\022D\n\tcheckTemp\022\030.t" +
      "hermometer.TempRequest\032\031.thermometer.Tem" +
      "pResponse\"\0000\001B\'\n\013thermometerB\026Thermomete" +
      "rServiceImplP\001b\006proto3"
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
    internal_static_thermometer_PowerRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_thermometer_PowerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_thermometer_PowerRequest_descriptor,
        new java.lang.String[] { "Power", });
    internal_static_thermometer_PowerResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_thermometer_PowerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_thermometer_PowerResponse_descriptor,
        new java.lang.String[] { "Power", });
    internal_static_thermometer_TempRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_thermometer_TempRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_thermometer_TempRequest_descriptor,
        new java.lang.String[] { "Temperature", });
    internal_static_thermometer_TempResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_thermometer_TempResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_thermometer_TempResponse_descriptor,
        new java.lang.String[] { "Temperature", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
