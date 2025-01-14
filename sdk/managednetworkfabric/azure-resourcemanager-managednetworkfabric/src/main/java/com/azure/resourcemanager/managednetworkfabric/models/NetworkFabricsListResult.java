// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkFabricInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of NetworkFabrics. */
@Fluent
public final class NetworkFabricsListResult {
    /*
     * List of NetworkFabric resources.
     */
    @JsonProperty(value = "value")
    private List<NetworkFabricInner> value;

    /*
     * Url to follow for getting next page of resources.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of NetworkFabricsListResult class. */
    public NetworkFabricsListResult() {
    }

    /**
     * Get the value property: List of NetworkFabric resources.
     *
     * @return the value value.
     */
    public List<NetworkFabricInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of NetworkFabric resources.
     *
     * @param value the value value to set.
     * @return the NetworkFabricsListResult object itself.
     */
    public NetworkFabricsListResult withValue(List<NetworkFabricInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Url to follow for getting next page of resources.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Url to follow for getting next page of resources.
     *
     * @param nextLink the nextLink value to set.
     * @return the NetworkFabricsListResult object itself.
     */
    public NetworkFabricsListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
