package Vrml2Sourcebook.Chapter30Scripts;

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
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.PointingDeviceSensor.*;
import org.web3d.x3d.jsail.Scripting.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Sound.*;
import org.web3d.x3d.jsail.Text.*;

// Javadoc metadata annotations follow, see below for X3DJSAIL Java source code.
/**
 * <p> A pair of filter scripts used to create a toggle on-off switch. </p>
 <p> Related links: <a href="../../../Chapter30Scripts/Figure30_3ScriptSoundActivate.java">Figure30_3ScriptSoundActivate.java</a> source, <a href="../../../Chapter30Scripts/Figure30_3ScriptSoundActivateIndex.html" target="_top">Figure30_3ScriptSoundActivate catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter30Scripts/Figure30_3ScriptSoundActivate.x3d">Figure30_3ScriptSoundActivate.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Figure 30.3, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://www.wiley.com/legacy/compbooks/vrml2sbk/ch30/30fig03.htm" target="_blank">http://www.wiley.com/legacy/compbooks/vrml2sbk/ch30/30fig03.htm</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translator </i> </td>
			<td> Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 29 October 2000 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> A pair of filter scripts used to create a toggle on-off switch. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter30Scripts/Figure30_3ScriptSoundActivate.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter30Scripts/Figure30_3ScriptSoundActivate.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> generator </i> </td>
			<td> X3D-Edit 3.3, <a href="https://savage.nps.edu/X3D-Edit" target="_blank">https://savage.nps.edu/X3D-Edit</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> license </i> </td>
			<td> <a href="../../../Chapter30Scripts/../../license.html">../../license.html</a> </td>
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

	* @author Figure 30.3, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland
 */

public class Figure30_3ScriptSoundActivate
{
	/** Default constructor to create this object. */
	public Figure30_3ScriptSoundActivate ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
            try { // catch-all
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_0)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("Figure30_3ScriptSoundActivate.x3d"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Figure 30.3, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.wiley.com/legacy/compbooks/vrml2sbk/ch30/30fig03.htm"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("29 October 2000"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("A pair of filter scripts used to create a toggle on-off switch."))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter30Scripts/Figure30_3ScriptSoundActivate.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("Figure30_3ScriptSoundActivate.x3d"))
    .addChild(new Viewpoint().setDescription("toggle sound by clicking ball"))
    .addChild(new Viewpoint().setDescription("move left spatialize right").setPosition(-5.0,0.0,10.0))
    .addChild(new Viewpoint().setDescription("move right spatialize left").setPosition(5.0,0.0,10.0))
    .addChild(new Viewpoint().setDescription("outside maximum attenuation ellipsoid").setPosition(0.0,0.0,30.0))
    .addChild(new NavigationInfo().setType("\"NONE\""))
    .addComments(" Background nodes are usually best placed at the top of the scene since they have global effect and are bindable nodes. ")
    .addChild(new Background().setGroundAngle(new double[] {1.309,1.570796}).setGroundColor(new MFColor(new double[] {0.1,0.1,0.0,0.5,0.25,0.2,0.6,0.6,0.2})).setSkyAngle(new double[] {1.309,1.571}).setSkyColor(new MFColor(new double[] {1.0,0.0,0.0,1.0,0.4,0.0,1.0,1.0,0.0})))
    .addChild(new Group()
      .addChild(new TouchSensor("Touch").setDescription("touch to toggle audio"))
      .addChild(new Shape()
        .setGeometry(new Sphere())
        .setAppearance(new Appearance()
          .setMaterial(new Material().setDiffuseColor(1.0,0.3,0.3))))
      .addChild(new Sound().setMaxBack(15).setMaxFront(15).setMinBack(5).setMinFront(5)
        .setSource(new AudioClip("Audio").setDescription("willow1").setLoop(true).setUrl(new String[] {"../Chapter24Sound/willow1.wav","https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter24Sound/willow1.wav"})))
      .addChild(new Script("ToggleScript").setSourceCode("""
ecmascript:

// setting the value of an eventOut variable also sends it as an event
// you can view the output of print statements in the VRML Console

function toggle ( value, ts ) {
  // only toggle on click (isActive true) not release (isActive false)
  if ( value == false ) return;
  if ( state == true )
  {
	state  = false;
	stateTurnedFalse = true;
	Browser.println ('ToggleScript.state = ' + state + ', stateTurnedFalse = ' + true);
  }
  else
  {
	state  = true;
	stateTurnedTrue = true;
	Browser.println ('ToggleScript.state = ' + state + ', stateTurnedTrue = ' + true);
  }
}
""")
        .addField(new field().setName("toggle").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INPUTONLY))
        .addField(new field().setName("state").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(true))
        .addField(new field().setName("stateTurnedTrue").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
        .addField(new field().setName("stateTurnedFalse").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_OUTPUTONLY)))
      .addChild(new Script("TimeFilter").setSourceCode("""
ecmascript:

// setting the value of an eventOut variable also sends it as an event

function setStart ( value, timeStamp ) {
	startEventTime = timeStamp;
	Browser.println ('TimeFilter.setStart (' + value + '), startEventTime = ' + timeStamp);
	Browser.println (); // newline
}
function setStop  ( value, timeStamp ) {
	stopEventTime  = timeStamp;
	Browser.println ('TimeFilter.setStop  (' + value + '),  stopEventTime = ' + timeStamp);
	Browser.println (); // newline
}
""")
        .addField(new field().setName("setStart").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INPUTONLY))
        .addField(new field().setName("setStop").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INPUTONLY))
        .addField(new field().setName("startEventTime").setType(field.TYPE_SFTIME).setAccessType(field.ACCESSTYPE_OUTPUTONLY))
        .addField(new field().setName("stopEventTime").setType(field.TYPE_SFTIME).setAccessType(field.ACCESSTYPE_OUTPUTONLY)))
      .addChild(new ROUTE().setFromNode("Touch").setFromField("isActive").setToNode("ToggleScript").setToField("toggle"))
      .addChild(new ROUTE().setFromNode("ToggleScript").setFromField("stateTurnedTrue").setToNode("TimeFilter").setToField("setStart"))
      .addChild(new ROUTE().setFromNode("ToggleScript").setFromField("stateTurnedFalse").setToNode("TimeFilter").setToField("setStop"))
      .addChild(new ROUTE().setFromNode("TimeFilter").setFromField("startEventTime").setToNode("Audio").setToField("set_startTime"))
      .addChild(new ROUTE().setFromNode("TimeFilter").setFromField("stopEventTime").setToNode("Audio").setToField("set_stopTime"))
      .addComments(" extra widget ")
      .addChild(new Transform().setTranslation(0.0,2.5,0.0)
        .addComments(" Selectable Text design pattern has transparent Box and TouchSensor description as a tooltip ")
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"toggle sound","by clicking ball"})
            .setFontStyle(new FontStyle().setFamily(new String[] {"SANS"}).setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.8).setCssStyle("BOLD")))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.9,0.9,0.9))))))
    .addComments(" Semitransparent sphere matching maxFront-MaxBack attenuation ellipsoid ")
    .addChild(new Shape()
      .setAppearance(new Appearance("TransparentAppearance")
        .setMaterial(new Material().setDiffuseColor(0.5,0.0,0.0).setTransparency(0.7)))
      .setGeometry(new Sphere().setRadius(15))));
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
	 * @return Figure30_3ScriptSoundActivate model
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
        X3D thisExampleX3dModel = new Figure30_3ScriptSoundActivate().getX3dModel();
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
                System.out.println("WARNING: \"Vrml2Sourcebook.Chapter30Scripts.Figure30_3ScriptSoundActivate\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
        else if (hasArguments) // if no arguments provided, this method produces usage warning
                thisExampleX3dModel.handleArguments(args);
	
        if (validate)
        {
            //  System.out.println("--- TODO fix duplicated outputs ---"); // omit when duplicated outputs problem is solved/refactored
		String validationResults = thisExampleX3dModel.validationReport();
            //  System.out.println("-----------------------------------"); // omit when duplicated outputs problem is solved/refactored
                System.out.print("Vrml2Sourcebook.Chapter30Scripts.Figure30_3ScriptSoundActivate self-validation test results: ");
                if (!validationResults.equals("success"))
                    System.out.println();
                System.out.println(validationResults.trim());
        }
    }
}
