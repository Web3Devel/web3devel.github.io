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
import org.web3d.x3d.jsail.Interpolation.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc metadata annotations follow, see below for X3DJSAIL Java source code.
/**
 * <p> This world creates a morphing snake using an Extrusion node. To make the snake move, a CoordinateInterpolator sends the Extrusion node a series of new spines. </p>
 <p> Related links: <a href="../../../Siggraph98Course/Snake.java">Snake.java</a> source, <a href="../../../Siggraph98Course/SnakeIndex.html" target="_top">Snake catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Siggraph98Course/Snake.x3d">Snake.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> This world creates a morphing snake using an Extrusion node. To make the snake move, a CoordinateInterpolator sends the Extrusion node a series of new spines. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> David R. Nadeau </td>
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
			<td> originals/snake.wrl </td>
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
			<td> <a href="http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0258.htm" target="_blank">http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0258.htm</a> </td>
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
			<td> <a href="https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Snake.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Snake.x3d</a> </td>
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

	* @author David R. Nadeau
 */

public class Snake
{
	/** Default constructor to create this object. */
	public Snake ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
            try { // catch-all
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("Snake.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("This world creates a morphing snake using an Extrusion node. To make the snake move, a CoordinateInterpolator sends the Extrusion node a series of new spines."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("David R. Nadeau"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 July 1998"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("2 February 2014"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("originals/snake.wrl"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98/conference/courses/18.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0258.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Snake.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setInfo(new String[] {"Copyright (c) 1998, David R. Nadeau"}).setTitle("Morphing snake"))
    .addChild(new Viewpoint().setDescription("Entry view").setOrientation(1.0,0.0,0.0,-0.785).setPosition(0.0,6.0,6.0))
    .addChild(new NavigationInfo())
    .addChild(new Shape()
      .setAppearance(new Appearance()
        .setMaterial(new Material().setDiffuseColor(0.4,0.2,0.0)))
      .setGeometry(new Box().setSize(30.0,0.01,30.0)))
    .addChild(new Transform().setTranslation(0.0,0.3,0.0)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(0.0,1.0,0.2).setShininess(0.05).setSpecularColor(0.9,0.9,0.0)))
        .setGeometry(new Extrusion("Snake").setCreaseAngle(1.57).setCrossSection(new MFVec2f(new double[] {1.0,0.0,0.92,-0.38,0.71,-0.71,0.38,-0.92,0.0,-1.0,-0.38,-0.92,-0.71,-0.71,-0.92,-0.38,-1.0,-0.0,-0.92,0.38,-0.71,0.71,-0.38,0.92,0.0,1.0,0.38,0.92,0.71,0.71,0.92,0.38,1.0,0.0})).setScale(new MFVec2f(new double[] {0.05,0.05,0.3,0.1,0.5,0.15,0.25,0.25,0.25,0.25,0.28,0.28,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.3,0.29,0.29,0.29,0.29,0.29,0.29,0.28,0.28,0.23,0.23,0.17,0.17,0.12,0.12,0.08,0.08,0.05,0.05})).setSpine(new MFVec3f(new double[] {-5.1,0.0,1.0,-4.83,0.0,1.0,-4.55,0.0,1.0,-4.28,0.0,1.0,-4.0,0.0,1.0,-3.72,0.0,0.91,-3.45,0.0,0.65,-3.17,0.0,0.27,-2.9,0.0,-0.16,-2.62,0.0,-0.56,-2.34,0.0,-0.86,-2.07,0.0,-0.99,-1.79,0.0,-0.95,-1.52,0.0,-0.73,-1.24,0.0,-0.37,-0.97,0.0,0.05,-0.69,0.0,0.47,-0.41,0.0,0.79,-0.14,0.0,0.98,0.14,0.0,0.98,0.41,0.0,0.8,0.69,0.0,0.47,0.97,0.0,0.06,1.24,0.0,-0.37,1.52,0.0,-0.72,1.79,0.0,-0.95,2.07,0.0,-0.99,2.34,0.0,-0.86,2.62,0.0,-0.57,2.9,0.0,-0.17,3.17,0.0,0.26,3.45,0.0,0.64,3.72,0.0,0.9,4.0,0.0,1.0})))))
    .addChild(new TimeSensor("Clock").setCycleInterval(4.0).setLoop(true))
    .addChild(new CoordinateInterpolator("SnakeWiggle").setKey(new double[] {0.0,0.03,0.07,0.1,0.14,0.17,0.21,0.24,0.28,0.31,0.34,0.38,0.41,0.45,0.48,0.52,0.55,0.59,0.62,0.66,0.69,0.72,0.76,0.79,0.83,0.86,0.9,0.93,0.97,1.0}).setKeyValue(getSnakeWiggle_3_32_keyValue()))
    .addChild(new ROUTE().setFromNode("Clock").setFromField("fraction_changed").setToNode("SnakeWiggle").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("SnakeWiggle").setFromField("value_changed").setToNode("Snake").setToField("set_spine")));
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
		private double[] getSnakeWiggle_3_32_keyValue_1()
		{
			double[] value = {-4.83,0.0,1.0,-4.55,0.0,1.0,-4.28,0.0,1.0,-4.0,0.0,1.0,-3.72,0.0,0.91,-3.45,0.0,0.67,-3.17,0.0,0.31,-2.9,0.0,-0.1,-2.62,0.0,-0.5,-2.34,0.0,-0.81,-2.07,0.0,-0.98,-1.79,0.0,-0.98,-1.52,0.0,-0.81,-1.24,0.0,-0.5,-0.97,0.0,-0.11,-0.69,0.0,0.31,-0.41,0.0,0.67,-0.14,0.0,0.91,0.14,0.0,1.0,0.41,0.0,0.91,0.69,0.0,0.67,0.97,0.0,0.31,1.24,0.0,-0.1,1.52,0.0,-0.5,1.79,0.0,-0.81,2.07,0.0,-0.98,2.34,0.0,-0.98,2.62,0.0,-0.81,2.9,0.0,-0.5,3.17,0.0,-0.11,3.45,0.0,0.3,3.72,0.0,0.66,4.0,0.0,0.91,4.28,0.0,1.0,-4.83,0.0,0.98,-4.55,0.0,0.98,-4.28,0.0,0.98,-4.0,0.0,0.98,-3.72,0.0,0.98,-3.45,0.0,0.81,-3.17,0.0,0.51,-2.9,0.0,0.11,-2.62,0.0,-0.3,-2.34,0.0,-0.66,-2.07,0.0,-0.91,-1.79,0.0,-1.0,-1.52,0.0,-0.92,-1.24,0.0,-0.68,-0.97,0.0,-0.32,-0.69,0.0,0.09,-0.41,0.0,0.49,-0.14,0.0,0.8,0.14,0.0,0.98,0.41,0.0,0.98,0.69,0.0,0.82,0.97,0.0,0.51,1.24,0.0,0.12,1.52,0.0,-0.3,1.79,0.0,-0.66,2.07,0.0,-0.91,2.34,0.0,-1.0,2.62,0.0,-0.92,2.9,0.0,-0.68,3.17,0.0,-0.32,3.45,0.0,0.09,3.72,0.0,0.49,4.0,0.0,0.8,4.28,0.0,0.98,-4.83,0.0,0.91,-4.55,0.0,0.91,-4.28,0.0,0.91,-4.0,0.0,0.91,-3.72,0.0,1.0,-3.45,0.0,0.92,-3.17,0.0,0.68,-2.9,0.0,0.32,-2.62,0.0,-0.09,-2.34,0.0,-0.49,-2.07,0.0,-0.8,-1.79,0.0,-0.97,-1.52,0.0,-0.98,-1.24,0.0,-0.82,-0.97,0.0,-0.51,-0.69,0.0,-0.12,-0.41,0.0,0.29,-0.14,0.0,0.66,0.14,0.0,0.91,0.41,0.0,1.0,0.69,0.0,0.92,0.97,0.0,0.68,1.24,0.0,0.33,1.52,0.0,-0.09,1.79,0.0,-0.48,2.07,0.0,-0.8,2.34,0.0,-0.97,2.62,0.0,-0.98,2.9,0.0,-0.82,3.17,0.0,-0.52,3.45,0.0,-0.12,3.72,0.0,0.29};
			return value;
		}
		private double[] getSnakeWiggle_3_32_keyValue_2()
		{
			double[] value = {4.0,0.0,0.65,4.28,0.0,0.9,-4.83,0.0,0.8,-4.55,0.0,0.8,-4.28,0.0,0.8,-4.0,0.0,0.8,-3.72,0.0,0.97,-3.45,0.0,0.98,-3.17,0.0,0.82,-2.9,0.0,0.52,-2.62,0.0,0.13,-2.34,0.0,-0.29,-2.07,0.0,-0.65,-1.79,0.0,-0.9,-1.52,0.0,-1.0,-1.24,0.0,-0.92,-0.97,0.0,-0.69,-0.69,0.0,-0.33,-0.41,0.0,0.08,-0.14,0.0,0.48,0.14,0.0,0.79,0.41,0.0,0.97,0.69,0.0,0.98,0.97,0.0,0.82,1.24,0.0,0.52,1.52,0.0,0.13,1.79,0.0,-0.28,2.07,0.0,-0.65,2.34,0.0,-0.9,2.62,0.0,-1.0,2.9,0.0,-0.92,3.17,0.0,-0.69,3.45,0.0,-0.33,3.72,0.0,0.08,4.0,0.0,0.48,4.28,0.0,0.79,-4.83,0.0,0.65,-4.55,0.0,0.65,-4.28,0.0,0.65,-4.0,0.0,0.65,-3.72,0.0,0.9,-3.45,0.0,1.0,-3.17,0.0,0.92,-2.9,0.0,0.69,-2.62,0.0,0.34,-2.34,0.0,-0.07,-2.07,0.0,-0.47,-1.79,0.0,-0.79,-1.52,0.0,-0.97,-1.24,0.0,-0.98,-0.97,0.0,-0.83,-0.69,0.0,-0.53,-0.41,0.0,-0.14,-0.14,0.0,0.28,0.14,0.0,0.65,0.41,0.0,0.9,0.69,0.0,1.0,0.97,0.0,0.93,1.24,0.0,0.69,1.52,0.0,0.34,1.79,0.0,-0.07,2.07,0.0,-0.47,2.34,0.0,-0.79,2.62,0.0,-0.97,2.9,0.0,-0.98,3.17,0.0,-0.83,3.45,0.0,-0.53,3.72,0.0,-0.14,4.0,0.0,0.28,4.28,0.0,0.64,-4.83,0.0,0.47,-4.55,0.0,0.47,-4.28,0.0,0.47,-4.0,0.0,0.47,-3.72,0.0,0.79,-3.45,0.0,0.97,-3.17,0.0,0.99,-2.9,0.0,0.83,-2.62,0.0,0.53,-2.34,0.0,0.14,-2.07,0.0,-0.27,-1.79,0.0,-0.64,-1.52,0.0,-0.9,-1.24,0.0,-1.0,-0.97,0.0,-0.93,-0.69,0.0,-0.7,-0.41,0.0,-0.35,-0.14,0.0,0.07,0.14,0.0,0.47,0.41,0.0,0.79,0.69,0.0,0.97,0.97,0.0,0.99,1.24,0.0,0.83,1.52,0.0,0.53,1.79,0.0,0.14,2.07,0.0,-0.27,2.34,0.0,-0.64,2.62,0.0,-0.9,2.9,0.0,-1.0,3.17,0.0,-0.93};
			return value;
		}
		private double[] getSnakeWiggle_3_32_keyValue_3()
		{
			double[] value = {3.45,0.0,-0.7,3.72,0.0,-0.35,4.0,0.0,0.06,4.28,0.0,0.46,-4.83,0.0,0.27,-4.55,0.0,0.27,-4.28,0.0,0.27,-4.0,0.0,0.27,-3.72,0.0,0.64,-3.45,0.0,0.9,-3.17,0.0,1.0,-2.9,0.0,0.93,-2.62,0.0,0.7,-2.34,0.0,0.35,-2.07,0.0,-0.06,-1.79,0.0,-0.46,-1.52,0.0,-0.78,-1.24,0.0,-0.97,-0.97,0.0,-0.99,-0.69,0.0,-0.83,-0.41,0.0,-0.54,-0.14,0.0,-0.15,0.14,0.0,0.27,0.41,0.0,0.63,0.69,0.0,0.89,0.97,0.0,1.0,1.24,0.0,0.93,1.52,0.0,0.7,1.79,0.0,0.35,2.07,0.0,-0.06,2.34,0.0,-0.46,2.62,0.0,-0.78,2.9,0.0,-0.97,3.17,0.0,-0.99,3.45,0.0,-0.84,3.72,0.0,-0.54,4.0,0.0,-0.15,4.28,0.0,0.26,-4.83,0.0,0.05,-4.55,0.0,0.05,-4.28,0.0,0.05,-4.0,0.0,0.05,-3.72,0.0,0.46,-3.45,0.0,0.78,-3.17,0.0,0.97,-2.9,0.0,0.99,-2.62,0.0,0.84,-2.34,0.0,0.54,-2.07,0.0,0.16,-1.79,0.0,-0.26,-1.52,0.0,-0.63,-1.24,0.0,-0.89,-0.97,0.0,-1.0,-0.69,0.0,-0.93,-0.41,0.0,-0.71,-0.14,0.0,-0.36,0.14,0.0,0.05,0.41,0.0,0.45,0.69,0.0,0.78,0.97,0.0,0.97,1.24,0.0,0.99,1.52,0.0,0.84,1.79,0.0,0.55,2.07,0.0,0.16,2.34,0.0,-0.26,2.62,0.0,-0.63,2.9,0.0,-0.89,3.17,0.0,-1.0,3.45,0.0,-0.93,3.72,0.0,-0.71,4.0,0.0,-0.36,4.28,0.0,0.05,-4.83,0.0,-0.16,-4.55,0.0,-0.16,-4.28,0.0,-0.16,-4.0,0.0,-0.16,-3.72,0.0,0.25,-3.45,0.0,0.63,-3.17,0.0,0.89,-2.9,0.0,1.0,-2.62,0.0,0.94,-2.34,0.0,0.71,-2.07,0.0,0.36,-1.79,0.0,-0.05,-1.52,0.0,-0.45,-1.24,0.0,-0.77,-0.97,0.0,-0.96,-0.69,0.0,-0.99,-0.41,0.0,-0.84,-0.14,0.0,-0.55,0.14,0.0,-0.16,0.41,0.0,0.25,0.69,0.0,0.62,0.97,0.0,0.89,1.24,0.0,1.0,1.52,0.0,0.94,1.79,0.0,0.71,2.07,0.0,0.37,2.34,0.0,-0.04,2.62,0.0,-0.45};
			return value;
		}
		private double[] getSnakeWiggle_3_32_keyValue_4()
		{
			double[] value = {2.9,0.0,-0.77,3.17,0.0,-0.96,3.45,0.0,-0.99,3.72,0.0,-0.84,4.0,0.0,-0.55,4.28,0.0,-0.17,-4.83,0.0,-0.37,-4.55,0.0,-0.37,-4.28,0.0,-0.37,-4.0,0.0,-0.37,-3.72,0.0,0.04,-3.45,0.0,0.44,-3.17,0.0,0.77,-2.9,0.0,0.96,-2.62,0.0,0.99,-2.34,0.0,0.85,-2.07,0.0,0.56,-1.79,0.0,0.17,-1.52,0.0,-0.25,-1.24,0.0,-0.62,-0.97,0.0,-0.88,-0.69,0.0,-1.0,-0.41,0.0,-0.94,-0.14,0.0,-0.72,0.14,0.0,-0.37,0.41,0.0,0.04,0.69,0.0,0.44,0.97,0.0,0.77,1.24,0.0,0.96,1.52,0.0,0.99,1.79,0.0,0.85,2.07,0.0,0.56,2.34,0.0,0.17,2.62,0.0,-0.24,2.9,0.0,-0.62,3.17,0.0,-0.88,3.45,0.0,-1.0,3.72,0.0,-0.94,4.0,0.0,-0.72,4.28,0.0,-0.38,-4.83,0.0,-0.56,-4.55,0.0,-0.56,-4.28,0.0,-0.56,-4.0,0.0,-0.56,-3.72,0.0,-0.18,-3.45,0.0,0.24,-3.17,0.0,0.61,-2.9,0.0,0.88,-2.62,0.0,1.0,-2.34,0.0,0.94,-2.07,0.0,0.72,-1.79,0.0,0.38,-1.52,0.0,-0.03,-1.24,0.0,-0.44,-0.97,0.0,-0.76,-0.69,0.0,-0.96,-0.41,0.0,-0.99,-0.14,0.0,-0.85,0.14,0.0,-0.56,0.41,0.0,-0.18,0.69,0.0,0.24,0.97,0.0,0.61,1.24,0.0,0.88,1.52,0.0,1.0,1.79,0.0,0.94,2.07,0.0,0.72,2.34,0.0,0.38,2.62,0.0,-0.03,2.9,0.0,-0.43,3.17,0.0,-0.76,3.45,0.0,-0.96,3.72,0.0,-0.99,4.0,0.0,-0.85,4.28,0.0,-0.57,-4.83,0.0,-0.73,-4.55,0.0,-0.73,-4.28,0.0,-0.73,-4.0,0.0,-0.73,-3.72,0.0,-0.38,-3.45,0.0,0.03,-3.17,0.0,0.43,-2.9,0.0,0.76,-2.62,0.0,0.96,-2.34,0.0,0.99,-2.07,0.0,0.85,-1.79,0.0,0.57,-1.52,0.0,0.18,-1.24,0.0,-0.23,-0.97,0.0,-0.61,-0.69,0.0,-0.88,-0.41,0.0,-1.0,-0.14,0.0,-0.94,0.14,0.0,-0.73,0.41,0.0,-0.39,0.69,0.0,0.02,0.97,0.0,0.43,1.24,0.0,0.76,1.52,0.0,0.96,1.79,0.0,0.99,2.07,0.0,0.85};
			return value;
		}
		private double[] getSnakeWiggle_3_32_keyValue_5()
		{
			double[] value = {2.34,0.0,0.57,2.62,0.0,0.19,2.9,0.0,-0.23,3.17,0.0,-0.6,3.45,0.0,-0.88,3.72,0.0,-1.0,4.0,0.0,-0.94,4.28,0.0,-0.73,-4.83,0.0,-0.86,-4.55,0.0,-0.86,-4.28,0.0,-0.86,-4.0,0.0,-0.86,-3.72,0.0,-0.57,-3.45,0.0,-0.19,-3.17,0.0,0.23,-2.9,0.0,0.6,-2.62,0.0,0.88,-2.34,0.0,1.0,-2.07,0.0,0.95,-1.79,0.0,0.73,-1.52,0.0,0.39,-1.24,0.0,-0.02,-0.97,0.0,-0.42,-0.69,0.0,-0.75,-0.41,0.0,-0.96,-0.14,0.0,-0.99,0.14,0.0,-0.86,0.41,0.0,-0.57,0.69,0.0,-0.19,0.97,0.0,0.22,1.24,0.0,0.6,1.52,0.0,0.87,1.79,0.0,1.0,2.07,0.0,0.95,2.34,0.0,0.73,2.62,0.0,0.39,2.9,0.0,-0.01,3.17,0.0,-0.42,3.45,0.0,-0.75,3.72,0.0,-0.96,4.0,0.0,-0.99,4.28,0.0,-0.86,-4.83,0.0,-0.95,-4.55,0.0,-0.95,-4.28,0.0,-0.95,-4.0,0.0,-0.95,-3.72,0.0,-0.74,-3.45,0.0,-0.4,-3.17,0.0,0.01,-2.9,0.0,0.42,-2.62,0.0,0.75,-2.34,0.0,0.95,-2.07,0.0,0.99,-1.79,0.0,0.86,-1.52,0.0,0.58,-1.24,0.0,0.2,-0.97,0.0,-0.22,-0.69,0.0,-0.6,-0.41,0.0,-0.87,-0.14,0.0,-1.0,0.14,0.0,-0.95,0.41,0.0,-0.74,0.69,0.0,-0.4,0.97,0.0,0.01,1.24,0.0,0.41,1.52,0.0,0.75,1.79,0.0,0.95,2.07,0.0,0.99,2.34,0.0,0.86,2.62,0.0,0.58,2.9,0.0,0.2,3.17,0.0,-0.21,3.45,0.0,-0.59,3.72,0.0,-0.87,4.0,0.0,-1.0,4.28,0.0,-0.95,-4.83,0.0,-0.99,-4.55,0.0,-0.99,-4.28,0.0,-0.99,-4.0,0.0,-0.99,-3.72,0.0,-0.86,-3.45,0.0,-0.58,-3.17,0.0,-0.2,-2.9,0.0,0.21,-2.62,0.0,0.59,-2.34,0.0,0.87,-2.07,0.0,0.99,-1.79,0.0,0.95,-1.52,0.0,0.74,-1.24,0.0,0.4,-0.97,0.0,0.0,-0.69,0.0,-0.41,-0.41,0.0,-0.74,-0.14,0.0,-0.95,0.14,0.0,-0.99,0.41,0.0,-0.87,0.69,0.0,-0.59,0.97,0.0,-0.21,1.24,0.0,0.21,1.52,0.0,0.59};
			return value;
		}
		private double[] getSnakeWiggle_3_32_keyValue_6()
		{
			double[] value = {1.79,0.0,0.87,2.07,0.0,0.99,2.34,0.0,0.95,2.62,0.0,0.74,2.9,0.0,0.41,3.17,0.0,0.0,3.45,0.0,-0.41,3.72,0.0,-0.74,4.0,0.0,-0.95,4.28,0.0,-0.99,-4.83,0.0,-0.99,-4.55,0.0,-0.99,-4.28,0.0,-0.99,-4.0,0.0,-0.99,-3.72,0.0,-0.95,-3.45,0.0,-0.74,-3.17,0.0,-0.41,-2.9,0.0,0.0,-2.62,0.0,0.4,-2.34,0.0,0.74,-2.07,0.0,0.95,-1.79,0.0,0.99,-1.52,0.0,0.87,-1.24,0.0,0.59,-0.97,0.0,0.21,-0.69,0.0,-0.2,-0.41,0.0,-0.58,-0.14,0.0,-0.86,0.14,0.0,-0.99,0.41,0.0,-0.95,0.69,0.0,-0.75,0.97,0.0,-0.41,1.24,0.0,-0.01,1.52,0.0,0.4,1.79,0.0,0.74,2.07,0.0,0.95,2.34,0.0,1.0,2.62,0.0,0.87,2.9,0.0,0.59,3.17,0.0,0.22,3.45,0.0,-0.2,3.72,0.0,-0.58,4.0,0.0,-0.86,4.28,0.0,-0.99,-4.83,0.0,-0.95,-4.55,0.0,-0.95,-4.28,0.0,-0.95,-4.0,0.0,-0.95,-3.72,0.0,-1.0,-3.45,0.0,-0.87,-3.17,0.0,-0.6,-2.9,0.0,-0.22,-2.62,0.0,0.2,-2.34,0.0,0.58,-2.07,0.0,0.86,-1.79,0.0,0.99,-1.52,0.0,0.95,-1.24,0.0,0.75,-0.97,0.0,0.42,-0.69,0.0,0.01,-0.41,0.0,-0.4,-0.14,0.0,-0.74,0.14,0.0,-0.95,0.41,0.0,-1.0,0.69,0.0,-0.87,0.97,0.0,-0.6,1.24,0.0,-0.22,1.52,0.0,0.19,1.79,0.0,0.58,2.07,0.0,0.86,2.34,0.0,0.99,2.62,0.0,0.96,2.9,0.0,0.75,3.17,0.0,0.42,3.45,0.0,0.01,3.72,0.0,-0.39,4.0,0.0,-0.73,4.28,0.0,-0.95,-4.83,0.0,-0.86,-4.55,0.0,-0.86,-4.28,0.0,-0.86,-4.0,0.0,-0.86,-3.72,0.0,-0.99,-3.45,0.0,-0.96,-3.17,0.0,-0.75,-2.9,0.0,-0.42,-2.62,0.0,-0.02,-2.34,0.0,0.39,-2.07,0.0,0.73,-1.79,0.0,0.95,-1.52,0.0,1.0,-1.24,0.0,0.88,-0.97,0.0,0.6,-0.69,0.0,0.23,-0.41,0.0,-0.19,-0.14,0.0,-0.57,0.14,0.0,-0.86,0.41,0.0,-0.99,0.69,0.0,-0.96,0.97,0.0,-0.76};
			return value;
		}
		private double[] getSnakeWiggle_3_32_keyValue_7()
		{
			double[] value = {1.24,0.0,-0.43,1.52,0.0,-0.02,1.79,0.0,0.39,2.07,0.0,0.73,2.34,0.0,0.94,2.62,0.0,1.0,2.9,0.0,0.88,3.17,0.0,0.61,3.45,0.0,0.23,3.72,0.0,-0.19,4.0,0.0,-0.57,4.28,0.0,-0.85,-4.83,0.0,-0.73,-4.55,0.0,-0.73,-4.28,0.0,-0.73,-4.0,0.0,-0.73,-3.72,0.0,-0.94,-3.45,0.0,-1.0,-3.17,0.0,-0.88,-2.9,0.0,-0.61,-2.62,0.0,-0.23,-2.34,0.0,0.18,-2.07,0.0,0.57,-1.79,0.0,0.85,-1.52,0.0,0.99,-1.24,0.0,0.96,-0.97,0.0,0.76,-0.69,0.0,0.43,-0.41,0.0,0.03,-0.14,0.0,-0.38,0.14,0.0,-0.73,0.41,0.0,-0.94,0.69,0.0,-1.0,0.97,0.0,-0.88,1.24,0.0,-0.61,1.52,0.0,-0.23,1.79,0.0,0.18,2.07,0.0,0.56,2.34,0.0,0.85,2.62,0.0,0.99,2.9,0.0,0.96,3.17,0.0,0.76,3.45,0.0,0.43,3.72,0.0,0.03,4.0,0.0,-0.38,4.28,0.0,-0.72,-4.83,0.0,-0.56,-4.55,0.0,-0.56,-4.28,0.0,-0.56,-4.0,0.0,-0.56,-3.72,0.0,-0.85,-3.45,0.0,-0.99,-3.17,0.0,-0.96,-2.9,0.0,-0.76,-2.62,0.0,-0.44,-2.34,0.0,-0.03,-2.07,0.0,0.38,-1.79,0.0,0.72,-1.52,0.0,0.94,-1.24,0.0,1.0,-0.97,0.0,0.88,-0.69,0.0,0.61,-0.41,0.0,0.24,-0.14,0.0,-0.18,0.14,0.0,-0.56,0.41,0.0,-0.85,0.69,0.0,-0.99,0.97,0.0,-0.96,1.24,0.0,-0.77,1.52,0.0,-0.44,1.79,0.0,-0.03,2.07,0.0,0.37,2.34,0.0,0.72,2.62,0.0,0.94,2.9,0.0,1.0,3.17,0.0,0.88,3.45,0.0,0.62,3.72,0.0,0.24,4.0,0.0,-0.17,4.28,0.0,-0.56,-4.83,0.0,-0.37,-4.55,0.0,-0.37,-4.28,0.0,-0.37,-4.0,0.0,-0.37,-3.72,0.0,-0.72,-3.45,0.0,-0.94,-3.17,0.0,-1.0,-2.9,0.0,-0.88,-2.62,0.0,-0.62,-2.34,0.0,-0.25,-2.07,0.0,0.17,-1.79,0.0,0.56,-1.52,0.0,0.85,-1.24,0.0,0.99,-0.97,0.0,0.96,-0.69,0.0,0.77,-0.41,0.0,0.44,-0.14,0.0,0.04,0.14,0.0,-0.37,0.41,0.0,-0.72};
			return value;
		}
		private double[] getSnakeWiggle_3_32_keyValue_8()
		{
			double[] value = {0.69,0.0,-0.94,0.97,0.0,-1.0,1.24,0.0,-0.89,1.52,0.0,-0.62,1.79,0.0,-0.25,2.07,0.0,0.17,2.34,0.0,0.55,2.62,0.0,0.84,2.9,0.0,0.99,3.17,0.0,0.96,3.45,0.0,0.77,3.72,0.0,0.45,4.0,0.0,0.04,4.28,0.0,-0.37,-4.83,0.0,-0.16,-4.55,0.0,-0.16,-4.28,0.0,-0.16,-4.0,0.0,-0.16,-3.72,0.0,-0.55,-3.45,0.0,-0.84,-3.17,0.0,-0.99,-2.9,0.0,-0.96,-2.62,0.0,-0.77,-2.34,0.0,-0.45,-2.07,0.0,-0.05,-1.79,0.0,0.36,-1.52,0.0,0.71,-1.24,0.0,0.94,-0.97,0.0,1.0,-0.69,0.0,0.89,-0.41,0.0,0.63,-0.14,0.0,0.25,0.14,0.0,-0.16,0.41,0.0,-0.55,0.69,0.0,-0.84,0.97,0.0,-0.99,1.24,0.0,-0.96,1.52,0.0,-0.77,1.79,0.0,-0.45,2.07,0.0,-0.05,2.34,0.0,0.36,2.62,0.0,0.71,2.9,0.0,0.93,3.17,0.0,1.0,3.45,0.0,0.89,3.72,0.0,0.63,4.0,0.0,0.26,4.28,0.0,-0.16,-4.83,0.0,0.05,-4.55,0.0,0.05,-4.28,0.0,0.05,-4.0,0.0,0.05,-3.72,0.0,-0.36,-3.45,0.0,-0.71,-3.17,0.0,-0.93,-2.9,0.0,-1.0,-2.62,0.0,-0.89,-2.34,0.0,-0.63,-2.07,0.0,-0.26,-1.79,0.0,0.16,-1.52,0.0,0.54,-1.24,0.0,0.84,-0.97,0.0,0.99,-0.69,0.0,0.97,-0.41,0.0,0.78,-0.14,0.0,0.46,0.14,0.0,0.05,0.41,0.0,-0.36,0.69,0.0,-0.7,0.97,0.0,-0.93,1.24,0.0,-1.0,1.52,0.0,-0.89,1.79,0.0,-0.63,2.07,0.0,-0.26,2.34,0.0,0.15,2.62,0.0,0.54,2.9,0.0,0.84,3.17,0.0,0.99,3.45,0.0,0.97,3.72,0.0,0.78,4.0,0.0,0.46,4.28,0.0,0.06,-4.83,0.0,0.27,-4.55,0.0,0.27,-4.28,0.0,0.27,-4.0,0.0,0.27,-3.72,0.0,-0.15,-3.45,0.0,-0.54,-3.17,0.0,-0.83,-2.9,0.0,-0.99,-2.62,0.0,-0.97,-2.34,0.0,-0.78,-2.07,0.0,-0.46,-1.79,0.0,-0.06,-1.52,0.0,0.35,-1.24,0.0,0.7,-0.97,0.0,0.93,-0.69,0.0,1.0,-0.41,0.0,0.9,-0.14,0.0,0.64};
			return value;
		}
		private double[] getSnakeWiggle_3_32_keyValue_9()
		{
			double[] value = {0.14,0.0,0.27,0.41,0.0,-0.15,0.69,0.0,-0.54,0.97,0.0,-0.83,1.24,0.0,-0.99,1.52,0.0,-0.97,1.79,0.0,-0.78,2.07,0.0,-0.46,2.34,0.0,-0.06,2.62,0.0,0.35,2.9,0.0,0.7,3.17,0.0,0.93,3.45,0.0,1.0,3.72,0.0,0.9,4.0,0.0,0.64,4.28,0.0,0.27,-4.83,0.0,0.47,-4.55,0.0,0.47,-4.28,0.0,0.47,-4.0,0.0,0.47,-3.72,0.0,0.07,-3.45,0.0,-0.35,-3.17,0.0,-0.7,-2.9,0.0,-0.93,-2.62,0.0,-1.0,-2.34,0.0,-0.9,-2.07,0.0,-0.64,-1.79,0.0,-0.27,-1.52,0.0,0.14,-1.24,0.0,0.53,-0.97,0.0,0.83,-0.69,0.0,0.99,-0.41,0.0,0.97,-0.14,0.0,0.79,0.14,0.0,0.47,0.41,0.0,0.07,0.69,0.0,-0.34,0.97,0.0,-0.69,1.24,0.0,-0.93,1.52,0.0,-1.0,1.79,0.0,-0.9,2.07,0.0,-0.64,2.34,0.0,-0.28,2.62,0.0,0.14,2.9,0.0,0.53,3.17,0.0,0.83,3.45,0.0,0.98,3.72,0.0,0.97,4.0,0.0,0.79,4.28,0.0,0.47,-4.83,0.0,0.65,-4.55,0.0,0.65,-4.28,0.0,0.65,-4.0,0.0,0.65,-3.72,0.0,0.28,-3.45,0.0,-0.14,-3.17,0.0,-0.53,-2.9,0.0,-0.83,-2.62,0.0,-0.98,-2.34,0.0,-0.97,-2.07,0.0,-0.79,-1.79,0.0,-0.47,-1.52,0.0,-0.07,-1.24,0.0,0.34,-0.97,0.0,0.69,-0.69,0.0,0.92,-0.41,0.0,1.0,-0.14,0.0,0.9,0.14,0.0,0.65,0.41,0.0,0.28,0.69,0.0,-0.13,0.97,0.0,-0.52,1.24,0.0,-0.82,1.52,0.0,-0.98,1.79,0.0,-0.97,2.07,0.0,-0.79,2.34,0.0,-0.48,2.62,0.0,-0.08,2.9,0.0,0.33,3.17,0.0,0.69,3.45,0.0,0.92,3.72,0.0,1.0,4.0,0.0,0.9,4.28,0.0,0.65,-4.83,0.0,0.79,-4.55,0.0,0.79,-4.28,0.0,0.79,-4.0,0.0,0.79,-3.72,0.0,0.48,-3.45,0.0,0.08,-3.17,0.0,-0.33,-2.9,0.0,-0.69,-2.62,0.0,-0.92,-2.34,0.0,-1.0,-2.07,0.0,-0.9,-1.79,0.0,-0.65,-1.52,0.0,-0.29,-1.24,0.0,0.13,-0.97,0.0,0.52,-0.69,0.0,0.82};
			return value;
		}
		private double[] getSnakeWiggle_3_32_keyValue_10()
		{
			double[] value = {-0.41,0.0,0.98,-0.14,0.0,0.97,0.14,0.0,0.8,0.41,0.0,0.48,0.69,0.0,0.08,0.97,0.0,-0.33,1.24,0.0,-0.68,1.52,0.0,-0.92,1.79,0.0,-1.0,2.07,0.0,-0.91,2.34,0.0,-0.65,2.62,0.0,-0.29,2.9,0.0,0.12,3.17,0.0,0.52,3.45,0.0,0.82,3.72,0.0,0.98,4.0,0.0,0.97,4.28,0.0,0.8,-4.83,0.0,0.91,-4.55,0.0,0.91,-4.28,0.0,0.91,-4.0,0.0,0.91,-3.72,0.0,0.66,-3.45,0.0,0.29,-3.17,0.0,-0.12,-2.9,0.0,-0.51,-2.62,0.0,-0.82,-2.34,0.0,-0.98,-2.07,0.0,-0.97,-1.79,0.0,-0.8,-1.52,0.0,-0.49,-1.24,0.0,-0.09,-0.97,0.0,0.32,-0.69,0.0,0.68,-0.41,0.0,0.92,-0.14,0.0,1.0,0.14,0.0,0.91,0.41,0.0,0.66,0.69,0.0,0.3,0.97,0.0,-0.12,1.24,0.0,-0.51,1.52,0.0,-0.82,1.79,0.0,-0.98,2.07,0.0,-0.98,2.34,0.0,-0.8,2.62,0.0,-0.49,2.9,0.0,-0.09,3.17,0.0,0.32,3.45,0.0,0.68,3.72,0.0,0.92,4.0,0.0,1.0,4.28,0.0,0.91,-4.83,0.0,0.98,-4.55,0.0,0.98,-4.28,0.0,0.98,-4.0,0.0,0.98,-3.72,0.0,0.8,-3.45,0.0,0.49,-3.17,0.0,0.09,-2.9,0.0,-0.32,-2.62,0.0,-0.68,-2.34,0.0,-0.92,-2.07,0.0,-1.0,-1.79,0.0,-0.91,-1.52,0.0,-0.66,-1.24,0.0,-0.3,-0.97,0.0,0.11,-0.69,0.0,0.51,-0.41,0.0,0.81,-0.14,0.0,0.98,0.14,0.0,0.98,0.41,0.0,0.8,0.69,0.0,0.49,0.97,0.0,0.1,1.24,0.0,-0.31,1.52,0.0,-0.67,1.79,0.0,-0.92,2.07,0.0,-1.0,2.34,0.0,-0.91,2.62,0.0,-0.67,2.9,0.0,-0.3,3.17,0.0,0.11,3.45,0.0,0.5,3.72,0.0,0.81,4.0,0.0,0.98,4.28,0.0,0.98,-4.83,0.0,1.0,-4.55,0.0,1.0,-4.28,0.0,1.0,-4.0,0.0,1.0,-3.72,0.0,0.91,-3.45,0.0,0.67,-3.17,0.0,0.31,-2.9,0.0,-0.11,-2.62,0.0,-0.5,-2.34,0.0,-0.81,-2.07,0.0,-0.98,-1.79,0.0,-0.98,-1.52,0.0,-0.81,-1.24,0.0,-0.5};
			return value;
		}
		private double[] getSnakeWiggle_3_32_keyValue_11()
		{
			double[] value = {-0.97,0.0,-0.1,-0.69,0.0,0.31,-0.41,0.0,0.67,-0.14,0.0,0.91,0.14,0.0,1.0,0.41,0.0,0.91,0.69,0.0,0.67,0.97,0.0,0.31,1.24,0.0,-0.1,1.52,0.0,-0.5,1.79,0.0,-0.81,2.07,0.0,-0.98,2.34,0.0,-0.98,2.62,0.0,-0.81,2.9,0.0,-0.5,3.17,0.0,-0.11,3.45,0.0,0.31,3.72,0.0,0.67,4.0,0.0,0.91,4.28,0.0,1.0};
			return value;
		}

		/** Large attribute array: CoordinateInterpolator DEF='SnakeWiggle' keyValue field, scene-graph level=3, element #32, 3060 total numbers made up of 1020 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getSnakeWiggle_3_32_keyValue()
		{
			MFVec3f SnakeWiggle_3_32_keyValue = new MFVec3f()/*2.finalize*/
				.append(new MFVec3f(getSnakeWiggle_3_32_keyValue_1()))
				.append(new MFVec3f(getSnakeWiggle_3_32_keyValue_2()))
				.append(new MFVec3f(getSnakeWiggle_3_32_keyValue_3()))
				.append(new MFVec3f(getSnakeWiggle_3_32_keyValue_4()))
				.append(new MFVec3f(getSnakeWiggle_3_32_keyValue_5()))
				.append(new MFVec3f(getSnakeWiggle_3_32_keyValue_6()))
				.append(new MFVec3f(getSnakeWiggle_3_32_keyValue_7()))
				.append(new MFVec3f(getSnakeWiggle_3_32_keyValue_8()))
				.append(new MFVec3f(getSnakeWiggle_3_32_keyValue_9()))
				.append(new MFVec3f(getSnakeWiggle_3_32_keyValue_10()))
				.append(new MFVec3f(getSnakeWiggle_3_32_keyValue_11()));
			return SnakeWiggle_3_32_keyValue;
		}

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return Snake model
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
        X3D thisExampleX3dModel = new Snake().getX3dModel();
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
                System.out.println("WARNING: \"Vrml2Sourcebook.Siggraph98Course.Snake\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
        else if (hasArguments) // if no arguments provided, this method produces usage warning
                thisExampleX3dModel.handleArguments(args);
	
        if (validate)
        {
            //  System.out.println("--- TODO fix duplicated outputs ---"); // omit when duplicated outputs problem is solved/refactored
		String validationResults = thisExampleX3dModel.validationReport();
            //  System.out.println("-----------------------------------"); // omit when duplicated outputs problem is solved/refactored
                System.out.print("Vrml2Sourcebook.Siggraph98Course.Snake self-validation test results: ");
                if (!validationResults.equals("success"))
                    System.out.println();
                System.out.println(validationResults.trim());
        }
    }
}