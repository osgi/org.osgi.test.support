/*******************************************************************************
 * Copyright (c) Contributors to the Eclipse Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0 
 *******************************************************************************/

package org.osgi.tck.signature;

import org.junit.jupiter.api.Test;
import org.osgi.framework.BundleContext;
import org.osgi.test.common.annotation.InjectBundleContext;

/**
 * JUnit 5 signature test: a TCK test-case bundle subclasses it with an empty
 * body, adds the packages to check to {@code -signaturetest} and lets the bnd
 * SignatureTest plugin generate the signature files.
 */
public abstract class AbstractSignatureTest {

	@InjectBundleContext
	BundleContext bundleContext;

	@Test
	public void testSignatures() {
		new SignatureChecker(bundleContext.getBundle()).check();
	}
}
