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
 * <p> Spiral flow shows how to move a set of particles (spheres) along a pre-computed animation path. Such an approach might be used to visualize the results of a fluid flow simulation. </p>
 <p> Related links: <a href="../../../Siggraph98Course/Spiral.java">Spiral.java</a> source, <a href="../../../Siggraph98Course/SpiralIndex.html" target="_top">Spiral catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Siggraph98Course/Spiral.x3d">Spiral.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Spiral flow shows how to move a set of particles (spheres) along a pre-computed animation path. Such an approach might be used to visualize the results of a fluid flow simulation. </td>
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
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> <a href="../../../Siggraph98Course/Spiral.png">Spiral.png</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> originals/spiral.wrl </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> TODO </i> </td>
			<td> build the track that the balls follow </td>
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
			<td> <a href="http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0008.htm" target="_blank">http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0008.htm</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0151.htm" target="_blank">http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0151.htm</a> </td>
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
			<td> <a href="https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Spiral.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Spiral.x3d</a> </td>
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

public class Spiral
{
	/** Default constructor to create this object. */
	public Spiral ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
            try { // catch-all
  x3dModel = new X3D().setProfile(X3D.PROFILE_INTERCHANGE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("Spiral.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Spiral flow shows how to move a set of particles (spheres) along a pre-computed animation path. Such an approach might be used to visualize the results of a fluid flow simulation."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("David R. Nadeau"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 July 1998"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("2 February 2014"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("Spiral.png"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("originals/spiral.wrl"))
    .addMeta(new meta().setName(meta.NAME_TODO       ).setContent("build the track that the balls follow"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98/conference/courses/18.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0008.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0151.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Spiral.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setInfo(new String[] {"Copyright (c) 1997, David R. Nadeau"}).setTitle("Spiral flow"))
    .addChild(new Viewpoint().setDescription("Entry view").setPosition(0.0,9.0,35.0))
    .addChild(new NavigationInfo())
    .addComments(" Center pole ")
    .addChild(new Transform().setTranslation(0.0,8.0,0.0)
      .addChild(new Shape()
        .setAppearance(new Appearance("BaseColor")
          .setMaterial(new Material().setDiffuseColor(0.0,0.5,1.0)))
        .setGeometry(new Cylinder().setHeight(18.0).setRadius(0.5))))
    .addComments(" Ground under pole ")
    .addChild(new Transform().setTranslation(0.0,-1.0,0.0)
      .addChild(new Shape()
        .setAppearance(new Appearance().setUSE("BaseColor"))
        .setGeometry(new Cylinder().setHeight(0.25).setRadius(6.0))))
    .addComments(" Particle source ")
    .addChild(new Transform().setTranslation(0.0,16.0,0.0)
      .addChild(new Transform().setRotation(1.0,0.0,0.0,-1.571).setTranslation(4.5,0.0,-1.0)
        .addChild(new Shape()
          .setAppearance(new Appearance().setUSE("BaseColor"))
          .setGeometry(new Cone().setBottomRadius(1.2).setHeight(2.5))))
      .addChild(new Transform().setTranslation(2.25,0.0,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance().setUSE("BaseColor"))
          .setGeometry(new Box().setSize(4.5,0.5,0.5)))))
    .addComments(" Particle sink ")
    .addChild(new Transform()
      .addChild(new Transform().setRotation(1.0,0.0,0.0,1.571).setTranslation(4.5,0.0,1.0)
        .addChild(new Shape()
          .setAppearance(new Appearance().setUSE("BaseColor"))
          .setGeometry(new Cone().setBottomRadius(1.2).setHeight(2.5))))
      .addChild(new Transform().setTranslation(2.25,0.0,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance().setUSE("BaseColor"))
          .setGeometry(new Box().setSize(4.5,0.5,0.5)))))
    .addComments(" Set of particles to spin around the pole ")
    .addChild(new Transform("Particle1")
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material("Material1")))
        .setGeometry(new Sphere("Particle"))))
    .addChild(new Transform("Particle2")
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material("Material2")))
        .setGeometry(new Sphere().setUSE("Particle"))))
    .addChild(new Transform("Particle3")
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material("Material3")))
        .setGeometry(new Sphere().setUSE("Particle"))))
    .addChild(new Transform("Particle4")
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material("Material4")))
        .setGeometry(new Sphere().setUSE("Particle"))))
    .addChild(new Transform("Particle5")
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material("Material5")))
        .setGeometry(new Sphere().setUSE("Particle"))))
    .addChild(new Transform("Particle6")
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material("Material6")))
        .setGeometry(new Sphere().setUSE("Particle"))))
    .addChild(new Transform("Particle7")
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material("Material7")))
        .setGeometry(new Sphere().setUSE("Particle"))))
    .addChild(new Transform("Particle8")
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material("Material8")))
        .setGeometry(new Sphere().setUSE("Particle"))))
    .addChild(new Transform("Particle9")
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material("Material9")))
        .setGeometry(new Sphere().setUSE("Particle"))))
    .addChild(new Transform("Particle10")
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material("Material10")))
        .setGeometry(new Sphere().setUSE("Particle"))))
    .addChild(new Transform("Particle11")
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material("Material11")))
        .setGeometry(new Sphere().setUSE("Particle"))))
    .addChild(new Transform("Particle12")
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material("Material12")))
        .setGeometry(new Sphere().setUSE("Particle"))))
    .addComments(" Set of timers, one per particle ")
    .addChild(new TimeSensor("Timer1").setCycleInterval(12.0).setLoop(true).setStopTime(-1.0))
    .addChild(new TimeSensor("Timer2").setCycleInterval(12.0).setLoop(true).setStartTime(0.25).setStopTime(-1.0))
    .addChild(new TimeSensor("Timer3").setCycleInterval(12.0).setLoop(true).setStartTime(0.5).setStopTime(-1.0))
    .addChild(new TimeSensor("Timer4").setCycleInterval(12.0).setLoop(true).setStartTime(0.7500000000000001).setStopTime(-1.0))
    .addChild(new TimeSensor("Timer5").setCycleInterval(12.0).setLoop(true).setStartTime(1.0).setStopTime(-1.0))
    .addChild(new TimeSensor("Timer6").setCycleInterval(12.0).setLoop(true).setStartTime(1.25).setStopTime(-1.0))
    .addChild(new TimeSensor("Timer7").setCycleInterval(12.0).setLoop(true).setStartTime(6.0).setStopTime(-1.0))
    .addChild(new TimeSensor("Timer8").setCycleInterval(12.0).setLoop(true).setStartTime(6.25).setStopTime(-1.0))
    .addChild(new TimeSensor("Timer9").setCycleInterval(12.0).setLoop(true).setStartTime(6.5).setStopTime(-1.0))
    .addChild(new TimeSensor("Timer10").setCycleInterval(12.0).setLoop(true).setStartTime(6.75).setStopTime(-1.0))
    .addChild(new TimeSensor("Timer11").setCycleInterval(12.0).setLoop(true).setStartTime(7.0).setStopTime(-1.0))
    .addChild(new TimeSensor("Timer12").setCycleInterval(12.0).setLoop(true).setStartTime(7.25).setStopTime(-1.0))
    .addComments(" Set of position interpolators, one per particle. All paths are identical ")
    .addChild(new PositionInterpolator("Position1").setKey(new double[] {0.0,0.02,0.03,0.05,0.06,0.08,0.1,0.11,0.13,0.14,0.16,0.17,0.19,0.21,0.22,0.24,0.25,0.27,0.29,0.3,0.32,0.33,0.35,0.37,0.38,0.4,0.41,0.43,0.44,0.46,0.48,0.49,0.51,0.52,0.54,0.56,0.57,0.59,0.6,0.62,0.63,0.65,0.67,0.68,0.7,0.71,0.73,0.75,0.76,0.78,0.79,0.81,0.83,0.84,0.86,0.87,0.89,0.9,0.92,0.94,0.95,0.97,0.98,1.0}).setKeyValue(getPosition1_3_124_keyValue()))
    .addChild(new PositionInterpolator("Position2").setKey(new double[] {0.0,0.02,0.03,0.05,0.06,0.08,0.1,0.11,0.13,0.14,0.16,0.17,0.19,0.21,0.22,0.24,0.25,0.27,0.29,0.3,0.32,0.33,0.35,0.37,0.38,0.4,0.41,0.43,0.44,0.46,0.48,0.49,0.51,0.52,0.54,0.56,0.57,0.59,0.6,0.62,0.63,0.65,0.67,0.68,0.7,0.71,0.73,0.75,0.76,0.78,0.79,0.81,0.83,0.84,0.86,0.87,0.89,0.9,0.92,0.94,0.95,0.97,0.98,1.0}).setKeyValue(getPosition2_3_125_keyValue()))
    .addChild(new PositionInterpolator("Position3").setKey(new double[] {0.0,0.02,0.03,0.05,0.06,0.08,0.1,0.11,0.13,0.14,0.16,0.17,0.19,0.21,0.22,0.24,0.25,0.27,0.29,0.3,0.32,0.33,0.35,0.37,0.38,0.4,0.41,0.43,0.44,0.46,0.48,0.49,0.51,0.52,0.54,0.56,0.57,0.59,0.6,0.62,0.63,0.65,0.67,0.68,0.7,0.71,0.73,0.75,0.76,0.78,0.79,0.81,0.83,0.84,0.86,0.87,0.89,0.9,0.92,0.94,0.95,0.97,0.98,1.0}).setKeyValue(getPosition3_3_126_keyValue()))
    .addChild(new PositionInterpolator("Position4").setKey(new double[] {0.0,0.02,0.03,0.05,0.06,0.08,0.1,0.11,0.13,0.14,0.16,0.17,0.19,0.21,0.22,0.24,0.25,0.27,0.29,0.3,0.32,0.33,0.35,0.37,0.38,0.4,0.41,0.43,0.44,0.46,0.48,0.49,0.51,0.52,0.54,0.56,0.57,0.59,0.6,0.62,0.63,0.65,0.67,0.68,0.7,0.71,0.73,0.75,0.76,0.78,0.79,0.81,0.83,0.84,0.86,0.87,0.89,0.9,0.92,0.94,0.95,0.97,0.98,1.0}).setKeyValue(getPosition4_3_127_keyValue()))
    .addChild(new PositionInterpolator("Position5").setKey(new double[] {0.0,0.02,0.03,0.05,0.06,0.08,0.1,0.11,0.13,0.14,0.16,0.17,0.19,0.21,0.22,0.24,0.25,0.27,0.29,0.3,0.32,0.33,0.35,0.37,0.38,0.4,0.41,0.43,0.44,0.46,0.48,0.49,0.51,0.52,0.54,0.56,0.57,0.59,0.6,0.62,0.63,0.65,0.67,0.68,0.7,0.71,0.73,0.75,0.76,0.78,0.79,0.81,0.83,0.84,0.86,0.87,0.89,0.9,0.92,0.94,0.95,0.97,0.98,1.0}).setKeyValue(getPosition5_3_128_keyValue()))
    .addChild(new PositionInterpolator("Position6").setKey(new double[] {0.0,0.02,0.03,0.05,0.06,0.08,0.1,0.11,0.13,0.14,0.16,0.17,0.19,0.21,0.22,0.24,0.25,0.27,0.29,0.3,0.32,0.33,0.35,0.37,0.38,0.4,0.41,0.43,0.44,0.46,0.48,0.49,0.51,0.52,0.54,0.56,0.57,0.59,0.6,0.62,0.63,0.65,0.67,0.68,0.7,0.71,0.73,0.75,0.76,0.78,0.79,0.81,0.83,0.84,0.86,0.87,0.89,0.9,0.92,0.94,0.95,0.97,0.98,1.0}).setKeyValue(getPosition6_3_129_keyValue()))
    .addChild(new PositionInterpolator("Position7").setKey(new double[] {0.0,0.02,0.03,0.05,0.06,0.08,0.1,0.11,0.13,0.14,0.16,0.17,0.19,0.21,0.22,0.24,0.25,0.27,0.29,0.3,0.32,0.33,0.35,0.37,0.38,0.4,0.41,0.43,0.44,0.46,0.48,0.49,0.51,0.52,0.54,0.56,0.57,0.59,0.6,0.62,0.63,0.65,0.67,0.68,0.7,0.71,0.73,0.75,0.76,0.78,0.79,0.81,0.83,0.84,0.86,0.87,0.89,0.9,0.92,0.94,0.95,0.97,0.98,1.0}).setKeyValue(getPosition7_3_130_keyValue()))
    .addChild(new PositionInterpolator("Position8").setKey(new double[] {0.0,0.02,0.03,0.05,0.06,0.08,0.1,0.11,0.13,0.14,0.16,0.17,0.19,0.21,0.22,0.24,0.25,0.27,0.29,0.3,0.32,0.33,0.35,0.37,0.38,0.4,0.41,0.43,0.44,0.46,0.48,0.49,0.51,0.52,0.54,0.56,0.57,0.59,0.6,0.62,0.63,0.65,0.67,0.68,0.7,0.71,0.73,0.75,0.76,0.78,0.79,0.81,0.83,0.84,0.86,0.87,0.89,0.9,0.92,0.94,0.95,0.97,0.98,1.0}).setKeyValue(getPosition8_3_131_keyValue()))
    .addChild(new PositionInterpolator("Position9").setKey(new double[] {0.0,0.02,0.03,0.05,0.06,0.08,0.1,0.11,0.13,0.14,0.16,0.17,0.19,0.21,0.22,0.24,0.25,0.27,0.29,0.3,0.32,0.33,0.35,0.37,0.38,0.4,0.41,0.43,0.44,0.46,0.48,0.49,0.51,0.52,0.54,0.56,0.57,0.59,0.6,0.62,0.63,0.65,0.67,0.68,0.7,0.71,0.73,0.75,0.76,0.78,0.79,0.81,0.83,0.84,0.86,0.87,0.89,0.9,0.92,0.94,0.95,0.97,0.98,1.0}).setKeyValue(getPosition9_3_132_keyValue()))
    .addChild(new PositionInterpolator("Position10").setKey(new double[] {0.0,0.02,0.03,0.05,0.06,0.08,0.1,0.11,0.13,0.14,0.16,0.17,0.19,0.21,0.22,0.24,0.25,0.27,0.29,0.3,0.32,0.33,0.35,0.37,0.38,0.4,0.41,0.43,0.44,0.46,0.48,0.49,0.51,0.52,0.54,0.56,0.57,0.59,0.6,0.62,0.63,0.65,0.67,0.68,0.7,0.71,0.73,0.75,0.76,0.78,0.79,0.81,0.83,0.84,0.86,0.87,0.89,0.9,0.92,0.94,0.95,0.97,0.98,1.0}).setKeyValue(getPosition10_3_133_keyValue()))
    .addChild(new PositionInterpolator("Position11").setKey(new double[] {0.0,0.02,0.03,0.05,0.06,0.08,0.1,0.11,0.13,0.14,0.16,0.17,0.19,0.21,0.22,0.24,0.25,0.27,0.29,0.3,0.32,0.33,0.35,0.37,0.38,0.4,0.41,0.43,0.44,0.46,0.48,0.49,0.51,0.52,0.54,0.56,0.57,0.59,0.6,0.62,0.63,0.65,0.67,0.68,0.7,0.71,0.73,0.75,0.76,0.78,0.79,0.81,0.83,0.84,0.86,0.87,0.89,0.9,0.92,0.94,0.95,0.97,0.98,1.0}).setKeyValue(getPosition11_3_134_keyValue()))
    .addChild(new PositionInterpolator("Position12").setKey(new double[] {0.0,0.02,0.03,0.05,0.06,0.08,0.1,0.11,0.13,0.14,0.16,0.17,0.19,0.21,0.22,0.24,0.25,0.27,0.29,0.3,0.32,0.33,0.35,0.37,0.38,0.4,0.41,0.43,0.44,0.46,0.48,0.49,0.51,0.52,0.54,0.56,0.57,0.59,0.6,0.62,0.63,0.65,0.67,0.68,0.7,0.71,0.73,0.75,0.76,0.78,0.79,0.81,0.83,0.84,0.86,0.87,0.89,0.9,0.92,0.94,0.95,0.97,0.98,1.0}).setKeyValue(getPosition12_3_135_keyValue()))
    .addComments(" Set of color interpolators to vary particle color ")
    .addChild(new ColorInterpolator("Color1").setKey(new double[] {0.0,0.02,0.03,0.05,0.06,0.08,0.1,0.11,0.13,0.14,0.16,0.17,0.19,0.21,0.22,0.24,0.25,0.27,0.29,0.3,0.32,0.33,0.35,0.37,0.38,0.4,0.41,0.43,0.44,0.46,0.48,0.49,0.51,0.52,0.54,0.56,0.57,0.59,0.6,0.62,0.63,0.65,0.67,0.68,0.7,0.71,0.73,0.75,0.76,0.78,0.79,0.81,0.83,0.84,0.86,0.87,0.89,0.9,0.92,0.94,0.95,0.97,0.98,1.0}).setKeyValue(new MFColor(new double[] {0.5,0.5,0.0,0.45,0.55,0.0,0.4,0.6,0.0,0.35,0.65,0.0,0.31,0.69,0.0,0.26,0.74,0.0,0.22,0.78,0.0,0.18,0.82,0.0,0.14,0.86,0.0,0.11,0.89,0.0,0.08,0.92,0.0,0.06,0.94,0.0,0.03,0.97,0.0,0.02,0.98,0.0,0.01,0.99,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.01,0.99,0.0,0.03,0.97,0.0,0.04,0.96,0.0,0.07,0.93,0.0,0.09,0.91,0.0,0.13,0.87,0.0,0.16,0.84,0.0,0.2,0.8,0.0,0.24,0.76,0.0,0.28,0.72,0.0,0.33,0.67,0.0,0.38,0.62,0.0,0.43,0.57,0.0,0.48,0.52,0.0,0.52,0.48,0.0,0.57,0.43,0.0,0.62,0.38,0.0,0.67,0.33,0.0,0.72,0.28,0.0,0.76,0.24,0.0,0.8,0.2,0.0,0.84,0.16,0.0,0.87,0.13,0.0,0.91,0.09,0.0,0.93,0.07,0.0,0.96,0.04,0.0,0.97,0.03,0.0,0.99,0.01,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,0.99,0.01,0.0,0.98,0.02,0.0,0.97,0.03,0.0,0.94,0.06,0.0,0.92,0.08,0.0,0.89,0.11,0.0,0.86,0.14,0.0,0.82,0.18,0.0,0.78,0.22,0.0,0.74,0.26,0.0,0.69,0.31,0.0,0.65,0.35,0.0,0.6,0.4,0.0,0.55,0.45,0.0,0.5,0.5,0.0})))
    .addChild(new ColorInterpolator("Color2").setKey(new double[] {0.0,0.02,0.03,0.05,0.06,0.08,0.1,0.11,0.13,0.14,0.16,0.17,0.19,0.21,0.22,0.24,0.25,0.27,0.29,0.3,0.32,0.33,0.35,0.37,0.38,0.4,0.41,0.43,0.44,0.46,0.48,0.49,0.51,0.52,0.54,0.56,0.57,0.59,0.6,0.62,0.63,0.65,0.67,0.68,0.7,0.71,0.73,0.75,0.76,0.78,0.79,0.81,0.83,0.84,0.86,0.87,0.89,0.9,0.92,0.94,0.95,0.97,0.98,1.0}).setKeyValue(new MFColor(new double[] {0.5,0.5,0.0,0.45,0.55,0.0,0.4,0.6,0.0,0.35,0.65,0.0,0.31,0.69,0.0,0.26,0.74,0.0,0.22,0.78,0.0,0.18,0.82,0.0,0.14,0.86,0.0,0.11,0.89,0.0,0.08,0.92,0.0,0.06,0.94,0.0,0.03,0.97,0.0,0.02,0.98,0.0,0.01,0.99,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.01,0.99,0.0,0.03,0.97,0.0,0.04,0.96,0.0,0.07,0.93,0.0,0.09,0.91,0.0,0.13,0.87,0.0,0.16,0.84,0.0,0.2,0.8,0.0,0.24,0.76,0.0,0.28,0.72,0.0,0.33,0.67,0.0,0.38,0.62,0.0,0.43,0.57,0.0,0.48,0.52,0.0,0.52,0.48,0.0,0.57,0.43,0.0,0.62,0.38,0.0,0.67,0.33,0.0,0.72,0.28,0.0,0.76,0.24,0.0,0.8,0.2,0.0,0.84,0.16,0.0,0.87,0.13,0.0,0.91,0.09,0.0,0.93,0.07,0.0,0.96,0.04,0.0,0.97,0.03,0.0,0.99,0.01,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,0.99,0.01,0.0,0.98,0.02,0.0,0.97,0.03,0.0,0.94,0.06,0.0,0.92,0.08,0.0,0.89,0.11,0.0,0.86,0.14,0.0,0.82,0.18,0.0,0.78,0.22,0.0,0.74,0.26,0.0,0.69,0.31,0.0,0.65,0.35,0.0,0.6,0.4,0.0,0.55,0.45,0.0,0.5,0.5,0.0})))
    .addChild(new ColorInterpolator("Color3").setKey(new double[] {0.0,0.02,0.03,0.05,0.06,0.08,0.1,0.11,0.13,0.14,0.16,0.17,0.19,0.21,0.22,0.24,0.25,0.27,0.29,0.3,0.32,0.33,0.35,0.37,0.38,0.4,0.41,0.43,0.44,0.46,0.48,0.49,0.51,0.52,0.54,0.56,0.57,0.59,0.6,0.62,0.63,0.65,0.67,0.68,0.7,0.71,0.73,0.75,0.76,0.78,0.79,0.81,0.83,0.84,0.86,0.87,0.89,0.9,0.92,0.94,0.95,0.97,0.98,1.0}).setKeyValue(new MFColor(new double[] {0.5,0.5,0.0,0.45,0.55,0.0,0.4,0.6,0.0,0.35,0.65,0.0,0.31,0.69,0.0,0.26,0.74,0.0,0.22,0.78,0.0,0.18,0.82,0.0,0.14,0.86,0.0,0.11,0.89,0.0,0.08,0.92,0.0,0.06,0.94,0.0,0.03,0.97,0.0,0.02,0.98,0.0,0.01,0.99,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.01,0.99,0.0,0.03,0.97,0.0,0.04,0.96,0.0,0.07,0.93,0.0,0.09,0.91,0.0,0.13,0.87,0.0,0.16,0.84,0.0,0.2,0.8,0.0,0.24,0.76,0.0,0.28,0.72,0.0,0.33,0.67,0.0,0.38,0.62,0.0,0.43,0.57,0.0,0.48,0.52,0.0,0.52,0.48,0.0,0.57,0.43,0.0,0.62,0.38,0.0,0.67,0.33,0.0,0.72,0.28,0.0,0.76,0.24,0.0,0.8,0.2,0.0,0.84,0.16,0.0,0.87,0.13,0.0,0.91,0.09,0.0,0.93,0.07,0.0,0.96,0.04,0.0,0.97,0.03,0.0,0.99,0.01,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,0.99,0.01,0.0,0.98,0.02,0.0,0.97,0.03,0.0,0.94,0.06,0.0,0.92,0.08,0.0,0.89,0.11,0.0,0.86,0.14,0.0,0.82,0.18,0.0,0.78,0.22,0.0,0.74,0.26,0.0,0.69,0.31,0.0,0.65,0.35,0.0,0.6,0.4,0.0,0.55,0.45,0.0,0.5,0.5,0.0})))
    .addChild(new ColorInterpolator("Color4").setKey(new double[] {0.0,0.02,0.03,0.05,0.06,0.08,0.1,0.11,0.13,0.14,0.16,0.17,0.19,0.21,0.22,0.24,0.25,0.27,0.29,0.3,0.32,0.33,0.35,0.37,0.38,0.4,0.41,0.43,0.44,0.46,0.48,0.49,0.51,0.52,0.54,0.56,0.57,0.59,0.6,0.62,0.63,0.65,0.67,0.68,0.7,0.71,0.73,0.75,0.76,0.78,0.79,0.81,0.83,0.84,0.86,0.87,0.89,0.9,0.92,0.94,0.95,0.97,0.98,1.0}).setKeyValue(new MFColor(new double[] {0.5,0.5,0.0,0.45,0.55,0.0,0.4,0.6,0.0,0.35,0.65,0.0,0.31,0.69,0.0,0.26,0.74,0.0,0.22,0.78,0.0,0.18,0.82,0.0,0.14,0.86,0.0,0.11,0.89,0.0,0.08,0.92,0.0,0.06,0.94,0.0,0.03,0.97,0.0,0.02,0.98,0.0,0.01,0.99,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.01,0.99,0.0,0.03,0.97,0.0,0.04,0.96,0.0,0.07,0.93,0.0,0.09,0.91,0.0,0.13,0.87,0.0,0.16,0.84,0.0,0.2,0.8,0.0,0.24,0.76,0.0,0.28,0.72,0.0,0.33,0.67,0.0,0.38,0.62,0.0,0.43,0.57,0.0,0.48,0.52,0.0,0.52,0.48,0.0,0.57,0.43,0.0,0.62,0.38,0.0,0.67,0.33,0.0,0.72,0.28,0.0,0.76,0.24,0.0,0.8,0.2,0.0,0.84,0.16,0.0,0.87,0.13,0.0,0.91,0.09,0.0,0.93,0.07,0.0,0.96,0.04,0.0,0.97,0.03,0.0,0.99,0.01,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,0.99,0.01,0.0,0.98,0.02,0.0,0.97,0.03,0.0,0.94,0.06,0.0,0.92,0.08,0.0,0.89,0.11,0.0,0.86,0.14,0.0,0.82,0.18,0.0,0.78,0.22,0.0,0.74,0.26,0.0,0.69,0.31,0.0,0.65,0.35,0.0,0.6,0.4,0.0,0.55,0.45,0.0,0.5,0.5,0.0})))
    .addChild(new ColorInterpolator("Color5").setKey(new double[] {0.0,0.02,0.03,0.05,0.06,0.08,0.1,0.11,0.13,0.14,0.16,0.17,0.19,0.21,0.22,0.24,0.25,0.27,0.29,0.3,0.32,0.33,0.35,0.37,0.38,0.4,0.41,0.43,0.44,0.46,0.48,0.49,0.51,0.52,0.54,0.56,0.57,0.59,0.6,0.62,0.63,0.65,0.67,0.68,0.7,0.71,0.73,0.75,0.76,0.78,0.79,0.81,0.83,0.84,0.86,0.87,0.89,0.9,0.92,0.94,0.95,0.97,0.98,1.0}).setKeyValue(new MFColor(new double[] {0.5,0.5,0.0,0.45,0.55,0.0,0.4,0.6,0.0,0.35,0.65,0.0,0.31,0.69,0.0,0.26,0.74,0.0,0.22,0.78,0.0,0.18,0.82,0.0,0.14,0.86,0.0,0.11,0.89,0.0,0.08,0.92,0.0,0.06,0.94,0.0,0.03,0.97,0.0,0.02,0.98,0.0,0.01,0.99,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.01,0.99,0.0,0.03,0.97,0.0,0.04,0.96,0.0,0.07,0.93,0.0,0.09,0.91,0.0,0.13,0.87,0.0,0.16,0.84,0.0,0.2,0.8,0.0,0.24,0.76,0.0,0.28,0.72,0.0,0.33,0.67,0.0,0.38,0.62,0.0,0.43,0.57,0.0,0.48,0.52,0.0,0.52,0.48,0.0,0.57,0.43,0.0,0.62,0.38,0.0,0.67,0.33,0.0,0.72,0.28,0.0,0.76,0.24,0.0,0.8,0.2,0.0,0.84,0.16,0.0,0.87,0.13,0.0,0.91,0.09,0.0,0.93,0.07,0.0,0.96,0.04,0.0,0.97,0.03,0.0,0.99,0.01,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,0.99,0.01,0.0,0.98,0.02,0.0,0.97,0.03,0.0,0.94,0.06,0.0,0.92,0.08,0.0,0.89,0.11,0.0,0.86,0.14,0.0,0.82,0.18,0.0,0.78,0.22,0.0,0.74,0.26,0.0,0.69,0.31,0.0,0.65,0.35,0.0,0.6,0.4,0.0,0.55,0.45,0.0,0.5,0.5,0.0})))
    .addChild(new ColorInterpolator("Color6").setKey(new double[] {0.0,0.02,0.03,0.05,0.06,0.08,0.1,0.11,0.13,0.14,0.16,0.17,0.19,0.21,0.22,0.24,0.25,0.27,0.29,0.3,0.32,0.33,0.35,0.37,0.38,0.4,0.41,0.43,0.44,0.46,0.48,0.49,0.51,0.52,0.54,0.56,0.57,0.59,0.6,0.62,0.63,0.65,0.67,0.68,0.7,0.71,0.73,0.75,0.76,0.78,0.79,0.81,0.83,0.84,0.86,0.87,0.89,0.9,0.92,0.94,0.95,0.97,0.98,1.0}).setKeyValue(new MFColor(new double[] {0.5,0.5,0.0,0.45,0.55,0.0,0.4,0.6,0.0,0.35,0.65,0.0,0.31,0.69,0.0,0.26,0.74,0.0,0.22,0.78,0.0,0.18,0.82,0.0,0.14,0.86,0.0,0.11,0.89,0.0,0.08,0.92,0.0,0.06,0.94,0.0,0.03,0.97,0.0,0.02,0.98,0.0,0.01,0.99,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.01,0.99,0.0,0.03,0.97,0.0,0.04,0.96,0.0,0.07,0.93,0.0,0.09,0.91,0.0,0.13,0.87,0.0,0.16,0.84,0.0,0.2,0.8,0.0,0.24,0.76,0.0,0.28,0.72,0.0,0.33,0.67,0.0,0.38,0.62,0.0,0.43,0.57,0.0,0.48,0.52,0.0,0.52,0.48,0.0,0.57,0.43,0.0,0.62,0.38,0.0,0.67,0.33,0.0,0.72,0.28,0.0,0.76,0.24,0.0,0.8,0.2,0.0,0.84,0.16,0.0,0.87,0.13,0.0,0.91,0.09,0.0,0.93,0.07,0.0,0.96,0.04,0.0,0.97,0.03,0.0,0.99,0.01,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,0.99,0.01,0.0,0.98,0.02,0.0,0.97,0.03,0.0,0.94,0.06,0.0,0.92,0.08,0.0,0.89,0.11,0.0,0.86,0.14,0.0,0.82,0.18,0.0,0.78,0.22,0.0,0.74,0.26,0.0,0.69,0.31,0.0,0.65,0.35,0.0,0.6,0.4,0.0,0.55,0.45,0.0,0.5,0.5,0.0})))
    .addChild(new ColorInterpolator("Color7").setKey(new double[] {0.0,0.02,0.03,0.05,0.06,0.08,0.1,0.11,0.13,0.14,0.16,0.17,0.19,0.21,0.22,0.24,0.25,0.27,0.29,0.3,0.32,0.33,0.35,0.37,0.38,0.4,0.41,0.43,0.44,0.46,0.48,0.49,0.51,0.52,0.54,0.56,0.57,0.59,0.6,0.62,0.63,0.65,0.67,0.68,0.7,0.71,0.73,0.75,0.76,0.78,0.79,0.81,0.83,0.84,0.86,0.87,0.89,0.9,0.92,0.94,0.95,0.97,0.98,1.0}).setKeyValue(new MFColor(new double[] {0.5,0.5,0.0,0.45,0.55,0.0,0.4,0.6,0.0,0.35,0.65,0.0,0.31,0.69,0.0,0.26,0.74,0.0,0.22,0.78,0.0,0.18,0.82,0.0,0.14,0.86,0.0,0.11,0.89,0.0,0.08,0.92,0.0,0.06,0.94,0.0,0.03,0.97,0.0,0.02,0.98,0.0,0.01,0.99,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.01,0.99,0.0,0.03,0.97,0.0,0.04,0.96,0.0,0.07,0.93,0.0,0.09,0.91,0.0,0.13,0.87,0.0,0.16,0.84,0.0,0.2,0.8,0.0,0.24,0.76,0.0,0.28,0.72,0.0,0.33,0.67,0.0,0.38,0.62,0.0,0.43,0.57,0.0,0.48,0.52,0.0,0.52,0.48,0.0,0.57,0.43,0.0,0.62,0.38,0.0,0.67,0.33,0.0,0.72,0.28,0.0,0.76,0.24,0.0,0.8,0.2,0.0,0.84,0.16,0.0,0.87,0.13,0.0,0.91,0.09,0.0,0.93,0.07,0.0,0.96,0.04,0.0,0.97,0.03,0.0,0.99,0.01,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,0.99,0.01,0.0,0.98,0.02,0.0,0.97,0.03,0.0,0.94,0.06,0.0,0.92,0.08,0.0,0.89,0.11,0.0,0.86,0.14,0.0,0.82,0.18,0.0,0.78,0.22,0.0,0.74,0.26,0.0,0.69,0.31,0.0,0.65,0.35,0.0,0.6,0.4,0.0,0.55,0.45,0.0,0.5,0.5,0.0})))
    .addChild(new ColorInterpolator("Color8").setKey(new double[] {0.0,0.02,0.03,0.05,0.06,0.08,0.1,0.11,0.13,0.14,0.16,0.17,0.19,0.21,0.22,0.24,0.25,0.27,0.29,0.3,0.32,0.33,0.35,0.37,0.38,0.4,0.41,0.43,0.44,0.46,0.48,0.49,0.51,0.52,0.54,0.56,0.57,0.59,0.6,0.62,0.63,0.65,0.67,0.68,0.7,0.71,0.73,0.75,0.76,0.78,0.79,0.81,0.83,0.84,0.86,0.87,0.89,0.9,0.92,0.94,0.95,0.97,0.98,1.0}).setKeyValue(new MFColor(new double[] {0.5,0.5,0.0,0.45,0.55,0.0,0.4,0.6,0.0,0.35,0.65,0.0,0.31,0.69,0.0,0.26,0.74,0.0,0.22,0.78,0.0,0.18,0.82,0.0,0.14,0.86,0.0,0.11,0.89,0.0,0.08,0.92,0.0,0.06,0.94,0.0,0.03,0.97,0.0,0.02,0.98,0.0,0.01,0.99,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.01,0.99,0.0,0.03,0.97,0.0,0.04,0.96,0.0,0.07,0.93,0.0,0.09,0.91,0.0,0.13,0.87,0.0,0.16,0.84,0.0,0.2,0.8,0.0,0.24,0.76,0.0,0.28,0.72,0.0,0.33,0.67,0.0,0.38,0.62,0.0,0.43,0.57,0.0,0.48,0.52,0.0,0.52,0.48,0.0,0.57,0.43,0.0,0.62,0.38,0.0,0.67,0.33,0.0,0.72,0.28,0.0,0.76,0.24,0.0,0.8,0.2,0.0,0.84,0.16,0.0,0.87,0.13,0.0,0.91,0.09,0.0,0.93,0.07,0.0,0.96,0.04,0.0,0.97,0.03,0.0,0.99,0.01,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,0.99,0.01,0.0,0.98,0.02,0.0,0.97,0.03,0.0,0.94,0.06,0.0,0.92,0.08,0.0,0.89,0.11,0.0,0.86,0.14,0.0,0.82,0.18,0.0,0.78,0.22,0.0,0.74,0.26,0.0,0.69,0.31,0.0,0.65,0.35,0.0,0.6,0.4,0.0,0.55,0.45,0.0,0.5,0.5,0.0})))
    .addChild(new ColorInterpolator("Color9").setKey(new double[] {0.0,0.02,0.03,0.05,0.06,0.08,0.1,0.11,0.13,0.14,0.16,0.17,0.19,0.21,0.22,0.24,0.25,0.27,0.29,0.3,0.32,0.33,0.35,0.37,0.38,0.4,0.41,0.43,0.44,0.46,0.48,0.49,0.51,0.52,0.54,0.56,0.57,0.59,0.6,0.62,0.63,0.65,0.67,0.68,0.7,0.71,0.73,0.75,0.76,0.78,0.79,0.81,0.83,0.84,0.86,0.87,0.89,0.9,0.92,0.94,0.95,0.97,0.98,1.0}).setKeyValue(new MFColor(new double[] {0.5,0.5,0.0,0.45,0.55,0.0,0.4,0.6,0.0,0.35,0.65,0.0,0.31,0.69,0.0,0.26,0.74,0.0,0.22,0.78,0.0,0.18,0.82,0.0,0.14,0.86,0.0,0.11,0.89,0.0,0.08,0.92,0.0,0.06,0.94,0.0,0.03,0.97,0.0,0.02,0.98,0.0,0.01,0.99,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.01,0.99,0.0,0.03,0.97,0.0,0.04,0.96,0.0,0.07,0.93,0.0,0.09,0.91,0.0,0.13,0.87,0.0,0.16,0.84,0.0,0.2,0.8,0.0,0.24,0.76,0.0,0.28,0.72,0.0,0.33,0.67,0.0,0.38,0.62,0.0,0.43,0.57,0.0,0.48,0.52,0.0,0.52,0.48,0.0,0.57,0.43,0.0,0.62,0.38,0.0,0.67,0.33,0.0,0.72,0.28,0.0,0.76,0.24,0.0,0.8,0.2,0.0,0.84,0.16,0.0,0.87,0.13,0.0,0.91,0.09,0.0,0.93,0.07,0.0,0.96,0.04,0.0,0.97,0.03,0.0,0.99,0.01,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,0.99,0.01,0.0,0.98,0.02,0.0,0.97,0.03,0.0,0.94,0.06,0.0,0.92,0.08,0.0,0.89,0.11,0.0,0.86,0.14,0.0,0.82,0.18,0.0,0.78,0.22,0.0,0.74,0.26,0.0,0.69,0.31,0.0,0.65,0.35,0.0,0.6,0.4,0.0,0.55,0.45,0.0,0.5,0.5,0.0})))
    .addChild(new ColorInterpolator("Color10").setKey(new double[] {0.0,0.02,0.03,0.05,0.06,0.08,0.1,0.11,0.13,0.14,0.16,0.17,0.19,0.21,0.22,0.24,0.25,0.27,0.29,0.3,0.32,0.33,0.35,0.37,0.38,0.4,0.41,0.43,0.44,0.46,0.48,0.49,0.51,0.52,0.54,0.56,0.57,0.59,0.6,0.62,0.63,0.65,0.67,0.68,0.7,0.71,0.73,0.75,0.76,0.78,0.79,0.81,0.83,0.84,0.86,0.87,0.89,0.9,0.92,0.94,0.95,0.97,0.98,1.0}).setKeyValue(new MFColor(new double[] {0.5,0.5,0.0,0.45,0.55,0.0,0.4,0.6,0.0,0.35,0.65,0.0,0.31,0.69,0.0,0.26,0.74,0.0,0.22,0.78,0.0,0.18,0.82,0.0,0.14,0.86,0.0,0.11,0.89,0.0,0.08,0.92,0.0,0.06,0.94,0.0,0.03,0.97,0.0,0.02,0.98,0.0,0.01,0.99,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.01,0.99,0.0,0.03,0.97,0.0,0.04,0.96,0.0,0.07,0.93,0.0,0.09,0.91,0.0,0.13,0.87,0.0,0.16,0.84,0.0,0.2,0.8,0.0,0.24,0.76,0.0,0.28,0.72,0.0,0.33,0.67,0.0,0.38,0.62,0.0,0.43,0.57,0.0,0.48,0.52,0.0,0.52,0.48,0.0,0.57,0.43,0.0,0.62,0.38,0.0,0.67,0.33,0.0,0.72,0.28,0.0,0.76,0.24,0.0,0.8,0.2,0.0,0.84,0.16,0.0,0.87,0.13,0.0,0.91,0.09,0.0,0.93,0.07,0.0,0.96,0.04,0.0,0.97,0.03,0.0,0.99,0.01,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,0.99,0.01,0.0,0.98,0.02,0.0,0.97,0.03,0.0,0.94,0.06,0.0,0.92,0.08,0.0,0.89,0.11,0.0,0.86,0.14,0.0,0.82,0.18,0.0,0.78,0.22,0.0,0.74,0.26,0.0,0.69,0.31,0.0,0.65,0.35,0.0,0.6,0.4,0.0,0.55,0.45,0.0,0.5,0.5,0.0})))
    .addChild(new ColorInterpolator("Color11").setKey(new double[] {0.0,0.02,0.03,0.05,0.06,0.08,0.1,0.11,0.13,0.14,0.16,0.17,0.19,0.21,0.22,0.24,0.25,0.27,0.29,0.3,0.32,0.33,0.35,0.37,0.38,0.4,0.41,0.43,0.44,0.46,0.48,0.49,0.51,0.52,0.54,0.56,0.57,0.59,0.6,0.62,0.63,0.65,0.67,0.68,0.7,0.71,0.73,0.75,0.76,0.78,0.79,0.81,0.83,0.84,0.86,0.87,0.89,0.9,0.92,0.94,0.95,0.97,0.98,1.0}).setKeyValue(new MFColor(new double[] {0.5,0.5,0.0,0.45,0.55,0.0,0.4,0.6,0.0,0.35,0.65,0.0,0.31,0.69,0.0,0.26,0.74,0.0,0.22,0.78,0.0,0.18,0.82,0.0,0.14,0.86,0.0,0.11,0.89,0.0,0.08,0.92,0.0,0.06,0.94,0.0,0.03,0.97,0.0,0.02,0.98,0.0,0.01,0.99,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.01,0.99,0.0,0.03,0.97,0.0,0.04,0.96,0.0,0.07,0.93,0.0,0.09,0.91,0.0,0.13,0.87,0.0,0.16,0.84,0.0,0.2,0.8,0.0,0.24,0.76,0.0,0.28,0.72,0.0,0.33,0.67,0.0,0.38,0.62,0.0,0.43,0.57,0.0,0.48,0.52,0.0,0.52,0.48,0.0,0.57,0.43,0.0,0.62,0.38,0.0,0.67,0.33,0.0,0.72,0.28,0.0,0.76,0.24,0.0,0.8,0.2,0.0,0.84,0.16,0.0,0.87,0.13,0.0,0.91,0.09,0.0,0.93,0.07,0.0,0.96,0.04,0.0,0.97,0.03,0.0,0.99,0.01,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,0.99,0.01,0.0,0.98,0.02,0.0,0.97,0.03,0.0,0.94,0.06,0.0,0.92,0.08,0.0,0.89,0.11,0.0,0.86,0.14,0.0,0.82,0.18,0.0,0.78,0.22,0.0,0.74,0.26,0.0,0.69,0.31,0.0,0.65,0.35,0.0,0.6,0.4,0.0,0.55,0.45,0.0,0.5,0.5,0.0})))
    .addChild(new ColorInterpolator("Color12").setKey(new double[] {0.0,0.02,0.03,0.05,0.06,0.08,0.1,0.11,0.13,0.14,0.16,0.17,0.19,0.21,0.22,0.24,0.25,0.27,0.29,0.3,0.32,0.33,0.35,0.37,0.38,0.4,0.41,0.43,0.44,0.46,0.48,0.49,0.51,0.52,0.54,0.56,0.57,0.59,0.6,0.62,0.63,0.65,0.67,0.68,0.7,0.71,0.73,0.75,0.76,0.78,0.79,0.81,0.83,0.84,0.86,0.87,0.89,0.9,0.92,0.94,0.95,0.97,0.98,1.0}).setKeyValue(new MFColor(new double[] {0.5,0.5,0.0,0.45,0.55,0.0,0.4,0.6,0.0,0.35,0.65,0.0,0.31,0.69,0.0,0.26,0.74,0.0,0.22,0.78,0.0,0.18,0.82,0.0,0.14,0.86,0.0,0.11,0.89,0.0,0.08,0.92,0.0,0.06,0.94,0.0,0.03,0.97,0.0,0.02,0.98,0.0,0.01,0.99,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.01,0.99,0.0,0.03,0.97,0.0,0.04,0.96,0.0,0.07,0.93,0.0,0.09,0.91,0.0,0.13,0.87,0.0,0.16,0.84,0.0,0.2,0.8,0.0,0.24,0.76,0.0,0.28,0.72,0.0,0.33,0.67,0.0,0.38,0.62,0.0,0.43,0.57,0.0,0.48,0.52,0.0,0.52,0.48,0.0,0.57,0.43,0.0,0.62,0.38,0.0,0.67,0.33,0.0,0.72,0.28,0.0,0.76,0.24,0.0,0.8,0.2,0.0,0.84,0.16,0.0,0.87,0.13,0.0,0.91,0.09,0.0,0.93,0.07,0.0,0.96,0.04,0.0,0.97,0.03,0.0,0.99,0.01,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,0.99,0.01,0.0,0.98,0.02,0.0,0.97,0.03,0.0,0.94,0.06,0.0,0.92,0.08,0.0,0.89,0.11,0.0,0.86,0.14,0.0,0.82,0.18,0.0,0.78,0.22,0.0,0.74,0.26,0.0,0.69,0.31,0.0,0.65,0.35,0.0,0.6,0.4,0.0,0.55,0.45,0.0,0.5,0.5,0.0})))
    .addComments(" Wire the animation circuit ")
    .addChild(new ROUTE().setFromNode("Timer1").setFromField("fraction_changed").setToNode("Position1").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Position1").setFromField("value_changed").setToNode("Particle1").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("Timer1").setFromField("fraction_changed").setToNode("Color1").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Color1").setFromField("value_changed").setToNode("Material1").setToField("set_diffuseColor"))
    .addChild(new ROUTE().setFromNode("Timer2").setFromField("fraction_changed").setToNode("Position2").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Position2").setFromField("value_changed").setToNode("Particle2").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("Timer2").setFromField("fraction_changed").setToNode("Color2").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Color2").setFromField("value_changed").setToNode("Material2").setToField("set_diffuseColor"))
    .addChild(new ROUTE().setFromNode("Timer3").setFromField("fraction_changed").setToNode("Position3").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Position3").setFromField("value_changed").setToNode("Particle3").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("Timer3").setFromField("fraction_changed").setToNode("Color3").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Color3").setFromField("value_changed").setToNode("Material3").setToField("set_diffuseColor"))
    .addChild(new ROUTE().setFromNode("Timer4").setFromField("fraction_changed").setToNode("Position4").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Position4").setFromField("value_changed").setToNode("Particle4").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("Timer4").setFromField("fraction_changed").setToNode("Color4").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Color4").setFromField("value_changed").setToNode("Material4").setToField("set_diffuseColor"))
    .addChild(new ROUTE().setFromNode("Timer5").setFromField("fraction_changed").setToNode("Position5").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Position5").setFromField("value_changed").setToNode("Particle5").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("Timer5").setFromField("fraction_changed").setToNode("Color5").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Color5").setFromField("value_changed").setToNode("Material5").setToField("set_diffuseColor"))
    .addChild(new ROUTE().setFromNode("Timer6").setFromField("fraction_changed").setToNode("Position6").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Position6").setFromField("value_changed").setToNode("Particle6").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("Timer6").setFromField("fraction_changed").setToNode("Color6").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Color6").setFromField("value_changed").setToNode("Material6").setToField("set_diffuseColor"))
    .addChild(new ROUTE().setFromNode("Timer7").setFromField("fraction_changed").setToNode("Position7").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Position7").setFromField("value_changed").setToNode("Particle7").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("Timer7").setFromField("fraction_changed").setToNode("Color7").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Color7").setFromField("value_changed").setToNode("Material7").setToField("set_diffuseColor"))
    .addChild(new ROUTE().setFromNode("Timer8").setFromField("fraction_changed").setToNode("Position8").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Position8").setFromField("value_changed").setToNode("Particle8").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("Timer8").setFromField("fraction_changed").setToNode("Color8").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Color8").setFromField("value_changed").setToNode("Material8").setToField("set_diffuseColor"))
    .addChild(new ROUTE().setFromNode("Timer9").setFromField("fraction_changed").setToNode("Position9").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Position9").setFromField("value_changed").setToNode("Particle9").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("Timer9").setFromField("fraction_changed").setToNode("Color9").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Color9").setFromField("value_changed").setToNode("Material9").setToField("set_diffuseColor"))
    .addChild(new ROUTE().setFromNode("Timer10").setFromField("fraction_changed").setToNode("Position10").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Position10").setFromField("value_changed").setToNode("Particle10").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("Timer10").setFromField("fraction_changed").setToNode("Color10").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Color10").setFromField("value_changed").setToNode("Material10").setToField("set_diffuseColor"))
    .addChild(new ROUTE().setFromNode("Timer11").setFromField("fraction_changed").setToNode("Position11").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Position11").setFromField("value_changed").setToNode("Particle11").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("Timer11").setFromField("fraction_changed").setToNode("Color11").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Color11").setFromField("value_changed").setToNode("Material11").setToField("set_diffuseColor"))
    .addChild(new ROUTE().setFromNode("Timer12").setFromField("fraction_changed").setToNode("Position12").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Position12").setFromField("value_changed").setToNode("Particle12").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("Timer12").setFromField("fraction_changed").setToNode("Color12").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Color12").setFromField("value_changed").setToNode("Material12").setToField("set_diffuseColor")));
            }
            catch (Exception ex)
            {       
                System.err.println ("*** Further hints on X3DJSAIL errors and exceptions at");
                System.err.println ("*** https://www.web3d.org/specifications/java/X3DJSAIL.html");
                throw (ex);
            }
	}
	// end of initialize() method












		/** Large attribute array: PositionInterpolator DEF='Position1' keyValue field, scene-graph level=3, element #124, 192 total numbers made up of 64 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getPosition1_3_124_keyValue()
		{
			MFVec3f Position1_3_124_keyValue = new MFVec3f(new double[] {4.5,16.0,0.0,3.89,15.75,2.81,1.63,15.49,4.83,-1.49,15.24,5.17,-4.33,14.98,3.65,-5.88,14.73,0.81,-5.71,14.48,-2.4,-4.01,14.22,-5.02,-1.41,13.97,-6.5,1.36,13.71,-6.71,3.76,13.46,-5.93,5.52,13.21,-4.57,6.62,12.95,-3.07,7.19,12.7,-1.72,7.42,12.44,-0.71,7.49,12.19,-0.13,7.5,11.94,-0.01,7.47,11.68,-0.36,7.33,11.43,-1.16,6.95,11.17,-2.36,6.14,10.92,-3.82,4.73,10.67,-5.29,2.63,10.41,-6.42,-0.01,10.16,-6.75,-2.78,9.9,-5.92,-5.02,9.65,-3.83,-6.01,9.4,-0.81,-5.31,9.14,2.34,-3.02,8.89,4.63,0.11,8.63,5.24,2.93,8.38,3.98,4.42,8.13,1.43,4.14,7.87,-1.34,2.4,7.62,-3.26,0.08,7.37,-3.76,-1.9,7.11,-2.91,-2.93,6.86,-1.29,-2.91,6.6,0.39,-2.14,6.35,1.63,-1.04,6.1,2.23,0.0,5.84,2.25,0.78,5.59,1.91,1.27,5.33,1.42,1.5,5.08,0.93,1.57,4.83,0.53,1.56,4.57,0.25,1.52,4.32,0.07,1.5,4.06,0.0,1.51,3.81,0.03,1.54,3.56,0.15,1.57,3.3,0.38,1.55,3.05,0.72,1.41,2.79,1.17,1.06,2.54,1.67,0.43,2.29,2.11,-0.5,2.03,2.3,-1.6,1.78,2.01,-2.59,1.52,1.09,-3.04,1.27,-0.42,-2.55,1.02,-2.15,-1.0,0.76,-3.47,1.25,0.51,-3.7,3.41,0.25,-2.46,4.5,0.0,0.0});
			return Position1_3_124_keyValue;
		}
		/** Large attribute array: PositionInterpolator DEF='Position2' keyValue field, scene-graph level=3, element #125, 192 total numbers made up of 64 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getPosition2_3_125_keyValue()
		{
			MFVec3f Position2_3_125_keyValue = new MFVec3f(new double[] {4.5,16.0,0.0,3.89,15.75,2.81,1.63,15.49,4.83,-1.49,15.24,5.17,-4.33,14.98,3.65,-5.88,14.73,0.81,-5.71,14.48,-2.4,-4.01,14.22,-5.02,-1.41,13.97,-6.5,1.36,13.71,-6.71,3.76,13.46,-5.93,5.52,13.21,-4.57,6.62,12.95,-3.07,7.19,12.7,-1.72,7.42,12.44,-0.71,7.49,12.19,-0.13,7.5,11.94,-0.01,7.47,11.68,-0.36,7.33,11.43,-1.16,6.95,11.17,-2.36,6.14,10.92,-3.82,4.73,10.67,-5.29,2.63,10.41,-6.42,-0.01,10.16,-6.75,-2.78,9.9,-5.92,-5.02,9.65,-3.83,-6.01,9.4,-0.81,-5.31,9.14,2.34,-3.02,8.89,4.63,0.11,8.63,5.24,2.93,8.38,3.98,4.42,8.13,1.43,4.14,7.87,-1.34,2.4,7.62,-3.26,0.08,7.37,-3.76,-1.9,7.11,-2.91,-2.93,6.86,-1.29,-2.91,6.6,0.39,-2.14,6.35,1.63,-1.04,6.1,2.23,0.0,5.84,2.25,0.78,5.59,1.91,1.27,5.33,1.42,1.5,5.08,0.93,1.57,4.83,0.53,1.56,4.57,0.25,1.52,4.32,0.07,1.5,4.06,0.0,1.51,3.81,0.03,1.54,3.56,0.15,1.57,3.3,0.38,1.55,3.05,0.72,1.41,2.79,1.17,1.06,2.54,1.67,0.43,2.29,2.11,-0.5,2.03,2.3,-1.6,1.78,2.01,-2.59,1.52,1.09,-3.04,1.27,-0.42,-2.55,1.02,-2.15,-1.0,0.76,-3.47,1.25,0.51,-3.7,3.41,0.25,-2.46,4.5,0.0,0.0});
			return Position2_3_125_keyValue;
		}
		/** Large attribute array: PositionInterpolator DEF='Position3' keyValue field, scene-graph level=3, element #126, 192 total numbers made up of 64 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getPosition3_3_126_keyValue()
		{
			MFVec3f Position3_3_126_keyValue = new MFVec3f(new double[] {4.5,16.0,0.0,3.89,15.75,2.81,1.63,15.49,4.83,-1.49,15.24,5.17,-4.33,14.98,3.65,-5.88,14.73,0.81,-5.71,14.48,-2.4,-4.01,14.22,-5.02,-1.41,13.97,-6.5,1.36,13.71,-6.71,3.76,13.46,-5.93,5.52,13.21,-4.57,6.62,12.95,-3.07,7.19,12.7,-1.72,7.42,12.44,-0.71,7.49,12.19,-0.13,7.5,11.94,-0.01,7.47,11.68,-0.36,7.33,11.43,-1.16,6.95,11.17,-2.36,6.14,10.92,-3.82,4.73,10.67,-5.29,2.63,10.41,-6.42,-0.01,10.16,-6.75,-2.78,9.9,-5.92,-5.02,9.65,-3.83,-6.01,9.4,-0.81,-5.31,9.14,2.34,-3.02,8.89,4.63,0.11,8.63,5.24,2.93,8.38,3.98,4.42,8.13,1.43,4.14,7.87,-1.34,2.4,7.62,-3.26,0.08,7.37,-3.76,-1.9,7.11,-2.91,-2.93,6.86,-1.29,-2.91,6.6,0.39,-2.14,6.35,1.63,-1.04,6.1,2.23,0.0,5.84,2.25,0.78,5.59,1.91,1.27,5.33,1.42,1.5,5.08,0.93,1.57,4.83,0.53,1.56,4.57,0.25,1.52,4.32,0.07,1.5,4.06,0.0,1.51,3.81,0.03,1.54,3.56,0.15,1.57,3.3,0.38,1.55,3.05,0.72,1.41,2.79,1.17,1.06,2.54,1.67,0.43,2.29,2.11,-0.5,2.03,2.3,-1.6,1.78,2.01,-2.59,1.52,1.09,-3.04,1.27,-0.42,-2.55,1.02,-2.15,-1.0,0.76,-3.47,1.25,0.51,-3.7,3.41,0.25,-2.46,4.5,0.0,0.0});
			return Position3_3_126_keyValue;
		}
		/** Large attribute array: PositionInterpolator DEF='Position4' keyValue field, scene-graph level=3, element #127, 192 total numbers made up of 64 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getPosition4_3_127_keyValue()
		{
			MFVec3f Position4_3_127_keyValue = new MFVec3f(new double[] {4.5,16.0,0.0,3.89,15.75,2.81,1.63,15.49,4.83,-1.49,15.24,5.17,-4.33,14.98,3.65,-5.88,14.73,0.81,-5.71,14.48,-2.4,-4.01,14.22,-5.02,-1.41,13.97,-6.5,1.36,13.71,-6.71,3.76,13.46,-5.93,5.52,13.21,-4.57,6.62,12.95,-3.07,7.19,12.7,-1.72,7.42,12.44,-0.71,7.49,12.19,-0.13,7.5,11.94,-0.01,7.47,11.68,-0.36,7.33,11.43,-1.16,6.95,11.17,-2.36,6.14,10.92,-3.82,4.73,10.67,-5.29,2.63,10.41,-6.42,-0.01,10.16,-6.75,-2.78,9.9,-5.92,-5.02,9.65,-3.83,-6.01,9.4,-0.81,-5.31,9.14,2.34,-3.02,8.89,4.63,0.11,8.63,5.24,2.93,8.38,3.98,4.42,8.13,1.43,4.14,7.87,-1.34,2.4,7.62,-3.26,0.08,7.37,-3.76,-1.9,7.11,-2.91,-2.93,6.86,-1.29,-2.91,6.6,0.39,-2.14,6.35,1.63,-1.04,6.1,2.23,0.0,5.84,2.25,0.78,5.59,1.91,1.27,5.33,1.42,1.5,5.08,0.93,1.57,4.83,0.53,1.56,4.57,0.25,1.52,4.32,0.07,1.5,4.06,0.0,1.51,3.81,0.03,1.54,3.56,0.15,1.57,3.3,0.38,1.55,3.05,0.72,1.41,2.79,1.17,1.06,2.54,1.67,0.43,2.29,2.11,-0.5,2.03,2.3,-1.6,1.78,2.01,-2.59,1.52,1.09,-3.04,1.27,-0.42,-2.55,1.02,-2.15,-1.0,0.76,-3.47,1.25,0.51,-3.7,3.41,0.25,-2.46,4.5,0.0,0.0});
			return Position4_3_127_keyValue;
		}
		/** Large attribute array: PositionInterpolator DEF='Position5' keyValue field, scene-graph level=3, element #128, 192 total numbers made up of 64 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getPosition5_3_128_keyValue()
		{
			MFVec3f Position5_3_128_keyValue = new MFVec3f(new double[] {4.5,16.0,0.0,3.89,15.75,2.81,1.63,15.49,4.83,-1.49,15.24,5.17,-4.33,14.98,3.65,-5.88,14.73,0.81,-5.71,14.48,-2.4,-4.01,14.22,-5.02,-1.41,13.97,-6.5,1.36,13.71,-6.71,3.76,13.46,-5.93,5.52,13.21,-4.57,6.62,12.95,-3.07,7.19,12.7,-1.72,7.42,12.44,-0.71,7.49,12.19,-0.13,7.5,11.94,-0.01,7.47,11.68,-0.36,7.33,11.43,-1.16,6.95,11.17,-2.36,6.14,10.92,-3.82,4.73,10.67,-5.29,2.63,10.41,-6.42,-0.01,10.16,-6.75,-2.78,9.9,-5.92,-5.02,9.65,-3.83,-6.01,9.4,-0.81,-5.31,9.14,2.34,-3.02,8.89,4.63,0.11,8.63,5.24,2.93,8.38,3.98,4.42,8.13,1.43,4.14,7.87,-1.34,2.4,7.62,-3.26,0.08,7.37,-3.76,-1.9,7.11,-2.91,-2.93,6.86,-1.29,-2.91,6.6,0.39,-2.14,6.35,1.63,-1.04,6.1,2.23,0.0,5.84,2.25,0.78,5.59,1.91,1.27,5.33,1.42,1.5,5.08,0.93,1.57,4.83,0.53,1.56,4.57,0.25,1.52,4.32,0.07,1.5,4.06,0.0,1.51,3.81,0.03,1.54,3.56,0.15,1.57,3.3,0.38,1.55,3.05,0.72,1.41,2.79,1.17,1.06,2.54,1.67,0.43,2.29,2.11,-0.5,2.03,2.3,-1.6,1.78,2.01,-2.59,1.52,1.09,-3.04,1.27,-0.42,-2.55,1.02,-2.15,-1.0,0.76,-3.47,1.25,0.51,-3.7,3.41,0.25,-2.46,4.5,0.0,0.0});
			return Position5_3_128_keyValue;
		}
		/** Large attribute array: PositionInterpolator DEF='Position6' keyValue field, scene-graph level=3, element #129, 192 total numbers made up of 64 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getPosition6_3_129_keyValue()
		{
			MFVec3f Position6_3_129_keyValue = new MFVec3f(new double[] {4.5,16.0,0.0,3.89,15.75,2.81,1.63,15.49,4.83,-1.49,15.24,5.17,-4.33,14.98,3.65,-5.88,14.73,0.81,-5.71,14.48,-2.4,-4.01,14.22,-5.02,-1.41,13.97,-6.5,1.36,13.71,-6.71,3.76,13.46,-5.93,5.52,13.21,-4.57,6.62,12.95,-3.07,7.19,12.7,-1.72,7.42,12.44,-0.71,7.49,12.19,-0.13,7.5,11.94,-0.01,7.47,11.68,-0.36,7.33,11.43,-1.16,6.95,11.17,-2.36,6.14,10.92,-3.82,4.73,10.67,-5.29,2.63,10.41,-6.42,-0.01,10.16,-6.75,-2.78,9.9,-5.92,-5.02,9.65,-3.83,-6.01,9.4,-0.81,-5.31,9.14,2.34,-3.02,8.89,4.63,0.11,8.63,5.24,2.93,8.38,3.98,4.42,8.13,1.43,4.14,7.87,-1.34,2.4,7.62,-3.26,0.08,7.37,-3.76,-1.9,7.11,-2.91,-2.93,6.86,-1.29,-2.91,6.6,0.39,-2.14,6.35,1.63,-1.04,6.1,2.23,0.0,5.84,2.25,0.78,5.59,1.91,1.27,5.33,1.42,1.5,5.08,0.93,1.57,4.83,0.53,1.56,4.57,0.25,1.52,4.32,0.07,1.5,4.06,0.0,1.51,3.81,0.03,1.54,3.56,0.15,1.57,3.3,0.38,1.55,3.05,0.72,1.41,2.79,1.17,1.06,2.54,1.67,0.43,2.29,2.11,-0.5,2.03,2.3,-1.6,1.78,2.01,-2.59,1.52,1.09,-3.04,1.27,-0.42,-2.55,1.02,-2.15,-1.0,0.76,-3.47,1.25,0.51,-3.7,3.41,0.25,-2.46,4.5,0.0,0.0});
			return Position6_3_129_keyValue;
		}
		/** Large attribute array: PositionInterpolator DEF='Position7' keyValue field, scene-graph level=3, element #130, 192 total numbers made up of 64 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getPosition7_3_130_keyValue()
		{
			MFVec3f Position7_3_130_keyValue = new MFVec3f(new double[] {4.5,16.0,0.0,3.89,15.75,2.81,1.63,15.49,4.83,-1.49,15.24,5.17,-4.33,14.98,3.65,-5.88,14.73,0.81,-5.71,14.48,-2.4,-4.01,14.22,-5.02,-1.41,13.97,-6.5,1.36,13.71,-6.71,3.76,13.46,-5.93,5.52,13.21,-4.57,6.62,12.95,-3.07,7.19,12.7,-1.72,7.42,12.44,-0.71,7.49,12.19,-0.13,7.5,11.94,-0.01,7.47,11.68,-0.36,7.33,11.43,-1.16,6.95,11.17,-2.36,6.14,10.92,-3.82,4.73,10.67,-5.29,2.63,10.41,-6.42,-0.01,10.16,-6.75,-2.78,9.9,-5.92,-5.02,9.65,-3.83,-6.01,9.4,-0.81,-5.31,9.14,2.34,-3.02,8.89,4.63,0.11,8.63,5.24,2.93,8.38,3.98,4.42,8.13,1.43,4.14,7.87,-1.34,2.4,7.62,-3.26,0.08,7.37,-3.76,-1.9,7.11,-2.91,-2.93,6.86,-1.29,-2.91,6.6,0.39,-2.14,6.35,1.63,-1.04,6.1,2.23,0.0,5.84,2.25,0.78,5.59,1.91,1.27,5.33,1.42,1.5,5.08,0.93,1.57,4.83,0.53,1.56,4.57,0.25,1.52,4.32,0.07,1.5,4.06,0.0,1.51,3.81,0.03,1.54,3.56,0.15,1.57,3.3,0.38,1.55,3.05,0.72,1.41,2.79,1.17,1.06,2.54,1.67,0.43,2.29,2.11,-0.5,2.03,2.3,-1.6,1.78,2.01,-2.59,1.52,1.09,-3.04,1.27,-0.42,-2.55,1.02,-2.15,-1.0,0.76,-3.47,1.25,0.51,-3.7,3.41,0.25,-2.46,4.5,0.0,0.0});
			return Position7_3_130_keyValue;
		}
		/** Large attribute array: PositionInterpolator DEF='Position8' keyValue field, scene-graph level=3, element #131, 192 total numbers made up of 64 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getPosition8_3_131_keyValue()
		{
			MFVec3f Position8_3_131_keyValue = new MFVec3f(new double[] {4.5,16.0,0.0,3.89,15.75,2.81,1.63,15.49,4.83,-1.49,15.24,5.17,-4.33,14.98,3.65,-5.88,14.73,0.81,-5.71,14.48,-2.4,-4.01,14.22,-5.02,-1.41,13.97,-6.5,1.36,13.71,-6.71,3.76,13.46,-5.93,5.52,13.21,-4.57,6.62,12.95,-3.07,7.19,12.7,-1.72,7.42,12.44,-0.71,7.49,12.19,-0.13,7.5,11.94,-0.01,7.47,11.68,-0.36,7.33,11.43,-1.16,6.95,11.17,-2.36,6.14,10.92,-3.82,4.73,10.67,-5.29,2.63,10.41,-6.42,-0.01,10.16,-6.75,-2.78,9.9,-5.92,-5.02,9.65,-3.83,-6.01,9.4,-0.81,-5.31,9.14,2.34,-3.02,8.89,4.63,0.11,8.63,5.24,2.93,8.38,3.98,4.42,8.13,1.43,4.14,7.87,-1.34,2.4,7.62,-3.26,0.08,7.37,-3.76,-1.9,7.11,-2.91,-2.93,6.86,-1.29,-2.91,6.6,0.39,-2.14,6.35,1.63,-1.04,6.1,2.23,0.0,5.84,2.25,0.78,5.59,1.91,1.27,5.33,1.42,1.5,5.08,0.93,1.57,4.83,0.53,1.56,4.57,0.25,1.52,4.32,0.07,1.5,4.06,0.0,1.51,3.81,0.03,1.54,3.56,0.15,1.57,3.3,0.38,1.55,3.05,0.72,1.41,2.79,1.17,1.06,2.54,1.67,0.43,2.29,2.11,-0.5,2.03,2.3,-1.6,1.78,2.01,-2.59,1.52,1.09,-3.04,1.27,-0.42,-2.55,1.02,-2.15,-1.0,0.76,-3.47,1.25,0.51,-3.7,3.41,0.25,-2.46,4.5,0.0,0.0});
			return Position8_3_131_keyValue;
		}
		/** Large attribute array: PositionInterpolator DEF='Position9' keyValue field, scene-graph level=3, element #132, 192 total numbers made up of 64 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getPosition9_3_132_keyValue()
		{
			MFVec3f Position9_3_132_keyValue = new MFVec3f(new double[] {4.5,16.0,0.0,3.89,15.75,2.81,1.63,15.49,4.83,-1.49,15.24,5.17,-4.33,14.98,3.65,-5.88,14.73,0.81,-5.71,14.48,-2.4,-4.01,14.22,-5.02,-1.41,13.97,-6.5,1.36,13.71,-6.71,3.76,13.46,-5.93,5.52,13.21,-4.57,6.62,12.95,-3.07,7.19,12.7,-1.72,7.42,12.44,-0.71,7.49,12.19,-0.13,7.5,11.94,-0.01,7.47,11.68,-0.36,7.33,11.43,-1.16,6.95,11.17,-2.36,6.14,10.92,-3.82,4.73,10.67,-5.29,2.63,10.41,-6.42,-0.01,10.16,-6.75,-2.78,9.9,-5.92,-5.02,9.65,-3.83,-6.01,9.4,-0.81,-5.31,9.14,2.34,-3.02,8.89,4.63,0.11,8.63,5.24,2.93,8.38,3.98,4.42,8.13,1.43,4.14,7.87,-1.34,2.4,7.62,-3.26,0.08,7.37,-3.76,-1.9,7.11,-2.91,-2.93,6.86,-1.29,-2.91,6.6,0.39,-2.14,6.35,1.63,-1.04,6.1,2.23,0.0,5.84,2.25,0.78,5.59,1.91,1.27,5.33,1.42,1.5,5.08,0.93,1.57,4.83,0.53,1.56,4.57,0.25,1.52,4.32,0.07,1.5,4.06,0.0,1.51,3.81,0.03,1.54,3.56,0.15,1.57,3.3,0.38,1.55,3.05,0.72,1.41,2.79,1.17,1.06,2.54,1.67,0.43,2.29,2.11,-0.5,2.03,2.3,-1.6,1.78,2.01,-2.59,1.52,1.09,-3.04,1.27,-0.42,-2.55,1.02,-2.15,-1.0,0.76,-3.47,1.25,0.51,-3.7,3.41,0.25,-2.46,4.5,0.0,0.0});
			return Position9_3_132_keyValue;
		}
		/** Large attribute array: PositionInterpolator DEF='Position10' keyValue field, scene-graph level=3, element #133, 192 total numbers made up of 64 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getPosition10_3_133_keyValue()
		{
			MFVec3f Position10_3_133_keyValue = new MFVec3f(new double[] {4.5,16.0,0.0,3.89,15.75,2.81,1.63,15.49,4.83,-1.49,15.24,5.17,-4.33,14.98,3.65,-5.88,14.73,0.81,-5.71,14.48,-2.4,-4.01,14.22,-5.02,-1.41,13.97,-6.5,1.36,13.71,-6.71,3.76,13.46,-5.93,5.52,13.21,-4.57,6.62,12.95,-3.07,7.19,12.7,-1.72,7.42,12.44,-0.71,7.49,12.19,-0.13,7.5,11.94,-0.01,7.47,11.68,-0.36,7.33,11.43,-1.16,6.95,11.17,-2.36,6.14,10.92,-3.82,4.73,10.67,-5.29,2.63,10.41,-6.42,-0.01,10.16,-6.75,-2.78,9.9,-5.92,-5.02,9.65,-3.83,-6.01,9.4,-0.81,-5.31,9.14,2.34,-3.02,8.89,4.63,0.11,8.63,5.24,2.93,8.38,3.98,4.42,8.13,1.43,4.14,7.87,-1.34,2.4,7.62,-3.26,0.08,7.37,-3.76,-1.9,7.11,-2.91,-2.93,6.86,-1.29,-2.91,6.6,0.39,-2.14,6.35,1.63,-1.04,6.1,2.23,0.0,5.84,2.25,0.78,5.59,1.91,1.27,5.33,1.42,1.5,5.08,0.93,1.57,4.83,0.53,1.56,4.57,0.25,1.52,4.32,0.07,1.5,4.06,0.0,1.51,3.81,0.03,1.54,3.56,0.15,1.57,3.3,0.38,1.55,3.05,0.72,1.41,2.79,1.17,1.06,2.54,1.67,0.43,2.29,2.11,-0.5,2.03,2.3,-1.6,1.78,2.01,-2.59,1.52,1.09,-3.04,1.27,-0.42,-2.55,1.02,-2.15,-1.0,0.76,-3.47,1.25,0.51,-3.7,3.41,0.25,-2.46,4.5,0.0,0.0});
			return Position10_3_133_keyValue;
		}
		/** Large attribute array: PositionInterpolator DEF='Position11' keyValue field, scene-graph level=3, element #134, 192 total numbers made up of 64 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getPosition11_3_134_keyValue()
		{
			MFVec3f Position11_3_134_keyValue = new MFVec3f(new double[] {4.5,16.0,0.0,3.89,15.75,2.81,1.63,15.49,4.83,-1.49,15.24,5.17,-4.33,14.98,3.65,-5.88,14.73,0.81,-5.71,14.48,-2.4,-4.01,14.22,-5.02,-1.41,13.97,-6.5,1.36,13.71,-6.71,3.76,13.46,-5.93,5.52,13.21,-4.57,6.62,12.95,-3.07,7.19,12.7,-1.72,7.42,12.44,-0.71,7.49,12.19,-0.13,7.5,11.94,-0.01,7.47,11.68,-0.36,7.33,11.43,-1.16,6.95,11.17,-2.36,6.14,10.92,-3.82,4.73,10.67,-5.29,2.63,10.41,-6.42,-0.01,10.16,-6.75,-2.78,9.9,-5.92,-5.02,9.65,-3.83,-6.01,9.4,-0.81,-5.31,9.14,2.34,-3.02,8.89,4.63,0.11,8.63,5.24,2.93,8.38,3.98,4.42,8.13,1.43,4.14,7.87,-1.34,2.4,7.62,-3.26,0.08,7.37,-3.76,-1.9,7.11,-2.91,-2.93,6.86,-1.29,-2.91,6.6,0.39,-2.14,6.35,1.63,-1.04,6.1,2.23,0.0,5.84,2.25,0.78,5.59,1.91,1.27,5.33,1.42,1.5,5.08,0.93,1.57,4.83,0.53,1.56,4.57,0.25,1.52,4.32,0.07,1.5,4.06,0.0,1.51,3.81,0.03,1.54,3.56,0.15,1.57,3.3,0.38,1.55,3.05,0.72,1.41,2.79,1.17,1.06,2.54,1.67,0.43,2.29,2.11,-0.5,2.03,2.3,-1.6,1.78,2.01,-2.59,1.52,1.09,-3.04,1.27,-0.42,-2.55,1.02,-2.15,-1.0,0.76,-3.47,1.25,0.51,-3.7,3.41,0.25,-2.46,4.5,0.0,0.0});
			return Position11_3_134_keyValue;
		}
		/** Large attribute array: PositionInterpolator DEF='Position12' keyValue field, scene-graph level=3, element #135, 192 total numbers made up of 64 3-tuple values.
		 * Reassemble split array as single method to improve readability and runnability.
		 * Provide large array values via separate methods, hoping to avoid 'code too large' Java compilation errors. 
		 * Individual Java methods (including aggregated initializations) are limited to 64KB.
		 * @see https://stackoverflow.com/questions/2407912/code-too-large-compilation-error-in-java
		 * @see https://stackoverflow.com/questions/11437905/java-too-many-constants-jvm-error
		 */
		private MFVec3f getPosition12_3_135_keyValue()
		{
			MFVec3f Position12_3_135_keyValue = new MFVec3f(new double[] {4.5,16.0,0.0,3.89,15.75,2.81,1.63,15.49,4.83,-1.49,15.24,5.17,-4.33,14.98,3.65,-5.88,14.73,0.81,-5.71,14.48,-2.4,-4.01,14.22,-5.02,-1.41,13.97,-6.5,1.36,13.71,-6.71,3.76,13.46,-5.93,5.52,13.21,-4.57,6.62,12.95,-3.07,7.19,12.7,-1.72,7.42,12.44,-0.71,7.49,12.19,-0.13,7.5,11.94,-0.01,7.47,11.68,-0.36,7.33,11.43,-1.16,6.95,11.17,-2.36,6.14,10.92,-3.82,4.73,10.67,-5.29,2.63,10.41,-6.42,-0.01,10.16,-6.75,-2.78,9.9,-5.92,-5.02,9.65,-3.83,-6.01,9.4,-0.81,-5.31,9.14,2.34,-3.02,8.89,4.63,0.11,8.63,5.24,2.93,8.38,3.98,4.42,8.13,1.43,4.14,7.87,-1.34,2.4,7.62,-3.26,0.08,7.37,-3.76,-1.9,7.11,-2.91,-2.93,6.86,-1.29,-2.91,6.6,0.39,-2.14,6.35,1.63,-1.04,6.1,2.23,0.0,5.84,2.25,0.78,5.59,1.91,1.27,5.33,1.42,1.5,5.08,0.93,1.57,4.83,0.53,1.56,4.57,0.25,1.52,4.32,0.07,1.5,4.06,0.0,1.51,3.81,0.03,1.54,3.56,0.15,1.57,3.3,0.38,1.55,3.05,0.72,1.41,2.79,1.17,1.06,2.54,1.67,0.43,2.29,2.11,-0.5,2.03,2.3,-1.6,1.78,2.01,-2.59,1.52,1.09,-3.04,1.27,-0.42,-2.55,1.02,-2.15,-1.0,0.76,-3.47,1.25,0.51,-3.7,3.41,0.25,-2.46,4.5,0.0,0.0});
			return Position12_3_135_keyValue;
		}

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return Spiral model
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
        X3D thisExampleX3dModel = new Spiral().getX3dModel();
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
                System.out.println("WARNING: \"Vrml2Sourcebook.Siggraph98Course.Spiral\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
        else if (hasArguments) // if no arguments provided, this method produces usage warning
                thisExampleX3dModel.handleArguments(args);
	
        if (validate)
        {
            //  System.out.println("--- TODO fix duplicated outputs ---"); // omit when duplicated outputs problem is solved/refactored
		String validationResults = thisExampleX3dModel.validationReport();
            //  System.out.println("-----------------------------------"); // omit when duplicated outputs problem is solved/refactored
                System.out.print("Vrml2Sourcebook.Siggraph98Course.Spiral self-validation test results: ");
                if (!validationResults.equals("success"))
                    System.out.println();
                System.out.println(validationResults.trim());
        }
    }
}
