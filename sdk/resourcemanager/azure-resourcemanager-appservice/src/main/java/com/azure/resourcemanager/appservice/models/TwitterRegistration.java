// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TwitterRegistration model. */
@JsonFlatten
@Fluent
public class TwitterRegistration extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TwitterRegistration.class);

    /*
     * The consumerKey property.
     */
    @JsonProperty(value = "properties.consumerKey")
    private String consumerKey;

    /*
     * The consumerSecretSettingName property.
     */
    @JsonProperty(value = "properties.consumerSecretSettingName")
    private String consumerSecretSettingName;

    /**
     * Get the consumerKey property: The consumerKey property.
     *
     * @return the consumerKey value.
     */
    public String consumerKey() {
        return this.consumerKey;
    }

    /**
     * Set the consumerKey property: The consumerKey property.
     *
     * @param consumerKey the consumerKey value to set.
     * @return the TwitterRegistration object itself.
     */
    public TwitterRegistration withConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
        return this;
    }

    /**
     * Get the consumerSecretSettingName property: The consumerSecretSettingName property.
     *
     * @return the consumerSecretSettingName value.
     */
    public String consumerSecretSettingName() {
        return this.consumerSecretSettingName;
    }

    /**
     * Set the consumerSecretSettingName property: The consumerSecretSettingName property.
     *
     * @param consumerSecretSettingName the consumerSecretSettingName value to set.
     * @return the TwitterRegistration object itself.
     */
    public TwitterRegistration withConsumerSecretSettingName(String consumerSecretSettingName) {
        this.consumerSecretSettingName = consumerSecretSettingName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TwitterRegistration withKind(String kind) {
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
