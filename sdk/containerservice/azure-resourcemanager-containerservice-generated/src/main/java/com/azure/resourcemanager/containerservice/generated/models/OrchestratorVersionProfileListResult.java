// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.models;

import com.azure.resourcemanager.containerservice.generated.fluent.models.OrchestratorVersionProfileListResultInner;
import java.util.List;

/** An immutable client-side representation of OrchestratorVersionProfileListResult. */
public interface OrchestratorVersionProfileListResult {
    /**
     * Gets the id property: Id of the orchestrator version profile list result.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Name of the orchestrator version profile list result.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: Type of the orchestrator version profile list result.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the orchestrators property: List of orchestrator version profiles.
     *
     * @return the orchestrators value.
     */
    List<OrchestratorVersionProfile> orchestrators();

    /**
     * Gets the inner
     * com.azure.resourcemanager.containerservice.generated.fluent.models.OrchestratorVersionProfileListResultInner
     * object.
     *
     * @return the inner object.
     */
    OrchestratorVersionProfileListResultInner innerModel();
}
