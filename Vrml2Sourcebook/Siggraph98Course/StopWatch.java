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
import org.web3d.x3d.jsail.Interpolation.*;
import org.web3d.x3d.jsail.Navigation.*;
import org.web3d.x3d.jsail.PointingDeviceSensor.*;
import org.web3d.x3d.jsail.Shape.*;
import org.web3d.x3d.jsail.Time.*;

// Javadoc metadata annotations follow, see below for X3DJSAIL Java source code.
/**
 * <p> Stop-watch with automatically moving second, minute, and hour hands, start and stop buttons, and a stop-watch sweep second hand. </p>
 <p> Related links: <a href="../../../Siggraph98Course/StopWatch.java">StopWatch.java</a> source, <a href="../../../Siggraph98Course/StopWatchIndex.html" target="_top">StopWatch catalog page</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html" target="_blank">X3D Resources</a>, <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>, and <a href="https://www.web3d.org/x3d/content/X3dTooltips.html" target="_blank">X3D Tooltips</a>. </p>
	<table style="color:black; border:0px solid; border-spacing:10px 0px;">
        <caption>Scene Meta Information</caption>
		<tr style="background-color:silver; border-color:silver;">
			<td style="text-align:center; padding:10px 0px;"><i>meta tags</i></td>
			<td style="text-align:left;   padding:10px 0px;">&nbsp; Document Metadata </td>
		</tr>

		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> title </i> </td>
			<td> <a href="../../../Siggraph98Course/StopWatch.x3d">StopWatch.x3d</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> description </i> </td>
			<td> Stop-watch with automatically moving second, minute, and hour hands, start and stop buttons, and a stop-watch sweep second hand. </td>
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
			<td> <a href="../../../Siggraph98Course/StopWatch.png">StopWatch.png</a> </td>
		</tr>
		<tr>
			<td style="text-align:right; vertical-align: text-top;"> <i> reference </i> </td>
			<td> originals/stopwtch.wrl </td>
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
			<td> <a href="http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0256.htm" target="_blank">http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0256.htm</a> </td>
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
			<td> <a href="https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/StopWatch.x3d" target="_blank">https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/StopWatch.x3d</a> </td>
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

public class StopWatch
{
	/** Default constructor to create this object. */
	public StopWatch ()
	{
	  initialize();
	}

	/** Create and initialize the X3D model for this object. */
	public final void initialize()
	{
            try { // catch-all
  x3dModel = new X3D().setProfile(X3D.PROFILE_INTERACTIVE).setVersion(X3D.VERSION_3_3)
  .setHead(new head()
    .addMeta(new meta().setName(meta.NAME_TITLE      ).setContent("StopWatch.x3d"))
    .addMeta(new meta().setName(meta.NAME_DESCRIPTION).setContent("Stop-watch with automatically moving second, minute, and hour hands, start and stop buttons, and a stop-watch sweep second hand."))
    .addMeta(new meta().setName(meta.NAME_CREATOR    ).setContent("David R. Nadeau"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATOR ).setContent("Don Brutzman"))
    .addMeta(new meta().setName(meta.NAME_CREATED    ).setContent("1 July 1998"))
    .addMeta(new meta().setName(meta.NAME_TRANSLATED ).setContent("2 February 2014"))
    .addMeta(new meta().setName(meta.NAME_MODIFIED   ).setContent("20 October 2019"))
    .addMeta(new meta().setName(meta.NAME_IMAGE      ).setContent("StopWatch.png"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("originals/stopwtch.wrl"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.siggraph.org/s98/conference/courses/18.html"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/slides/mt0256.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("http://www.sdsc.edu/~moreland/courses/Siggraph98/vrml97/vrml97.htm"))
    .addMeta(new meta().setName(meta.NAME_REFERENCE  ).setContent("https://www.web3d.org/x3d/content/examples/X3dResources.html"))
    .addMeta(new meta().setName(meta.NAME_IDENTIFIER ).setContent("https://www.web3d.org/x3d/content/examples/Vrml2Sourcebook/Siggraph98Course/StopWatch.x3d"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("Vrml97ToX3dNist, http://ovrt.nist.gov/v2_x3d.html"))
    .addMeta(new meta().setName(meta.NAME_GENERATOR  ).setContent("X3D-Edit, https://savage.nps.edu/X3D-Edit"))
    .addMeta(new meta().setName(meta.NAME_LICENSE    ).setContent("../license.html")))
  .setScene(new Scene()
    .addChild(new WorldInfo().setInfo(new String[] {"Copyright (c) 1997, David R. Nadeau"}).setTitle("Stop watch"))
    .addChild(new Viewpoint().setDescription("Entry view").setPosition(0.0,0.0,15.0))
    .addChild(new NavigationInfo())
    .addChild(new Transform("StopWatch")
      .addChild(new Transform().setRotation(1.0,0.0,0.0,1.571)
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.7,0.3,0.0)))
          .setGeometry(new Cylinder().setHeight(0.8).setRadius(4.8)))
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,1.0,1.0)))
          .setGeometry(new Cylinder().setHeight(0.9).setRadius(4.0))))
      .addChild(new Transform().setRotation(0.0,0.0,1.0,-0.71).setTranslation(3.5,3.5,0.0)
        .addChild(new TouchSensor("Start"))
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(0.0,1.0,0.0)))
          .setGeometry(new Cylinder().setHeight(0.3).setRadius(0.38))))
      .addChild(new Transform().setRotation(0.0,0.0,1.0,0.71).setTranslation(-3.5,3.5,0.0)
        .addChild(new TouchSensor("Stop"))
        .addChild(new Shape()
          .setAppearance(new Appearance()
            .setMaterial(new Material().setDiffuseColor(1.0,0.0,0.0)))
          .setGeometry(new Cylinder().setHeight(0.3).setRadius(0.38))))
      .addChild(new Transform("MinuteHand").setCenter(0.0,-1.5,0.6).setTranslation(0.0,1.5,0.6)
        .addChild(new Shape("Arm")
          .setAppearance(new Appearance("Black")
            .setMaterial(new Material().setDiffuseColor(0.2,0.2,0.2)))
          .setGeometry(new Cylinder().setHeight(3.0).setRadius(0.17)))
        .addChild(new Transform("ArrowHead").setTranslation(0.0,1.9,0.0)
          .addChild(new Shape()
            .setAppearance(new Appearance().setUSE("Black"))
            .setGeometry(new Cone().setBottomRadius(0.4).setHeight(0.8)))))
      .addChild(new Transform("HourHand").setCenter(0.0,-1.5,0.6).setScale(1.0,0.7,1.0).setTranslation(0.0,1.5,0.6)
        .addChild(new Shape().setUSE("Arm"))
        .addChild(new Transform().setUSE("ArrowHead")))
      .addChild(new Transform("SecondHand").setCenter(0.0,-1.5,0.6).setScale(0.6,1.0,0.6).setTranslation(0.0,1.5,0.6)
        .addChild(new Shape().setUSE("Arm"))
        .addChild(new Transform().setUSE("ArrowHead")))
      .addChild(new Transform("SweepHand").setCenter(0.0,-1.9,0.6).setScale(0.6,1.0,0.6).setTranslation(0.0,1.9,0.6)
        .addChild(new Shape()
          .setAppearance(new Appearance("Red")
            .setMaterial(new Material().setDiffuseColor(1.0,0.0,0.0)))
          .setGeometry(new Cylinder().setHeight(3.8).setRadius(0.17)))))
    .addChild(new TimeSensor("SecondTimer").setCycleInterval(60.0).setLoop(true).setStopTime(-1.0))
    .addChild(new TimeSensor("MinuteTimer").setCycleInterval(3600.0).setLoop(true).setStopTime(-1.0))
    .addChild(new TimeSensor("HourTimer").setCycleInterval(43200.0).setLoop(true).setStartTime(28800.0).setStopTime(-1.0))
    .addChild(new OrientationInterpolator("SecondSpinner").setKey(new double[] {0.0,0.5,1.0}).setKeyValue(new MFRotation(new double[] {0.0,0.0,1.0,0.0,0.0,0.0,1.0,-3.14,0.0,0.0,1.0,-6.28})))
    .addChild(new OrientationInterpolator("MinuteSpinner").setKey(new double[] {0.0,0.5,1.0}).setKeyValue(new MFRotation(new double[] {0.0,0.0,1.0,0.0,0.0,0.0,1.0,-3.14,0.0,0.0,1.0,-6.28})))
    .addChild(new OrientationInterpolator("HourSpinner").setKey(new double[] {0.0,0.5,1.0}).setKeyValue(new MFRotation(new double[] {0.0,0.0,1.0,0.0,0.0,0.0,1.0,-3.14,0.0,0.0,1.0,-6.28})))
    .addChild(new ROUTE().setFromNode("SecondTimer").setFromField("fraction_changed").setToNode("SecondSpinner").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("MinuteTimer").setFromField("fraction_changed").setToNode("MinuteSpinner").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("HourTimer").setFromField("fraction_changed").setToNode("HourSpinner").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("SecondSpinner").setFromField("value_changed").setToNode("SecondHand").setToField("set_rotation"))
    .addChild(new ROUTE().setFromNode("MinuteSpinner").setFromField("value_changed").setToNode("MinuteHand").setToField("set_rotation"))
    .addChild(new ROUTE().setFromNode("HourSpinner").setFromField("value_changed").setToNode("HourHand").setToField("set_rotation"))
    .addChild(new TimeSensor("SweepTimer").setCycleInterval(60.0).setLoop(true).setStopTime(1.0))
    .addChild(new OrientationInterpolator("SweepSpinner").setKey(new double[] {0.0,0.5,1.0}).setKeyValue(new MFRotation(new double[] {0.0,0.0,1.0,0.0,0.0,0.0,1.0,-3.14,0.0,0.0,1.0,-6.28})))
    .addChild(new ROUTE().setFromNode("Start").setFromField("touchTime").setToNode("SweepTimer").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("Stop").setFromField("touchTime").setToNode("SweepTimer").setToField("set_stopTime"))
    .addChild(new ROUTE().setFromNode("SweepTimer").setFromField("fraction_changed").setToNode("SweepSpinner").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("SweepSpinner").setFromField("value_changed").setToNode("SweepHand").setToField("set_rotation"))
    .addChild(new TimeSensor("QuarterHour").setCycleInterval(900.0).setLoop(true).setStartTime(28800.0).setStopTime(-1.0))
    .addChild(new TimeSensor("QuarterAnimation").setCycleInterval(3.0).setStartTime(-1.0))
    .addChild(new OrientationInterpolator("QuarterSpinner").setKey(new double[] {0.0,0.5,1.0}).setKeyValue(new MFRotation(new double[] {1.0,1.0,0.0,0.0,1.0,1.0,0.0,-3.14,1.0,1.0,0.0,-6.28})))
    .addChild(new PositionInterpolator("QuarterSquisher").setKey(new double[] {0.0,0.25,0.5,0.75,1.0}).setKeyValue(new MFVec3f(new double[] {1.0,1.0,1.0,0.1,3.0,1.2,3.0,0.1,1.0,0.3,2.0,1.2,1.0,1.0,1.0})))
    .addChild(new ROUTE().setFromNode("QuarterHour").setFromField("cycleTime").setToNode("QuarterAnimation").setToField("set_startTime"))
    .addChild(new ROUTE().setFromNode("QuarterAnimation").setFromField("fraction_changed").setToNode("QuarterSpinner").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("QuarterAnimation").setFromField("fraction_changed").setToNode("QuarterSquisher").setToField("set_fraction"))
    .addChild(new ROUTE().setFromNode("QuarterSpinner").setFromField("value_changed").setToNode("StopWatch").setToField("set_rotation"))
    .addChild(new ROUTE().setFromNode("QuarterSquisher").setFromField("value_changed").setToNode("StopWatch").setToField("set_scale")));
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
	 * @return StopWatch model
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
        X3D thisExampleX3dModel = new StopWatch().getX3dModel();
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
                System.out.println("WARNING: \"Vrml2Sourcebook.Siggraph98Course.StopWatch\" model invocation is attempting to load file \"" + fileName + "\" instead of simply validating itself... file loading ignored.");
        else if (hasArguments) // if no arguments provided, this method produces usage warning
                thisExampleX3dModel.handleArguments(args);
	
        if (validate)
        {
            //  System.out.println("--- TODO fix duplicated outputs ---"); // omit when duplicated outputs problem is solved/refactored
		String validationResults = thisExampleX3dModel.validationReport();
            //  System.out.println("-----------------------------------"); // omit when duplicated outputs problem is solved/refactored
                System.out.print("Vrml2Sourcebook.Siggraph98Course.StopWatch self-validation test results: ");
                if (!validationResults.equals("success"))
                    System.out.println();
                System.out.println(validationResults.trim());
        }
    }
}
