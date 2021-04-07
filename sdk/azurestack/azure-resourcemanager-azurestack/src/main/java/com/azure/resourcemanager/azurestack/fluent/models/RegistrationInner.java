// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Registration information. */
@JsonFlatten
@Fluent
public class RegistrationInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RegistrationInner.class);

    /*
     * The object identifier associated with the Azure Stack connecting to
     * Azure.
     */
    @JsonProperty(value = "properties.objectId")
    private String objectId;

    /*
     * The identifier of the registered Azure Stack.
     */
    @JsonProperty(value = "properties.cloudId")
    private String cloudId;

    /*
     * Specifies the billing mode for the Azure Stack registration.
     */
    @JsonProperty(value = "properties.billingModel")
    private String billingModel;

    /*
     * The kind of the resource.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The entity tag used for optimistic concurrency when modifying the
     * resource.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the objectId property: The object identifier associated with the Azure Stack connecting to Azure.
     *
     * @return the objectId value.
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Set the objectId property: The object identifier associated with the Azure Stack connecting to Azure.
     *
     * @param objectId the objectId value to set.
     * @return the RegistrationInner object itself.
     */
    public RegistrationInner withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * Get the cloudId property: The identifier of the registered Azure Stack.
     *
     * @return the cloudId value.
     */
    public String cloudId() {
        return this.cloudId;
    }

    /**
     * Set the cloudId property: The identifier of the registered Azure Stack.
     *
     * @param cloudId the cloudId value to set.
     * @return the RegistrationInner object itself.
     */
    public RegistrationInner withCloudId(String cloudId) {
        this.cloudId = cloudId;
        return this;
    }

    /**
     * Get the billingModel property: Specifies the billing mode for the Azure Stack registration.
     *
     * @return the billingModel value.
     */
    public String billingModel() {
        return this.billingModel;
    }

    /**
     * Set the billingModel property: Specifies the billing mode for the Azure Stack registration.
     *
     * @param billingModel the billingModel value to set.
     * @return the RegistrationInner object itself.
     */
    public RegistrationInner withBillingModel(String billingModel) {
        this.billingModel = billingModel;
        return this;
    }

    /**
     * Get the kind property: The kind of the resource.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the etag property: The entity tag used for optimistic concurrency when modifying the resource.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The entity tag used for optimistic concurrency when modifying the resource.
     *
     * @param etag the etag value to set.
     * @return the RegistrationInner object itself.
     */
    public RegistrationInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RegistrationInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RegistrationInner withTags(Map<String, String> tags) {
        super.withTags(tags);
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
