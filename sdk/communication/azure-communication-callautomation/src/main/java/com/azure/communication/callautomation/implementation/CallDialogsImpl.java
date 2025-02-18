// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation;

import com.azure.communication.callautomation.implementation.models.CommunicationErrorResponseException;
import com.azure.communication.callautomation.implementation.models.DialogStateResponse;
import com.azure.communication.callautomation.implementation.models.StartDialogRequest;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in CallDialogs. */
public final class CallDialogsImpl {
    /** The proxy service used to perform REST calls. */
    private final CallDialogsService service;

    /** The service client containing this operation class. */
    private final AzureCommunicationCallAutomationServiceImpl client;

    /**
     * Initializes an instance of CallDialogsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    CallDialogsImpl(AzureCommunicationCallAutomationServiceImpl client) {
        this.service =
                RestProxy.create(CallDialogsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureCommunicationCallAutomationServiceCallDialogs to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "AzureCommunicationCa")
    public interface CallDialogsService {
        @Put("/calling/callConnections/{callConnectionId}/dialogs/{dialogId}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<DialogStateResponse>> startDialog(
                @HostParam("endpoint") String endpoint,
                @PathParam("callConnectionId") String callConnectionId,
                @PathParam("dialogId") String dialogId,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") StartDialogRequest startDialogRequest,
                @HeaderParam("Accept") String accept,
                Context context);

        @Delete("/calling/callConnections/{callConnectionId}/dialogs/{dialogId}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<Void>> stopDialog(
                @HostParam("endpoint") String endpoint,
                @PathParam("callConnectionId") String callConnectionId,
                @PathParam("dialogId") String dialogId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Start a dialog.
     *
     * @param callConnectionId The call connection id.
     * @param dialogId The dialog id.
     * @param startDialogRequest The start dialog request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DialogStateResponse>> startDialogWithResponseAsync(
            String callConnectionId, String dialogId, StartDialogRequest startDialogRequest) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.startDialog(
                                this.client.getEndpoint(),
                                callConnectionId,
                                dialogId,
                                this.client.getApiVersion(),
                                startDialogRequest,
                                accept,
                                context));
    }

    /**
     * Start a dialog.
     *
     * @param callConnectionId The call connection id.
     * @param dialogId The dialog id.
     * @param startDialogRequest The start dialog request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DialogStateResponse>> startDialogWithResponseAsync(
            String callConnectionId, String dialogId, StartDialogRequest startDialogRequest, Context context) {
        final String accept = "application/json";
        return service.startDialog(
                this.client.getEndpoint(),
                callConnectionId,
                dialogId,
                this.client.getApiVersion(),
                startDialogRequest,
                accept,
                context);
    }

    /**
     * Start a dialog.
     *
     * @param callConnectionId The call connection id.
     * @param dialogId The dialog id.
     * @param startDialogRequest The start dialog request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DialogStateResponse> startDialogAsync(
            String callConnectionId, String dialogId, StartDialogRequest startDialogRequest) {
        return startDialogWithResponseAsync(callConnectionId, dialogId, startDialogRequest)
                .flatMap(
                        (Response<DialogStateResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Start a dialog.
     *
     * @param callConnectionId The call connection id.
     * @param dialogId The dialog id.
     * @param startDialogRequest The start dialog request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DialogStateResponse> startDialogAsync(
            String callConnectionId, String dialogId, StartDialogRequest startDialogRequest, Context context) {
        return startDialogWithResponseAsync(callConnectionId, dialogId, startDialogRequest, context)
                .flatMap(
                        (Response<DialogStateResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Start a dialog.
     *
     * @param callConnectionId The call connection id.
     * @param dialogId The dialog id.
     * @param startDialogRequest The start dialog request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DialogStateResponse startDialog(
            String callConnectionId, String dialogId, StartDialogRequest startDialogRequest) {
        return startDialogAsync(callConnectionId, dialogId, startDialogRequest).block();
    }

    /**
     * Start a dialog.
     *
     * @param callConnectionId The call connection id.
     * @param dialogId The dialog id.
     * @param startDialogRequest The start dialog request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DialogStateResponse> startDialogWithResponse(
            String callConnectionId, String dialogId, StartDialogRequest startDialogRequest, Context context) {
        return startDialogWithResponseAsync(callConnectionId, dialogId, startDialogRequest, context).block();
    }

    /**
     * Stop a dialog.
     *
     * @param callConnectionId The call connection id.
     * @param dialogId The dialog id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> stopDialogWithResponseAsync(String callConnectionId, String dialogId) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.stopDialog(
                                this.client.getEndpoint(),
                                callConnectionId,
                                dialogId,
                                this.client.getApiVersion(),
                                accept,
                                context));
    }

    /**
     * Stop a dialog.
     *
     * @param callConnectionId The call connection id.
     * @param dialogId The dialog id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> stopDialogWithResponseAsync(String callConnectionId, String dialogId, Context context) {
        final String accept = "application/json";
        return service.stopDialog(
                this.client.getEndpoint(), callConnectionId, dialogId, this.client.getApiVersion(), accept, context);
    }

    /**
     * Stop a dialog.
     *
     * @param callConnectionId The call connection id.
     * @param dialogId The dialog id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> stopDialogAsync(String callConnectionId, String dialogId) {
        return stopDialogWithResponseAsync(callConnectionId, dialogId).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Stop a dialog.
     *
     * @param callConnectionId The call connection id.
     * @param dialogId The dialog id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> stopDialogAsync(String callConnectionId, String dialogId, Context context) {
        return stopDialogWithResponseAsync(callConnectionId, dialogId, context)
                .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Stop a dialog.
     *
     * @param callConnectionId The call connection id.
     * @param dialogId The dialog id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void stopDialog(String callConnectionId, String dialogId) {
        stopDialogAsync(callConnectionId, dialogId).block();
    }

    /**
     * Stop a dialog.
     *
     * @param callConnectionId The call connection id.
     * @param dialogId The dialog id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> stopDialogWithResponse(String callConnectionId, String dialogId, Context context) {
        return stopDialogWithResponseAsync(callConnectionId, dialogId, context).block();
    }
}
