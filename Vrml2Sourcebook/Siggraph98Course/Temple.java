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
import org.web3d.x3d.jsail.Networking.*;
import org.web3d.x3d.jsail.PointingDeviceSensor.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Sound.*;
import org.web3d.x3d.jsail.Texturing.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc metadata annotations follow, see below for X3DJSAIL Java source code.
/**
 * <p> Temple of the Glowing Orb: this world creates a glowing rotating orb when the pedestal is touched. </p>
 <p> Related links: <a href="../../../Siggraph98Course/Temple.java">Temple.java</a> source, <a href="../../../Siggraph98Course/TempleIndex.html" target="_top">Temple catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Siggraph98Course/Temple.x3d">Temple.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Temple of the Glowing Orb: this world creates a glowing rotating orb when the pedestal is touched. </td>
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
			<td> originals/temple.wrl </td>
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
			<td> <a href="http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0309.htm" target="_blank">http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0309.htm</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0383.htm" target="_blank">http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0383.htm</a> </td>
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
			<td> <a href="https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Temple.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Temple.x3d</a> </td>
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

public class Temple
{
	/** Default constructor to create this object. */
	public Temple ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
            try { // catch-all
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("Temple.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Temple of the Glowing Orb: this world creates a glowing rotating orb when the pedestal is touched."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("David R. Nadeau, John L. Moreland, Michael M. Heck"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 July 1998"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("2 February 2014"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("originals/temple.wrl"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98/conference/courses/18.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0008.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0309.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0383.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Temple.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addComments(" The orb animations include: ")
    .addComments(" 1. An OrientationInterpolator rotating an inner emissive textured sphere. ")
    .addComments(" 2. An OrientationInterpolator rotating an outer emissive textured semi-transparent sphere. ")
    .addComments(" 3. An OrientationInterpolator rotating a pair of rings, angled at a 45 degree angle. ")
    .addComments(" 4. An OrientationInterpolator rotating a second pair of rings, angled at a 45 degree angle. ")
    .addComments(" A ScalarInterpolator with semi-random floating point keyValue that are routed in to a PointLight, thereby causing a flickering effect. That effect is turned on only after the pedestal has been touched. ")
    .addChild(new WorldInfo().setInfo(new String[] {"Copyright (c) 1997, David R. Nadeau"}).setTitle("Temple of the Orb"))
    .addChild(new Viewpoint().setDescription("Entry view").setPosition(0.0,1.6,9.0))
    .addChild(new NavigationInfo().setHeadlight(false).setSpeed(2.0).setType("\"WALK\" \"ANY\""))
    .addChild(new Background().setSkyAngle(new double[] {1.371,1.571}).setSkyColor(new MFColor(new double[] {0.0,0.1,0.2,0.0,0.1,0.3,0.0,0.0,0.0})))
    .addChild(new PointLight("OrbLight").setColor(0.3,0.7,1.0).setIntensity(0.0).setLocation(0.0,2.0,0.0))
    .addChild(new DirectionalLight().setColor(1.0,0.5,0.0).setDirection(1.0,0.1,-0.5))
    .addChild(new DirectionalLight().setColor(1.0,0.5,0.0).setDirection(1.0,0.1,-0.5))
    .addChild(new DirectionalLight().setColor(1.0,0.0,0.0).setDirection(-1.0,-0.4,-0.5))
    .addChild(new DirectionalLight().setColor(1.0,0.0,0.0).setDirection(-1.0,-0.4,-0.5))
    .addChild(new Transform().setTranslation(0.0,3.64,0.0)
      .addChild(new Group("VaultedCeiling")
        .addChild(new Inline("Vault").setUrl(new String[] {"vault.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/vault.x3d","vault.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/vault.wrl"}))
        .addChild(new Transform().setRotation(0.0,1.0,0.0,1.57)
          .addChild(new Inline().setUSE("Vault")))
        .addChild(new Transform().setRotation(0.0,1.0,0.0,3.14)
          .addChild(new Inline().setUSE("Vault")))
        .addChild(new Transform().setRotation(0.0,1.0,0.0,-1.57)
          .addChild(new Inline().setUSE("Vault"))))
      .addChild(new Transform().setTranslation(-2.0,0.0,0.0)
        .addChild(new Group().setUSE("VaultedCeiling")))
      .addChild(new Transform().setTranslation(2.0,0.0,0.0)
        .addChild(new Group().setUSE("VaultedCeiling")))
      .addChild(new Transform().setTranslation(0.0,0.0,-2.0)
        .addChild(new Group().setUSE("VaultedCeiling")))
      .addChild(new Transform().setTranslation(0.0,0.0,2.0)
        .addChild(new Group().setUSE("VaultedCeiling"))))
    .addChild(new Transform().setTranslation(-3.0,0.0,-1.0)
      .addChild(new Transform("Column").setScale(0.5,0.7,0.5)
        .addChild(new Inline().setUrl(new String[] {"column.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/column.x3d","column.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/column.wrl"}))))
    .addChild(new Transform().setTranslation(-1.0,0.0,-1.0)
      .addChild(new Transform().setUSE("Column")))
    .addChild(new Transform().setTranslation(1.0,0.0,-1.0)
      .addChild(new Transform().setUSE("Column")))
    .addChild(new Transform().setTranslation(3.0,0.0,-1.0)
      .addChild(new Transform().setUSE("Column")))
    .addChild(new Transform().setTranslation(-3.0,0.0,1.0)
      .addChild(new Transform().setUSE("Column")))
    .addChild(new Transform().setTranslation(-1.0,0.0,1.0)
      .addChild(new Transform().setUSE("Column")))
    .addChild(new Transform().setTranslation(1.0,0.0,1.0)
      .addChild(new Transform().setUSE("Column")))
    .addChild(new Transform().setTranslation(3.0,0.0,1.0)
      .addChild(new Transform().setUSE("Column")))
    .addChild(new Transform().setTranslation(-1.0,0.0,-3.0)
      .addChild(new Transform().setUSE("Column")))
    .addChild(new Transform().setTranslation(-1.0,0.0,3.0)
      .addChild(new Transform().setUSE("Column")))
    .addChild(new Transform().setTranslation(1.0,0.0,-3.0)
      .addChild(new Transform().setUSE("Column")))
    .addChild(new Transform().setTranslation(1.0,0.0,3.0)
      .addChild(new Transform().setUSE("Column")))
    .addChild(new Transform().setTranslation(-11.5,0.0,-11.5)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setTextureTransform(new TextureTransform().setScale(16.0,16.0))
          .setMaterial(new Material().setAmbientIntensity(0.5).setDiffuseColor(1.0,1.0,1.0))
          .setTexture(new ImageTexture().setUrl(new String[] {"stone2.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/stone2.jpg"})))
        .setGeometry(new ElevationGrid().setSolid(false).setXDimension(8).setXSpacing(3.0).setZDimension(8).setZSpacing(3.0).setHeight(new double[] {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0}))))
    .addChild(new Collision().setEnabled(false)
      .addChild(new Transform("OrbAll").setScale(0.01,0.01,0.01).setTranslation(0.0,1.625,0.0)
        .addChild(new Transform().setRotation(0.0,0.0,1.0,0.785)
          .addChild(new Transform("RingSet1")
            .addChild(new Transform("Ring1").setRotation(0.0,0.0,1.0,0.35).setTranslation(0.0,0.0525,0.0)
              .addChild(new Shape("Ring")
                .setAppearance(new Appearance()
                  .setMaterial(new Material().setAmbientIntensity(0.0).setDiffuseColor(0.0,0.0,0.0).setEmissiveColor(0.0,0.3,0.8).setShininess(1.0).setSpecularColor(0.0,0.1,0.1)))
                .setGeometry(new Cylinder().setBottom(false).setHeight(0.008).setRadius(0.15).setTop(false))))
            .addChild(new Transform("Ring2").setRotation(0.0,0.0,1.0,-0.35).setTranslation(0.0,-0.0525,0.0)
              .addChild(new Shape().setUSE("Ring")))))
        .addChild(new Transform().setRotation(0.0,0.0,1.0,-0.785)
          .addChild(new Transform("RingSet2").setScale(0.9,0.9,0.9)
            .addChild(new Transform().setUSE("Ring1"))
            .addChild(new Transform().setUSE("Ring2"))))
        .addChild(new Transform("Orb")
          .addChild(new Shape()
            .setAppearance(new Appearance()
              .setTextureTransform(new TextureTransform().setScale(2.0,2.0))
              .setTexture(new ImageTexture().setUrl(new String[] {"brtsky.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/brtsky.jpg"})))
            .setGeometry(new Sphere().setRadius(0.1))))))
    .addChild(new Transform().setTranslation(0.0,1.625,0.0)
      .addChild(new Sound("OrbSound").setIntensity(0.0).setMaxBack(15.0).setMaxFront(15.0)
        .setSource(new AudioClip("OrbClip").setStartTime(-1.0).setUrl(new String[] {"willow1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/willow1.wav"}))))
    .addChild(new Collision().setEnabled(false)
      .addChild(new Transform().setScale(3.25,3.25,3.25).setTranslation(0.0,0.015,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material("GranitMaterial").setAmbientIntensity(0.0).setDiffuseColor(0.8,0.8,1.0))
            .setTexture(new ImageTexture("GranitTexture").setUrl(new String[] {"granit_g.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/granit_g.jpg"})))
          .setGeometry(new IndexedFaceSet().setCoordIndex(new int[] {0,1,4,-1,1,2,4,-1,2,3,4,-1,3,0,4,-1}).setTexCoordIndex(new int[] {0,1,2,-1,0,1,2,-1,0,1,2,-1,0,1,2,-1})
            .setTexCoord(new TextureCoordinate().setPoint(new MFVec2f(new double[] {0.0,0.0,1.0,0.0,0.5,1.0})))
            .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {-0.06,0.0,0.06,0.06,0.0,0.06,0.06,0.0,-0.06,-0.06,0.0,-0.06,0.0,0.3,0.0})))))
        .addChild(new TouchSensor("PedestalTouch").setDescription("Touch center pedestal to see and hear the orb")))
      .addChild(new Transform().setScale(3.25,3.25,3.25).setTranslation(0.0,0.008,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setUSE("GranitMaterial"))
            .setTexture(new ImageTexture().setUSE("GranitTexture")))
          .setGeometry(new Box().setSize(0.2,0.025,0.2)))))
    .addChild(new TimeSensor("OrbTimer").setCycleInterval(20.0).setLoop(true).setStartTime(-1.0))
    .addChild(new OrientationInterpolator("OrbRotator").setKey(new double[] {0.0,0.5,1.0}).setKeyValue(new MFRotation(new double[] {0.0,1.0,0.0,0.0,0.0,1.0,0.0,3.14,0.0,1.0,0.0,6.28})))
    .addChild(new ROUTE().setFromNode("OrbTimer").setFromField("fraction_changed").setToNode("OrbRotator").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("OrbRotator").setFromField("value_changed").setToNode("Orb").setToField("set_rotation"))
    .addChild(new TimeSensor("RingSet1Timer").setCycleInterval(2.0).setLoop(true).setStartTime(-1.0))
    .addChild(new TimeSensor("RingSet2Timer").setCycleInterval(2.2).setLoop(true).setStartTime(-1.0))
    .addChild(new OrientationInterpolator("RingSet1Rotator").setKey(new double[] {0.0,0.5,1.0}).setKeyValue(new MFRotation(new double[] {0.0,1.0,0.0,0.0,0.0,1.0,0.0,-3.14,0.0,1.0,0.0,-6.28})))
    .addChild(new ROUTE().setFromNode("RingSet1Timer").setFromField("fraction_changed").setToNode("RingSet1Rotator").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("RingSet1Rotator").setFromField("value_changed").setToNode("RingSet1").setToField("set_rotation"))
    .addChild(new OrientationInterpolator("RingSet2Rotator").setKey(new double[] {0.0,0.5,1.0}).setKeyValue(new MFRotation(new double[] {0.0,1.0,0.0,0.0,0.0,1.0,0.0,3.14,0.0,1.0,0.0,6.28})))
    .addChild(new ROUTE().setFromNode("RingSet2Timer").setFromField("fraction_changed").setToNode("RingSet2Rotator").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("RingSet2Rotator").setFromField("value_changed").setToNode("RingSet2").setToField("set_rotation"))
    .addChild(new TimeSensor("OrbLightTimer").setCycleInterval(12.0).setStartTime(-1.0))
    .addChild(new ScalarInterpolator("OrbLightIntensity").setKey(new double[] {0.0,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9,1.0}).setKeyValue(new double[] {0.0,0.5,0.7,1.0,0.9,0.8,1.0,0.9,0.9,0.5,0.0}))
    .addChild(new ROUTE().setFromNode("OrbLightTimer").setFromField("fraction_changed").setToNode("OrbLightIntensity").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("OrbLightIntensity").setFromField("value_changed").setToNode("OrbLight").setToField("set_intensity"))
    .addChild(new TimeSensor("OrbScaleTimer").setCycleInterval(12.0).setStartTime(-1.0))
    .addChild(new PositionInterpolator("OrbScaler").setKey(new double[] {0.0,0.3,0.9,1.0}).setKeyValue(new MFVec3f(new double[] {0.001,0.001,0.001,3.25,3.25,3.25,3.25,3.25,3.25,0.001,0.001,0.001})))
    .addChild(new ScalarInterpolator("OrbVolume").setKey(new double[] {0.0,0.3,0.9,1.0}).setKeyValue(new double[] {0.0,1.0,1.0,0.0}))
    .addChild(new ROUTE().setFromNode("PedestalTouch").setFromField("touchTime").setToNode("OrbScaleTimer").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("PedestalTouch").setFromField("touchTime").setToNode("OrbLightTimer").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("PedestalTouch").setFromField("touchTime").setToNode("OrbClip").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("PedestalTouch").setFromField("touchTime").setToNode("OrbTimer").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("PedestalTouch").setFromField("touchTime").setToNode("RingSet1Timer").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("PedestalTouch").setFromField("touchTime").setToNode("RingSet2Timer").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("OrbScaleTimer").setFromField("fraction_changed").setToNode("OrbScaler").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("OrbScaleTimer").setFromField("fraction_changed").setToNode("OrbVolume").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("OrbScaler").setFromField("value_changed").setToNode("OrbAll").setToField("set_scale"))
    .addChild(new ROUTE().setFromNode("OrbVolume").setFromField("value_changed").setToNode("OrbSound").setToField("set_intensity")));
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
	 * @return Temple model
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
        X3D thisExampleX3dModel = new Temple().getX3dModel();
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
                System.out.println("WARNING: \"Vrml2Sourcebook.Siggraph98Course.Temple\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
        else if (hasArguments) // if no arguments provided, this method produces usage warning
                thisExampleX3dModel.handleArguments(args);
	
        if (validate)
        {
            //  System.out.println("--- TODO fix duplicated outputs ---"); // omit when duplicated outputs problem is solved/refactored
		String validationResults = thisExampleX3dModel.validationReport();
            //  System.out.println("-----------------------------------"); // omit when duplicated outputs problem is solved/refactored
                System.out.print("Vrml2Sourcebook.Siggraph98Course.Temple self-validation test results: ");
                if (!validationResults.equals("success"))
                    System.out.println();
                System.out.println(validationResults.trim());
        }
    }
}
