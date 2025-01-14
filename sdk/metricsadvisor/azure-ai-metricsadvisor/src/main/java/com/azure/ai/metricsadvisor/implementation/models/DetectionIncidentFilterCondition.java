// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DetectionIncidentFilterCondition model. */
@Fluent
public final class DetectionIncidentFilterCondition {
    /*
     * dimension filter
     */
    @JsonProperty(value = "dimensionFilter")
    private List<DimensionGroupIdentity> dimensionFilter;

    /** Creates an instance of DetectionIncidentFilterCondition class. */
    public DetectionIncidentFilterCondition() {}

    /**
     * Get the dimensionFilter property: dimension filter.
     *
     * @return the dimensionFilter value.
     */
    public List<DimensionGroupIdentity> getDimensionFilter() {
        return this.dimensionFilter;
    }

    /**
     * Set the dimensionFilter property: dimension filter.
     *
     * @param dimensionFilter the dimensionFilter value to set.
     * @return the DetectionIncidentFilterCondition object itself.
     */
    public DetectionIncidentFilterCondition setDimensionFilter(List<DimensionGroupIdentity> dimensionFilter) {
        this.dimensionFilter = dimensionFilter;
        return this;
    }
}
