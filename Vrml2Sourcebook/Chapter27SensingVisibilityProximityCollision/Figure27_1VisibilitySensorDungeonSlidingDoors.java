package Vrml2Sourcebook.Chapter27SensingVisibilityProximityCollision;

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
import org.web3d.x3d.jsail.EnvironmentalSensor.*;
import org.web3d.x3d.jsail.fields.*;
import org.web3d.x3d.jsail.Grouping.*;
import org.web3d.x3d.jsail.Interpolation.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.Networking.*;
import org.web3d.x3d.jsail.Sound.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc metadata annotations follow, see below for X3DJSAIL Java source code.
/**
 * <p> A dungeon door that slides open when visible, and slides closed when not visible. When you are look away from the door it goes shut, then it reopens when you look back. Page up/down between the first two viewpoints to observe this behavior. Arrow keys also help you peek left/right. Interesting side effect: users can't back up through the closed door. </p>
 <p> Related links: <a href="../../../Chapter27SensingVisibilityProximityCollision/Figure27_1VisibilitySensorDungeonSlidingDoors.java">Figure27_1VisibilitySensorDungeonSlidingDoors.java</a> source, <a href="../../../Chapter27SensingVisibilityProximityCollision/Figure27_1VisibilitySensorDungeonSlidingDoorsIndex.html" target="_top">Figure27_1VisibilitySensorDungeonSlidingDoors catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter27SensingVisibilityProximityCollision/Figure27_1VisibilitySensorDungeonSlidingDoors.x3d">Figure27_1VisibilitySensorDungeonSlidingDoors.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Figure 27.1, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://www.wiley.com/legacy/compbooks/vrml2sbk/ch27/27fig01.htm" target="_blank">http://www.wiley.com/legacy/compbooks/vrml2sbk/ch27/27fig01.htm</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translator </i> </td>
			<td> Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 26 October 2000 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> Image </i> </td>
			<td> <a href="../../../Chapter27SensingVisibilityProximityCollision/Figure27_1VisibilitySensorDungeonSlidingDoors.png">Figure27_1VisibilitySensorDungeonSlidingDoors.png</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> A dungeon door that slides open when visible, and slides closed when not visible. When you are look away from the door it goes shut, then it reopens when you look back. Page up/down between the first two viewpoints to observe this behavior. Arrow keys also help you peek left/right. Interesting side effect: users can't back up through the closed door. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter27SensingVisibilityProximityCollision/Figure27_1VisibilitySensorDungeonSlidingDoors.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter27SensingVisibilityProximityCollision/Figure27_1VisibilitySensorDungeonSlidingDoors.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../Chapter27SensingVisibilityProximityCollision/../../license.html">../../license.html</a> </td>
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

	* @author Figure 27.1, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland
 */

public class Figure27_1VisibilitySensorDungeonSlidingDoors
{
	/** Default constructor to create this object. */
	public Figure27_1VisibilitySensorDungeonSlidingDoors ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
            try { // catch-all
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_0)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("Figure27_1VisibilitySensorDungeonSlidingDoors.x3d"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Figure 27.1, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.wiley.com/legacy/compbooks/vrml2sbk/ch27/27fig01.htm"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("26 October 2000"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("Figure27_1VisibilitySensorDungeonSlidingDoors.png"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("A dungeon door that slides open when visible, and slides closed when not visible. When you are look away from the door it goes shut, then it reopens when you look back. Page up/down between the first two viewpoints to observe this behavior. Arrow keys also help you peek left/right. Interesting side effect: users can't back up through the closed door."))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter27SensingVisibilityProximityCollision/Figure27_1VisibilitySensorDungeonSlidingDoors.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../../license.html")))
  .setScene(new Scene()
    .addChild(new Viewpoint().setDescription("Now doors open, because they are visible").setFieldOfView(1.05).setPosition(0.0,2.0,10.0))
    .addChild(new Viewpoint().setDescription("Now doors close, because they are not visible").setFieldOfView(1.05).setOrientation(0.0,1.0,0.0,-0.85).setPosition(0.0,2.0,5.0))
    .addChild(new NavigationInfo().setAvatarSize(new double[] {0.5,1.6,0.5}).setHeadlight(false).setSpeed(2).setType("\"WALK\" \"EXAMINE\" \"ANY\""))
    .addChild(new Group()
      .addChild(new LOD().setRange(new double[] {20.0})
        .addChild(new Inline("DungeonRoom").setUrl(new String[] {"../Chapter25LevelOfDetail/Figure25_08DungeonRoom.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter25LevelOfDetail/Figure25_08DungeonRoom.x3d","../Chapter25LevelOfDetail/Figure25_08DungeonRoom.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter25LevelOfDetail/Figure25_08DungeonRoom.wrl"}))
        .addChild(new WorldInfo().setInfo(new String[] {"null node"})))
      .addChild(new Transform().setTranslation(0.0,0.0,-10.0)
        .addChild(new LOD().setRange(new double[] {20.0})
          .addChild(new Inline().setUSE("DungeonRoom"))
          .addChild(new WorldInfo().setInfo(new String[] {"null node"}))))
      .addChild(new Transform().setTranslation(0.0,0.0,-5.0)
        .addChild(new Inline().setUrl(new String[] {"../Chapter25LevelOfDetail/Figure25_10DungeonWallWithDoorway.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter25LevelOfDetail/Figure25_10DungeonWallWithDoorway.x3d","../Chapter25LevelOfDetail/Figure25_10DungeonWallWithDoorway.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter25LevelOfDetail/Figure25_10DungeonWallWithDoorway.wrl"})))
      .addChild(new Transform().setRotation(0.0,1.0,0.0,1.57).setScale(1.0,1.0,2.0).setTranslation(0.0,0.0,-15.0)
        .addChild(new Inline().setUrl(new String[] {"../Chapter25LevelOfDetail/Figure25_07DungeonRoomWall.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter25LevelOfDetail/Figure25_07DungeonRoomWall.x3d","../Chapter25LevelOfDetail/Figure25_07DungeonRoomWall.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter25LevelOfDetail/Figure25_07DungeonRoomWall.wrl"})))
      .addChild(new Transform().setTranslation(0.0,0.0,-4.95)
        .addChild(new Transform("LeftDoor")
          .addChild(new Transform().setTranslation(-0.75,0.0,0.0)
            .addChild(new Inline("Door").setUrl(new String[] {"../Chapter25LevelOfDetail/Figure25_11DungeonDoor.x3d","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter25LevelOfDetail/Figure25_11DungeonDoor.x3d","../Chapter25LevelOfDetail/Figure25_11DungeonDoor.wrl","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter25LevelOfDetail/Figure25_11DungeonDoor.wrl"}))))
        .addChild(new Transform("RightDoor")
          .addChild(new Transform().setTranslation(0.75,0.0,0.0)
            .addChild(new Inline().setUSE("Door"))))
        .addChild(new VisibilitySensor("DoorSense").setCenter(0.0,1.75,0.0).setSize(3.0,2.5,1.0)))
      .addChild(new Sound().setMaxBack(60).setMaxFront(60).setMinBack(20).setMinFront(20)
        .setSource(new AudioClip("OpenSound").setDescription("door clunks open").setUrl(new String[] {"clunk1.wav","../Chapter27SensingVisibilityProximityCollision/clunk1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter27SensingVisibilityProximityCollision/clunk1.wav"})))
      .addChild(new Sound().setMaxBack(60).setMaxFront(60).setMinBack(20).setMinFront(20)
        .setSource(new AudioClip("CloseSound").setDescription("door clunks shut").setUrl(new String[] {"clunk1.wav","../Chapter27SensingVisibilityProximityCollision/clunk1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter27SensingVisibilityProximityCollision/clunk1.wav"})))
      .addChild(new TimeSensor("OpenClock").setCycleInterval(2))
      .addChild(new TimeSensor("CloseClock").setCycleInterval(2))
      .addChild(new PositionInterpolator("LeftOpen").setKey(new double[] {0.0,1.0}).setKeyValue(new MFVec3f(new double[] {0.0,0.0,0.0,-1.3,0.0,0.0})))
      .addChild(new PositionInterpolator("LeftClose").setKey(new double[] {0.0,1.0}).setKeyValue(new MFVec3f(new double[] {-1.3,0.0,0.0,0.0,0.0,0.0})))
      .addChild(new PositionInterpolator("RightOpen").setKey(new double[] {0.0,1.0}).setKeyValue(new MFVec3f(new double[] {0.0,0.0,0.0,1.3,0.0,0.0})))
      .addChild(new PositionInterpolator("RightClose").setKey(new double[] {0.0,1.0}).setKeyValue(new MFVec3f(new double[] {1.3,0.0,0.0,0.0,0.0,0.0}))))
    .addComments(" open door ")
    .addChild(new ROUTE().setFromNode("DoorSense").setFromField("enterTime").setToNode("OpenSound").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("DoorSense").setFromField("exitTime").setToNode("OpenSound").setToField("set_stopTime"))
    .addChild(new ROUTE().setFromNode("DoorSense").setFromField("enterTime").setToNode("OpenClock").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("DoorSense").setFromField("exitTime").setToNode("OpenClock").setToField("set_stopTime"))
    .addComments(" close door ")
    .addChild(new ROUTE().setFromNode("DoorSense").setFromField("exitTime").setToNode("CloseSound").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("DoorSense").setFromField("enterTime").setToNode("CloseSound").setToField("set_stopTime"))
    .addChild(new ROUTE().setFromNode("DoorSense").setFromField("exitTime").setToNode("CloseClock").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("DoorSense").setFromField("enterTime").setToNode("CloseClock").setToField("set_stopTime"))
    .addComments(" door timers ")
    .addChild(new ROUTE().setFromNode("OpenClock").setFromField("fraction_changed").setToNode("LeftOpen").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("OpenClock").setFromField("fraction_changed").setToNode("RightOpen").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("CloseClock").setFromField("fraction_changed").setToNode("LeftClose").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("CloseClock").setFromField("fraction_changed").setToNode("RightClose").setToField("set_fraction"))
    .addComments(" door translations ")
    .addChild(new ROUTE().setFromNode("LeftOpen").setFromField("value_changed").setToNode("LeftDoor").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("RightOpen").setFromField("value_changed").setToNode("RightDoor").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("LeftClose").setFromField("value_changed").setToNode("LeftDoor").setToField("set_translation"))
    .addChild(new ROUTE().setFromNode("RightClose").setFromField("value_changed").setToNode("RightDoor").setToField("set_translation")));
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
	 * @return Figure27_1VisibilitySensorDungeonSlidingDoors model
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
        X3D thisExampleX3dModel = new Figure27_1VisibilitySensorDungeonSlidingDoors().getX3dModel();
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
                System.out.println("WARNING: \"Vrml2Sourcebook.Chapter27SensingVisibilityProximityCollision.Figure27_1VisibilitySensorDungeonSlidingDoors\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
        else if (hasArguments) // if no arguments provided, this method produces usage warning
                thisExampleX3dModel.handleArguments(args);
	
        if (validate)
        {
            //  System.out.println("--- TODO fix duplicated outputs ---"); // omit when duplicated outputs problem is solved/refactored
		String validationResults = thisExampleX3dModel.validationReport();
            //  System.out.println("-----------------------------------"); // omit when duplicated outputs problem is solved/refactored
                System.out.print("Vrml2Sourcebook.Chapter27SensingVisibilityProximityCollision.Figure27_1VisibilitySensorDungeonSlidingDoors self-validation test results: ");
                if (!validationResults.equals("success"))
                    System.out.println();
                System.out.println(validationResults.trim());
        }
    }
}
