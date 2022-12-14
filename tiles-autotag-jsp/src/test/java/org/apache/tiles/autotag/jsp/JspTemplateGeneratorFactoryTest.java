/*
 * $Id: JspTemplateGeneratorFactoryTest.java 1643653 2014-12-07 06:47:59Z nlebas $
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
package org.apache.tiles.autotag.jsp;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.isA;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.assertSame;

import org.apache.tiles.autotag.core.OutputLocator;
import org.apache.tiles.autotag.generate.TemplateGenerator;
import org.apache.tiles.autotag.generate.TemplateGeneratorBuilder;
import org.apache.velocity.app.VelocityEngine;
import org.junit.Test;

/**
 * Tests {@link JspTemplateGeneratorFactory}.
 *
 * @version $Rev: 1643653 $ $Date: 2014-12-07 07:47:59 +0100 (Sun, 07 Dec 2014) $
 */
public class JspTemplateGeneratorFactoryTest {

    /**
     * Test method for {@link JspTemplateGeneratorFactory#createTemplateGenerator()}.
     */
    @Test
    public void testCreateTemplateGenerator() {
    	OutputLocator classesOutputLocator = createMock(OutputLocator.class);
    	OutputLocator resourcesOutputLocator = createMock(OutputLocator.class);
        VelocityEngine velocityEngine = createMock(VelocityEngine.class);
        TemplateGeneratorBuilder builder = createMock(TemplateGeneratorBuilder.class);
        TemplateGenerator generator = createMock(TemplateGenerator.class);

        expect(builder.setClassesOutputLocator(classesOutputLocator)).andReturn(builder);
        expect(builder.setResourcesOutputLocator(resourcesOutputLocator)).andReturn(builder);
        expect(builder.addResourcesTemplateSuiteGenerator(isA(TLDGenerator.class))).andReturn(builder);
        expect(builder.addClassesTemplateClassGenerator(isA(TagClassGenerator.class))).andReturn(builder);
        expect(builder.build()).andReturn(generator);

        replay(classesOutputLocator, resourcesOutputLocator, velocityEngine, builder, generator);
        JspTemplateGeneratorFactory factory = new JspTemplateGeneratorFactory(
                classesOutputLocator, resourcesOutputLocator,
                velocityEngine, builder);
        assertSame(generator, factory.createTemplateGenerator());
        verify(classesOutputLocator, resourcesOutputLocator, velocityEngine, builder, generator);
    }

}
