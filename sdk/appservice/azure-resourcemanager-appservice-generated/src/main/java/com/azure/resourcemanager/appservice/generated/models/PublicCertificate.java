// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.PublicCertificateInner;

/** An immutable client-side representation of PublicCertificate. */
public interface PublicCertificate {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the blob property: Public Certificate byte array.
     *
     * @return the blob value.
     */
    byte[] blob();

    /**
     * Gets the publicCertificateLocation property: Public Certificate Location.
     *
     * @return the publicCertificateLocation value.
     */
    PublicCertificateLocation publicCertificateLocation();

    /**
     * Gets the thumbprint property: Certificate Thumbprint.
     *
     * @return the thumbprint value.
     */
    String thumbprint();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.PublicCertificateInner object.
     *
     * @return the inner object.
     */
    PublicCertificateInner innerModel();

    /** The entirety of the PublicCertificate definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The PublicCertificate definition stages. */
    interface DefinitionStages {
        /** The first stage of the PublicCertificate definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the PublicCertificate definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, name.
             *
             * @param resourceGroupName Name of the resource group to which the resource belongs.
             * @param name Name of the app.
             * @return the next definition stage.
             */
            WithCreate withExistingSite(String resourceGroupName, String name);
        }
        /**
         * The stage of the PublicCertificate definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithKind,
                DefinitionStages.WithBlob,
                DefinitionStages.WithPublicCertificateLocation {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            PublicCertificate create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            PublicCertificate create(Context context);
        }
        /** The stage of the PublicCertificate definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             *
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            WithCreate withKind(String kind);
        }
        /** The stage of the PublicCertificate definition allowing to specify blob. */
        interface WithBlob {
            /**
             * Specifies the blob property: Public Certificate byte array.
             *
             * @param blob Public Certificate byte array.
             * @return the next definition stage.
             */
            WithCreate withBlob(byte[] blob);
        }
        /** The stage of the PublicCertificate definition allowing to specify publicCertificateLocation. */
        interface WithPublicCertificateLocation {
            /**
             * Specifies the publicCertificateLocation property: Public Certificate Location.
             *
             * @param publicCertificateLocation Public Certificate Location.
             * @return the next definition stage.
             */
            WithCreate withPublicCertificateLocation(PublicCertificateLocation publicCertificateLocation);
        }
    }
    /**
     * Begins update for the PublicCertificate resource.
     *
     * @return the stage of resource update.
     */
    PublicCertificate.Update update();

    /** The template for PublicCertificate update. */
    interface Update extends UpdateStages.WithKind, UpdateStages.WithBlob, UpdateStages.WithPublicCertificateLocation {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        PublicCertificate apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        PublicCertificate apply(Context context);
    }
    /** The PublicCertificate update stages. */
    interface UpdateStages {
        /** The stage of the PublicCertificate update allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             *
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            Update withKind(String kind);
        }
        /** The stage of the PublicCertificate update allowing to specify blob. */
        interface WithBlob {
            /**
             * Specifies the blob property: Public Certificate byte array.
             *
             * @param blob Public Certificate byte array.
             * @return the next definition stage.
             */
            Update withBlob(byte[] blob);
        }
        /** The stage of the PublicCertificate update allowing to specify publicCertificateLocation. */
        interface WithPublicCertificateLocation {
            /**
             * Specifies the publicCertificateLocation property: Public Certificate Location.
             *
             * @param publicCertificateLocation Public Certificate Location.
             * @return the next definition stage.
             */
            Update withPublicCertificateLocation(PublicCertificateLocation publicCertificateLocation);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    PublicCertificate refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    PublicCertificate refresh(Context context);
}
