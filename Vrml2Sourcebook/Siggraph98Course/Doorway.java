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
import org.web3d.x3d.jsail.EnvironmentalSensor.*;
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Geometry3D.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Interpolation.*;
import org.web3d.x3d.jsail.Lighting.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Networking.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Texturing.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc metadata annotations follow, see below for X3DJSAIL Java source code.
/**
 * <p> The Doorway scene consists of four sliding stairs that lead forward along a path to a glowing white doorway. </p>
 <p> Related links: <a href="../../../Siggraph98Course/Doorway.java">Doorway.java</a> source, <a href="../../../Siggraph98Course/DoorwayIndex.html" target="_top">Doorway catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Siggraph98Course/Doorway.x3d">Doorway.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> The Doorway scene consists of four sliding stairs that lead forward along a path to a glowing white doorway. </td>
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
			<td> originals/doorway.wrl </td>
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
			<td> <a href="https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Doorway.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Doorway.x3d</a> </td>
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

public class Doorway
{
	/** Default constructor to create this object. */
	public Doorway ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
            try { // catch-all
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("Doorway.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("The Doorway scene consists of four sliding stairs that lead forward along a path to a glowing white doorway."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("David R. Nadeau"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 July 1998"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("2 February 2014"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("originals/doorway.wrl"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98/conference/courses/18.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0383.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Doorway.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addComments(" A ProximitySensor routes to four TimeSensors, one per sliding stair. Each stair's timer routes to a PositionInterpolator that outputs varying positions side-to-side along the X axis. The PositionInterpolator's positions are routed into translation fields for Transform nodes surrounding each stair. ")
    .addComments(" By using different starting positions, the four stairs are made to slide back and forth in a pattern. ")
    .addComments(" Things to experiment with: ")
    .addComments(" Add sound! Perhaps the crackling of fire below and the grinding sliding sounds of the stone stairs. ")
    .addComments(" Use a ScalarInterpolator to flicker the red light as if there is fire below. ")
    .addComments(" Surround the doorway with an Anchor node that leads somewhere! ")
    .addComments(" Place a ProximitySensor around the doorway. As you approach it, the ProximitySensor triggers an OrientationInterpolator which slowly rotates the door open. The open door reveals ... ! ")
    .addChild(new WorldInfo().setInfo(new String[] {"Copyright (c) 1997, David R. Nadeau"}).setTitle("The Doorway"))
    .addChild(new Viewpoint("Entry").setDescription("Entry view").setPosition(0.0,3.1,10.0))
    .addChild(new NavigationInfo().setAvatarSize(new double[] {0.5,3.0,1.5}).setHeadlight(false).setType("\"WALK\" \"ANY\""))
    .addChild(new ProximitySensor("Proximity").setSize(10.0,10.0,50.0))
    .addChild(new Background().setSkyAngle(new double[] {1.47,1.67}).setSkyColor(new MFColor(new double[] {0.0,0.0,0.0,0.0,0.0,0.0,1.0,0.0,0.0})))
    .addChild(new DirectionalLight().setAmbientIntensity(0.5).setColor(0.0,0.3,1.0).setDirection(1.0,-1.0,-3.0))
    .addChild(new DirectionalLight().setAmbientIntensity(0.3).setColor(1.0,0.0,0.0).setDirection(-1.0,2.5,-1.0))
    .addChild(new DirectionalLight().setColor(1.0,0.0,0.0).setDirection(-1.0,2.5,-1.0))
    .addChild(new Transform().setTranslation(0.0,-0.5,8.0)
      .addChild(new Shape()
        .setAppearance(new Appearance()
          .setTextureTransform(new TextureTransform().setScale(0.5,0.5))
          .setMaterial(new Material())
          .setTexture(new ImageTexture("Granit").setUrl(new String[] {"granit_g.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/granit_g.jpg"})))
        .setGeometry(new Box().setSize(4.0,0.4,16.0))))
    .addChild(new Transform("Stair1")
      .addChild(new Inline("Stair").setUrl(new String[] {"Tread.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Tread.x3d","Tread.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Tread.wrl"})))
    .addChild(new Transform().setTranslation(-1.0,0.5,-2.0)
      .addChild(new Transform("Stair2")
        .addChild(new Inline().setUSE("Stair"))))
    .addChild(new Transform().setTranslation(1.5,1.0,-4.0)
      .addChild(new Transform("Stair3")
        .addChild(new Inline().setUSE("Stair"))))
    .addChild(new Transform().setTranslation(0.0,1.5,-6.0)
      .addChild(new Transform("Stair4")
        .addChild(new Inline().setUSE("Stair"))))
    .addChild(new Transform().setTranslation(0.0,2.0,-8.0)
      .addChild(new Inline().setUSE("Stair")))
    .addChild(new Transform().setScale(0.7,0.7,0.7).setTranslation(0.0,2.0,-10.0)
      .addChild(new Inline().setUrl(new String[] {"GlowDoor.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/GlowDoor.x3d","GlowDoor.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/GlowDoor.wrl"})))
    .addChild(new Transform().setRotation(0.0,0.0,1.0,0.785).setTranslation(-2.0,6.0,-10.0)
      .addChild(new Shape("ArchBox")
        .setAppearance(new Appearance()
          .setMaterial(new Material().setAmbientIntensity(0.0).setDiffuseColor(1.0,1.0,1.0).setEmissiveColor(0.4,0.4,0.4))
          .setTexture(new ImageTexture().setUrl(new String[] {"marble_g.jpg","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/marble_g.jpg"})))
        .setGeometry(new Box().setSize(4.0,0.2,2.0)))
      .addChild(new Transform().setTranslation(1.0,0.2,1.0)
        .addChild(new Shape().setUSE("ArchBox")))
      .addChild(new Transform().setTranslation(2.0,0.4,2.0)
        .addChild(new Shape().setUSE("ArchBox"))))
    .addChild(new Transform().setRotation(0.0,0.0,1.0,-0.785).setTranslation(2.0,6.0,-10.0)
      .addChild(new Shape().setUSE("ArchBox"))
      .addChild(new Transform().setTranslation(-1.0,0.2,1.0)
        .addChild(new Shape().setUSE("ArchBox")))
      .addChild(new Transform().setTranslation(-2.0,0.4,2.0)
        .addChild(new Shape().setUSE("ArchBox"))))
    .addChild(new TimeSensor("Stair1Timer").setCycleInterval(4.0).setLoop(true))
    .addChild(new PositionInterpolator("Stair1Path").setKey(new double[] {0.0,0.25,0.5,0.75,1.0}).setKeyValue(new MFVec3f(new double[] {0.0,0.0,0.0,3.0,0.0,0.0,0.0,0.0,0.0,-3.0,0.0,0.0,0.0,0.0,0.0})))
    .addChild(new ROUTE().setFromNode("Proximity").setFromField("enterTime").setToNode("Stair1Timer").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("Stair1Timer").setFromField("fraction_changed").setToNode("Stair1Path").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Stair1Path").setFromField("value_changed").setToNode("Stair1").setToField("set_translation"))
    .addChild(new TimeSensor("Stair2Timer").setCycleInterval(4.0).setLoop(true))
    .addChild(new PositionInterpolator("Stair2Path").setKey(new double[] {0.0,0.25,0.5,0.75,1.0}).setKeyValue(new MFVec3f(new double[] {3.0,0.0,0.0,0.0,0.0,0.0,-3.0,0.0,0.0,0.0,0.0,0.0,3.0,0.0,0.0})))
    .addChild(new ROUTE().setFromNode("Proximity").setFromField("enterTime").setToNode("Stair2Timer").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("Stair2Timer").setFromField("fraction_changed").setToNode("Stair2Path").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Stair2Path").setFromField("value_changed").setToNode("Stair2").setToField("set_translation"))
    .addChild(new TimeSensor("Stair3Timer").setCycleInterval(4.0).setLoop(true))
    .addChild(new PositionInterpolator("Stair3Path").setKey(new double[] {0.0,0.25,0.5,0.75,1.0}).setKeyValue(new MFVec3f(new double[] {-3.0,0.0,0.0,0.0,0.0,0.0,3.0,0.0,0.0,0.0,0.0,0.0,-3.0,0.0,0.0})))
    .addChild(new ROUTE().setFromNode("Proximity").setFromField("enterTime").setToNode("Stair3Timer").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("Stair3Timer").setFromField("fraction_changed").setToNode("Stair3Path").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Stair3Path").setFromField("value_changed").setToNode("Stair3").setToField("set_translation"))
    .addChild(new TimeSensor("Stair4Timer").setCycleInterval(4.0).setLoop(true))
    .addChild(new PositionInterpolator("Stair4Path").setKey(new double[] {0.0,0.25,0.5,0.75,1.0}).setKeyValue(new MFVec3f(new double[] {0.0,0.0,0.0,-3.0,0.0,0.0,0.0,0.0,0.0,3.0,0.0,0.0,0.0,0.0,0.0})))
    .addChild(new ROUTE().setFromNode("Proximity").setFromField("enterTime").setToNode("Stair4Timer").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("Stair4Timer").setFromField("fraction_changed").setToNode("Stair4Path").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("Stair4Path").setFromField("value_changed").setToNode("Stair4").setToField("set_translation")));
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
	 * @return Doorway model
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
        X3D thisExampleX3dModel = new Doorway().getX3dModel();
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
                System.out.println("WARNING: \"Vrml2Sourcebook.Siggraph98Course.Doorway\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
        else if (hasArguments) // if no arguments provided, this method produces usage warning
                thisExampleX3dModel.handleArguments(args);
	
        if (validate)
        {
            //  System.out.println("--- TODO fix duplicated outputs ---"); // omit when duplicated outputs problem is solved/refactored
		String validationResults = thisExampleX3dModel.validationReport();
            //  System.out.println("-----------------------------------"); // omit when duplicated outputs problem is solved/refactored
                System.out.print("Vrml2Sourcebook.Siggraph98Course.Doorway self-validation test results: ");
                if (!validationResults.equals("success"))
                    System.out.println();
                System.out.println(validationResults.trim());
        }
    }
}
