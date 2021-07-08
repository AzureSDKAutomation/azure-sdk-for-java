// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.quota.models.QuotaRequestState;
import com.azure.resourcemanager.quota.models.SubRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** List of quota requests with details. */
@JsonFlatten
@Fluent
public class QuotaRequestDetailsInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QuotaRequestDetailsInner.class);

    /*
     * Quota request ID.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Quota request name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Resource type. "Microsoft.Quota/quotaLimits"
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The quota request status.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private QuotaRequestState provisioningState;

    /*
     * User-friendly status message.
     */
    @JsonProperty(value = "properties.message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * The quota request submission time. The date conforms to the following
     * format specified by the ISO 8601 standard: yyyy-MM-ddTHH:mm:ssZ
     */
    @JsonProperty(value = "properties.requestSubmitTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime requestSubmitTime;

    /*
     * Quota request details.
     */
    @JsonProperty(value = "properties.value")
    private List<SubRequest> value;

    /**
     * Get the id property: Quota request ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: Quota request name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Resource type. "Microsoft.Quota/quotaLimits".
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the provisioningState property: The quota request status.
     *
     * @return the provisioningState value.
     */
    public QuotaRequestState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the message property: User-friendly status message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the requestSubmitTime property: The quota request submission time. The date conforms to the following format
     * specified by the ISO 8601 standard: yyyy-MM-ddTHH:mm:ssZ.
     *
     * @return the requestSubmitTime value.
     */
    public OffsetDateTime requestSubmitTime() {
        return this.requestSubmitTime;
    }

    /**
     * Get the value property: Quota request details.
     *
     * @return the value value.
     */
    public List<SubRequest> value() {
        return this.value;
    }

    /**
     * Set the value property: Quota request details.
     *
     * @param value the value value to set.
     * @return the QuotaRequestDetailsInner object itself.
     */
    public QuotaRequestDetailsInner withValue(List<SubRequest> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
