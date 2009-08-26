/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2009 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 *(at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.jasperreports.charts;

import net.sf.jasperreports.engine.JRChart;
import net.sf.jasperreports.engine.JRCloneable;

/**
 * Describes an axis that can be added to a multiple axis chart.  The name
 * "axis" is a bit of a misnomer, as it really contains information about
 * a new dataset to plot, the axis to plot it against, and how to render that
 * dataset.
 *
 * @author Barry Klawans (barry@users.sourceforge.net)
 * @version $Id$
 */


public interface JRChartAxis extends JRCloneable
{
	/**
	 * Position the axis to the left of a VERTICAL chart or on the top
	 * of a HORIZONTAL chart.
	 */
	public static final byte POSITION_LEFT_OR_TOP = 1;

	/**
	 * Position the axis to the right of a VERTICAL chart or on the bottom
	 * of a HORIZONTAL chart.
	 */
	public static final byte POSITION_RIGHT_OR_BOTTOM = 2;

	/**
	 * @deprecated Replaced by {@link #getPositionByte()}
	 */
	public byte getPosition();

	/**
	 * Returns the position of this axis.
	 *
	 * @return the position of this axis
	 */
	public Byte getPositionByte();


	/**
	 * Returns the chart that contains the dataset and plot to use for this
	 * axis.  The plot is used to figure out how to render the dataset when
	 * adding to the multiple axis chart.
	 *
	 * @return the chart that contains the dataset and plot for this axis
	 */
	public JRChart getChart();
}
