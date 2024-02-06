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
import org.web3d.x3d.jsail.EnvironmentalEffects.*;
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Interpolation.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.PointingDeviceSensor.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc metadata annotations follow, see below for X3DJSAIL Java source code.
/**
 * <p> This scene presents some colorful frames. See the source comments regarding animation details. </p>
 <p> Related links: <a href="../../../Siggraph98Course/Colors.java">Colors.java</a> source, <a href="../../../Siggraph98Course/ColorsIndex.html" target="_top">Colors catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Siggraph98Course/Colors.x3d">Colors.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> This scene presents some colorful frames. See the source comments regarding animation details. </td>
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
			<td> originals/colors.wrl </td>
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
			<td> <a href="http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0073.htm" target="_blank">http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0073.htm</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0130.htm" target="_blank">http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0130.htm</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0167.htm" target="_blank">http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0167.htm</a> </td>
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
			<td> <a href="https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Colors.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Colors.x3d</a> </td>
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

public class Colors
{
	/** Default constructor to create this object. */
	public Colors ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
            try { // catch-all
  x3dModel = new X3D().setProfile(X3D.PROFILE_INTERACTIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("Colors.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("This scene presents some colorful frames. See the source comments regarding animation details."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("David R. Nadeau"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 July 1998"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("2 February 2014"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("originals/colors.wrl"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98/conference/courses/18.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0073.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0130.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0167.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Colors.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addComments(" Orientation interpolators slowly spin 9 frames, each with a slightly different speed. At first there is a clear structure, but as the animation evolves the structure dissolves in to chaos. If you wait long enough, they'll all get back in sync again... after about 560 years! ")
    .addComments(" Things to experiment with: Try using other time keyValue for the rotation speed of the 9 squares. If the keyValue are multiples of a common factor, the squares will get in sync sooner than if they don't have a common factor. ")
    .addChild(new WorldInfo().setInfo(new String[] {"Copyright (c) 1996, David R. Nadeau"}).setTitle("Colors"))
    .addChild(new Viewpoint("Entry").setDescription("Entry view").setPosition(0.0,0.0,3.0))
    .addChild(new NavigationInfo())
    .addChild(new Background())
    .addChild(new Transform("Frame1")
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(1.0,0.0,0.0)))
        .setGeometry(new IndexedFaceSet("Frame").setDEF("Frame").setCoordIndex(new int[] {0,1,6,7,-1,1,2,17,16,-1,2,3,4,5,-1,19,18,5,6,-1,11,10,13,12,-1,10,9,20,21,-1,9,8,15,14,-1,22,23,14,13,-1,3,11,12,4,-1,4,12,15,7,-1,8,0,7,15,-1,0,8,11,3,-1,16,17,21,20,-1,21,17,18,22,-1,19,23,22,18,-1,16,20,23,19,-1})
          .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {-1.0,-1.0,0.1,-0.9,-1.0,0.1,0.9,-1.0,0.1,1.0,-1.0,0.1,1.0,1.0,0.1,0.9,1.0,0.1,-0.9,1.0,0.1,-1.0,1.0,0.1,-1.0,-1.0,-0.1,-0.9,-1.0,-0.1,0.9,-1.0,-0.1,1.0,-1.0,-0.1,1.0,1.0,-0.1,0.9,1.0,-0.1,-0.9,1.0,-0.1,-1.0,1.0,-0.1,-0.9,-0.9,0.1,0.9,-0.9,0.1,0.9,0.9,0.1,-0.9,0.9,0.1,-0.9,-0.9,-0.1,0.9,-0.9,-0.1,0.9,0.9,-0.1,-0.9,0.9,-0.1}))))))
    .addChild(new Transform("Frame2").setTranslation(0.0,0.0,-0.4)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(1.0,0.5,0.0)))
        .setGeometry(new IndexedFaceSet().setUSE("Frame"))))
    .addChild(new Transform("Frame3").setTranslation(0.0,0.0,-0.8)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(1.0,1.0,0.0)))
        .setGeometry(new IndexedFaceSet().setUSE("Frame"))))
    .addChild(new Transform("Frame4").setTranslation(0.0,0.0,-1.2)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(0.5,1.0,0.0)))
        .setGeometry(new IndexedFaceSet().setUSE("Frame"))))
    .addChild(new Transform("Frame5").setTranslation(0.0,0.0,-1.6)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(0.0,1.0,0.0)))
        .setGeometry(new IndexedFaceSet().setUSE("Frame"))))
    .addChild(new Transform("Frame6").setTranslation(0.0,0.0,-2.0)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(0.0,1.0,0.5)))
        .setGeometry(new IndexedFaceSet().setUSE("Frame"))))
    .addChild(new Transform("Frame7").setTranslation(0.0,0.0,-2.4)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(0.0,1.0,1.0)))
        .setGeometry(new IndexedFaceSet().setUSE("Frame"))))
    .addChild(new Transform("Frame8").setTranslation(0.0,0.0,-2.8)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(0.0,0.5,1.0)))
        .setGeometry(new IndexedFaceSet().setUSE("Frame"))))
    .addChild(new Transform("Frame9").setTranslation(0.0,0.0,-3.2)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(0.0,0.0,1.0)))
        .setGeometry(new IndexedFaceSet().setUSE("Frame"))))
    .addChild(new TouchSensor("Touch"))
    .addChild(new TimeSensor("Timer1").setCycleInterval(10.0).setLoop(true).setStartTime(-1.0))
    .addChild(new TimeSensor("Timer2").setCycleInterval(11.0).setLoop(true).setStartTime(-1.0))
    .addChild(new TimeSensor("Timer3").setCycleInterval(12.0).setLoop(true).setStartTime(-1.0))
    .addChild(new TimeSensor("Timer4").setCycleInterval(13.0).setLoop(true).setStartTime(-1.0))
    .addChild(new TimeSensor("Timer5").setCycleInterval(14.0).setLoop(true).setStartTime(-1.0))
    .addChild(new TimeSensor("Timer6").setCycleInterval(15.0).setLoop(true).setStartTime(-1.0))
    .addChild(new TimeSensor("Timer7").setCycleInterval(16.0).setLoop(true).setStartTime(-1.0))
    .addChild(new TimeSensor("Timer8").setCycleInterval(17.0).setLoop(true).setStartTime(-1.0))
    .addChild(new TimeSensor("Timer9").setCycleInterval(18.0).setLoop(true).setStartTime(-1.0))
    .addChild(new OrientationInterpolator("Rot1").setKey(new double[] {0.0,0.5,1.0}).setKeyValue(new MFRotation(new double[] {0.0,0.0,1.0,0.0,0.0,0.0,1.0,3.14,0.0,0.0,1.0,6.28})))
    .addChild(new OrientationInterpolator("Rot2").setKey(new double[] {0.0,0.5,1.0}).setKeyValue(new MFRotation(new double[] {0.0,0.0,1.0,0.0,0.0,0.0,1.0,3.14,0.0,0.0,1.0,6.28})))
    .addChild(new OrientationInterpolator("Rot3").setKey(new double[] {0.0,0.5,1.0}).setKeyValue(new MFRotation(new double[] {0.0,0.0,1.0,0.0,0.0,0.0,1.0,3.14,0.0,0.0,1.0,6.28})))
    .addChild(new OrientationInterpolator("Rot4").setKey(new double[] {0.0,0.5,1.0}).setKeyValue(new MFRotation(new double[] {0.0,0.0,1.0,0.0,0.0,0.0,1.0,3.14,0.0,0.0,1.0,6.28})))
    .addChild(new OrientationInterpolator("Rot5").setKey(new double[] {0.0,0.5,1.0}).setKeyValue(new MFRotation(new double[] {0.0,0.0,1.0,0.0,0.0,0.0,1.0,3.14,0.0,0.0,1.0,6.28})))
    .addChild(new OrientationInterpolator("Rot6").setKey(new double[] {0.0,0.5,1.0}).setKeyValue(new MFRotation(new double[] {0.0,0.0,1.0,0.0,0.0,0.0,1.0,3.14,0.0,0.0,1.0,6.28})))
    .addChild(new OrientationInterpolator("Rot7").setKey(new double[] {0.0,0.5,1.0}).setKeyValue(new MFRotation(new double[] {0.0,0.0,1.0,0.0,0.0,0.0,1.0,3.14,0.0,0.0,1.0,6.28})))
    .addChild(new OrientationInterpolator("Rot8").setKey(new double[] {0.0,0.5,1.0}).setKeyValue(new MFRotation(new double[] {0.0,0.0,1.0,0.0,0.0,0.0,1.0,3.14,0.0,0.0,1.0,6.28})))
    .addChild(new OrientationInterpolator("Rot9").setKey(new double[] {0.0,0.5,1.0}).setKeyValue(new MFRotation(new double[] {0.0,0.0,1.0,0.0,0.0,0.0,1.0,3.14,0.0,0.0,1.0,6.28})))
    .addChild(new ROUTE().setFromNode("Touch").setFromField("touchTime").setToNode("Timer1").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("Touch").setFromField("touchTime").setToNode("Timer2").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("Touch").setFromField("touchTime").setToNode("Timer3").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("Touch").setFromField("touchTime").setToNode("Timer4").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("Touch").setFromField("touchTime").setToNode("Timer5").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("Touch").setFromField("touchTime").setToNode("Timer6").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("Touch").setFromField("touchTime").setToNode("Timer7").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("Touch").setFromField("touchTime").setToNode("Timer8").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("Touch").setFromField("touchTime").setToNode("Timer9").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("Timer1").setFromField("fraction_changed").setToNode("Rot1").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Timer2").setFromField("fraction_changed").setToNode("Rot2").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Timer3").setFromField("fraction_changed").setToNode("Rot3").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Timer4").setFromField("fraction_changed").setToNode("Rot4").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Timer5").setFromField("fraction_changed").setToNode("Rot5").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Timer6").setFromField("fraction_changed").setToNode("Rot6").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Timer7").setFromField("fraction_changed").setToNode("Rot7").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Timer8").setFromField("fraction_changed").setToNode("Rot8").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Timer9").setFromField("fraction_changed").setToNode("Rot9").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Rot1").setFromField("value_changed").setToNode("Frame1").setToField("set_rotation"))
    .addChild(new ROUTE().setFromNode("Rot2").setFromField("value_changed").setToNode("Frame2").setToField("set_rotation"))
    .addChild(new ROUTE().setFromNode("Rot3").setFromField("value_changed").setToNode("Frame3").setToField("set_rotation"))
    .addChild(new ROUTE().setFromNode("Rot4").setFromField("value_changed").setToNode("Frame4").setToField("set_rotation"))
    .addChild(new ROUTE().setFromNode("Rot5").setFromField("value_changed").setToNode("Frame5").setToField("set_rotation"))
    .addChild(new ROUTE().setFromNode("Rot6").setFromField("value_changed").setToNode("Frame6").setToField("set_rotation"))
    .addChild(new ROUTE().setFromNode("Rot7").setFromField("value_changed").setToNode("Frame7").setToField("set_rotation"))
    .addChild(new ROUTE().setFromNode("Rot8").setFromField("value_changed").setToNode("Frame8").setToField("set_rotation"))
    .addChild(new ROUTE().setFromNode("Rot9").setFromField("value_changed").setToNode("Frame9").setToField("set_rotation")));
            }
            catch (Exception ex)
            {       
                System.err.println ("*** Further hints on X3DJSAIL errors and exceptions at");
                System.err.println ("*** https://www.web3d.org/specifications/java/X3DJSAIL.html");
                throw (ex);
            }
	}
	// end of initialize() method

	/** The initialized model object, created within initialize() method. */
	private X3D x3dModel;

	/** 
	 * Provide a 
	 * <a href="https://dzone.com/articles/java-copy-shallow-vs-deep-in-which-you-will-swim" target="_blank">shallow copy</a>
	 * of the X3D model.
	 * @see <a href="https://www.web3d.org/specifications/java/javadoc/org/web3d/x3d/jsail/Core/X3D.html">X3D</a>
	 * @return Colors model
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
        X3D thisExampleX3dModel = new Colors().getX3dModel();
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
                System.out.println("WARNING: \"Vrml2Sourcebook.Siggraph98Course.Colors\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
        else if (hasArguments) // if no arguments provided, this method produces usage warning
                thisExampleX3dModel.handleArguments(args);
	
        if (validate)
        {
            //  System.out.println("--- TODO fix duplicated outputs ---"); // omit when duplicated outputs problem is solved/refactored
		String validationResults = thisExampleX3dModel.validationReport();
            //  System.out.println("-----------------------------------"); // omit when duplicated outputs problem is solved/refactored
                System.out.print("Vrml2Sourcebook.Siggraph98Course.Colors self-validation test results: ");
                if (!validationResults.equals("success"))
                    System.out.println();
                System.out.println(validationResults.trim());
        }
    }
}
