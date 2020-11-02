/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appconfiguration.v2020_07_01_preview.implementation;

import com.microsoft.azure.management.appconfiguration.v2020_07_01_preview.ProvisioningState;
import com.microsoft.azure.management.appconfiguration.v2020_07_01_preview.EventFilter;
import com.microsoft.azure.management.appconfiguration.v2020_07_01_preview.SubscriberIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The event grid filter resource along with all resource properties.
 */
@JsonFlatten
public class EventGridFilterInner extends ProxyResource {
    /**
     * The provisioning state of the event grid filter. Possible values
     * include: 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Failed',
     * 'Canceled'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Properties describing the filtering behavior of the event grid filter.
     */
    @JsonProperty(value = "properties.filter", access = JsonProperty.Access.WRITE_ONLY)
    private EventFilter filter;

    /**
     * Information describing the event subscriber.
     */
    @JsonProperty(value = "properties.subscriberIdentityInfo", access = JsonProperty.Access.WRITE_ONLY)
    private SubscriberIdentityInfo subscriberIdentityInfo;

    /**
     * Get the provisioning state of the event grid filter. Possible values include: 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Failed', 'Canceled'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get properties describing the filtering behavior of the event grid filter.
     *
     * @return the filter value
     */
    public EventFilter filter() {
        return this.filter;
    }

    /**
     * Get information describing the event subscriber.
     *
     * @return the subscriberIdentityInfo value
     */
    public SubscriberIdentityInfo subscriberIdentityInfo() {
        return this.subscriberIdentityInfo;
    }

}
