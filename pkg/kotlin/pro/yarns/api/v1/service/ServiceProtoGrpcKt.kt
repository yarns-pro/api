package pro.yarns.api.v1.service

import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import pro.yarns.api.v1.service.YarnsApiV1Grpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for pro.yarns.api.v1.service.YarnsApiV1.
 */
public object YarnsApiV1GrpcKt {
  public const val SERVICE_NAME: String = YarnsApiV1Grpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val registerUserMethod: MethodDescriptor<RegisterUserRequest, RegisterUserResponse>
    @JvmStatic
    get() = YarnsApiV1Grpc.getRegisterUserMethod()

  public val getUsersByIdsMethod: MethodDescriptor<GetUsersByIdsRequest, GetUsersByIdsResponse>
    @JvmStatic
    get() = YarnsApiV1Grpc.getGetUsersByIdsMethod()

  public val sendMessageMethod: MethodDescriptor<SendMessageRequest, SendMessageResponse>
    @JvmStatic
    get() = YarnsApiV1Grpc.getSendMessageMethod()

  public val checkMessagesMethod: MethodDescriptor<CheckMessagesRequest, CheckMessagesResponse>
    @JvmStatic
    get() = YarnsApiV1Grpc.getCheckMessagesMethod()

  public val confirmMessagesMethod:
      MethodDescriptor<ConfirmMessagesRequest, ConfirmMessagesResponse>
    @JvmStatic
    get() = YarnsApiV1Grpc.getConfirmMessagesMethod()

  /**
   * A stub for issuing RPCs to a(n) pro.yarns.api.v1.service.YarnsApiV1 service as suspending
   * coroutines.
   */
  @StubFor(YarnsApiV1Grpc::class)
  public class YarnsApiV1CoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<YarnsApiV1CoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): YarnsApiV1CoroutineStub =
        YarnsApiV1CoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun registerUser(request: RegisterUserRequest, headers: Metadata = Metadata()):
        RegisterUserResponse = unaryRpc(
      channel,
      YarnsApiV1Grpc.getRegisterUserMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getUsersByIds(request: GetUsersByIdsRequest, headers: Metadata = Metadata()):
        GetUsersByIdsResponse = unaryRpc(
      channel,
      YarnsApiV1Grpc.getGetUsersByIdsMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun sendMessage(request: SendMessageRequest, headers: Metadata = Metadata()):
        SendMessageResponse = unaryRpc(
      channel,
      YarnsApiV1Grpc.getSendMessageMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun checkMessages(request: CheckMessagesRequest, headers: Metadata = Metadata()):
        CheckMessagesResponse = unaryRpc(
      channel,
      YarnsApiV1Grpc.getCheckMessagesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun confirmMessages(request: ConfirmMessagesRequest, headers: Metadata =
        Metadata()): ConfirmMessagesResponse = unaryRpc(
      channel,
      YarnsApiV1Grpc.getConfirmMessagesMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the pro.yarns.api.v1.service.YarnsApiV1 service based on Kotlin
   * coroutines.
   */
  public abstract class YarnsApiV1CoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for pro.yarns.api.v1.service.YarnsApiV1.RegisterUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun registerUser(request: RegisterUserRequest): RegisterUserResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method pro.yarns.api.v1.service.YarnsApiV1.RegisterUser is unimplemented"))

    /**
     * Returns the response to an RPC for pro.yarns.api.v1.service.YarnsApiV1.GetUsersByIds.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getUsersByIds(request: GetUsersByIdsRequest): GetUsersByIdsResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method pro.yarns.api.v1.service.YarnsApiV1.GetUsersByIds is unimplemented"))

    /**
     * Returns the response to an RPC for pro.yarns.api.v1.service.YarnsApiV1.SendMessage.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun sendMessage(request: SendMessageRequest): SendMessageResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method pro.yarns.api.v1.service.YarnsApiV1.SendMessage is unimplemented"))

    /**
     * Returns the response to an RPC for pro.yarns.api.v1.service.YarnsApiV1.CheckMessages.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun checkMessages(request: CheckMessagesRequest): CheckMessagesResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method pro.yarns.api.v1.service.YarnsApiV1.CheckMessages is unimplemented"))

    /**
     * Returns the response to an RPC for pro.yarns.api.v1.service.YarnsApiV1.ConfirmMessages.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun confirmMessages(request: ConfirmMessagesRequest):
        ConfirmMessagesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method pro.yarns.api.v1.service.YarnsApiV1.ConfirmMessages is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = YarnsApiV1Grpc.getRegisterUserMethod(),
      implementation = ::registerUser
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = YarnsApiV1Grpc.getGetUsersByIdsMethod(),
      implementation = ::getUsersByIds
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = YarnsApiV1Grpc.getSendMessageMethod(),
      implementation = ::sendMessage
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = YarnsApiV1Grpc.getCheckMessagesMethod(),
      implementation = ::checkMessages
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = YarnsApiV1Grpc.getConfirmMessagesMethod(),
      implementation = ::confirmMessages
    )).build()
  }
}
