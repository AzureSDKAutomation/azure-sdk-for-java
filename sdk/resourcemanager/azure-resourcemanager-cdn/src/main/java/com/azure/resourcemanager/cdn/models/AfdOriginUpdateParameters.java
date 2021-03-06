// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** AFDOrigin properties needed for origin update. */
@JsonFlatten
@Fluent
public class AfdOriginUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AfdOriginUpdateParameters.class);

    /*
     * Resource reference to the Azure origin resource.
     */
    @JsonProperty(value = "properties.azureOrigin")
    private ResourceReference azureOrigin;

    /*
     * The address of the origin. Domain names, IPv4 addresses, and IPv6
     * addresses are supported.This should be unique across all origins in an
     * endpoint.
     */
    @JsonProperty(value = "properties.hostName")
    private String hostname;

    /*
     * The value of the HTTP port. Must be between 1 and 65535.
     */
    @JsonProperty(value = "properties.httpPort")
    private Integer httpPort;

    /*
     * The value of the HTTPS port. Must be between 1 and 65535.
     */
    @JsonProperty(value = "properties.httpsPort")
    private Integer httpsPort;

    /*
     * The host header value sent to the origin with each request. If you leave
     * this blank, the request hostname determines this value. Azure CDN
     * origins, such as Web Apps, Blob Storage, and Cloud Services require this
     * host header value to match the origin hostname by default. This
     * overrides the host header defined at Endpoint
     */
    @JsonProperty(value = "properties.originHostHeader")
    private String originHostHeader;

    /*
     * Priority of origin in given origin group for load balancing. Higher
     * priorities will not be used for load balancing if any lower priority
     * origin is healthy.Must be between 1 and 5
     */
    @JsonProperty(value = "properties.priority")
    private Integer priority;

    /*
     * Weight of the origin in given origin group for load balancing. Must be
     * between 1 and 1000
     */
    @JsonProperty(value = "properties.weight")
    private Integer weight;

    /*
     * The properties of the private link resource for private origin.
     */
    @JsonProperty(value = "properties.sharedPrivateLinkResource")
    private Object sharedPrivateLinkResource;

    /*
     * Whether to enable health probes to be made against backends defined
     * under backendPools. Health probes can only be disabled if there is a
     * single enabled backend in single enabled backend pool.
     */
    @JsonProperty(value = "properties.enabledState")
    private EnabledState enabledState;

    /**
     * Get the azureOrigin property: Resource reference to the Azure origin resource.
     *
     * @return the azureOrigin value.
     */
    public ResourceReference azureOrigin() {
        return this.azureOrigin;
    }

    /**
     * Set the azureOrigin property: Resource reference to the Azure origin resource.
     *
     * @param azureOrigin the azureOrigin value to set.
     * @return the AfdOriginUpdateParameters object itself.
     */
    public AfdOriginUpdateParameters withAzureOrigin(ResourceReference azureOrigin) {
        this.azureOrigin = azureOrigin;
        return this;
    }

    /**
     * Get the hostname property: The address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are
     * supported.This should be unique across all origins in an endpoint.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: The address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are
     * supported.This should be unique across all origins in an endpoint.
     *
     * @param hostname the hostname value to set.
     * @return the AfdOriginUpdateParameters object itself.
     */
    public AfdOriginUpdateParameters withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the httpPort property: The value of the HTTP port. Must be between 1 and 65535.
     *
     * @return the httpPort value.
     */
    public Integer httpPort() {
        return this.httpPort;
    }

    /**
     * Set the httpPort property: The value of the HTTP port. Must be between 1 and 65535.
     *
     * @param httpPort the httpPort value to set.
     * @return the AfdOriginUpdateParameters object itself.
     */
    public AfdOriginUpdateParameters withHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
        return this;
    }

    /**
     * Get the httpsPort property: The value of the HTTPS port. Must be between 1 and 65535.
     *
     * @return the httpsPort value.
     */
    public Integer httpsPort() {
        return this.httpsPort;
    }

    /**
     * Set the httpsPort property: The value of the HTTPS port. Must be between 1 and 65535.
     *
     * @param httpsPort the httpsPort value to set.
     * @return the AfdOriginUpdateParameters object itself.
     */
    public AfdOriginUpdateParameters withHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }

    /**
     * Get the originHostHeader property: The host header value sent to the origin with each request. If you leave this
     * blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud
     * Services require this host header value to match the origin hostname by default. This overrides the host header
     * defined at Endpoint.
     *
     * @return the originHostHeader value.
     */
    public String originHostHeader() {
        return this.originHostHeader;
    }

    /**
     * Set the originHostHeader property: The host header value sent to the origin with each request. If you leave this
     * blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud
     * Services require this host header value to match the origin hostname by default. This overrides the host header
     * defined at Endpoint.
     *
     * @param originHostHeader the originHostHeader value to set.
     * @return the AfdOriginUpdateParameters object itself.
     */
    public AfdOriginUpdateParameters withOriginHostHeader(String originHostHeader) {
        this.originHostHeader = originHostHeader;
        return this;
    }

    /**
     * Get the priority property: Priority of origin in given origin group for load balancing. Higher priorities will
     * not be used for load balancing if any lower priority origin is healthy.Must be between 1 and 5.
     *
     * @return the priority value.
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Priority of origin in given origin group for load balancing. Higher priorities will
     * not be used for load balancing if any lower priority origin is healthy.Must be between 1 and 5.
     *
     * @param priority the priority value to set.
     * @return the AfdOriginUpdateParameters object itself.
     */
    public AfdOriginUpdateParameters withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the weight property: Weight of the origin in given origin group for load balancing. Must be between 1 and
     * 1000.
     *
     * @return the weight value.
     */
    public Integer weight() {
        return this.weight;
    }

    /**
     * Set the weight property: Weight of the origin in given origin group for load balancing. Must be between 1 and
     * 1000.
     *
     * @param weight the weight value to set.
     * @return the AfdOriginUpdateParameters object itself.
     */
    public AfdOriginUpdateParameters withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get the sharedPrivateLinkResource property: The properties of the private link resource for private origin.
     *
     * @return the sharedPrivateLinkResource value.
     */
    public Object sharedPrivateLinkResource() {
        return this.sharedPrivateLinkResource;
    }

    /**
     * Set the sharedPrivateLinkResource property: The properties of the private link resource for private origin.
     *
     * @param sharedPrivateLinkResource the sharedPrivateLinkResource value to set.
     * @return the AfdOriginUpdateParameters object itself.
     */
    public AfdOriginUpdateParameters withSharedPrivateLinkResource(Object sharedPrivateLinkResource) {
        this.sharedPrivateLinkResource = sharedPrivateLinkResource;
        return this;
    }

    /**
     * Get the enabledState property: Whether to enable health probes to be made against backends defined under
     * backendPools. Health probes can only be disabled if there is a single enabled backend in single enabled backend
     * pool.
     *
     * @return the enabledState value.
     */
    public EnabledState enabledState() {
        return this.enabledState;
    }

    /**
     * Set the enabledState property: Whether to enable health probes to be made against backends defined under
     * backendPools. Health probes can only be disabled if there is a single enabled backend in single enabled backend
     * pool.
     *
     * @param enabledState the enabledState value to set.
     * @return the AfdOriginUpdateParameters object itself.
     */
    public AfdOriginUpdateParameters withEnabledState(EnabledState enabledState) {
        this.enabledState = enabledState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (azureOrigin() != null) {
            azureOrigin().validate();
        }
    }
}
