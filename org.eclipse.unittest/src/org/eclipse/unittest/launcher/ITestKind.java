/*******************************************************************************
 * Copyright (c) 2006, 2008 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     David Saff (saff@mit.edu) - initial API and implementation
 *             (bug 102632: [JUnit] Support for JUnit 4.)
 *******************************************************************************/

package org.eclipse.unittest.launcher;

public interface ITestKind {
	static class NullTestKind extends TestKind {
		private NullTestKind() {
			super(null);
		}

		@Override
		public boolean isNull() {
			return true;
		}

	}

	public static final TestKind NULL = new NullTestKind();

	public static final String ID = "id"; //$NON-NLS-1$
	public static final String DISPLAY_NAME = "displayName"; //$NON-NLS-1$
	public static final String FINDER_CLASS_NAME = "finderClass"; //$NON-NLS-1$
	public static final String LOADER_PLUGIN_ID = "loaderPluginId"; //$NON-NLS-1$
	public static final String LOADER_CLASS_NAME = "loaderClass"; //$NON-NLS-1$
	public static final String TEST_RUNNER_CLIENT_CLASS_NAME = "testRunnerClientClass"; //$NON-NLS-1$
	public static final String TEST_VIEW_SUPPORT_CLASS_NAME = "testViewSupportClass"; //$NON-NLS-1$

	public static final String PRECEDES = "precedesTestKind"; //$NON-NLS-1$


	public static final String RUNTIME_CLASSPATH_ENTRY = "runtimeClasspathEntry"; //$NON-NLS-1$

	public static final String CLASSPATH_PLUGIN_ID = "pluginId"; //$NON-NLS-1$
	public static final String CLASSPATH_PATH_TO_JAR = "pathToJar"; //$NON-NLS-1$

	public abstract ITestFinder getFinder();
	public abstract ITestRunnerClient getTestRunnerClient();
	public abstract ITestViewSupport getTestViewSupport();

	public abstract String getId();
	public abstract String getDisplayName();
	public abstract String getFinderClassName();
	public abstract String getLoaderPluginId();
	public abstract String getLoaderClassName();
	public abstract String getTestRunnerClientClassName();
	public abstract String getTestViewSupportClassName();
	public abstract String getPrecededKindId();


	public abstract boolean isNull();

	public abstract UnitTestRuntimeClasspathEntry[] getClasspathEntries();
}