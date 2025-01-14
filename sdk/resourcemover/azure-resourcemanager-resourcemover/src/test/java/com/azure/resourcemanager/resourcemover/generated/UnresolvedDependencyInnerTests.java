// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.fluent.models.UnresolvedDependencyInner;
import org.junit.jupiter.api.Assertions;

public final class UnresolvedDependencyInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UnresolvedDependencyInner model =
            BinaryData.fromString("{\"count\":374026778,\"id\":\"pbobjo\"}").toObject(UnresolvedDependencyInner.class);
        Assertions.assertEquals(374026778, model.count());
        Assertions.assertEquals("pbobjo", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UnresolvedDependencyInner model = new UnresolvedDependencyInner().withCount(374026778).withId("pbobjo");
        model = BinaryData.fromObject(model).toObject(UnresolvedDependencyInner.class);
        Assertions.assertEquals(374026778, model.count());
        Assertions.assertEquals("pbobjo", model.id());
    }
}
