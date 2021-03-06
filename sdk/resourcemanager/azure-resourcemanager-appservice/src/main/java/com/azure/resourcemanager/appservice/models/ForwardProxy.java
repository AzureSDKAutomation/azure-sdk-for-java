// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ForwardProxy model. */
@JsonFlatten
@Fluent
public class ForwardProxy extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ForwardProxy.class);

    /*
     * The convention property.
     */
    @JsonProperty(value = "properties.convention")
    private ForwardProxyConvention convention;

    /*
     * The customHostHeaderName property.
     */
    @JsonProperty(value = "properties.customHostHeaderName")
    private String customHostHeaderName;

    /*
     * The customProtoHeaderName property.
     */
    @JsonProperty(value = "properties.customProtoHeaderName")
    private String customProtoHeaderName;

    /**
     * Get the convention property: The convention property.
     *
     * @return the convention value.
     */
    public ForwardProxyConvention convention() {
        return this.convention;
    }

    /**
     * Set the convention property: The convention property.
     *
     * @param convention the convention value to set.
     * @return the ForwardProxy object itself.
     */
    public ForwardProxy withConvention(ForwardProxyConvention convention) {
        this.convention = convention;
        return this;
    }

    /**
     * Get the customHostHeaderName property: The customHostHeaderName property.
     *
     * @return the customHostHeaderName value.
     */
    public String customHostHeaderName() {
        return this.customHostHeaderName;
    }

    /**
     * Set the customHostHeaderName property: The customHostHeaderName property.
     *
     * @param customHostHeaderName the customHostHeaderName value to set.
     * @return the ForwardProxy object itself.
     */
    public ForwardProxy withCustomHostHeaderName(String customHostHeaderName) {
        this.customHostHeaderName = customHostHeaderName;
        return this;
    }

    /**
     * Get the customProtoHeaderName property: The customProtoHeaderName property.
     *
     * @return the customProtoHeaderName value.
     */
    public String customProtoHeaderName() {
        return this.customProtoHeaderName;
    }

    /**
     * Set the customProtoHeaderName property: The customProtoHeaderName property.
     *
     * @param customProtoHeaderName the customProtoHeaderName value to set.
     * @return the ForwardProxy object itself.
     */
    public ForwardProxy withCustomProtoHeaderName(String customProtoHeaderName) {
        this.customProtoHeaderName = customProtoHeaderName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ForwardProxy withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
