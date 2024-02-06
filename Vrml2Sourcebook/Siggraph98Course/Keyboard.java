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
import org.web3d.x3d.jsail.Lighting.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.PointingDeviceSensor.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Sound.*;

// Javadoc metadata annotations follow, see below for X3DJSAIL Java source code.
/**
 * <p> Synthesizer keyboard that creates a playable synthesizer keyboard. Each key on the keyboard has a sound and touch sensor associated with it. Touching a key triggers the touch sensor, which triggers the sound. </p>
 <p> Related links: <a href="../../../Siggraph98Course/Keyboard.java">Keyboard.java</a> source, <a href="../../../Siggraph98Course/KeyboardIndex.html" target="_top">Keyboard catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Siggraph98Course/Keyboard.x3d">Keyboard.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Synthesizer keyboard that creates a playable synthesizer keyboard. Each key on the keyboard has a sound and touch sensor associated with it. Touching a key triggers the touch sensor, which triggers the sound. </td>
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
			<td> originals/keybd.wrl </td>
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
			<td> <a href="http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0345.htm" target="_blank">http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0345.htm</a> </td>
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
			<td> <a href="https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Keyboard.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Keyboard.x3d</a> </td>
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

public class Keyboard
{
	/** Default constructor to create this object. */
	public Keyboard ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
            try { // catch-all
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("Keyboard.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Synthesizer keyboard that creates a playable synthesizer keyboard. Each key on the keyboard has a sound and touch sensor associated with it. Touching a key triggers the touch sensor, which triggers the sound."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("David R. Nadeau"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 July 1998"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("2 February 2014"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("originals/keybd.wrl"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98/conference/courses/18.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0345.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/Keyboard.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addComments(" Things to experiment with... ")
    .addComments(" Use a Script to trigger sounds on **Mouse button down** not up. Huh, you say? Well, a TouchSensor generates a touch time event on mouse down, not up. Since means that sounds triggered by a TouchSensor seem to happen late... they happen when you release the mouse button, not when you press it. But, a TouchSensor sends a TRUE on it's isActive output on mouse down. So, you could route that into a Script node and grab the associated time stamp, then send THAT out as an event to start the sound. This will remove the lag and make sounds more responsive. ")
    .addChild(new WorldInfo().setInfo(new String[] {"Copyright (c) 1997, David R. Nadeau"}).setTitle("Synthesizer keyboard"))
    .addChild(new Viewpoint().setDescription("Entry view").setOrientation(1.0,0.0,0.0,-0.785).setPosition(0.875,1.5,1.5))
    .addChild(new NavigationInfo().setHeadlight(false))
    .addChild(new DirectionalLight().setDirection(1.0,-2.0,-0.5))
    .addChild(new Transform()
      .addChild(new Shape("WhiteKey")
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(1.0,1.0,1.0)))
        .setGeometry(new Box().setSize(0.23,0.1,1.5)))
      .addChild(new TouchSensor("C4"))
      .addChild(new Sound().setMaxBack(100.0).setMaxFront(100.0)
        .setSource(new AudioClip("PitchC4").setUrl(new String[] {"tone1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tone1.wav"}))))
    .addChild(new Transform().setTranslation(0.125,0.1,-0.375)
      .addChild(new Shape("BlackKey")
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(0.4,0.4,0.4)))
        .setGeometry(new Box().setSize(0.2,0.1,0.75)))
      .addChild(new TouchSensor("Cs4"))
      .addChild(new Sound().setMaxBack(100.0).setMaxFront(100.0)
        .setSource(new AudioClip("PitchCs4").setPitch(1.059).setUrl(new String[] {"tone1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tone1.wav"}))))
    .addChild(new Transform().setTranslation(0.25,0.0,0.0)
      .addChild(new Shape().setUSE("WhiteKey"))
      .addChild(new TouchSensor("D4"))
      .addChild(new Sound().setMaxBack(100.0).setMaxFront(100.0)
        .setSource(new AudioClip("PitchD4").setPitch(1.122).setUrl(new String[] {"tone1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tone1.wav"}))))
    .addChild(new Transform().setTranslation(0.375,0.1,-0.375)
      .addChild(new Shape().setUSE("BlackKey"))
      .addChild(new TouchSensor("Ds4"))
      .addChild(new Sound().setMaxBack(100.0).setMaxFront(100.0)
        .setSource(new AudioClip("PitchDs4").setPitch(1.189).setUrl(new String[] {"tone1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tone1.wav"}))))
    .addChild(new Transform().setTranslation(0.5,0.0,0.0)
      .addChild(new Shape().setUSE("WhiteKey"))
      .addChild(new TouchSensor("E4"))
      .addChild(new Sound().setMaxBack(100.0).setMaxFront(100.0)
        .setSource(new AudioClip("PitchE4").setPitch(1.26).setUrl(new String[] {"tone1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tone1.wav"}))))
    .addChild(new Transform().setTranslation(0.75,0.0,0.0)
      .addChild(new Shape().setUSE("WhiteKey"))
      .addChild(new TouchSensor("F4"))
      .addChild(new Sound().setMaxBack(100.0).setMaxFront(100.0)
        .setSource(new AudioClip("PitchF4").setPitch(1.335).setUrl(new String[] {"tone1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tone1.wav"}))))
    .addChild(new Transform().setTranslation(0.875,0.1,-0.375)
      .addChild(new Shape().setUSE("BlackKey"))
      .addChild(new TouchSensor("Fs4"))
      .addChild(new Sound().setMaxBack(100.0).setMaxFront(100.0)
        .setSource(new AudioClip("PitchFs4").setPitch(1.414).setUrl(new String[] {"tone1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tone1.wav"}))))
    .addChild(new Transform().setTranslation(1.0,0.0,0.0)
      .addChild(new Shape().setUSE("WhiteKey"))
      .addChild(new TouchSensor("G4"))
      .addChild(new Sound().setMaxBack(100.0).setMaxFront(100.0)
        .setSource(new AudioClip("PitchG4").setPitch(1.498).setUrl(new String[] {"tone1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tone1.wav"}))))
    .addChild(new Transform().setTranslation(1.125,0.1,-0.375)
      .addChild(new Shape().setUSE("BlackKey"))
      .addChild(new TouchSensor("Gs4"))
      .addChild(new Sound().setMaxBack(100.0).setMaxFront(100.0)
        .setSource(new AudioClip("PitchGs4").setPitch(1.587).setUrl(new String[] {"tone1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tone1.wav"}))))
    .addChild(new Transform().setTranslation(1.25,0.0,0.0)
      .addChild(new Shape().setUSE("WhiteKey"))
      .addChild(new TouchSensor("A5"))
      .addChild(new Sound().setMaxBack(100.0).setMaxFront(100.0)
        .setSource(new AudioClip("PitchA5").setPitch(1.682).setUrl(new String[] {"tone1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tone1.wav"}))))
    .addChild(new Transform().setTranslation(1.375,0.1,-0.375)
      .addChild(new Shape().setUSE("BlackKey"))
      .addChild(new TouchSensor("As5"))
      .addChild(new Sound().setMaxBack(100.0).setMaxFront(100.0)
        .setSource(new AudioClip("PitchAs5").setPitch(1.782).setUrl(new String[] {"tone1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tone1.wav"}))))
    .addChild(new Transform().setTranslation(1.5,0.0,0.0)
      .addChild(new Shape().setUSE("WhiteKey"))
      .addChild(new TouchSensor("B5"))
      .addChild(new Sound().setMaxBack(100.0).setMaxFront(100.0)
        .setSource(new AudioClip("PitchB5").setPitch(1.888).setUrl(new String[] {"tone1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tone1.wav"}))))
    .addChild(new Transform().setTranslation(1.75,0.0,0.0)
      .addChild(new Shape().setUSE("WhiteKey"))
      .addChild(new TouchSensor("C5"))
      .addChild(new Sound().setMaxBack(100.0).setMaxFront(100.0)
        .setSource(new AudioClip("PitchC5").setPitch(2.0).setUrl(new String[] {"tone1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/tone1.wav"}))))
    .addChild(new ROUTE().setFromNode("C4").setFromField("touchTime").setToNode("PitchC4").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("Cs4").setFromField("touchTime").setToNode("PitchCs4").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("D4").setFromField("touchTime").setToNode("PitchD4").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("Ds4").setFromField("touchTime").setToNode("PitchDs4").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("E4").setFromField("touchTime").setToNode("PitchE4").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("F4").setFromField("touchTime").setToNode("PitchF4").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("Fs4").setFromField("touchTime").setToNode("PitchFs4").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("G4").setFromField("touchTime").setToNode("PitchG4").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("Gs4").setFromField("touchTime").setToNode("PitchGs4").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("A5").setFromField("touchTime").setToNode("PitchA5").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("As5").setFromField("touchTime").setToNode("PitchAs5").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("B5").setFromField("touchTime").setToNode("PitchB5").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("C5").setFromField("touchTime").setToNode("PitchC5").setToField("set_startTime")));
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
	 * @return Keyboard model
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
        X3D thisExampleX3dModel = new Keyboard().getX3dModel();
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
                System.out.println("WARNING: \"Vrml2Sourcebook.Siggraph98Course.Keyboard\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
        else if (hasArguments) // if no arguments provided, this method produces usage warning
                thisExampleX3dModel.handleArguments(args);
	
        if (validate)
        {
            //  System.out.println("--- TODO fix duplicated outputs ---"); // omit when duplicated outputs problem is solved/refactored
		String validationResults = thisExampleX3dModel.validationReport();
            //  System.out.println("-----------------------------------"); // omit when duplicated outputs problem is solved/refactored
                System.out.print("Vrml2Sourcebook.Siggraph98Course.Keyboard self-validation test results: ");
                if (!validationResults.equals("success"))
                    System.out.println();
                System.out.println(validationResults.trim());
        }
    }
}
