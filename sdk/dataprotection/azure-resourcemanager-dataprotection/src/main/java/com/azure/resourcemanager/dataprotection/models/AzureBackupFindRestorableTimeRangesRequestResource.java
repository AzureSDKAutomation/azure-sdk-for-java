// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** List Restore Ranges Request. */
@Fluent
public final class AzureBackupFindRestorableTimeRangesRequestResource extends DppWorkerRequest {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(AzureBackupFindRestorableTimeRangesRequestResource.class);

    /*
     * AzureBackupFindRestorableTimeRangesRequestResource content
     */
    @JsonProperty(value = "content")
    private AzureBackupFindRestorableTimeRangesRequest content;

    /**
     * Get the content property: AzureBackupFindRestorableTimeRangesRequestResource content.
     *
     * @return the content value.
     */
    public AzureBackupFindRestorableTimeRangesRequest content() {
        return this.content;
    }

    /**
     * Set the content property: AzureBackupFindRestorableTimeRangesRequestResource content.
     *
     * @param content the content value to set.
     * @return the AzureBackupFindRestorableTimeRangesRequestResource object itself.
     */
    public AzureBackupFindRestorableTimeRangesRequestResource withContent(
        AzureBackupFindRestorableTimeRangesRequest content) {
        this.content = content;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBackupFindRestorableTimeRangesRequestResource withSubscriptionId(String subscriptionId) {
        super.withSubscriptionId(subscriptionId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBackupFindRestorableTimeRangesRequestResource withUri(String uri) {
        super.withUri(uri);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBackupFindRestorableTimeRangesRequestResource withHeaders(Map<String, List<String>> headers) {
        super.withHeaders(headers);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBackupFindRestorableTimeRangesRequestResource withSupportedGroupVersions(
        List<String> supportedGroupVersions) {
        super.withSupportedGroupVersions(supportedGroupVersions);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBackupFindRestorableTimeRangesRequestResource withCultureInfo(String cultureInfo) {
        super.withCultureInfo(cultureInfo);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBackupFindRestorableTimeRangesRequestResource withParameters(Map<String, String> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBackupFindRestorableTimeRangesRequestResource withHttpMethod(String httpMethod) {
        super.withHttpMethod(httpMethod);
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
        if (content() != null) {
            content().validate();
        }
    }
}
