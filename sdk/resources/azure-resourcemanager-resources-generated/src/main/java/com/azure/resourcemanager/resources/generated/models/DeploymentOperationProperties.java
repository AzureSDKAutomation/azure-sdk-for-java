// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Deployment operation properties. */
@Immutable
public final class DeploymentOperationProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeploymentOperationProperties.class);

    /*
     * The name of the current provisioning operation.
     */
    @JsonProperty(value = "provisioningOperation", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningOperation provisioningOperation;

    /*
     * The state of the provisioning.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The date and time of the operation.
     */
    @JsonProperty(value = "timestamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timestamp;

    /*
     * The duration of the operation.
     */
    @JsonProperty(value = "duration", access = JsonProperty.Access.WRITE_ONLY)
    private String duration;

    /*
     * Deployment operation service request id.
     */
    @JsonProperty(value = "serviceRequestId", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceRequestId;

    /*
     * Operation status code from the resource provider. This property may not
     * be set if a response has not yet been received.
     */
    @JsonProperty(value = "statusCode", access = JsonProperty.Access.WRITE_ONLY)
    private String statusCode;

    /*
     * Operation status message from the resource provider. This property is
     * optional.  It will only be provided if an error was received from the
     * resource provider.
     */
    @JsonProperty(value = "statusMessage", access = JsonProperty.Access.WRITE_ONLY)
    private StatusMessage statusMessage;

    /*
     * The target resource.
     */
    @JsonProperty(value = "targetResource", access = JsonProperty.Access.WRITE_ONLY)
    private TargetResource targetResource;

    /*
     * The HTTP request message.
     */
    @JsonProperty(value = "request", access = JsonProperty.Access.WRITE_ONLY)
    private HttpMessage request;

    /*
     * The HTTP response message.
     */
    @JsonProperty(value = "response", access = JsonProperty.Access.WRITE_ONLY)
    private HttpMessage response;

    /**
     * Get the provisioningOperation property: The name of the current provisioning operation.
     *
     * @return the provisioningOperation value.
     */
    public ProvisioningOperation provisioningOperation() {
        return this.provisioningOperation;
    }

    /**
     * Get the provisioningState property: The state of the provisioning.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the timestamp property: The date and time of the operation.
     *
     * @return the timestamp value.
     */
    public OffsetDateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Get the duration property: The duration of the operation.
     *
     * @return the duration value.
     */
    public String duration() {
        return this.duration;
    }

    /**
     * Get the serviceRequestId property: Deployment operation service request id.
     *
     * @return the serviceRequestId value.
     */
    public String serviceRequestId() {
        return this.serviceRequestId;
    }

    /**
     * Get the statusCode property: Operation status code from the resource provider. This property may not be set if a
     * response has not yet been received.
     *
     * @return the statusCode value.
     */
    public String statusCode() {
        return this.statusCode;
    }

    /**
     * Get the statusMessage property: Operation status message from the resource provider. This property is optional.
     * It will only be provided if an error was received from the resource provider.
     *
     * @return the statusMessage value.
     */
    public StatusMessage statusMessage() {
        return this.statusMessage;
    }

    /**
     * Get the targetResource property: The target resource.
     *
     * @return the targetResource value.
     */
    public TargetResource targetResource() {
        return this.targetResource;
    }

    /**
     * Get the request property: The HTTP request message.
     *
     * @return the request value.
     */
    public HttpMessage request() {
        return this.request;
    }

    /**
     * Get the response property: The HTTP response message.
     *
     * @return the response value.
     */
    public HttpMessage response() {
        return this.response;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (statusMessage() != null) {
            statusMessage().validate();
        }
        if (targetResource() != null) {
            targetResource().validate();
        }
        if (request() != null) {
            request().validate();
        }
        if (response() != null) {
            response().validate();
        }
    }
}
