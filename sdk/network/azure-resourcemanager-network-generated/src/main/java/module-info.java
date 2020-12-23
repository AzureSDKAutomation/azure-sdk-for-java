// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.network.generated {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.network.generated;
    exports com.azure.resourcemanager.network.generated.fluent;
    exports com.azure.resourcemanager.network.generated.fluent.models;
    exports com.azure.resourcemanager.network.generated.models;

    opens com.azure.resourcemanager.network.generated.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.network.generated.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}
