// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: v1/service/service.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package pro.yarns.api.v1.service;

@kotlin.jvm.JvmName("-initializegetUsersByIdsRequest")
public inline fun getUsersByIdsRequest(block: pro.yarns.api.v1.service.GetUsersByIdsRequestKt.Dsl.() -> kotlin.Unit): pro.yarns.api.v1.service.GetUsersByIdsRequest =
  pro.yarns.api.v1.service.GetUsersByIdsRequestKt.Dsl._create(pro.yarns.api.v1.service.GetUsersByIdsRequest.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `pro.yarns.api.v1.service.GetUsersByIdsRequest`
 */
public object GetUsersByIdsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: pro.yarns.api.v1.service.GetUsersByIdsRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
      internal fun _create(builder: pro.yarns.api.v1.service.GetUsersByIdsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
  @kotlin.PublishedApi
    internal fun _build(): pro.yarns.api.v1.service.GetUsersByIdsRequest = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class UserIdsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated int64 userIds = 1 [json_name = "userIds"];`
     */
     public val userIds: com.google.protobuf.kotlin.DslList<kotlin.Long, UserIdsProxy>
      @kotlin.jvm.JvmSynthetic
  get() = com.google.protobuf.kotlin.DslList(
        _builder.userIdsList
      )
    /**
     * `repeated int64 userIds = 1 [json_name = "userIds"];`
     * @param value The userIds to add.
     */
    @kotlin.jvm.JvmSynthetic
@kotlin.jvm.JvmName("addUserIds")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Long, UserIdsProxy>.add(value: kotlin.Long) {
      _builder.addUserIds(value)
    }/**
     * `repeated int64 userIds = 1 [json_name = "userIds"];`
     * @param value The userIds to add.
     */
    @kotlin.jvm.JvmSynthetic
@kotlin.jvm.JvmName("plusAssignUserIds")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, UserIdsProxy>.plusAssign(value: kotlin.Long) {
      add(value)
    }/**
     * `repeated int64 userIds = 1 [json_name = "userIds"];`
     * @param values The userIds to add.
     */
    @kotlin.jvm.JvmSynthetic
@kotlin.jvm.JvmName("addAllUserIds")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Long, UserIdsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.Long>) {
      _builder.addAllUserIds(values)
    }/**
     * `repeated int64 userIds = 1 [json_name = "userIds"];`
     * @param values The userIds to add.
     */
    @kotlin.jvm.JvmSynthetic
@kotlin.jvm.JvmName("plusAssignAllUserIds")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, UserIdsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.Long>) {
      addAll(values)
    }/**
     * `repeated int64 userIds = 1 [json_name = "userIds"];`
     * @param index The index to set the value at.
     * @param value The userIds to set.
     */
    @kotlin.jvm.JvmSynthetic
@kotlin.jvm.JvmName("setUserIds")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.Long, UserIdsProxy>.set(index: kotlin.Int, value: kotlin.Long) {
      _builder.setUserIds(index, value)
    }/**
     * `repeated int64 userIds = 1 [json_name = "userIds"];`
     */
    @kotlin.jvm.JvmSynthetic
@kotlin.jvm.JvmName("clearUserIds")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Long, UserIdsProxy>.clear() {
      _builder.clearUserIds()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun pro.yarns.api.v1.service.GetUsersByIdsRequest.copy(block: `pro.yarns.api.v1.service`.GetUsersByIdsRequestKt.Dsl.() -> kotlin.Unit): pro.yarns.api.v1.service.GetUsersByIdsRequest =
  `pro.yarns.api.v1.service`.GetUsersByIdsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

