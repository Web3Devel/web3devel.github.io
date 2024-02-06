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
import org.web3d.x3d.jsail.Lighting.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc metadata annotations follow, see below for X3DJSAIL Java source code.
/**
 * <p> Floating pads world: a collection of white pads are created. Each pad slides back and forth horizontally or vertically at its own speed. A green light illuminates the tops of the pads while a blue light illuminates the bottoms. </p>
 <p> Related links: <a href="../../../Siggraph98Course/Floater.java">Floater.java</a> source, <a href="../../../Siggraph98Course/FloaterIndex.html" target="_top">Floater catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Siggraph98Course/Floater.x3d">Floater.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Floating pads world: a collection of white pads are created. Each pad slides back and forth horizontally or vertically at its own speed. A green light illuminates the tops of the pads while a blue light illuminates the bottoms. </td>
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
			<td> <a href="../../../Siggraph98Course/Floater.png">Floater.png</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> originals/floater.wrl </td>
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
			<td> <a href="http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0135htm" target="_blank">http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0135htm</a> </td>
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
			<td> <a href="https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Floater.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Floater.x3d</a> </td>
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

public class Floater
{
	/** Default constructor to create this object. */
	public Floater ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
            try { // catch-all
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("Floater.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Floating pads world: a collection of white pads are created. Each pad slides back and forth horizontally or vertically at its own speed. A green light illuminates the tops of the pads while a blue light illuminates the bottoms."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("David R. Nadeau"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 July 1998"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("2 February 2014"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("Floater.png"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("originals/floater.wrl"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98/conference/courses/18.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0008.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0135htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Floater.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addComments(" Complexity is created from simplicity via two tricks: ")
    .addComments(" 1. Create a set of simple shapes, then repeat the same shapes several times. In this case, there are only 7 original pads moving left and right. Those 7 are repeated again, but turned around the Y axis so that they slide front to back. The same 7 are repeated again, but rotated around the Z axis so that they slide up and down. The effect is one of a complex bunch of moving shapes when in reality there are only 7. ")
    .addComments(" 2. Give each moving shape a slightly different cycle interval for its animation. This makes all the movement out of sync, which again creates the appearance of complexity. ")
    .addComments(" A PROTO is used to create a new Pad node that incorporates a box shape, a time sensor, a position interpolator, and routes to connect them together. Fields to the Pad node control the initial placement of the pad, and it's animation cycle interval. ")
    .addComments(" Add textures. Particularly try adding a texture with a transparency (alpha) channel. Using transparency textures you can add stripes, checks, or whatever to the pads. One approach that looks interesting is to add a cloud texture, but make the sky behind the clouds transparent in the texture. When mapped, this creates a blobby indistinct shape on each pad. ")
    .addComments(" Add a Transform node around the entire group of pads, then use an OrientationInterpolator and TimeSensor to slowly spin the world. Remembering the complexity tricks above, you can create a complex tumble by using three nested Transform nodes (X, Y, and Z), each with its own OrientationInterpolator and TimeSensor. Give the three TimeSensors slightly different cycleInterval values (such as 5.0, 7.0, and 11.0). Prime numbers are good choices. Since the cycle times are different for the three spins, they don't sync up, and it looks like a chaotic tumble. ")
    .addChild(new WorldInfo().setInfo(new String[] {"Copyright (c) 1996, David R. Nadeau"}).setTitle("Floating Pads World"))
    .addChild(new Viewpoint().setDescription("Entry view").setPosition(0.0,1.6,10.0))
    .addChild(new NavigationInfo().setHeadlight(false))
    .addChild(new Background().setSkyColor(new MFColor(new double[] {0.0,0.1,0.4})))
    .addChild(new DirectionalLight().setColor(0.3,1.0,0.3).setDirection(0.5,-1.0,-0.7))
    .addChild(new DirectionalLight().setColor(0.0,0.3,1.0).setDirection(-0.5,1.0,0.7))
    .addChild(new ProtoDeclare("Pad").setName("Pad")
      .setProtoInterface(new ProtoInterface()
        .addField(new field().setName("rotation").setType(field.TYPE_SFROTATION).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setValue(new SFRotation(0.0,0.0,1.0,0.0)))
        .addField(new field().setName("cycleInterval").setType(field.TYPE_SFTIME).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setValue(10.0))
        .addField(new field().setName("translation").setType(field.TYPE_SFVEC3F).setAccessType(field.ACCESSTYPE_INPUTOUTPUT).setValue(new SFVec3f(0.0,0.0,0.0))))
      .setProtoBody(new ProtoBody()
        .addChild(new Collision().setEnabled(false)
          .addChild(new Transform()
            .setIS(new IS()
              .addConnect(new connect().setNodeField("translation").setProtoField("translation"))
              .addConnect(new connect().setNodeField("rotation").setProtoField("rotation")))
            .addChild(new Transform("Movee")
              .addChild(new Shape()
                .setAppearance(new Appearance()
                  .setMaterial(new Material().setDiffuseColor(1.0,1.0,1.0)))
                .setGeometry(new Box().setSize(4.0,0.2,2.0)))
              .addChild(new TimeSensor("Clock").setLoop(true).setStartTime(1.0)
                .setIS(new IS()
                  .addConnect(new connect().setNodeField("cycleInterval").setProtoField("cycleInterval"))))
              .addChild(new PositionInterpolator("Mover").setKey(new double[] {0.0,0.5,1.0}).setKeyValue(new MFVec3f(new double[] {-10.0,0.0,0.0,10.0,0.0,0.0,-10.0,0.0,0.0}))))))
        .addChild(new ROUTE().setFromNode("Clock").setFromField("fraction_changed").setToNode("Mover").setToField("set_fraction"))
        .addChild(new ROUTE().setFromNode("Mover").setFromField("value_changed").setToNode("Movee").setToField("set_translation"))))
    .addChild(new ProtoInstance("Pad").setContainerField("children")
      .addFieldValue(new fieldValue().setName("cycleInterval").setValue(10.0))
      .addFieldValue(new fieldValue().setName("translation").setValue(new SFVec3f(0.0,4.0,0.0))))
    .addChild(new ProtoInstance("Pad").setContainerField("children")
      .addFieldValue(new fieldValue().setName("cycleInterval").setValue(12.0))
      .addFieldValue(new fieldValue().setName("translation").setValue(new SFVec3f(-2.0,0.0,-2.0))))
    .addChild(new ProtoInstance("Pad").setContainerField("children")
      .addFieldValue(new fieldValue().setName("cycleInterval").setValue(14.0))
      .addFieldValue(new fieldValue().setName("translation").setValue(new SFVec3f(2.0,6.0,-4.0))))
    .addChild(new ProtoInstance("Pad").setContainerField("children")
      .addFieldValue(new fieldValue().setName("cycleInterval").setValue(16.0))
      .addFieldValue(new fieldValue().setName("translation").setValue(new SFVec3f(-4.0,2.0,-8.0))))
    .addChild(new ProtoInstance("Pad").setContainerField("children")
      .addFieldValue(new fieldValue().setName("cycleInterval").setValue(18.0))
      .addFieldValue(new fieldValue().setName("translation").setValue(new SFVec3f(0.0,-6.0,-10.0))))
    .addChild(new ProtoInstance("Pad").setContainerField("children")
      .addFieldValue(new fieldValue().setName("cycleInterval").setValue(10.0))
      .addFieldValue(new fieldValue().setName("translation").setValue(new SFVec3f(4.0,-2.0,-10.0))))
    .addChild(new ProtoInstance("Pad").setContainerField("children")
      .addFieldValue(new fieldValue().setName("cycleInterval").setValue(8.0))
      .addFieldValue(new fieldValue().setName("translation").setValue(new SFVec3f(0.0,-4.0,-0.0))))
    .addChild(new ProtoInstance("Pad").setContainerField("children")
      .addFieldValue(new fieldValue().setName("rotation").setValue(new SFRotation(0.0,1.0,0.0,1.571)))
      .addFieldValue(new fieldValue().setName("cycleInterval").setValue(10.0))
      .addFieldValue(new fieldValue().setName("translation").setValue(new SFVec3f(0.0,4.0,0.0))))
    .addChild(new ProtoInstance("Pad").setContainerField("children")
      .addFieldValue(new fieldValue().setName("rotation").setValue(new SFRotation(0.0,1.0,0.0,1.571)))
      .addFieldValue(new fieldValue().setName("cycleInterval").setValue(12.0))
      .addFieldValue(new fieldValue().setName("translation").setValue(new SFVec3f(-2.0,0.0,-2.0))))
    .addChild(new ProtoInstance("Pad").setContainerField("children")
      .addFieldValue(new fieldValue().setName("rotation").setValue(new SFRotation(0.0,1.0,0.0,1.571)))
      .addFieldValue(new fieldValue().setName("cycleInterval").setValue(14.0))
      .addFieldValue(new fieldValue().setName("translation").setValue(new SFVec3f(2.0,6.0,-4.0))))
    .addChild(new ProtoInstance("Pad").setContainerField("children")
      .addFieldValue(new fieldValue().setName("rotation").setValue(new SFRotation(0.0,1.0,0.0,1.571)))
      .addFieldValue(new fieldValue().setName("cycleInterval").setValue(16.0))
      .addFieldValue(new fieldValue().setName("translation").setValue(new SFVec3f(-4.0,2.0,-8.0))))
    .addChild(new ProtoInstance("Pad").setContainerField("children")
      .addFieldValue(new fieldValue().setName("rotation").setValue(new SFRotation(0.0,1.0,0.0,1.571)))
      .addFieldValue(new fieldValue().setName("cycleInterval").setValue(18.0))
      .addFieldValue(new fieldValue().setName("translation").setValue(new SFVec3f(0.0,-6.0,-10.0))))
    .addChild(new ProtoInstance("Pad").setContainerField("children")
      .addFieldValue(new fieldValue().setName("rotation").setValue(new SFRotation(0.0,1.0,0.0,1.571)))
      .addFieldValue(new fieldValue().setName("cycleInterval").setValue(10.0))
      .addFieldValue(new fieldValue().setName("translation").setValue(new SFVec3f(4.0,-2.0,-10.0))))
    .addChild(new ProtoInstance("Pad").setContainerField("children")
      .addFieldValue(new fieldValue().setName("rotation").setValue(new SFRotation(0.0,1.0,0.0,1.571)))
      .addFieldValue(new fieldValue().setName("cycleInterval").setValue(8.0))
      .addFieldValue(new fieldValue().setName("translation").setValue(new SFVec3f(0.0,-4.0,-0.0))))
    .addChild(new ProtoInstance("Pad").setContainerField("children")
      .addFieldValue(new fieldValue().setName("rotation").setValue(new SFRotation(0.0,0.0,1.0,1.571)))
      .addFieldValue(new fieldValue().setName("cycleInterval").setValue(10.0))
      .addFieldValue(new fieldValue().setName("translation").setValue(new SFVec3f(0.0,4.0,0.0))))
    .addChild(new ProtoInstance("Pad").setContainerField("children")
      .addFieldValue(new fieldValue().setName("rotation").setValue(new SFRotation(0.0,0.0,1.0,1.571)))
      .addFieldValue(new fieldValue().setName("cycleInterval").setValue(12.0))
      .addFieldValue(new fieldValue().setName("translation").setValue(new SFVec3f(-2.0,0.0,-2.0))))
    .addChild(new ProtoInstance("Pad").setContainerField("children")
      .addFieldValue(new fieldValue().setName("rotation").setValue(new SFRotation(0.0,0.0,1.0,1.571)))
      .addFieldValue(new fieldValue().setName("cycleInterval").setValue(14.0))
      .addFieldValue(new fieldValue().setName("translation").setValue(new SFVec3f(2.0,6.0,-4.0))))
    .addChild(new ProtoInstance("Pad").setContainerField("children")
      .addFieldValue(new fieldValue().setName("rotation").setValue(new SFRotation(0.0,0.0,1.0,1.571)))
      .addFieldValue(new fieldValue().setName("cycleInterval").setValue(16.0))
      .addFieldValue(new fieldValue().setName("translation").setValue(new SFVec3f(-4.0,2.0,-8.0))))
    .addChild(new ProtoInstance("Pad").setContainerField("children")
      .addFieldValue(new fieldValue().setName("rotation").setValue(new SFRotation(0.0,0.0,1.0,1.571)))
      .addFieldValue(new fieldValue().setName("cycleInterval").setValue(18.0))
      .addFieldValue(new fieldValue().setName("translation").setValue(new SFVec3f(0.0,-6.0,-10.0))))
    .addChild(new ProtoInstance("Pad").setContainerField("children")
      .addFieldValue(new fieldValue().setName("rotation").setValue(new SFRotation(0.0,0.0,1.0,1.571)))
      .addFieldValue(new fieldValue().setName("cycleInterval").setValue(10.0))
      .addFieldValue(new fieldValue().setName("translation").setValue(new SFVec3f(4.0,-2.0,-10.0))))
    .addChild(new ProtoInstance("Pad").setContainerField("children")
      .addFieldValue(new fieldValue().setName("rotation").setValue(new SFRotation(0.0,0.0,1.0,1.571)))
      .addFieldValue(new fieldValue().setName("cycleInterval").setValue(8.0))
      .addFieldValue(new fieldValue().setName("translation").setValue(new SFVec3f(0.0,-4.0,-0.0)))));
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
	 * @return Floater model
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
        X3D thisExampleX3dModel = new Floater().getX3dModel();
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
                System.out.println("WARNING: \"Vrml2Sourcebook.Siggraph98Course.Floater\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
        else if (hasArguments) // if no arguments provided, this method produces usage warning
                thisExampleX3dModel.handleArguments(args);
	
        if (validate)
        {
            //  System.out.println("--- TODO fix duplicated outputs ---"); // omit when duplicated outputs problem is solved/refactored
		String validationResults = thisExampleX3dModel.validationReport();
            //  System.out.println("-----------------------------------"); // omit when duplicated outputs problem is solved/refactored
                System.out.print("Vrml2Sourcebook.Siggraph98Course.Floater self-validation test results: ");
                if (!validationResults.equals("success"))
                    System.out.println();
                System.out.println(validationResults.trim());
        }
    }
}
