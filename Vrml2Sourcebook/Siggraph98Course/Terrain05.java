package Vrml2Sourcebook.Siggraph98Course;

/*
Copyright (c) 1995-2023 held by the author(s).  All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:

    * Redistributions of source code must retain the above copyright
      notice, this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright
      notice, this list of conditions and the following disclaimer
      in the documentation and/or other materials provided with the
      distribution.
    * Neither the name of the Web3D Consortium (https://www.web3d.org)
      nor the names of its contributors may be used to endorse or
      promote products derived from this software without specific
      prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
POSSIBILITY OF SUCH DAMAGE.
*/

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Shape.*;

// Javadoc metadata annotations follow, see below for X3DJSAIL Java source code.
/**
 * <p> Terrain snapshot providing an animation keyframe for AnimatedGrid.x3d. </p>
 <p> Related links: <a href="../../../Siggraph98Course/Terrain05.java">Terrain05.java</a> source, <a href="../../../Siggraph98Course/Terrrain05Index.html" target="_top">Terrrain05 catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Siggraph98Course/Terrrain05.x3d">Terrrain05.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Terrain snapshot providing an animation keyframe for AnimatedGrid.x3d </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> David R. Nadeau, John L. Moreland, Michael M. Heck </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translator </i> </td>
			<td> Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 1 July 1998 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translated </i> </td>
			<td> 2 February 2014 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="../../../Siggraph98Course/AnimatedGrid.x3d">AnimatedGrid.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> originals/ter05.wrl </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://www.siggraph.org/s98" target="_blank">http://www.siggraph.org/s98</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://www.siggraph.org/s98/conference/courses/18.html" target="_blank">http://www.siggraph.org/s98/conference/courses/18.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0495.htm" target="_blank">http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0495.htm</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm" target="_blank">http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">https://www.web3d.org/x3d/content/examples/X3dResources.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Terrrain05.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Terrrain05.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> Vrml97ToX3dNist, <a href="http://ovrt.nist.gov/v2_x3d.html" target="_blank">http://ovrt.nist.gov/v2_x3d.html</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../Siggraph98Course/../license.html">../license.html</a> </td>
		</tr>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center;" colspan="2">  &nbsp; </td>
		</tr>
	</table>

	<p>
		This program uses the
		<a href="https://www.web3d.org/specifications/java/X3DJSAIL.html" target="_blank">X3D Java Scene Access Interface Library (X3DJSAIL)</a>.
		It has been produced using the 
		<a href="https://www.web3d.org/x3d/stylesheets/X3dToJava.xslt" target="_blank">X3dToJava.xslt</a>
		stylesheet
	       (<a href="https://sourceforge.net/p/x3d/code/HEAD/tree/www.web3d.org/x3d/stylesheets/X3dToJava.xslt" target="_blank">version&amp;nbsp;control</a>)
                is used to create Java source code from an original <code>.x3d</code> model.
	</p>

	* @author David R. Nadeau, John L. Moreland, Michael M. Heck
 */

public class Terrain05
{
	/** Default constructor to create this object. */
	public Terrain05 ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
            try { // catch-all
  x3dModel = new X3D().setProfile(X3D.PROFILE_INTERACTIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("Terrrain05.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Terrain snapshot providing an animation keyframe for AnimatedGrid.x3d"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("David R. Nadeau, John L. Moreland, Michael M. Heck"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 July 1998"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("2 February 2014"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("AnimatedGrid.x3d"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("originals/ter05.wrl"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98/conference/courses/18.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0495.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Terrrain05.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("Terrrain05.x3d"))
    .addChild(new Transform().setTranslation(-7.5,0.0,-7.5)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material()))
        .setGeometry(new ElevationGrid().setCreaseAngle(1.571).setSolid(false).setXDimension(15).setZDimension(15).setHeight(getElevationGrid_5_23_height())
          .setColor(new Color().setColor(getColor_6_23_color()))))));
            }
            catch (Exception ex)
            {       
                System.err.println ("*** Further hints on X3DJSAIL errors and exceptions at");
                System.err.println ("*** https://www.web3d.org/specifications/java/X3DJSAIL.html");
                throw (ex);
            }
	}
	// end of initialize() method

		/** Define subarrays using type double[] */
		private double[] getElevationGrid_5_23_height_1()
		{
			double[] value = {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,1.09,-0.39,-1.61,-1.77,-0.76,0.76,1.77,1.61,0.39,-1.09,-1.85,-1.38,0.0,1.38,1.85,1.46,-0.52,-2.15,-2.37,-1.01,1.01,2.37,2.15,0.52,-1.46,-2.47,-1.85,0.0,1.85,2.47,0.86,-0.31,-1.27,-1.4,-0.6,0.6,1.4,1.27,0.31,-0.86,-1.46,-1.09,0.0,1.09,1.46,-0.31,0.11,0.45,0.49,0.21,-0.21,-0.49,-0.45,-0.11,0.31,0.52,0.39,0.0,-0.39,-0.52,-1.27,0.45,1.88,2.06,0.88,-0.88,-2.06,-1.88,-0.45,1.27,2.15,1.61,0.0,-1.61,-2.15,-1.4,0.49,2.06,2.26,0.97,-0.97,-2.26,-2.06,-0.49,1.4,2.37,1.77,0.0,-1.77,-2.37,-0.6,0.21,0.88,0.97,0.41,-0.41,-0.97,-0.88,-0.21,0.6,1.01,0.76,0.0,-0.76,-1.01,0.6,-0.21,-0.88,-0.97,-0.41,0.41,0.97,0.88,0.21,-0.6,-1.01,-0.76,0.0,0.76,1.01,1.4,-0.49,-2.06,-2.26,-0.97,0.97,2.26,2.06,0.49,-1.4,-2.37,-1.77,0.0,1.77,2.37,1.27,-0.45,-1.88,-2.06,-0.88,0.88,2.06,1.88,0.45,-1.27,-2.15,-1.61,0.0,1.61,2.15,0.31,-0.11,-0.45,-0.49,-0.21,0.21,0.49,0.45,0.11,-0.31,-0.52,-0.39,0.0,0.39,0.52,-0.86,0.31,1.27,1.4,0.6,-0.6,-1.4,-1.27,-0.31,0.86,1.46,1.09,0.0,-1.09,-1.46,-1.46,0.52,2.15,2.37,1.01,-1.01,-2.37,-2.15,-0.52,1.46,2.47,1.85,0.0,-1.85,-2.47,-1.09,0.39,1.61,1.77,0.76,-0.76,-1.77,-1.61,-0.39,1.09,1.85,1.38,0.0,-1.38,-1.85};
			return value;
		}


		/** Define subarrays using type double[] */
		private double[] getColor_6_23_color_1()
		{
			double[] value = {0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.44,0.0,0.56,0.15,0.0,0.85,0.64,0.0,0.36,0.71,0.0,0.29,0.3,0.0,0.7,0.3,0.0,0.7,0.71,0.0,0.29,0.64,0.0,0.36,0.15,0.0,0.85,0.44,0.0,0.56,0.74,0.0,0.26,0.55,0.0,0.45,0.0,0.0,1.0,0.55,0.0,0.45,0.74,0.0,0.26,0.58,0.0,0.42,0.21,0.0,0.79,0.86,0.0,0.14,0.95,0.0,0.05,0.4,0.0,0.6,0.4,0.0,0.6,0.95,0.0,0.05,0.86,0.0,0.14,0.21,0.0,0.79,0.58,0.0,0.42,0.99,0.0,0.01,0.74,0.0,0.26,0.0,0.0,1.0,0.74,0.0,0.26,0.99,0.0,0.01,0.35,0.0,0.65,0.12,0.0,0.88,0.51,0.0,0.49,0.56,0.0,0.44,0.24,0.0,0.76,0.24,0.0,0.76,0.56,0.0,0.44,0.51,0.0,0.49,0.12,0.0,0.88,0.35,0.0,0.65,0.58,0.0,0.42,0.44,0.0,0.56,0.0,0.0,1.0,0.44,0.0,0.56,0.58,0.0,0.42,0.12,0.0,0.88,0.04,0.0,0.96,0.18,0.0,0.82,0.2,0.0,0.8,0.08,0.0,0.92,0.08,0.0,0.92,0.2,0.0,0.8,0.18,0.0,0.82,0.04,0.0,0.96,0.12,0.0,0.88,0.21,0.0,0.79,0.15,0.0,0.85,0.0,0.0,1.0,0.15,0.0,0.85,0.21,0.0,0.79,0.51,0.0,0.49,0.18,0.0,0.82,0.75,0.0,0.25,0.82,0.0,0.18,0.35,0.0,0.65,0.35,0.0,0.65,0.82,0.0,0.18,0.75,0.0,0.25,0.18,0.0,0.82,0.51,0.0,0.49,0.86,0.0,0.14,0.64,0.0,0.36,0.0,0.0,1.0,0.64,0.0,0.36,0.86,0.0,0.14,0.56,0.0,0.44,0.2,0.0,0.8,0.82,0.0,0.18,0.9,0.0,0.1,0.39,0.0,0.61,0.39,0.0,0.61,0.9,0.0,0.1,0.82,0.0,0.18,0.2,0.0,0.8,0.56,0.0,0.44};
			return value;
		}
		private double[] getColor_6_23_color_2()
		{
			double[] value = {0.95,0.0,0.05,0.71,0.0,0.29,0.0,0.0,1.0,0.71,0.0,0.29,0.95,0.0,0.05,0.24,0.0,0.76,0.08,0.0,0.92,0.35,0.0,0.65,0.39,0.0,0.61,0.17,0.0,0.83,0.17,0.0,0.83,0.39,0.0,0.61,0.35,0.0,0.65,0.08,0.0,0.92,0.24,0.0,0.76,0.4,0.0,0.6,0.3,0.0,0.7,0.0,0.0,1.0,0.3,0.0,0.7,0.4,0.0,0.6,0.24,0.0,0.76,0.08,0.0,0.92,0.35,0.0,0.65,0.39,0.0,0.61,0.17,0.0,0.83,0.17,0.0,0.83,0.39,0.0,0.61,0.35,0.0,0.65,0.08,0.0,0.92,0.24,0.0,0.76,0.4,0.0,0.6,0.3,0.0,0.7,0.0,0.0,1.0,0.3,0.0,0.7,0.4,0.0,0.6,0.56,0.0,0.44,0.2,0.0,0.8,0.82,0.0,0.18,0.9,0.0,0.1,0.39,0.0,0.61,0.39,0.0,0.61,0.9,0.0,0.1,0.82,0.0,0.18,0.2,0.0,0.8,0.56,0.0,0.44,0.95,0.0,0.05,0.71,0.0,0.29,0.0,0.0,1.0,0.71,0.0,0.29,0.95,0.0,0.05,0.51,0.0,0.49,0.18,0.0,0.82,0.75,0.0,0.25,0.82,0.0,0.18,0.35,0.0,0.65,0.35,0.0,0.65,0.82,0.0,0.18,0.75,0.0,0.25,0.18,0.0,0.82,0.51,0.0,0.49,0.86,0.0,0.14,0.64,0.0,0.36,0.0,0.0,1.0,0.64,0.0,0.36,0.86,0.0,0.14,0.12,0.0,0.88,0.04,0.0,0.96,0.18,0.0,0.82,0.2,0.0,0.8,0.08,0.0,0.92,0.08,0.0,0.92,0.2,0.0,0.8,0.18,0.0,0.82,0.04,0.0,0.96,0.12,0.0,0.88,0.21,0.0,0.79,0.15,0.0,0.85,0.0,0.0,1.0,0.15,0.0,0.85,0.21,0.0,0.79,0.35,0.0,0.65,0.12,0.0,0.88,0.51,0.0,0.49,0.56,0.0,0.44,0.24,0.0,0.76,0.24,0.0,0.76,0.56,0.0,0.44,0.51,0.0,0.49,0.12,0.0,0.88,0.35,0.0,0.65,0.58,0.0,0.42,0.44,0.0,0.56,0.0,0.0,1.0,0.44,0.0,0.56,0.58,0.0,0.42,0.58,0.0,0.42,0.21,0.0,0.79,0.86,0.0,0.14,0.95,0.0,0.05,0.4,0.0,0.6};
			return value;
		}
		private double[] getColor_6_23_color_3()
		{
			double[] value = {0.4,0.0,0.6,0.95,0.0,0.05,0.86,0.0,0.14,0.21,0.0,0.79,0.58,0.0,0.42,0.99,0.0,0.01,0.74,0.0,0.26,0.0,0.0,1.0,0.74,0.0,0.26,0.99,0.0,0.01,0.44,0.0,0.56,0.15,0.0,0.85,0.64,0.0,0.36,0.71,0.0,0.29,0.3,0.0,0.7,0.3,0.0,0.7,0.71,0.0,0.29,0.64,0.0,0.36,0.15,0.0,0.85,0.44,0.0,0.56,0.74,0.0,0.26,0.55,0.0,0.45,0.0,0.0,1.0,0.55,0.0,0.45,0.74,0.0,0.26};
			return value;
		}

		/** Large attribute array: ElevationGrid height field, scene-graph level=5, element #23, 225 total numbers.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFFloat getElevationGrid_5_23_height()
		{
			MFFloat ElevationGrid_5_23_height = new MFFloat()/*2.finalize*/
				.append(new MFFloat(getElevationGrid_5_23_height_1()));
			return ElevationGrid_5_23_height;
		}
		/** Large attribute array: Color color field, scene-graph level=6, element #23, 675 total numbers made up of 225 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFColor getColor_6_23_color()
		{
			MFColor Color_6_23_color = new MFColor()/*2.finalize*/
				.append(new MFColor(getColor_6_23_color_1()))
				.append(new MFColor(getColor_6_23_color_2()))
				.append(new MFColor(getColor_6_23_color_3()));
			return Color_6_23_color;
		}

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return Terrain05 model
	 */
	public X3D getX3dModel()
	{	  
		return x3dModel;
	}
	   
    /** 
     * Default main() method provided for test purposes, uses CommandLine to set global ConfigurationProperties for this object.
     * @param args array of input parameters, provided as arguments
     * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html#handleArguments-java.lang.String:A-">X3D.handleArguments(args)</a>
     * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html#validationReport--">X3D.validationReport()</a>
     * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/CommandLine.html">CommandLine</a>
     * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/CommandLine.html#USAGE">CommandLine.USAGE</a>
     * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/ConfigurationProperties.html">ConfigurationProperties</a>
     */
    public static void main(String args[])
    {
        System.out.println("Build this X3D model, showing validation diagnostics...");
        X3D thisExampleX3dModel = new Terrain05().getX3dModel();
//      System.out.println("X3D model construction complete.");
	
        // next handle command line arguments
        boolean hasArguments = (args != null) && (args.length > 0);
        boolean validate = true; // default
        boolean argumentsLoadNewModel = false;
        String  fileName = new String();

        if (args != null)
        {
                for (String arg : args)
                {
                        if (arg.toLowerCase().startsWith("-v") || arg.toLowerCase().contains("validate"))
                        {
                                validate = true; // making sure
                        }
                        if (arg.toLowerCase().endsWith(X3D.FILE_EXTENSION_X3D) ||
                                arg.toLowerCase().endsWith(X3D.FILE_EXTENSION_CLASSICVRML) ||
                                arg.toLowerCase().endsWith(X3D.FILE_EXTENSION_X3DB) ||
                                arg.toLowerCase().endsWith(X3D.FILE_EXTENSION_VRML97) ||
                                arg.toLowerCase().endsWith(X3D.FILE_EXTENSION_EXI) ||
                                arg.toLowerCase().endsWith(X3D.FILE_EXTENSION_GZIP) ||
                                arg.toLowerCase().endsWith(X3D.FILE_EXTENSION_ZIP) ||
                                arg.toLowerCase().endsWith(X3D.FILE_EXTENSION_HTML) ||
                                arg.toLowerCase().endsWith(X3D.FILE_EXTENSION_XHTML))
                        {
                                argumentsLoadNewModel = true;
                                fileName = arg;
                        }
                }
        }
        if      (argumentsLoadNewModel)
                System.out.println("WARNING: \"Vrml2Sourcebook.Siggraph98Course.Terrain05\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
        else if (hasArguments) // if no arguments provided, this method produces usage warning
                thisExampleX3dModel.handleArguments(args);
	
        if (validate)
        {
            //  System.out.println("--- TODO fix duplicated outputs ---"); // omit when duplicated outputs problem is solved/refactored
		String validationResults = thisExampleX3dModel.validationReport();
            //  System.out.println("-----------------------------------"); // omit when duplicated outputs problem is solved/refactored
                System.out.print("Vrml2Sourcebook.Siggraph98Course.Terrain05 self-validation test results: ");
                if (!validationResults.equals("success"))
                    System.out.println();
                System.out.println(validationResults.trim());
        }
    }
}
