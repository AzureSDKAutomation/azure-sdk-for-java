/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2018_06_01_preview.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.sql.v2018_06_01_preview.ManagementOperationState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A managed instance operation.
 */
@JsonFlatten
public class ManagedInstanceOperationInner extends ProxyResource {
    /**
     * The name of the managed instance the operation is being performed on.
     */
    @JsonProperty(value = "properties.managedInstanceName", access = JsonProperty.Access.WRITE_ONLY)
    private String managedInstanceName;

    /**
     * The name of operation.
     */
    @JsonProperty(value = "properties.operation", access = JsonProperty.Access.WRITE_ONLY)
    private String operation;

    /**
     * The friendly name of operation.
     */
    @JsonProperty(value = "properties.operationFriendlyName", access = JsonProperty.Access.WRITE_ONLY)
    private String operationFriendlyName;

    /**
     * The percentage of the operation completed.
     */
    @JsonProperty(value = "properties.percentComplete", access = JsonProperty.Access.WRITE_ONLY)
    private Integer percentComplete;

    /**
     * The operation start time.
     */
    @JsonProperty(value = "properties.startTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startTime;

    /**
     * The operation state. Possible values include: 'Pending', 'InProgress',
     * 'Succeeded', 'Failed', 'CancelInProgress', 'Cancelled'.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private ManagementOperationState state;

    /**
     * The operation error code.
     */
    @JsonProperty(value = "properties.errorCode", access = JsonProperty.Access.WRITE_ONLY)
    private Integer errorCode;

    /**
     * The operation error description.
     */
    @JsonProperty(value = "properties.errorDescription", access = JsonProperty.Access.WRITE_ONLY)
    private String errorDescription;

    /**
     * The operation error severity.
     */
    @JsonProperty(value = "properties.errorSeverity", access = JsonProperty.Access.WRITE_ONLY)
    private Integer errorSeverity;

    /**
     * Whether or not the error is a user error.
     */
    @JsonProperty(value = "properties.isUserError", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isUserError;

    /**
     * The estimated completion time of the operation.
     */
    @JsonProperty(value = "properties.estimatedCompletionTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime estimatedCompletionTime;

    /**
     * The operation description.
     */
    @JsonProperty(value = "properties.description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Whether the operation can be cancelled.
     */
    @JsonProperty(value = "properties.isCancellable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isCancellable;

    /**
     * Get the name of the managed instance the operation is being performed on.
     *
     * @return the managedInstanceName value
     */
    public String managedInstanceName() {
        return this.managedInstanceName;
    }

    /**
     * Get the name of operation.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Get the friendly name of operation.
     *
     * @return the operationFriendlyName value
     */
    public String operationFriendlyName() {
        return this.operationFriendlyName;
    }

    /**
     * Get the percentage of the operation completed.
     *
     * @return the percentComplete value
     */
    public Integer percentComplete() {
        return this.percentComplete;
    }

    /**
     * Get the operation start time.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the operation state. Possible values include: 'Pending', 'InProgress', 'Succeeded', 'Failed', 'CancelInProgress', 'Cancelled'.
     *
     * @return the state value
     */
    public ManagementOperationState state() {
        return this.state;
    }

    /**
     * Get the operation error code.
     *
     * @return the errorCode value
     */
    public Integer errorCode() {
        return this.errorCode;
    }

    /**
     * Get the operation error description.
     *
     * @return the errorDescription value
     */
    public String errorDescription() {
        return this.errorDescription;
    }

    /**
     * Get the operation error severity.
     *
     * @return the errorSeverity value
     */
    public Integer errorSeverity() {
        return this.errorSeverity;
    }

    /**
     * Get whether or not the error is a user error.
     *
     * @return the isUserError value
     */
    public Boolean isUserError() {
        return this.isUserError;
    }

    /**
     * Get the estimated completion time of the operation.
     *
     * @return the estimatedCompletionTime value
     */
    public DateTime estimatedCompletionTime() {
        return this.estimatedCompletionTime;
    }

    /**
     * Get the operation description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Get whether the operation can be cancelled.
     *
     * @return the isCancellable value
     */
    public Boolean isCancellable() {
        return this.isCancellable;
    }

}
