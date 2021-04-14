// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TLS settings for the resource. */
@Fluent
public final class WebPubSubTlsSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WebPubSubTlsSettings.class);

    /*
     * Request client certificate during TLS handshake if enabled
     */
    @JsonProperty(value = "clientCertEnabled")
    private Boolean clientCertEnabled;

    /**
     * Get the clientCertEnabled property: Request client certificate during TLS handshake if enabled.
     *
     * @return the clientCertEnabled value.
     */
    public Boolean clientCertEnabled() {
        return this.clientCertEnabled;
    }

    /**
     * Set the clientCertEnabled property: Request client certificate during TLS handshake if enabled.
     *
     * @param clientCertEnabled the clientCertEnabled value to set.
     * @return the WebPubSubTlsSettings object itself.
     */
    public WebPubSubTlsSettings withClientCertEnabled(Boolean clientCertEnabled) {
        this.clientCertEnabled = clientCertEnabled;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
