package ru.kamenetskii.yarns.api.v1.service

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
import ru.kamenetskii.yarns.api.v1.service.YarnsApiV1Grpc.getServiceDescriptor

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * ru.kamenetskii.yarns.api.v1.service.YarnsApiV1.
 */
public object YarnsApiV1GrpcKt {
  public const val SERVICE_NAME: String = YarnsApiV1Grpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val registerMethod: MethodDescriptor<RegisterRequest, RegisterResponse>
    @JvmStatic
    get() = YarnsApiV1Grpc.getRegisterMethod()

  public val getByIdMethod: MethodDescriptor<GetByIdRequest, GetByIdResponse>
    @JvmStatic
    get() = YarnsApiV1Grpc.getGetByIdMethod()

  /**
   * A stub for issuing RPCs to a(n) ru.kamenetskii.yarns.api.v1.service.YarnsApiV1 service as
   * suspending coroutines.
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
    public suspend fun register(request: RegisterRequest, headers: Metadata = Metadata()):
        RegisterResponse = unaryRpc(
      channel,
      YarnsApiV1Grpc.getRegisterMethod(),
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
    public suspend fun getById(request: GetByIdRequest, headers: Metadata = Metadata()):
        GetByIdResponse = unaryRpc(
      channel,
      YarnsApiV1Grpc.getGetByIdMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the ru.kamenetskii.yarns.api.v1.service.YarnsApiV1 service based on
   * Kotlin coroutines.
   */
  public abstract class YarnsApiV1CoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for ru.kamenetskii.yarns.api.v1.service.YarnsApiV1.Register.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun register(request: RegisterRequest): RegisterResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method ru.kamenetskii.yarns.api.v1.service.YarnsApiV1.Register is unimplemented"))

    /**
     * Returns the response to an RPC for ru.kamenetskii.yarns.api.v1.service.YarnsApiV1.GetById.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getById(request: GetByIdRequest): GetByIdResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method ru.kamenetskii.yarns.api.v1.service.YarnsApiV1.GetById is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = YarnsApiV1Grpc.getRegisterMethod(),
      implementation = ::register
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = YarnsApiV1Grpc.getGetByIdMethod(),
      implementation = ::getById
    )).build()
  }
}
