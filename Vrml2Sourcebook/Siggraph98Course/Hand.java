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
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Shape.*;

// Javadoc metadata annotations follow, see below for X3DJSAIL Java source code.
/**
 * <p> Robotic hand juggling primitives: this scene illustrates the use of the primitive shapes and a lot of nested Transform nodes to created articulated structures. </p>
 <p> Related links: <a href="../../../Siggraph98Course/Hand.java">Hand.java</a> source, <a href="../../../Siggraph98Course/HandIndex.html" target="_top">Hand catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Siggraph98Course/Hand.x3d">Hand.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Robotic hand juggling primitives: this scene illustrates the use of the primitive shapes and a lot of nested Transform nodes to created articulated structures. </td>
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
			<td> 3 September 2023 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> <a href="../../../Siggraph98Course/Hand.png">Hand.png</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> originals/hand.wrl </td>
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
			<td> <a href="http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0063.htm" target="_blank">http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0063.htm</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0115.htm" target="_blank">http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0115.htm</a> </td>
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
			<td> <a href="https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Hand.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Hand.x3d</a> </td>
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

public class Hand
{
	/** Default constructor to create this object. */
	public Hand ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
            try { // catch-all
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("Hand.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Robotic hand juggling primitives: this scene illustrates the use of the primitive shapes and a lot of nested Transform nodes to created articulated structures."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("David R. Nadeau"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 July 1998"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("2 February 2014"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("3 September 2023"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("Hand.png"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("originals/hand.wrl"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98/conference/courses/18.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0063.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0115.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Hand.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addComments(" Each of the finger joints are controlled by a separate rotation. Changing the rotation angles (by editing this file) will open and close the hand. ")
    .addComments(" For convenience, each of the hand's parts are spearately authored within a Switch node whose 'whichChoice' field is set to -1 which forces the parts to be skipped during drawing. The parts in the Switch, however, are assembled later in a 'hand' shape at the end of the Switch, and that shape is then instanced outside of the Switch. The effect is to create a file structure that enables you to build things piece by piece, then use Transform's later on to assemble those pieces into a drawn shape. ")
    .addChild(new WorldInfo().setInfo(new String[] {"copyright (c) 1997, David R. Nadeau"}).setTitle("Robotic hand juggling primitives"))
    .addChild(new Viewpoint().setDescription("Entry view"))
    .addChild(new NavigationInfo())
    .addChild(new Switch().setWhichChoice(-1)
      .addChild(new Shape()
        .setAppearance(new Appearance("HandColor")
          .setMaterial(new Material().setAmbientIntensity(0.3).setDiffuseColor(0.3,0.3,0.5).setShininess(0.1).setSpecularColor(0.7,0.7,0.8))))
      .addChild(new Group("finger_base")
        .addChild(new Shape()
          .setAppearance(new Appearance().setUSE("HandColor"))
          .setGeometry(new Sphere().setRadius(0.41)))
        .addChild(new Transform().setTranslation(0.0,0.875,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance().setUSE("HandColor"))
            .setGeometry(new Cylinder().setHeight(1.75).setRadius(0.35)))
          .addChild(new Transform().setTranslation(0.0,0.835,0.0)
            .addChild(new Shape()
              .setAppearance(new Appearance().setUSE("HandColor"))
              .setGeometry(new Sphere().setRadius(0.35))))))
      .addChild(new Transform("finger_middle").setTranslation(0.0,0.5,0.0)
        .addChild(new Shape()
          .setAppearance(new Appearance().setUSE("HandColor"))
          .setGeometry(new Cylinder().setHeight(1.0).setRadius(0.315)))
        .addChild(new Transform().setTranslation(0.0,0.5,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance().setUSE("HandColor"))
            .setGeometry(new Sphere().setRadius(0.32)))))
      .addChild(new Transform("finger_tip").setRotation(1.0,0.0,0.0,-0.1)
        .addChild(new Transform().setTranslation(0.0,0.4,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance().setUSE("HandColor"))
            .setGeometry(new Cylinder().setHeight(0.75).setRadius(0.27)))
          .addChild(new Transform().setScale(1.0,0.7,1.0).setTranslation(0.0,0.35,0.0)
            .addChild(new Shape()
              .setAppearance(new Appearance().setUSE("HandColor"))
              .setGeometry(new Sphere().setRadius(0.235))))))
      .addChild(new Transform("finger1").setRotation(0.0,0.0,1.0,0.035)
        .addChild(new Transform().setRotation(0.0,1.0,0.0,-0.03)
          .addChild(new Transform().setRotation(1.0,0.0,0.0,-0.2)
            .addChild(new Group().setUSE("finger_base"))
            .addChild(new Transform().setRotation(1.0,0.0,0.0,-0.2).setTranslation(0.0,1.71,0.0)
              .addChild(new Transform().setUSE("finger_middle"))
              .addChild(new Transform().setRotation(1.0,0.0,0.0,-0.2).setTranslation(0.0,1.0,0.0)
                .addChild(new Transform().setUSE("finger_tip")))))))
      .addChild(new Transform("finger2").setScale(1.01,1.15,1.01)
        .addChild(new Transform()
          .addChild(new Transform().setRotation(1.0,0.0,0.0,-0.4).setTranslation(0.0,0.2,0.0)
            .addChild(new Group().setUSE("finger_base"))
            .addChild(new Transform().setRotation(1.0,0.0,0.0,-0.4).setTranslation(0.0,1.71,0.0)
              .addChild(new Transform().setUSE("finger_middle"))
              .addChild(new Transform().setRotation(1.0,0.0,0.0,-0.4).setTranslation(0.0,1.0,0.0)
                .addChild(new Transform().setUSE("finger_tip")))))))
      .addChild(new Transform("finger3").setRotation(0.0,0.0,1.0,-0.0175).setScale(1.0,1.05,1.0)
        .addChild(new Transform().setRotation(0.0,1.0,0.0,0.065)
          .addChild(new Transform().setRotation(1.0,0.0,0.0,-0.6).setTranslation(0.0,0.1,0.0)
            .addChild(new Group().setUSE("finger_base"))
            .addChild(new Transform().setRotation(1.0,0.0,0.0,-0.4).setTranslation(0.0,1.71,0.0)
              .addChild(new Transform().setUSE("finger_middle"))
              .addChild(new Transform().setRotation(1.0,0.0,0.0,-0.4).setTranslation(0.0,1.0,0.0)
                .addChild(new Transform().setUSE("finger_tip")))))))
      .addChild(new Transform("finger4").setRotation(0.0,0.0,1.0,-0.0698).setScale(0.9,0.9,0.9)
        .addChild(new Transform().setRotation(0.0,1.0,0.0,0.1)
          .addChild(new Transform().setRotation(1.0,0.0,0.0,-0.7).setTranslation(0.0,-0.2,0.0)
            .addChild(new Group().setUSE("finger_base"))
            .addChild(new Transform().setRotation(1.0,0.0,0.0,-0.4).setTranslation(0.0,1.71,0.0)
              .addChild(new Transform().setUSE("finger_middle"))
              .addChild(new Transform().setRotation(1.0,0.0,0.0,-0.4).setTranslation(0.0,1.0,0.0)
                .addChild(new Transform().setUSE("finger_tip")))))))
      .addChild(new Transform("thumb").setRotation(0.0,0.0,1.0,0.7)
        .addChild(new Transform().setRotation(0.0,0.0,1.0,0.1)
          .addChild(new Transform().setRotation(0.0,1.0,0.0,-0.9).setScale(0.7,0.7,0.8)
            .addChild(new Shape()
              .setAppearance(new Appearance().setUSE("HandColor"))
              .setGeometry(new Sphere().setRadius(0.9)))
            .addChild(new Transform().setTranslation(0.0,1.1,0.0)
              .addChild(new Shape()
                .setAppearance(new Appearance().setUSE("HandColor"))
                .setGeometry(new Cylinder().setRadius(0.55)))
              .addChild(new Transform().setTranslation(0.0,0.85,0.0)
                .addChild(new Shape()
                  .setAppearance(new Appearance().setUSE("HandColor"))
                  .setGeometry(new Sphere().setRadius(0.58)))
                .addChild(new Transform().setRotation(1.0,0.0,0.0,0.08)
                  .addChild(new Transform().setTranslation(0.0,0.6,0.0)
                    .addChild(new Shape()
                      .setAppearance(new Appearance().setUSE("HandColor"))
                      .setGeometry(new Cylinder().setHeight(1.2).setRadius(0.41)))
                    .addChild(new Transform().setTranslation(0.0,0.6,0.0)
                      .addChild(new Shape()
                        .setAppearance(new Appearance().setUSE("HandColor"))
                        .setGeometry(new Sphere().setRadius(0.45)))
                      .addChild(new Transform().setRotation(1.0,0.0,0.0,0.13)
                        .addChild(new Transform().setRotation(1.0,0.0,0.0,-0.1)
                          .addChild(new Transform().setTranslation(0.0,0.5,0.05)
                            .addChild(new Shape()
                              .setAppearance(new Appearance().setUSE("HandColor"))
                              .setGeometry(new Cylinder().setHeight(1.0).setRadius(0.325)))
                            .addChild(new Transform().setScale(1.0,0.7,1.0).setTranslation(0.0,0.5,0.0)
                              .addChild(new Shape()
                                .setAppearance(new Appearance().setUSE("HandColor"))
                                .setGeometry(new Sphere().setRadius(0.29)))))))))))))))
      .addChild(new Group("palm")
        .addChild(new Transform().setTranslation(-0.05,0.875,-0.03)
          .addChild(new Shape()
            .setAppearance(new Appearance().setUSE("HandColor"))
            .setGeometry(new Box().setSize(2.85,2.45,0.6))))
        .addChild(new Transform().setScale(1.1,0.7,0.3).setTranslation(-0.9,0.2,-0.2)
          .addChild(new Shape()
            .setAppearance(new Appearance().setUSE("HandColor"))
            .setGeometry(new Sphere().setRadius(1.1))))
        .addChild(new Transform().setScale(0.9,0.8,0.3).setTranslation(0.5,0.0,-0.2)
          .addChild(new Shape()
            .setAppearance(new Appearance().setUSE("HandColor"))
            .setGeometry(new Sphere())))
        .addChild(new Transform().setScale(1.5,1.0,1.0).setTranslation(0.0,-0.6,0.0)
          .addChild(new Transform().setRotation(1.0,0.0,0.0,-0.4)
            .addChild(new Shape()
              .setAppearance(new Appearance().setUSE("HandColor"))
              .setGeometry(new Cylinder().setHeight(0.1).setRadius(1.1)))
            .addChild(new Transform().setTranslation(0.0,-0.3,0.0)
              .addChild(new Shape()
                .setAppearance(new Appearance().setUSE("HandColor"))
                .setGeometry(new Sphere().setRadius(0.8)))
              .addChild(new Shape()
                .setAppearance(new Appearance().setUSE("HandColor"))
                .setGeometry(new Cylinder().setHeight(0.1).setRadius(1.1)))
              .addChild(new Transform().setTranslation(0.0,-1.3,0.0)
                .addChild(new Shape()
                  .setAppearance(new Appearance().setUSE("HandColor"))
                  .setGeometry(new Cylinder().setRadius(0.6)))))))
        .addChild(new Transform().setTranslation(0.0,-0.475,0.345)
          .addChild(new Transform().setRotation(0.0,0.0,1.0,0.15)
            .addChild(new Transform("vein").setTranslation(0.0,1.375,0.0)
              .addChild(new Shape()
                .setAppearance(new Appearance().setUSE("HandColor"))
                .setGeometry(new Cylinder().setHeight(2.85).setRadius(0.15)))))
          .addChild(new Transform().setRotation(0.0,0.0,1.0,0.45)
            .addChild(new Transform().setUSE("vein")))
          .addChild(new Transform().setRotation(0.0,0.0,1.0,-0.15)
            .addChild(new Transform().setUSE("vein")))
          .addChild(new Transform().setRotation(0.0,0.0,1.0,-0.45)
            .addChild(new Transform().setUSE("vein")))
          .addChild(new Transform().setRotation(0.0,0.0,1.0,1.15)
            .addChild(new Transform().setTranslation(0.0,0.875,0.0)
              .addChild(new Shape()
                .setAppearance(new Appearance().setUSE("HandColor"))
                .setGeometry(new Cylinder().setHeight(1.75).setRadius(0.15)))))))
      .addChild(new Group("hand")
        .addChild(new Transform().setUSE("finger1"))
        .addChild(new Transform().setTranslation(0.8,0.0,0.0)
          .addChild(new Transform().setUSE("finger2"))
          .addChild(new Transform().setTranslation(0.8,0.0,0.0)
            .addChild(new Transform().setUSE("finger3"))
            .addChild(new Transform().setTranslation(0.8,0.0,0.0)
              .addChild(new Transform().setUSE("finger4")))))
        .addChild(new Transform().setTranslation(-0.4,-2.0,0.0)
          .addChild(new Transform().setUSE("thumb")))
        .addChild(new Transform().setTranslation(1.2,-2.2,0.0)
          .addChild(new Group().setUSE("palm")))))
    .addChild(new Transform().setRotation(0.0,1.0,0.0,1.0).setTranslation(0.0,-2.0,0.0)
      .addChild(new Transform().setRotation(1.0,0.0,0.0,1.9)
        .addChild(new Group().setUSE("hand"))))
    .addChild(new Transform().setRotation(1.0,0.0,1.0,0.3).setTranslation(1.5,1.0,0.0)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(1.0,0.0,0.0)))
        .setGeometry(new Cone())))
    .addChild(new Transform().setTranslation(2.0,3.0,-0.5)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(1.0,1.0,0.0)))
        .setGeometry(new Sphere())))
    .addChild(new Transform().setRotation(1.0,0.0,0.2,0.82).setTranslation(-0.6,0.8,0.5)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(0.0,0.7,1.0)))
        .setGeometry(new Cylinder().setHeight(1.5).setRadius(0.75))))
    .addChild(new Transform().setRotation(1.0,0.0,0.7,1.3).setTranslation(0.0,2.6,-1.1)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(0.0,1.0,0.0)))
        .setGeometry(new Box().setSize(1.25,1.25,1.25)))));
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
	 * @return Hand model
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
        X3D thisExampleX3dModel = new Hand().getX3dModel();
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
                System.out.println("WARNING: \"Vrml2Sourcebook.Siggraph98Course.Hand\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
        else if (hasArguments) // if no arguments provided, this method produces usage warning
                thisExampleX3dModel.handleArguments(args);
	
        if (validate)
        {
            //  System.out.println("--- TODO fix duplicated outputs ---"); // omit when duplicated outputs problem is solved/refactored
		String validationResults = thisExampleX3dModel.validationReport();
            //  System.out.println("-----------------------------------"); // omit when duplicated outputs problem is solved/refactored
                System.out.print("Vrml2Sourcebook.Siggraph98Course.Hand self-validation test results: ");
                if (!validationResults.equals("success"))
                    System.out.println();
                System.out.println(validationResults.trim());
        }
    }
}
