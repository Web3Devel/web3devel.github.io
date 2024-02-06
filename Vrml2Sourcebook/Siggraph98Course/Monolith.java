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
import org.web3d.x3d.jsail.Networking.*;
import org.web3d.x3d.jsail.PointingDeviceSensor.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Texturing.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc metadata annotations follow, see below for X3DJSAIL Java source code.
/**
 * <p> Monolith world: six vertical monoliths stand arranged together. Touching a monolith starts it glowing in a pulsing fashion. </p>
 <p> Related links: <a href="../../../Siggraph98Course/Monolith.java">Monolith.java</a> source, <a href="../../../Siggraph98Course/MonolithIndex.html" target="_top">Monolith catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Siggraph98Course/Monolith.x3d">Monolith.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Monolith world: six vertical monoliths stand arranged together. Touching a monolith starts it glowing in a pulsing fashion. </td>
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
			<td> originals/monolith.wrl </td>
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
			<td> <a href="http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0145.htm" target="_blank">http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0145.htm</a> </td>
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
			<td> <a href="https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Monolith.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Monolith.x3d</a> </td>
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

public class Monolith
{
	/** Default constructor to create this object. */
	public Monolith ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
            try { // catch-all
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("Monolith.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Monolith world: six vertical monoliths stand arranged together. Touching a monolith starts it glowing in a pulsing fashion."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("David R. Nadeau"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 July 1998"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("2 February 2014"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("originals/monolith.wrl"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98/conference/courses/18.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0145.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Monolith.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addComments(" TouchSensors on the monoliths route to TimeSensors, one per monolith. Each TimeSensor routes to the intensity field of a PointLight placed just in front of the monolith. Simultaneously, a monolith's TimeSensor routes to the transparency field on a Material for a Box surrounding the monolith. ")
    .addComments(" As a monolith's TimeSensor fraction ramps up from 0.0 to 1.0, the PointLight intensity ramps up from 0.0 (off) to 1.0 (full on). At the same time, the monolith's outer box transparency ramps from 0.0 (opaque) to 1.0 (transparent). As the transparency increases, an emissive textured inner box for the monolith becomes visible. The inner box's emissive shading makes it appear to be a light source, and the plausible source of the PointLight source's illumination. The overall effect is one of pulsing glowing monoliths. ")
    .addComments(" A grid mesh floor is used so that localized lighting effects will be obvious. ")
    .addComments(" Things to experiment with: ")
    .addComments(" Try adding a ScalarInterpolator to each monolith and route it's output in to the rotation field of the monolith's TextureTransform. This will rotate the texture on the monolith. ")
    .addComments(" Instead of the transparent box trick, try using a ColorInterpolator to gradually increase the emissiveColor of a single monolith box while decreasing the box's diffuseColor. ")
    .addComments(" Try routing the TimeSensor's outputs in to a ScalarInterpolator that varies up and down smoothly, then route this output in to the light source's intensity, etc. Instead of the 0.1-1.0 ramp, then instant fall to 0.0 that the TimeSensor's fraction output gives, you can shape an arbitrary smooth rise and fall curve in the Scalar Interpolator's key values. ")
    .addChild(new WorldInfo().setInfo(new String[] {"Copyright (c) 1997, David R. Nadeau"}).setTitle("Monolith World"))
    .addChild(new Viewpoint().setDescription("Monolith Entry View").setPosition(0.0,1.6,9.0))
    .addChild(new NavigationInfo().setHeadlight(false).setType("\"WALK\" \"ANY\""))
    .addChild(new Background().setSkyAngle(new double[] {1.37,1.57}).setSkyColor(new MFColor(new double[] {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.1,0.5})))
    .addChild(new PointLight().setAmbientIntensity(0.1).setColor(0.2,0.2,0.2).setLocation(0.0,8.0,10.0))
    .addChild(new PointLight("Monolith1Light").setAmbientIntensity(0.2).setColor(0.8,0.4,0.0).setIntensity(0.0).setLocation(0.0,2.0,0.5))
    .addChild(new Transform().setTranslation(0.0,2.0,0.0)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material("Monolith1Facade").setDiffuseColor(0.2,0.2,0.2).setTransparency(1.0)))
        .setGeometry(new Box("MonolithOuterBox").setSize(2.0,4.0,0.3)))
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setTextureTransform(new TextureTransform().setScale(0.5,0.5))
          .setTexture(new ImageTexture("MonolithInnerFire").setUrl(new String[] {"fire.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/fire.jpg"})))
        .setGeometry(new Box("MonolithInnerBox").setSize(1.9,3.9,0.2)))
      .addChild(new TouchSensor("Monolith1Touch")))
    .addChild(new PointLight("Monolith2Light").setAmbientIntensity(0.2).setColor(0.8,0.4,0.0).setIntensity(0.0).setLocation(-3.0,2.0,2.5))
    .addChild(new Transform().setTranslation(-3.0,2.0,2.0)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material("Monolith2Facade").setDiffuseColor(0.2,0.2,0.2).setTransparency(1.0)))
        .setGeometry(new Box().setUSE("MonolithOuterBox")))
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setTextureTransform(new TextureTransform().setScale(0.3,0.3).setTranslation(0.2,0.2))
          .setTexture(new ImageTexture().setUSE("MonolithInnerFire")))
        .setGeometry(new Box().setUSE("MonolithInnerBox")))
      .addChild(new TouchSensor("Monolith2Touch")))
    .addChild(new PointLight("Monolith3Light").setAmbientIntensity(0.2).setColor(0.8,0.4,0.0).setIntensity(0.0).setLocation(4.0,2.0,-1.5))
    .addChild(new Transform().setTranslation(4.0,2.0,-2.0)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material("Monolith3Facade").setDiffuseColor(0.2,0.2,0.2).setTransparency(1.0)))
        .setGeometry(new Box().setUSE("MonolithOuterBox")))
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setTextureTransform(new TextureTransform().setScale(0.1,0.1).setTranslation(0.3,0.5))
          .setTexture(new ImageTexture().setUSE("MonolithInnerFire")))
        .setGeometry(new Box().setUSE("MonolithInnerBox")))
      .addChild(new TouchSensor("Monolith3Touch")))
    .addChild(new PointLight("Monolith4Light").setAmbientIntensity(0.2).setColor(0.8,0.4,0.0).setIntensity(0.0).setLocation(4.5,2.0,3.5))
    .addChild(new Transform().setTranslation(4.5,2.0,3.0)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material("Monolith4Facade").setDiffuseColor(0.2,0.2,0.2).setTransparency(1.0)))
        .setGeometry(new Box().setUSE("MonolithOuterBox")))
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setTextureTransform(new TextureTransform().setScale(0.2,0.2).setTranslation(0.4,0.6))
          .setTexture(new ImageTexture().setUSE("MonolithInnerFire")))
        .setGeometry(new Box().setUSE("MonolithInnerBox")))
      .addChild(new TouchSensor("Monolith4Touch")))
    .addChild(new PointLight("Monolith5Light").setAmbientIntensity(0.2).setColor(0.8,0.4,0.0).setIntensity(0.0).setLocation(-3.5,2.0,-4.5))
    .addChild(new Transform().setTranslation(-3.5,2.0,-5.0)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material("Monolith5Facade").setDiffuseColor(0.2,0.2,0.2).setTransparency(1.0)))
        .setGeometry(new Box().setUSE("MonolithOuterBox")))
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setTextureTransform(new TextureTransform().setScale(0.2,0.4).setTranslation(0.5,0.1))
          .setTexture(new ImageTexture().setUSE("MonolithInnerFire")))
        .setGeometry(new Box().setUSE("MonolithInnerBox")))
      .addChild(new TouchSensor("Monolith5Touch")))
    .addChild(new PointLight("Monolith6Light").setAmbientIntensity(0.2).setColor(0.8,0.4,0.0).setIntensity(0.0).setLocation(2.0,2.0,-5.5))
    .addChild(new Transform().setTranslation(2.0,2.0,-6.0)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setMaterial(new Material("Monolith6Facade").setDiffuseColor(0.2,0.2,0.2).setTransparency(1.0)))
        .setGeometry(new Box().setUSE("MonolithOuterBox")))
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setTextureTransform(new TextureTransform().setScale(0.2,0.4).setTranslation(0.5,0.1))
          .setTexture(new ImageTexture().setUSE("MonolithInnerFire")))
        .setGeometry(new Box().setUSE("MonolithInnerBox")))
      .addChild(new TouchSensor("Monolith6Touch")))
    .addChild(new Inline().setUrl(new String[] {"Floor.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Floor.x3d","Floor.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Floor.wrl"}))
    .addChild(new TimeSensor("Monolith1Timer").setCycleInterval(4.0).setStopTime(0.1))
    .addChild(new ROUTE().setFromNode("Monolith1Touch").setFromField("touchTime").setToNode("Monolith1Timer").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("Monolith1Timer").setFromField("fraction_changed").setToNode("Monolith1Facade").setToField("set_transparency"))
    .addChild(new ROUTE().setFromNode("Monolith1Timer").setFromField("fraction_changed").setToNode("Monolith1Light").setToField("set_intensity"))
    .addChild(new TimeSensor("Monolith2Timer").setCycleInterval(4.5).setStopTime(0.1))
    .addChild(new ROUTE().setFromNode("Monolith2Touch").setFromField("touchTime").setToNode("Monolith2Timer").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("Monolith2Timer").setFromField("fraction_changed").setToNode("Monolith2Facade").setToField("set_transparency"))
    .addChild(new ROUTE().setFromNode("Monolith2Timer").setFromField("fraction_changed").setToNode("Monolith2Light").setToField("set_intensity"))
    .addChild(new TimeSensor("Monolith3Timer").setCycleInterval(5.0).setStopTime(0.1))
    .addChild(new ROUTE().setFromNode("Monolith3Touch").setFromField("touchTime").setToNode("Monolith3Timer").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("Monolith3Timer").setFromField("fraction_changed").setToNode("Monolith3Facade").setToField("set_transparency"))
    .addChild(new ROUTE().setFromNode("Monolith3Timer").setFromField("fraction_changed").setToNode("Monolith3Light").setToField("set_intensity"))
    .addChild(new TimeSensor("Monolith4Timer").setCycleInterval(5.5).setStopTime(0.1))
    .addChild(new ROUTE().setFromNode("Monolith4Touch").setFromField("touchTime").setToNode("Monolith4Timer").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("Monolith4Timer").setFromField("fraction_changed").setToNode("Monolith4Facade").setToField("set_transparency"))
    .addChild(new ROUTE().setFromNode("Monolith4Timer").setFromField("fraction_changed").setToNode("Monolith4Light").setToField("set_intensity"))
    .addChild(new TimeSensor("Monolith5Timer").setCycleInterval(6.0).setStopTime(0.1))
    .addChild(new ROUTE().setFromNode("Monolith5Touch").setFromField("touchTime").setToNode("Monolith5Timer").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("Monolith5Timer").setFromField("fraction_changed").setToNode("Monolith5Facade").setToField("set_transparency"))
    .addChild(new ROUTE().setFromNode("Monolith5Timer").setFromField("fraction_changed").setToNode("Monolith5Light").setToField("set_intensity"))
    .addChild(new TimeSensor("Monolith6Timer").setCycleInterval(6.5).setStopTime(0.1))
    .addChild(new ROUTE().setFromNode("Monolith6Touch").setFromField("touchTime").setToNode("Monolith6Timer").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("Monolith6Timer").setFromField("fraction_changed").setToNode("Monolith6Facade").setToField("set_transparency"))
    .addChild(new ROUTE().setFromNode("Monolith6Timer").setFromField("fraction_changed").setToNode("Monolith6Light").setToField("set_intensity")));
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
	 * @return Monolith model
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
        X3D thisExampleX3dModel = new Monolith().getX3dModel();
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
                System.out.println("WARNING: \"Vrml2Sourcebook.Siggraph98Course.Monolith\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
        else if (hasArguments) // if no arguments provided, this method produces usage warning
                thisExampleX3dModel.handleArguments(args);
	
        if (validate)
        {
            //  System.out.println("--- TODO fix duplicated outputs ---"); // omit when duplicated outputs problem is solved/refactored
		String validationResults = thisExampleX3dModel.validationReport();
            //  System.out.println("-----------------------------------"); // omit when duplicated outputs problem is solved/refactored
                System.out.print("Vrml2Sourcebook.Siggraph98Course.Monolith self-validation test results: ");
                if (!validationResults.equals("success"))
                    System.out.println();
                System.out.println(validationResults.trim());
        }
    }
}
