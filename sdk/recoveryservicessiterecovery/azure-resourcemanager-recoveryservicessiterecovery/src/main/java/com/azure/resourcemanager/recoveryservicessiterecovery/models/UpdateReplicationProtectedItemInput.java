// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Update replication protected item input. */
@Fluent
public final class UpdateReplicationProtectedItemInput {
    /*
     * Update replication protected item properties.
     */
    @JsonProperty(value = "properties")
    private UpdateReplicationProtectedItemInputProperties properties;

    /** Creates an instance of UpdateReplicationProtectedItemInput class. */
    public UpdateReplicationProtectedItemInput() {
    }

    /**
     * Get the properties property: Update replication protected item properties.
     *
     * @return the properties value.
     */
    public UpdateReplicationProtectedItemInputProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Update replication protected item properties.
     *
     * @param properties the properties value to set.
     * @return the UpdateReplicationProtectedItemInput object itself.
     */
    public UpdateReplicationProtectedItemInput withProperties(
        UpdateReplicationProtectedItemInputProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
