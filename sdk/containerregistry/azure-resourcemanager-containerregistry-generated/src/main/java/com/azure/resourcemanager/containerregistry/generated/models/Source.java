// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The registry node that generated the event. Put differently, while the actor initiates the event, the source
 * generates it.
 */
@Fluent
public final class Source {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Source.class);

    /*
     * The IP or hostname and the port of the registry node that generated the
     * event. Generally, this will be resolved by os.Hostname() along with the
     * running port.
     */
    @JsonProperty(value = "addr")
    private String addr;

    /*
     * The running instance of an application. Changes after each restart.
     */
    @JsonProperty(value = "instanceID")
    private String instanceId;

    /**
     * Get the addr property: The IP or hostname and the port of the registry node that generated the event. Generally,
     * this will be resolved by os.Hostname() along with the running port.
     *
     * @return the addr value.
     */
    public String addr() {
        return this.addr;
    }

    /**
     * Set the addr property: The IP or hostname and the port of the registry node that generated the event. Generally,
     * this will be resolved by os.Hostname() along with the running port.
     *
     * @param addr the addr value to set.
     * @return the Source object itself.
     */
    public Source withAddr(String addr) {
        this.addr = addr;
        return this;
    }

    /**
     * Get the instanceId property: The running instance of an application. Changes after each restart.
     *
     * @return the instanceId value.
     */
    public String instanceId() {
        return this.instanceId;
    }

    /**
     * Set the instanceId property: The running instance of an application. Changes after each restart.
     *
     * @param instanceId the instanceId value to set.
     * @return the Source object itself.
     */
    public Source withInstanceId(String instanceId) {
        this.instanceId = instanceId;
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
