// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: v1/service/service.proto
// Protobuf Java Version: 4.31.1

package pro.yarns.api.v1.service;

@com.google.protobuf.Generated
public interface CheckMessagesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pro.yarns.api.v1.service.CheckMessagesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .pro.yarns.api.v1.entity.Message messages = 1 [json_name = "messages"];</code>
   */
  java.util.List<pro.yarns.api.v1.entity.MessageOuterClass.Message> 
      getMessagesList();
  /**
   * <code>repeated .pro.yarns.api.v1.entity.Message messages = 1 [json_name = "messages"];</code>
   */
  pro.yarns.api.v1.entity.MessageOuterClass.Message getMessages(int index);
  /**
   * <code>repeated .pro.yarns.api.v1.entity.Message messages = 1 [json_name = "messages"];</code>
   */
  int getMessagesCount();
  /**
   * <code>repeated .pro.yarns.api.v1.entity.Message messages = 1 [json_name = "messages"];</code>
   */
  java.util.List<? extends pro.yarns.api.v1.entity.MessageOuterClass.MessageOrBuilder> 
      getMessagesOrBuilderList();
  /**
   * <code>repeated .pro.yarns.api.v1.entity.Message messages = 1 [json_name = "messages"];</code>
   */
  pro.yarns.api.v1.entity.MessageOuterClass.MessageOrBuilder getMessagesOrBuilder(
      int index);
}
