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

package com.liferay.document.library.opener.uad.exporter;

import com.liferay.document.library.opener.model.DLOpenerFileEntryReference;
import com.liferay.document.library.opener.service.DLOpenerFileEntryReferenceLocalService;
import com.liferay.document.library.opener.uad.constants.DLOpenerUADConstants;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.util.StringBundler;

import com.liferay.user.associated.data.exporter.DynamicQueryUADExporter;

import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the dl opener file entry reference UAD exporter.
 *
 * <p>
 * This implementation exists only as a container for the default methods
 * generated by ServiceBuilder. All custom service methods should be put in
 * {@link DLOpenerFileEntryReferenceUADExporter}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class BaseDLOpenerFileEntryReferenceUADExporter
	extends DynamicQueryUADExporter<DLOpenerFileEntryReference> {
	@Override
	public Class<DLOpenerFileEntryReference> getTypeClass() {
		return DLOpenerFileEntryReference.class;
	}

	@Override
	protected ActionableDynamicQuery doGetActionableDynamicQuery() {
		return dlOpenerFileEntryReferenceLocalService.getActionableDynamicQuery();
	}

	@Override
	protected String[] doGetUserIdFieldNames() {
		return DLOpenerUADConstants.USER_ID_FIELD_NAMES_DL_OPENER_FILE_ENTRY_REFERENCE;
	}

	@Override
	protected String toXmlString(
		DLOpenerFileEntryReference dlOpenerFileEntryReference) {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append(
			"com.liferay.document.library.opener.model.DLOpenerFileEntryReference");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dlOpenerFileEntryReferenceId</column-name><column-value><![CDATA[");
		sb.append(dlOpenerFileEntryReference.getDlOpenerFileEntryReferenceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(dlOpenerFileEntryReference.getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(dlOpenerFileEntryReference.getUserName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	@Reference
	protected DLOpenerFileEntryReferenceLocalService dlOpenerFileEntryReferenceLocalService;
}