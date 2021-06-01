// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.resourcemanager.providerhub.fluent.models.CheckinManifestInfoInner;

/** An immutable client-side representation of CheckinManifestInfo. */
public interface CheckinManifestInfo {
    /**
     * Gets the isCheckedIn property: The isCheckedIn property.
     *
     * @return the isCheckedIn value.
     */
    boolean isCheckedIn();

    /**
     * Gets the statusMessage property: The statusMessage property.
     *
     * @return the statusMessage value.
     */
    String statusMessage();

    /**
     * Gets the pullRequest property: The pullRequest property.
     *
     * @return the pullRequest value.
     */
    String pullRequest();

    /**
     * Gets the commitId property: The commitId property.
     *
     * @return the commitId value.
     */
    String commitId();

    /**
     * Gets the inner com.azure.resourcemanager.providerhub.fluent.models.CheckinManifestInfoInner object.
     *
     * @return the inner object.
     */
    CheckinManifestInfoInner innerModel();
}
