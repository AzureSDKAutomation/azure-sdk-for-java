// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An azure function receiver. */
@Fluent
public final class AzureFunctionReceiver {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureFunctionReceiver.class);

    /*
     * The name of the azure function receiver. Names must be unique across all
     * receivers within an action group.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The azure resource id of the function app.
     */
    @JsonProperty(value = "functionAppResourceId", required = true)
    private String functionAppResourceId;

    /*
     * The function name in the function app.
     */
    @JsonProperty(value = "functionName", required = true)
    private String functionName;

    /*
     * The http trigger url where http request sent to.
     */
    @JsonProperty(value = "httpTriggerUrl", required = true)
    private String httpTriggerUrl;

    /*
     * Indicates whether to use common alert schema.
     */
    @JsonProperty(value = "useCommonAlertSchema")
    private Boolean useCommonAlertSchema;

    /**
     * Get the name property: The name of the azure function receiver. Names must be unique across all receivers within
     * an action group.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the azure function receiver. Names must be unique across all receivers within
     * an action group.
     *
     * @param name the name value to set.
     * @return the AzureFunctionReceiver object itself.
     */
    public AzureFunctionReceiver withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the functionAppResourceId property: The azure resource id of the function app.
     *
     * @return the functionAppResourceId value.
     */
    public String functionAppResourceId() {
        return this.functionAppResourceId;
    }

    /**
     * Set the functionAppResourceId property: The azure resource id of the function app.
     *
     * @param functionAppResourceId the functionAppResourceId value to set.
     * @return the AzureFunctionReceiver object itself.
     */
    public AzureFunctionReceiver withFunctionAppResourceId(String functionAppResourceId) {
        this.functionAppResourceId = functionAppResourceId;
        return this;
    }

    /**
     * Get the functionName property: The function name in the function app.
     *
     * @return the functionName value.
     */
    public String functionName() {
        return this.functionName;
    }

    /**
     * Set the functionName property: The function name in the function app.
     *
     * @param functionName the functionName value to set.
     * @return the AzureFunctionReceiver object itself.
     */
    public AzureFunctionReceiver withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * Get the httpTriggerUrl property: The http trigger url where http request sent to.
     *
     * @return the httpTriggerUrl value.
     */
    public String httpTriggerUrl() {
        return this.httpTriggerUrl;
    }

    /**
     * Set the httpTriggerUrl property: The http trigger url where http request sent to.
     *
     * @param httpTriggerUrl the httpTriggerUrl value to set.
     * @return the AzureFunctionReceiver object itself.
     */
    public AzureFunctionReceiver withHttpTriggerUrl(String httpTriggerUrl) {
        this.httpTriggerUrl = httpTriggerUrl;
        return this;
    }

    /**
     * Get the useCommonAlertSchema property: Indicates whether to use common alert schema.
     *
     * @return the useCommonAlertSchema value.
     */
    public Boolean useCommonAlertSchema() {
        return this.useCommonAlertSchema;
    }

    /**
     * Set the useCommonAlertSchema property: Indicates whether to use common alert schema.
     *
     * @param useCommonAlertSchema the useCommonAlertSchema value to set.
     * @return the AzureFunctionReceiver object itself.
     */
    public AzureFunctionReceiver withUseCommonAlertSchema(Boolean useCommonAlertSchema) {
        this.useCommonAlertSchema = useCommonAlertSchema;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model AzureFunctionReceiver"));
        }
        if (functionAppResourceId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property functionAppResourceId in model AzureFunctionReceiver"));
        }
        if (functionName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property functionName in model AzureFunctionReceiver"));
        }
        if (httpTriggerUrl() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property httpTriggerUrl in model AzureFunctionReceiver"));
        }
    }
}
