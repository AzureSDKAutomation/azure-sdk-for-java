// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.KeyVaultSecretStatus;
import com.azure.resourcemanager.appservice.generated.models.SystemData;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Key Vault container ARM resource for a certificate that is purchased through Azure. */
@JsonFlatten
@Fluent
public class AppServiceCertificateResourceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AppServiceCertificateResourceInner.class);

    /*
     * Key Vault resource Id.
     */
    @JsonProperty(value = "properties.keyVaultId")
    private String keyVaultId;

    /*
     * Key Vault secret name.
     */
    @JsonProperty(value = "properties.keyVaultSecretName")
    private String keyVaultSecretName;

    /*
     * Status of the Key Vault secret.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private KeyVaultSecretStatus provisioningState;

    /*
     * Kind of resource.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /*
     * The system metadata relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the keyVaultId property: Key Vault resource Id.
     *
     * @return the keyVaultId value.
     */
    public String keyVaultId() {
        return this.keyVaultId;
    }

    /**
     * Set the keyVaultId property: Key Vault resource Id.
     *
     * @param keyVaultId the keyVaultId value to set.
     * @return the AppServiceCertificateResourceInner object itself.
     */
    public AppServiceCertificateResourceInner withKeyVaultId(String keyVaultId) {
        this.keyVaultId = keyVaultId;
        return this;
    }

    /**
     * Get the keyVaultSecretName property: Key Vault secret name.
     *
     * @return the keyVaultSecretName value.
     */
    public String keyVaultSecretName() {
        return this.keyVaultSecretName;
    }

    /**
     * Set the keyVaultSecretName property: Key Vault secret name.
     *
     * @param keyVaultSecretName the keyVaultSecretName value to set.
     * @return the AppServiceCertificateResourceInner object itself.
     */
    public AppServiceCertificateResourceInner withKeyVaultSecretName(String keyVaultSecretName) {
        this.keyVaultSecretName = keyVaultSecretName;
        return this;
    }

    /**
     * Get the provisioningState property: Status of the Key Vault secret.
     *
     * @return the provisioningState value.
     */
    public KeyVaultSecretStatus provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Kind of resource.
     *
     * @param kind the kind value to set.
     * @return the AppServiceCertificateResourceInner object itself.
     */
    public AppServiceCertificateResourceInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public AppServiceCertificateResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AppServiceCertificateResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (systemData() != null) {
            systemData().validate();
        }
    }
}
