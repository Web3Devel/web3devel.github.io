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
import org.web3d.x3d.jsail.Text.*;

// Javadoc metadata annotations follow, see below for X3DJSAIL Java source code.
/**
 * <p> Click on a geometric Shape to change the scene Background. A Script node controls the state changes. </p>
 <p> Related links: <a href="../../../Chapter30Scripts/Figure30_2ScriptBackgroundSelect.java">Figure30_2ScriptBackgroundSelect.java</a> source, <a href="../../../Chapter30Scripts/Figure30_2ScriptBackgroundSelectIndex.html" target="_top">Figure30_2ScriptBackgroundSelect catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Chapter30Scripts/Figure30_2ScriptBackgroundSelect.x3d">Figure30_2ScriptBackgroundSelect.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> creator </i> </td>
			<td> Figure 30.2, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> <a href="http://www.wiley.com/legacy/compbooks/vrml2sbk/ch30/30fig02.htm" target="_blank">http://www.wiley.com/legacy/compbooks/vrml2sbk/ch30/30fig02.htm</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> translator </i> </td>
			<td> Don Brutzman </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> created </i> </td>
			<td> 2 September 2000 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> modified </i> </td>
			<td> 20 October 2019 </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Click on a geometric Shape to change the scene Background. A Script node controls the state changes. </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> identifier </i> </td>
			<td> <a href="https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter30Scripts/Figure30_2ScriptBackgroundSelect.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter30Scripts/Figure30_2ScriptBackgroundSelect.x3d</a> </td>
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

	* @author Figure 30.2, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland
 */

public class Figure30_2ScriptBackgroundSelect
{
	/** Default constructor to create this object. */
	public Figure30_2ScriptBackgroundSelect ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
            try { // catch-all
  x3dModel = new X3D().setProfile(X3D.PROFILE_IMMERSIVE).setVersion(X3D.VERSION_3_0)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("Figure30_2ScriptBackgroundSelect.x3d"))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("Figure 30.2, The VRML 2.0 Sourcebook, Copyright [1997] By Andrea L. Ames, David R. Nadeau, and John L. Moreland"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.wiley.com/legacy/compbooks/vrml2sbk/ch30/30fig02.htm"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("2 September 2000"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Click on a geometric Shape to change the scene Background. A Script node controls the state changes."))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Chapter30Scripts/Figure30_2ScriptBackgroundSelect.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit 3.3, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setTitle("Figure30_2ScriptBackgroundSelect.x3d"))
    .addChild(new Viewpoint().setDescription("Background select").setOrientation(1.0,0.0,0.0,-0.2).setPosition(0.0,2.0,10.0))
    .addComments(" Background nodes are usually best placed at the top of the scene since they have global effect and are bindable nodes. ")
    .addComments(" Bindable Backgrounds (cyan, red, blue) ")
    .addChild(new Background("Default"))
    .addChild(new Background("BackgroundCyan-ish").setGroundAngle(new double[] {1.309,1.570796}).setGroundColor(new MFColor(new double[] {0.1,0.1,0.0,0.4,0.25,0.2,0.6,0.6,0.6})).setSkyAngle(new double[] {1.309,1.571}).setSkyColor(new MFColor(new double[] {0.0,0.2,0.7,0.0,0.5,1.0,1.0,1.0,1.0})))
    .addChild(new Background("BackgroundReddish").setGroundAngle(new double[] {1.309,1.570796}).setGroundColor(new MFColor(new double[] {0.1,0.1,0.0,0.5,0.25,0.2,0.6,0.6,0.2})).setSkyAngle(new double[] {1.309,1.571}).setSkyColor(new MFColor(new double[] {1.0,0.0,0.0,1.0,0.4,0.0,1.0,1.0,0.0})))
    .addChild(new Background("BackgroundBluish").setGroundAngle(new double[] {1.309,1.570796}).setGroundColor(new MFColor(new double[] {0.0,0.0,0.1,0.0,0.1,0.3,0.3,0.3,0.6})).setSkyAngle(new double[] {1.309,1.571}).setSkyColor(new MFColor(new double[] {1.0,0.0,0.8,0.5,0.0,0.8,0.0,0.0,0.8})))
    .addChild(new Group()
      .addChild(new Transform().setTranslation(-3.0,0.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Box())
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.0,0.5,0.8))))
        .addChild(new TouchSensor("SensorButton1").setDescription("Cyan background")))
      .addChild(new Script("Filter1").setSourceCode("""
ecmascript:

function initialize () {
  Browser.println (' '); // skip line
  Browser.println ('Click shapes to select a background...');
  Browser.println (' '); // skip line
}

// setting the value of an eventOut variable also sends it as an event

function set_boolean ( value, eventTime ) {
  // only trigger on true values so that Background stays bound
  if ( value == true ) {  
	activated = value;
	Browser.println ('Cyan background ' + count);
  }
  else count++;  // received isActive value = false
}
""")
        .addField(new field().setName("set_boolean").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INPUTONLY).setAppinfo("filter input value"))
        .addField(new field().setName("activated").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_OUTPUTONLY).setAppinfo("activated provides a persistent binding value otherwise isActive events will toggle Background binding on/off."))
        .addField(new field().setName("count").setType(field.TYPE_SFINT32).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(1).setAppinfo("count is only used locally so it is declared as an interface for persistence")))
      .addChild(new ROUTE().setFromNode("SensorButton1").setFromField("isActive").setToNode("Filter1").setToField("set_boolean"))
      .addChild(new ROUTE().setFromNode("Filter1").setFromField("activated").setToNode("BackgroundCyan-ish").setToField("set_bind"))
      .addChild(new Group()
        .addChild(new Shape()
          .setGeometry(new Sphere())
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.3,0.3))))
        .addChild(new TouchSensor("SensorButton2").setDescription("Red background")))
      .addChild(new Script("Filter2").setSourceCode("""
ecmascript:

// setting the value of an eventOut variable also sends it as an event

function set_boolean ( value, eventTime ) {
  // only trigger on true values so that Background stays bound
  if ( value == true ) {
	activated = value;
	Browser.println ('Red background ' + count);
  }
  else count++;  // received isActive value = false
}
""")
        .addField(new field().setName("set_boolean").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INPUTONLY).setAppinfo("filter input value"))
        .addField(new field().setName("activated").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_OUTPUTONLY).setAppinfo("activated provides a persistent binding value otherwise isActive events will toggle Background binding on/off."))
        .addField(new field().setName("count").setType(field.TYPE_SFINT32).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(1).setAppinfo("count is only used locally so it is declared as an interface for persistence")))
      .addChild(new ROUTE().setFromNode("SensorButton2").setFromField("isActive").setToNode("Filter2").setToField("set_boolean"))
      .addChild(new ROUTE().setFromNode("Filter2").setFromField("activated").setToNode("BackgroundReddish").setToField("set_bind"))
      .addChild(new Transform().setTranslation(3.0,0.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Cone())
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.2,0.2,0.8))))
        .addChild(new TouchSensor("SensorButton3").setDescription("Blue background")))
      .addChild(new Script("Filter3").setSourceCode("""
ecmascript:

// setting the value of an eventOut variable also sends it as an event

function set_boolean ( value, eventTime ) {
  // only trigger on true values so that Background stays bound
  if ( value == true ) {
	activated = value;
	Browser.println ('Blue background ' + count);
  }
  else count++;  // received isActive value = false
}
""")
        .addField(new field().setName("set_boolean").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_INPUTONLY).setAppinfo("filter input value"))
        .addField(new field().setName("activated").setType(field.TYPE_SFBOOL).setAccessType(field.ACCESSTYPE_OUTPUTONLY).setAppinfo("activated provides a persistent binding value otherwise isActive events will toggle Background binding on/off."))
        .addField(new field().setName("count").setType(field.TYPE_SFINT32).setAccessType(field.ACCESSTYPE_INITIALIZEONLY).setValue(1).setAppinfo("count is only used locally so it is declared as an interface for persistence")))
      .addChild(new ROUTE().setFromNode("SensorButton3").setFromField("isActive").setToNode("Filter3").setToField("set_boolean"))
      .addChild(new ROUTE().setFromNode("Filter3").setFromField("activated").setToNode("BackgroundBluish").setToField("set_bind"))
      .addChild(new Transform().setTranslation(0.0,-3.0,0.0)
        .addChild(new Shape()
          .setGeometry(new Text().setString(new String[] {"Click on a Shape to change a Background,","Open player console to see trace statements."})
            .setFontStyle(new FontStyle().setJustify(FontStyle.JUSTIFY_MIDDLE_MIDDLE).setSize(0.6)))
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.7,0.7,0.7)))))));
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
	 * @return Figure30_2ScriptBackgroundSelect model
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
        X3D thisExampleX3dModel = new Figure30_2ScriptBackgroundSelect().getX3dModel();
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
                System.out.println("WARNING: \"Vrml2Sourcebook.Chapter30Scripts.Figure30_2ScriptBackgroundSelect\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
        else if (hasArguments) // if no arguments provided, this method produces usage warning
                thisExampleX3dModel.handleArguments(args);
	
        if (validate)
        {
            //  System.out.println("--- TODO fix duplicated outputs ---"); // omit when duplicated outputs problem is solved/refactored
		String validationResults = thisExampleX3dModel.validationReport();
            //  System.out.println("-----------------------------------"); // omit when duplicated outputs problem is solved/refactored
                System.out.print("Vrml2Sourcebook.Chapter30Scripts.Figure30_2ScriptBackgroundSelect self-validation test results: ");
                if (!validationResults.equals("success"))
                    System.out.println();
                System.out.println(validationResults.trim());
        }
    }
}
