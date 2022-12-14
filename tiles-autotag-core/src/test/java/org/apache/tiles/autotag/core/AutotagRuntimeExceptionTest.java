/*
 * $Id: AutotagRuntimeExceptionTest.java 1037208 2010-11-20 13:49:55Z apetrelli $
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

package org.apache.tiles.autotag.core;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests {@link AutotagRuntimeException}.
 *
 * @version $Rev: 1037208 $ $Date: 2010-11-20 14:49:55 +0100 (Sat, 20 Nov 2010) $
 */
public class AutotagRuntimeExceptionTest {

    /**
     * Test method for {@link AutotagRuntimeException#AutotagRuntimeException()}.
     */
    @Test
    public void testAutotagRuntimeException() {
        AutotagRuntimeException exception = new AutotagRuntimeException();
        assertNull(exception.getMessage());
        assertNull(exception.getCause());
    }

    /**
     * Test method for {@link AutotagRuntimeException#AutotagRuntimeException(java.lang.String)}.
     */
    @Test
    public void testAutotagRuntimeExceptionString() {
        AutotagRuntimeException exception = new AutotagRuntimeException("my message");
        assertEquals("my message", exception.getMessage());
        assertNull(exception.getCause());
    }

    /**
     * Test method for {@link AutotagRuntimeException#AutotagRuntimeException(java.lang.Throwable)}.
     */
    @Test
    public void testAutotagRuntimeExceptionThrowable() {
        Throwable cause = new Throwable();
        AutotagRuntimeException exception = new AutotagRuntimeException(cause);
        assertEquals(cause.toString(), exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

    /**
     * Test method for {@link AutotagRuntimeException#AutotagRuntimeException(java.lang.String, java.lang.Throwable)}.
     */
    @Test
    public void testAutotagRuntimeExceptionStringThrowable() {
        Throwable cause = new Throwable();
        AutotagRuntimeException exception = new AutotagRuntimeException("my message", cause);
        assertEquals("my message", exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

}
