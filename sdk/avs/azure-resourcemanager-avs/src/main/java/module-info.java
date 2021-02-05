// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.avs {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.avs;
    exports com.azure.resourcemanager.avs.fluent;
    exports com.azure.resourcemanager.avs.fluent.models;
    exports com.azure.resourcemanager.avs.models;

    opens com.azure.resourcemanager.avs.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.avs.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}
