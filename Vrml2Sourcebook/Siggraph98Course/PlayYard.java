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
import org.web3d.x3d.jsail.Lighting.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Texturing.*;

// Javadoc metadata annotations follow, see below for X3DJSAIL Java source code.
/**
 * <p> A playyard to demonstrate NavigationInfo operation. This world illustrates the use of a NavigationInfo node to set the size of the users avatar (width, height, stepsize). The playyard contains several obstacles, some of which the users can get past and others they cannot, all because of the size of the avatar. </p>
 <p> Related links: <a href="../../../Siggraph98Course/PlayYard.java">PlayYard.java</a> source, <a href="../../../Siggraph98Course/PlayYardIndex.html" target="_top">PlayYard catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Siggraph98Course/PlayYard.x3d">PlayYard.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> A playyard to demonstrate NavigationInfo operation. This world illustrates the use of a NavigationInfo node to set the size of the users avatar (width, height, stepsize). The playyard contains several obstacles, some of which the users can get past and others they cannot, all because of the size of the avatar. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> John L. Moreland </td>
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
			<td> originals/playyard.wrl </td>
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
			<td> <a href="http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0364.htm" target="_blank">http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0364.htm</a> </td>
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
			<td> <a href="https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/PlayYard.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/PlayYard.x3d</a> </td>
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

	* @author John L. Moreland
 */

public class PlayYard
{
	/** Default constructor to create this object. */
	public PlayYard ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
            try { // catch-all
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("PlayYard.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("A playyard to demonstrate NavigationInfo operation. This world illustrates the use of a NavigationInfo node to set the size of the users avatar (width, height, stepsize). The playyard contains several obstacles, some of which the users can get past and others they cannot, all because of the size of the avatar."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("John L. Moreland"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 July 1998"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("2 February 2014"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("originals/playyard.wrl"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98/conference/courses/18.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0364.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/PlayYard.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setInfo(new String[] {"Copyright (c) 1998, John L. Moreland"}).setTitle("Playyard"))
    .addChild(new NavigationInfo().setAvatarSize(new double[] {0.25,1.6,0.6}).setHeadlight(false).setSpeed(2.0).setType("\"WALK\" \"ANY\""))
    .addChild(new Background().setGroundAngle(new double[] {1.309,1.570796}).setGroundColor(new MFColor(new double[] {0.0,0.1,0.0,0.0,0.2,0.0,0.2,0.5,0.2})).setSkyAngle(new double[] {1.309,1.571}).setSkyColor(new MFColor(new double[] {0.0,0.2,0.7,0.0,0.5,1.0,1.0,1.0,1.0})))
    .addChild(new DirectionalLight().setAmbientIntensity(0.5).setDirection(-0.5,-1.0,-0.5))
    .addChild(new Viewpoint().setDescription("Away").setOrientation(1.0,0.0,0.0,-0.57).setPosition(0.0,5.5,9.0))
    .addChild(new Viewpoint().setDescription("Monkey Bars - End").setPosition(-4.0,1.6,4.0))
    .addChild(new Viewpoint().setDescription("Monkey Bars - Side").setOrientation(0.0,1.0,0.0,1.57).setPosition(0.0,1.6,0.0))
    .addChild(new Viewpoint().setDescription("Chin-Up Bar - Short").setOrientation(1.0,0.0,0.0,-0.57).setPosition(-1.0,1.6,-2.0))
    .addChild(new Viewpoint().setDescription("Chin-Up Bar - Tall").setPosition(1.0,1.6,0.0))
    .addChild(new Viewpoint().setDescription("Slide - Ladder").setOrientation(1.0,0.0,0.0,-0.57).setPosition(4.0,1.6,4.0))
    .addChild(new Viewpoint().setDescription("Slide - Shoot").setOrientation(0.0,1.0,0.5,3.14159).setPosition(4.0,1.6,-4.0))
    .addChild(new Shape()
      .setAppearance(new Appearance()
        .setTextureTransform(new TextureTransform().setScale(16.0,16.0))
        .setMaterial(new Material())
        .setTexture(new ImageTexture().setUrl(new String[] {"sand.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/sand.jpg"})))
      .setGeometry(new Box().setSize(10.0,0.02,10.0)))
    .addChild(new Transform().setTranslation(2.0,0.0,-10.0)
      .addChild(new Billboard("Palm")
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setTexture(new ImageTexture().setUrl(new String[] {"palm.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/palm.png"})))
          .setGeometry(new IndexedFaceSet().setSolid(false).setCoordIndex(new int[] {0,1,2,3}).setTexCoordIndex(new int[] {0,1,2,3})
            .setTexCoord(new TextureCoordinate().setPoint(new MFVec2f(new double[] {0.0,0.0,1.0,0.0,1.0,1.0,0.0,1.0})))
            .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {-0.83,0.0,0.0,0.83,0.0,0.0,0.83,3.75,0.0,-0.83,3.75,0.0})))))
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.0,0.0,0.0).setTransparency(0.5))
            .setTexture(new ImageTexture().setUrl(new String[] {"palmsh.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/palmsh.png"})))
          .setGeometry(new IndexedFaceSet().setSolid(false).setCoordIndex(new int[] {0,1,2,3}).setTexCoordIndex(new int[] {0,1,2,3})
            .setTexCoord(new TextureCoordinate().setPoint(new MFVec2f(new double[] {0.0,0.0,1.0,0.0,1.0,1.0,0.0,1.0})))
            .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {-1.0,0.02,1.0,1.0,0.02,1.0,1.0,0.02,-1.0,-1.0,0.02,-1.0})))))))
    .addChild(new Transform().setTranslation(-6.0,0.0,-1.0)
      .addChild(new Billboard().setUSE("Palm")))
    .addChild(new Group()
      .addChild(new Transform("Fence").setTranslation(0.0,0.0,-5.0)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setTextureTransform(new TextureTransform().setCenter(0.5,0.5).setRotation(0.7853982).setScale(17.0,17.0))
            .setMaterial(new Material())
            .setTexture(new ImageTexture().setUrl(new String[] {"grill.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/grill.png"})))
          .setGeometry(new IndexedFaceSet().setSolid(false).setCoordIndex(new int[] {0,1,2,3,-1,4,5,6,7,-1,8,9,10,11,-1,12,13,14,15,-1,16,17,18,19,-1,20,21,22,23,-1,24,25,26,27,-1,28,29,30,31,-1,32,33,34,35,-1,36,37,38,39,-1}).setTexCoordIndex(new int[] {0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1,0,1,2,3,-1})
            .setTexCoord(new TextureCoordinate().setPoint(new MFVec2f(new double[] {0.0,0.0,1.0,0.0,1.0,1.0,0.0,1.0})))
            .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {4.0,0.0,0.0,5.0,0.0,0.0,5.0,1.0,0.0,4.0,1.0,0.0,3.0,0.0,0.0,4.0,0.0,0.0,4.0,1.0,0.0,3.0,1.0,0.0,2.0,0.0,0.0,3.0,0.0,0.0,3.0,1.0,0.0,2.0,1.0,0.0,1.0,0.0,0.0,2.0,0.0,0.0,2.0,1.0,0.0,1.0,1.0,0.0,0.0,0.0,0.0,1.0,0.0,0.0,1.0,1.0,0.0,0.0,1.0,0.0,-1.0,0.0,0.0,0.0,0.0,0.0,0.0,1.0,0.0,-1.0,1.0,0.0,-2.0,0.0,0.0,-1.0,0.0,0.0,-1.0,1.0,0.0,-2.0,1.0,0.0,-3.0,0.0,0.0,-2.0,0.0,0.0,-2.0,1.0,0.0,-3.0,1.0,0.0,-4.0,0.0,0.0,-3.0,0.0,0.0,-3.0,1.0,0.0,-4.0,1.0,0.0,-5.0,0.0,0.0,-4.0,0.0,0.0,-4.0,1.0,0.0,-5.0,1.0,0.0})))))
        .addChild(new Transform().setTranslation(0.0,0.5,0.05)
          .addChild(new Shape("Post")
            .setAppearance(new Appearance("Galvanized")
              .setMaterial(new Material().setAmbientIntensity(0.3).setDiffuseColor(0.3,0.3,0.3).setShininess(0.1).setSpecularColor(0.7,0.7,0.8)))
            .setGeometry(new Cylinder().setHeight(1.0).setRadius(0.05))))
        .addChild(new Transform().setTranslation(4.95,0.5,0.05)
          .addChild(new Shape().setUSE("Post"))))
      .addChild(new Transform().setRotation(0.0,1.0,0.0,1.57)
        .addChild(new Transform().setUSE("Fence")))
      .addChild(new Transform().setRotation(0.0,1.0,0.0,3.14159)
        .addChild(new Transform().setUSE("Fence")))
      .addChild(new Transform().setRotation(0.0,1.0,0.0,-1.57)
        .addChild(new Transform().setUSE("Fence"))))
    .addChild(new Transform().setTranslation(-4.0,0.0,0.0)
      .addChild(new Transform().setTranslation(-0.3,1.0,-2.0)
        .addChild(new Shape("Lumber")
          .setAppearance(new Appearance("Wood")
            .setMaterial(new Material().setDiffuseColor(0.8,0.6,0.4))
            .setTexture(new ImageTexture().setUrl(new String[] {"wood.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/wood.jpg"})))
          .setGeometry(new Box().setSize(0.1,2.0,0.1))))
      .addChild(new Transform().setTranslation(0.3,1.0,-2.0)
        .addChild(new Shape().setUSE("Lumber")))
      .addChild(new Transform().setTranslation(-0.3,1.0,2.0)
        .addChild(new Shape().setUSE("Lumber")))
      .addChild(new Transform().setTranslation(0.3,1.0,2.0)
        .addChild(new Shape().setUSE("Lumber")))
      .addChild(new Transform().setRotation(1.0,0.0,0.0,1.57).setTranslation(0.0,1.8,0.0)
        .addChild(new Group("Ladder")
          .addChild(new Transform().setTranslation(-0.3,0.0,0.0)
            .addChild(new Shape("Pole")
              .setAppearance(new Appearance().setUSE("Galvanized"))
              .setGeometry(new Cylinder().setHeight(4.0).setRadius(0.025))))
          .addChild(new Transform().setTranslation(0.3,0.0,0.0)
            .addChild(new Shape().setUSE("Pole")))
          .addChild(new Transform().setRotation(0.0,0.0,1.0,1.57).setScale(1.0,0.15,1.0)
            .addChild(new Shape().setUSE("Pole")))
          .addChild(new Transform().setRotation(0.0,0.0,1.0,1.57).setScale(1.0,0.15,1.0).setTranslation(0.0,0.5,0.0)
            .addChild(new Shape().setUSE("Pole")))
          .addChild(new Transform().setRotation(0.0,0.0,1.0,1.57).setScale(1.0,0.15,1.0).setTranslation(0.0,-0.5,0.0)
            .addChild(new Shape().setUSE("Pole")))
          .addChild(new Transform().setRotation(0.0,0.0,1.0,1.57).setScale(1.0,0.15,1.0).setTranslation(0.0,1.0,0.0)
            .addChild(new Shape().setUSE("Pole")))
          .addChild(new Transform().setRotation(0.0,0.0,1.0,1.57).setScale(1.0,0.15,1.0).setTranslation(0.0,-1.0,0.0)
            .addChild(new Shape().setUSE("Pole")))
          .addChild(new Transform().setRotation(0.0,0.0,1.0,1.57).setScale(1.0,0.15,1.0).setTranslation(0.0,1.5,0.0)
            .addChild(new Shape().setUSE("Pole")))
          .addChild(new Transform().setRotation(0.0,0.0,1.0,1.57).setScale(1.0,0.15,1.0).setTranslation(0.0,-1.5,0.0)
            .addChild(new Shape().setUSE("Pole")))))
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(0.0,0.0,0.0).setTransparency(0.5))
          .setTexture(new ImageTexture().setUrl(new String[] {"ladrshad.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/ladrshad.png"})))
        .setGeometry(new IndexedFaceSet().setSolid(false).setCoordIndex(new int[] {0,1,2,3}).setTexCoordIndex(new int[] {0,1,2,3})
          .setTexCoord(new TextureCoordinate().setPoint(new MFVec2f(new double[] {0.0,0.0,1.0,0.0,1.0,1.0,0.0,1.0})))
          .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {-0.3,0.02,2.0,0.3,0.02,2.0,0.3,0.02,-2.0,-0.3,0.02,-2.0}))))))
    .addChild(new Transform().setTranslation(0.0,0.0,-4.0)
      .addChild(new Transform().setScale(1.0,0.5,1.0).setTranslation(-2.0,0.5,0.0)
        .addChild(new Shape().setUSE("Lumber")))
      .addChild(new Transform().setTranslation(0.0,1.0,0.0)
        .addChild(new Shape().setUSE("Lumber")))
      .addChild(new Transform().setTranslation(2.0,1.0,0.0)
        .addChild(new Shape().setUSE("Lumber")))
      .addChild(new Transform().setRotation(0.0,0.0,1.0,1.57).setScale(1.0,0.5,1.0).setTranslation(-1.0,0.8,0.0)
        .addChild(new Shape().setUSE("Pole")))
      .addChild(new Transform().setRotation(0.0,0.0,1.0,1.57).setScale(1.0,0.5,1.0).setTranslation(1.0,1.8,0.0)
        .addChild(new Shape().setUSE("Pole")))
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(0.0,0.0,0.0).setTransparency(0.5)))
        .setGeometry(new IndexedFaceSet().setSolid(false).setCoordIndex(new int[] {0,1,2,3}).setTexCoordIndex(new int[] {0,1,2,3})
          .setTexCoord(new TextureCoordinate().setPoint(new MFVec2f(new double[] {0.0,0.0,1.0,0.0,1.0,1.0,0.0,1.0})))
          .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {-2.0,0.02,0.05,2.0,0.02,0.05,2.0,0.02,-0.05,-2.0,0.02,-0.05}))))))
    .addChild(new Transform().setTranslation(4.0,0.0,0.0)
      .addChild(new Transform().setScale(1.0,1.5,1.0).setTranslation(-0.3,1.5,0.0)
        .addChild(new Shape().setUSE("Lumber")))
      .addChild(new Transform().setScale(1.0,1.5,1.0).setTranslation(0.3,1.5,0.0)
        .addChild(new Shape().setUSE("Lumber")))
      .addChild(new Transform().setTranslation(0.0,1.4,1.4)
        .addChild(new Transform().setRotation(1.0,0.0,0.0,-0.7853975)
          .addChild(new Group().setUSE("Ladder"))))
      .addChild(new Transform().setTranslation(0.0,2.8,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance().setUSE("Galvanized"))
          .setGeometry(new Extrusion().setBeginCap(false).setCrossSection(new MFVec2f(new double[] {-0.05,0.3,0.05,0.3,0.05,-0.3,-0.05,-0.3})).setEndCap(false).setSolid(false).setSpine(new MFVec3f(new double[] {0.0,0.0,0.0,0.0,-2.1,-3.0,0.0,-2.1,-3.5})))))
      .addChild(new Transform().setScale(1.0,0.35,1.0).setTranslation(0.3,0.35,-3.5)
        .addChild(new Shape().setUSE("Lumber")))
      .addChild(new Transform().setScale(1.0,0.35,1.0).setTranslation(-0.3,0.35,-3.5)
        .addChild(new Shape().setUSE("Lumber")))
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(0.0,0.0,0.0).setTransparency(0.5)))
        .setGeometry(new IndexedFaceSet().setSolid(false).setCoordIndex(new int[] {0,1,2,3}).setTexCoordIndex(new int[] {0,1,2,3})
          .setTexCoord(new TextureCoordinate().setPoint(new MFVec2f(new double[] {0.0,0.0,1.0,0.0,1.0,1.0,0.0,1.0})))
          .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {-0.3,0.02,0.0,0.3,0.02,0.0,0.3,0.02,-3.5,-0.3,0.02,-3.5})))))
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(0.0,0.0,0.0).setTransparency(0.5))
          .setTexture(new ImageTexture().setUrl(new String[] {"ladrshad.png","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/ladrshad.png"})))
        .setGeometry(new IndexedFaceSet().setSolid(false).setCoordIndex(new int[] {0,1,2,3}).setTexCoordIndex(new int[] {0,1,2,3})
          .setTexCoord(new TextureCoordinate().setPoint(new MFVec2f(new double[] {0.0,0.0,1.0,0.0,1.0,1.0,0.0,1.0})))
          .setCoord(new Coordinate().setPoint(new MFVec3f(new double[] {-0.3,0.02,2.8,0.3,0.02,2.8,0.3,0.02,0.0,-0.3,0.02,0.0})))))));
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
	 * @return PlayYard model
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
        X3D thisExampleX3dModel = new PlayYard().getX3dModel();
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
                System.out.println("WARNING: \"Vrml2Sourcebook.Siggraph98Course.PlayYard\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
        else if (hasArguments) // if no arguments provided, this method produces usage warning
                thisExampleX3dModel.handleArguments(args);
	
        if (validate)
        {
            //  System.out.println("--- TODO fix duplicated outputs ---"); // omit when duplicated outputs problem is solved/refactored
		String validationResults = thisExampleX3dModel.validationReport();
            //  System.out.println("-----------------------------------"); // omit when duplicated outputs problem is solved/refactored
                System.out.print("Vrml2Sourcebook.Siggraph98Course.PlayYard self-validation test results: ");
                if (!validationResults.equals("success"))
                    System.out.println();
                System.out.println(validationResults.trim());
        }
    }
}
