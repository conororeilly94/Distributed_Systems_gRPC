// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service1.proto

package thermometer;

public final class Service1Impl {
  private Service1Impl() {}
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
    internal_static_thermometer_TemperatureRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_thermometer_TemperatureRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_thermometer_TemperatureResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_thermometer_TemperatureResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016service1.proto\022\013thermometer\"\035\n\014PowerRe" +
      "quest\022\r\n\005power\030\001 \001(\010\"\036\n\rPowerResponse\022\r\n" +
      "\005power\030\001 \001(\010\")\n\022TemperatureRequest\022\023\n\013te" +
      "mperature\030\001 \001(\005\"*\n\023TemperatureResponse\022\023" +
      "\n\013temperature\030\001 \001(\0052\250\001\n\tsmartmed1\022F\n\013pow" +
      "erSwitch\022\031.thermometer.PowerRequest\032\032.th" +
      "ermometer.PowerResponse\"\000\022S\n\nchangeTemp\022" +
      "\037.thermometer.TemperatureRequest\032 .therm" +
      "ometer.TemperatureResponse\"\0000\001B\035\n\013thermo" +
      "meterB\014Service1ImplP\001b\006proto3"
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
    internal_static_thermometer_TemperatureRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_thermometer_TemperatureRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_thermometer_TemperatureRequest_descriptor,
        new java.lang.String[] { "Temperature", });
    internal_static_thermometer_TemperatureResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_thermometer_TemperatureResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_thermometer_TemperatureResponse_descriptor,
        new java.lang.String[] { "Temperature", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
