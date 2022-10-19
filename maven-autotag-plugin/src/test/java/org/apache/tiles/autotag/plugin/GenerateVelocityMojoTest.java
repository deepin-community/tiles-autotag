/*
 * $Id: GenerateVelocityMojoTest.java 1044657 2010-12-11 13:53:42Z apetrelli $
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.tiles.autotag.plugin;

import static org.junit.Assert.*;

import org.apache.tiles.autotag.velocity.VelocityTemplateGeneratorFactory;
import org.junit.Test;

/**
 * Tests {@link GenerateVelocityMojo}.
 *
 * @version $Rev: 1044657 $ $Date: 2010-12-11 14:53:42 +0100 (Sat, 11 Dec 2010) $
 */
public class GenerateVelocityMojoTest {

    /**
     * Test method for {@link GenerateVelocityMojo#createTemplateGeneratorFactory(VelocityEngine)}.
     */
    @Test
    public void testCreateTemplateGeneratorFactory() {
        GenerateVelocityMojo mojo = new GenerateVelocityMojo();
        assertTrue(mojo.createTemplateGeneratorFactory(null) instanceof VelocityTemplateGeneratorFactory);
    }

    /**
     * Test method for {@link org.apache.tiles.autotag.plugin.GenerateVelocityMojo#getParameters()}.
     */
    @Test
    public void testGetParameters() {
        GenerateVelocityMojo mojo = new GenerateVelocityMojo();
        assertNull(mojo.getParameters());
    }

}
