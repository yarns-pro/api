// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: v1/service/service.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package pro.yarns.api.v1.service;

@kotlin.jvm.JvmName("-initializeregisterUserResponse")
public inline fun registerUserResponse(block: pro.yarns.api.v1.service.RegisterUserResponseKt.Dsl.() -> kotlin.Unit): pro.yarns.api.v1.service.RegisterUserResponse =
  pro.yarns.api.v1.service.RegisterUserResponseKt.Dsl._create(pro.yarns.api.v1.service.RegisterUserResponse.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `pro.yarns.api.v1.service.RegisterUserResponse`
 */
public object RegisterUserResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: pro.yarns.api.v1.service.RegisterUserResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
      internal fun _create(builder: pro.yarns.api.v1.service.RegisterUserResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
  @kotlin.PublishedApi
    internal fun _build(): pro.yarns.api.v1.service.RegisterUserResponse = _builder.build()

    /**
     * `.pro.yarns.api.v1.entity.User user = 1 [json_name = "user"];`
     */
    public var user: pro.yarns.api.v1.entity.UserOuterClass.User
      @kotlin.jvm.JvmName("getUser")
        get() = _builder.user
      @kotlin.jvm.JvmName("setUser")
        set(value) {
        _builder.user = value
      }
    /**
     * `.pro.yarns.api.v1.entity.User user = 1 [json_name = "user"];`
     */
    public fun clearUser() {
      _builder.clearUser()
    }
    /**
     * `.pro.yarns.api.v1.entity.User user = 1 [json_name = "user"];`
     * @return Whether the user field is set.
     */
    public fun hasUser(): kotlin.Boolean {
      return _builder.hasUser()
    }

    public val RegisterUserResponseKt.Dsl.userOrNull: pro.yarns.api.v1.entity.UserOuterClass.User?
      get() = _builder.userOrNull
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun pro.yarns.api.v1.service.RegisterUserResponse.copy(block: `pro.yarns.api.v1.service`.RegisterUserResponseKt.Dsl.() -> kotlin.Unit): pro.yarns.api.v1.service.RegisterUserResponse =
  `pro.yarns.api.v1.service`.RegisterUserResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val pro.yarns.api.v1.service.RegisterUserResponseOrBuilder.userOrNull: pro.yarns.api.v1.entity.UserOuterClass.User?
  get() = if (hasUser()) getUser() else null

