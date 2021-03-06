/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.kernel.util;

import java.util.List;

/**
 * @author     Bruno Farache
 * @deprecated As of Wilberforce (7.0.x), moved to {@link
 *             com.liferay.portal.kernel.diff.DiffResult}
 */
@Deprecated
public class DiffResult extends com.liferay.portal.kernel.diff.DiffResult {

	public DiffResult(int linePos, List<String> changedLines) {
		super(linePos, changedLines);
	}

	public DiffResult(int linePos, String changedLine) {
		super(linePos, changedLine);
	}

}